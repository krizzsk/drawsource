package com.unity3d.services.core.api;

import android.media.MediaMetadataRetriever;
import android.util.Base64;
import android.util.SparseArray;
import com.unity3d.services.core.cache.C11983a;
import com.unity3d.services.core.cache.C11984b;
import com.unity3d.services.core.cache.C11985c;
import com.unity3d.services.core.cache.C11987e;
import com.unity3d.services.core.device.C12014b;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.properties.C12088d;
import com.unity3d.services.core.request.C12101i;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Cache {

    /* renamed from: com.unity3d.services.core.api.Cache$a */
    static class C11969a implements FilenameFilter {
        C11969a() {
        }

        public boolean accept(File file, String str) {
            return str.startsWith(C12088d.m32928c());
        }
    }

    /* renamed from: a */
    private static SparseArray<String> m32569a(String str, JSONArray jSONArray) throws JSONException, IOException, RuntimeException {
        File file = new File(str);
        SparseArray<String> sparseArray = new SparseArray<>();
        if (file.exists()) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            for (int i = 0; i < jSONArray.length(); i++) {
                int i2 = jSONArray.getInt(i);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(i2);
                if (extractMetadata != null) {
                    sparseArray.put(i2, extractMetadata);
                }
            }
            return sparseArray;
        }
        throw new IOException("File: " + file.getAbsolutePath() + " doesn't exist");
    }

    /* renamed from: b */
    private static JSONObject m32571b(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", str);
        File file = new File(m32570a(str));
        if (file.exists()) {
            jSONObject.put("found", true);
            jSONObject.put("size", file.length());
            jSONObject.put("mtime", file.lastModified());
        } else {
            jSONObject.put("found", false);
        }
        return jSONObject;
    }

    @WebViewExposed
    public static void deleteFile(String str, C12160l lVar) {
        if (new File(m32570a(str)).delete()) {
            lVar.mo71347a(new Object[0]);
        } else {
            lVar.mo71346a(C11985c.FILE_IO_ERROR, new Object[0]);
        }
    }

    @WebViewExposed
    public static void download(String str, String str2, JSONArray jSONArray, Boolean bool, C12160l lVar) {
        if (C11987e.m32611f()) {
            lVar.mo71346a(C11985c.FILE_ALREADY_CACHING, new Object[0]);
        } else if (!C12014b.m32699U()) {
            lVar.mo71346a(C11985c.NO_INTERNET, new Object[0]);
        } else {
            try {
                C11987e.m32604a(str, m32570a(str2), Request.getHeadersMap(jSONArray), bool.booleanValue());
                lVar.mo71347a(new Object[0]);
            } catch (Exception e) {
                C12065a.m32842a("Error mapping headers for the request", e);
                lVar.mo71346a(C12101i.MAPPING_HEADERS_FAILED, str, str2);
            }
        }
    }

    @WebViewExposed
    public static void getCacheDirectoryExists(C12160l lVar) {
        File a = C12088d.m32913a();
        if (a == null) {
            lVar.mo71346a(C11985c.CACHE_DIRECTORY_NULL, new Object[0]);
            return;
        }
        lVar.mo71347a(Boolean.valueOf(a.exists()));
    }

    @WebViewExposed
    public static void getCacheDirectoryType(C12160l lVar) {
        C11983a b = C12088d.m32923b();
        if (b == null || b.mo71024a(C12084a.m32908e()) == null) {
            lVar.mo71346a(C11985c.CACHE_DIRECTORY_NULL, new Object[0]);
        } else if (!b.mo71024a(C12084a.m32908e()).exists()) {
            lVar.mo71346a(C11985c.CACHE_DIRECTORY_DOESNT_EXIST, new Object[0]);
        } else {
            C11984b a = b.mo71023a();
            if (a == null) {
                lVar.mo71346a(C11985c.CACHE_DIRECTORY_TYPE_NULL, new Object[0]);
                return;
            }
            lVar.mo71347a(a.name());
        }
    }

    @WebViewExposed
    public static void getFileContent(String str, String str2, C12160l lVar) {
        String str3;
        String a = m32570a(str);
        File file = new File(a);
        if (!file.exists()) {
            lVar.mo71346a(C11985c.FILE_NOT_FOUND, str, a);
            return;
        }
        try {
            byte[] a2 = C12080j.m32882a(file);
            if (str2 == null) {
                lVar.mo71346a(C11985c.UNSUPPORTED_ENCODING, str, a, str2);
                return;
            }
            if (str2.equals("UTF-8")) {
                str3 = Charset.forName("UTF-8").decode(ByteBuffer.wrap(a2)).toString();
            } else if (str2.equals("Base64")) {
                str3 = Base64.encodeToString(a2, 2);
            } else {
                lVar.mo71346a(C11985c.UNSUPPORTED_ENCODING, str, a, str2);
                return;
            }
            lVar.mo71347a(str3);
        } catch (IOException e) {
            C11985c cVar = C11985c.FILE_IO_ERROR;
            lVar.mo71346a(cVar, str, a, e.getMessage() + ", " + e.getClass().getName());
        }
    }

    @WebViewExposed
    public static void getFileInfo(String str, C12160l lVar) {
        try {
            lVar.mo71347a(m32571b(str));
        } catch (JSONException e) {
            C12065a.m32842a("Error creating JSON", (Exception) e);
            lVar.mo71346a(C11985c.JSON_ERROR, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getFilePath(String str, C12160l lVar) {
        if (new File(m32570a(str)).exists()) {
            lVar.mo71347a(m32570a(str));
            return;
        }
        lVar.mo71346a(C11985c.FILE_NOT_FOUND, new Object[0]);
    }

    @WebViewExposed
    public static void getFiles(C12160l lVar) {
        File a = C12088d.m32913a();
        if (a != null) {
            C12065a.m32845b("Unity Ads cache: checking app directory for Unity Ads cached files");
            File[] listFiles = a.listFiles(new C11969a());
            if (listFiles == null || listFiles.length == 0) {
                lVar.mo71347a(new JSONArray());
            }
            try {
                JSONArray jSONArray = new JSONArray();
                for (File file : listFiles) {
                    String substring = file.getName().substring(C12088d.m32928c().length());
                    C12065a.m32845b("Unity Ads cache: found " + substring + ", " + file.length() + " bytes");
                    jSONArray.put(m32571b(substring));
                }
                lVar.mo71347a(jSONArray);
            } catch (JSONException e) {
                C12065a.m32842a("Error creating JSON", (Exception) e);
                lVar.mo71346a(C11985c.JSON_ERROR, new Object[0]);
            }
        }
    }

    @WebViewExposed
    public static void getFreeSpace(C12160l lVar) {
        lVar.mo71347a(Long.valueOf(C12014b.m32707a(C12088d.m32913a())));
    }

    @WebViewExposed
    public static void getHash(String str, C12160l lVar) {
        lVar.mo71347a(C12080j.m32874a(str));
    }

    @WebViewExposed
    public static void getMetaData(String str, JSONArray jSONArray, C12160l lVar) {
        try {
            SparseArray<String> a = m32569a(m32570a(str), jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < a.size(); i++) {
                JSONArray jSONArray3 = new JSONArray();
                jSONArray3.put(a.keyAt(i));
                jSONArray3.put(a.valueAt(i));
                jSONArray2.put(jSONArray3);
            }
            lVar.mo71347a(jSONArray2);
        } catch (JSONException e) {
            lVar.mo71346a(C11985c.JSON_ERROR, e.getMessage());
        } catch (RuntimeException e2) {
            lVar.mo71346a(C11985c.INVALID_ARGUMENT, e2.getMessage());
        } catch (IOException e3) {
            lVar.mo71346a(C11985c.FILE_IO_ERROR, e3.getMessage());
        }
    }

    @WebViewExposed
    public static void getProgressInterval(C12160l lVar) {
        lVar.mo71347a(Integer.valueOf(C11987e.m32607c()));
    }

    @WebViewExposed
    public static void getTimeouts(C12160l lVar) {
        lVar.mo71347a(Integer.valueOf(C11987e.m32605b()), Integer.valueOf(C11987e.m32609d()));
    }

    @WebViewExposed
    public static void getTotalSpace(C12160l lVar) {
        lVar.mo71347a(Long.valueOf(C12014b.m32715b(C12088d.m32913a())));
    }

    @WebViewExposed
    public static void isCaching(C12160l lVar) {
        lVar.mo71347a(Boolean.valueOf(C11987e.m32611f()));
    }

    @WebViewExposed
    public static void recreateCacheDirectory(C12160l lVar) {
        if (C12088d.m32913a().exists()) {
            lVar.mo71346a(C11985c.CACHE_DIRECTORY_EXISTS, new Object[0]);
            return;
        }
        C12088d.m32919a((C11983a) null);
        if (C12088d.m32913a() == null) {
            lVar.mo71346a(C11985c.CACHE_DIRECTORY_NULL, new Object[0]);
        } else {
            lVar.mo71347a(new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:28:0x0055, B:33:0x0068] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0055 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0068 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064 A[SYNTHETIC, Splitter:B:31:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077 A[SYNTHETIC, Splitter:B:36:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c A[SYNTHETIC, Splitter:B:45:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0055=Splitter:B:28:0x0055, B:33:0x0068=Splitter:B:33:0x0068} */
    @com.unity3d.services.core.webview.bridge.WebViewExposed
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setFileContent(java.lang.String r9, java.lang.String r10, java.lang.String r11, com.unity3d.services.core.webview.bridge.C12160l r12) {
        /*
            java.lang.String r0 = "Error closing FileOutputStream"
            java.lang.String r1 = "UTF-8"
            java.lang.String r2 = m32570a(r9)
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            byte[] r7 = r11.getBytes(r1)     // Catch:{ UnsupportedEncodingException -> 0x0095 }
            if (r10 == 0) goto L_0x003a
            int r8 = r10.length()
            if (r8 <= 0) goto L_0x003a
            java.lang.String r8 = "Base64"
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L_0x0025
            byte[] r7 = android.util.Base64.decode(r11, r4)
            goto L_0x003a
        L_0x0025:
            boolean r11 = r10.equals(r1)
            if (r11 == 0) goto L_0x002c
            goto L_0x003a
        L_0x002c:
            com.unity3d.services.core.cache.c r11 = com.unity3d.services.core.cache.C11985c.UNSUPPORTED_ENCODING
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r6] = r9
            r0[r5] = r2
            r0[r4] = r10
            r12.mo71346a(r11, r0)
            return
        L_0x003a:
            r11 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x0055 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x0055 }
            r1.write(r7)     // Catch:{ FileNotFoundException -> 0x0051, IOException -> 0x004f, all -> 0x004c }
            r1.flush()     // Catch:{ FileNotFoundException -> 0x0051, IOException -> 0x004f, all -> 0x004c }
            r1.close()     // Catch:{ Exception -> 0x004a }
            goto L_0x0082
        L_0x004a:
            r9 = move-exception
            goto L_0x007d
        L_0x004c:
            r9 = move-exception
            r11 = r1
            goto L_0x008a
        L_0x004f:
            r11 = r1
            goto L_0x0055
        L_0x0051:
            r11 = r1
            goto L_0x0068
        L_0x0053:
            r9 = move-exception
            goto L_0x008a
        L_0x0055:
            com.unity3d.services.core.cache.c r1 = com.unity3d.services.core.cache.C11985c.FILE_IO_ERROR     // Catch:{ all -> 0x0053 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0053 }
            r3[r6] = r9     // Catch:{ all -> 0x0053 }
            r3[r5] = r2     // Catch:{ all -> 0x0053 }
            r3[r4] = r10     // Catch:{ all -> 0x0053 }
            r12.mo71346a(r1, r3)     // Catch:{ all -> 0x0053 }
            if (r11 == 0) goto L_0x0081
            r11.close()     // Catch:{ Exception -> 0x007b }
            goto L_0x0081
        L_0x0068:
            com.unity3d.services.core.cache.c r1 = com.unity3d.services.core.cache.C11985c.FILE_NOT_FOUND     // Catch:{ all -> 0x0053 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0053 }
            r3[r6] = r9     // Catch:{ all -> 0x0053 }
            r3[r5] = r2     // Catch:{ all -> 0x0053 }
            r3[r4] = r10     // Catch:{ all -> 0x0053 }
            r12.mo71346a(r1, r3)     // Catch:{ all -> 0x0053 }
            if (r11 == 0) goto L_0x0081
            r11.close()     // Catch:{ Exception -> 0x007b }
            goto L_0x0081
        L_0x007b:
            r9 = move-exception
            r5 = r6
        L_0x007d:
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r0, (java.lang.Exception) r9)
            goto L_0x0082
        L_0x0081:
            r5 = r6
        L_0x0082:
            if (r5 == 0) goto L_0x0089
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r12.mo71347a(r9)
        L_0x0089:
            return
        L_0x008a:
            if (r11 == 0) goto L_0x0094
            r11.close()     // Catch:{ Exception -> 0x0090 }
            goto L_0x0094
        L_0x0090:
            r10 = move-exception
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r0, (java.lang.Exception) r10)
        L_0x0094:
            throw r9
        L_0x0095:
            com.unity3d.services.core.cache.c r11 = com.unity3d.services.core.cache.C11985c.UNSUPPORTED_ENCODING
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r6] = r9
            r0[r5] = r2
            r0[r4] = r10
            r12.mo71346a(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.api.Cache.setFileContent(java.lang.String, java.lang.String, java.lang.String, com.unity3d.services.core.webview.bridge.l):void");
    }

    @WebViewExposed
    public static void setProgressInterval(Integer num, C12160l lVar) {
        C11987e.m32606b(num.intValue());
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void setTimeouts(Integer num, Integer num2, C12160l lVar) {
        C11987e.m32603a(num.intValue());
        C11987e.m32608c(num2.intValue());
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void stop(C12160l lVar) {
        if (!C11987e.m32611f()) {
            lVar.mo71346a(C11985c.NOT_CACHING, new Object[0]);
            return;
        }
        C11987e.m32602a();
        lVar.mo71347a(new Object[0]);
    }

    /* renamed from: a */
    private static String m32570a(String str) {
        return C12088d.m32913a() + "/" + C12088d.m32928c() + str;
    }
}

package com.mbridge.msdk.foundation.download.utils;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.thrid.okhttp.Response;
import com.mbridge.msdk.thrid.okhttp.ResponseBody;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.util.Arrays;

public class Objects {
    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static boolean isNotNull(Object obj) {
        return !isNull(obj);
    }

    public static void closeInputStream(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception e) {
                C8672v.m24874a("closeStream", e.getLocalizedMessage());
            }
        }
    }

    public static void closeOutputStream(DownloadFileOutputStream downloadFileOutputStream) {
        if (downloadFileOutputStream != null) {
            try {
                downloadFileOutputStream.close();
            } catch (Exception e) {
                C8672v.m24874a("closeStream", e.getLocalizedMessage());
            }
        }
    }

    public static void closeResponse(Response response) {
        if (response != null) {
            try {
                if (response.body() != null) {
                    response.body().close();
                }
                response.close();
            } catch (Exception e) {
                C8672v.m24874a("closeStream", e.getLocalizedMessage());
            }
        }
    }

    public static void closeResponseBody(ResponseBody responseBody) {
        if (responseBody != null) {
            try {
                responseBody.close();
            } catch (Exception e) {
                C8672v.m24874a("closeStream", e.getLocalizedMessage());
            }
        }
    }

    public static boolean exists(File file, String str, String str2) {
        if (file == null || TextUtils.isEmpty(str)) {
            return false;
        }
        boolean exists = file.exists();
        return !exists ? doubleCheckExists(file, str, str2) : exists;
    }

    private static boolean doubleCheckExists(File file, final String str, final String str2) {
        File[] fileArr;
        try {
            fileArr = file.getParentFile().listFiles(new FilenameFilter() {
                public boolean accept(File file, String str) {
                    if (file == null || TextUtils.isEmpty(str) || !TextUtils.equals(file.getAbsolutePath(), str) || !TextUtils.equals(str, str2)) {
                        return false;
                    }
                    return true;
                }
            });
        } catch (Exception e) {
            C8672v.m24874a("doubleCheckExists", e.getLocalizedMessage());
            fileArr = null;
        }
        return fileArr != null && file.length() > 0;
    }
}

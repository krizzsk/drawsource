package com.mbridge.msdk.foundation.same.report.p314b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Log;
import com.facebook.share.internal.ShareInternalUtility;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.p083a.p084a.C2461a;
import com.mbridge.msdk.foundation.same.p301b.C8476c;
import com.mbridge.msdk.foundation.same.p301b.C8478e;
import com.mbridge.msdk.foundation.same.report.C8582d;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.report.b.a */
/* compiled from: CrashHandlerUtil */
public class C8578a implements Thread.UncaughtExceptionHandler {

    /* renamed from: c */
    private static volatile C8578a f21077c;

    /* renamed from: a */
    Handler f21078a = new Handler() {
        public final void handleMessage(Message message) {
            Context context;
            HashMap hashMap;
            super.handleMessage(message);
            if (message.what == 101 && (context = (Context) C8578a.this.f21079b.get()) != null && (message.obj instanceof HashMap) && (hashMap = (HashMap) message.obj) != null) {
                new C8582d(context).mo58066a((String) hashMap.get("crashinfo"), (File) hashMap.get(ShareInternalUtility.STAGING_PARAM));
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WeakReference<Context> f21079b;

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f21080d;

    /* renamed from: e */
    private Throwable f21081e;

    private C8578a(Context context) {
        this.f21079b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static C8578a m24592a(Context context) {
        if (f21077c == null) {
            synchronized (C8578a.class) {
                if (f21077c == null) {
                    f21077c = new C8578a(context);
                }
            }
        }
        return f21077c;
    }

    /* renamed from: a */
    public final void mo58057a() {
        this.f21080d = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* renamed from: a */
    private String m24594a(Throwable th, String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            Context context = (Context) this.f21079b.get();
            if (context == null) {
                return "";
            }
            float f = (float) ((((double) Runtime.getRuntime().totalMemory()) * 1.0d) / 1048576.0d);
            float freeMemory = (float) ((((double) Runtime.getRuntime().freeMemory()) * 1.0d) / 1048576.0d);
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            long usableSpace = externalStorageDirectory.getUsableSpace();
            String str3 = "appversionname";
            Object obj = "-1";
            long totalSpace = externalStorageDirectory.getTotalSpace();
            String formatFileSize = Formatter.formatFileSize(context, usableSpace);
            String formatFileSize2 = Formatter.formatFileSize(context, totalSpace);
            jSONObject.put("max_memory", String.valueOf((float) ((((double) Runtime.getRuntime().maxMemory()) * 1.0d) / 1048576.0d)));
            jSONObject.put("memoryby_app", String.valueOf(f));
            jSONObject.put("remaining_memory", (double) freeMemory);
            jSONObject.put("sdcard_remainder", formatFileSize);
            jSONObject.put("totalspacestr", formatFileSize2);
            jSONObject.put("crashtime", str);
            String b = C2461a.m6124a().mo16390b(MBridgeConstans.SDK_APP_ID);
            if (!TextUtils.isEmpty(b)) {
                jSONObject.put("appid", b);
            }
            try {
                jSONObject.put("osversion", Build.VERSION.SDK_INT);
                jSONObject.put("appversioncode", m24599b(context));
                str2 = str3;
                try {
                    jSONObject.put(str2, m24601c(context));
                    jSONObject.put("appname", m24602d(context));
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                str2 = str3;
                jSONObject.put("osversion", 0);
                Object obj2 = obj;
                jSONObject.put("appversioncode", obj2);
                jSONObject.put(str2, obj2);
                jSONObject.put("appname", "");
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                jSONObject.put("crashinfo", stringWriter.toString());
                String jSONObject2 = jSONObject.toString();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000052");
                stringBuffer.append("&exception=" + jSONObject2);
                return stringBuffer.toString();
            }
            StringWriter stringWriter2 = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter2));
            jSONObject.put("crashinfo", stringWriter2.toString());
            String jSONObject22 = jSONObject.toString();
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("key=2000052");
            stringBuffer2.append("&exception=" + jSONObject22);
            return stringBuffer2.toString();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    private int m24599b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: c */
    private static String m24601c(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("", e.getMessage());
            return "";
        }
    }

    /* renamed from: d */
    private String m24602d(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f21081e = th;
            C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
            if (b == null) {
                b = C2445b.m6020a().mo16285b();
            }
            String H = b.mo16153H() == null ? "mbridge" : b.mo16153H();
            List<String> a = m24596a(H, "<mvpackage>(.*?)</mvpackage>");
            if (a.size() > 0) {
                for (int i = 0; i < a.size(); i++) {
                    m24597a(m24593a(th), a.get(i), th, thread);
                }
                return;
            }
            m24597a(m24593a(th), H, th, thread);
        } catch (Exception e) {
            m24598a(thread, th);
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private String m24593a(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stackTrace.length; i++) {
            sb.append(stackTrace[i].toString() + "\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m24597a(String str, String str2, Throwable th, Thread thread) {
        if (str.contains(str2)) {
            HashMap<String, Object> b = m24600b();
            if (b != null && b.get(ShareInternalUtility.STAGING_PARAM) != null) {
                Message obtain = Message.obtain();
                HashMap hashMap = new HashMap();
                hashMap.put("crashinfo", m24594a(th, (String) b.get("time")));
                hashMap.put(ShareInternalUtility.STAGING_PARAM, b.get(ShareInternalUtility.STAGING_PARAM));
                obtain.obj = hashMap;
                obtain.what = 101;
                this.f21078a.sendMessage(obtain);
                m24598a(thread, th);
                return;
            }
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f21080d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* renamed from: a */
    private List<String> m24596a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        try {
            Matcher matcher = Pattern.compile(str2).matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m24598a(Thread thread, Throwable th) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Process.killProcess(Process.myPid());
    }

    /* renamed from: b */
    private HashMap<String, Object> m24600b() {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (this.f21081e == null) {
            return null;
        }
        String b = C8478e.m24306b(C8476c.MBRIDGE_CRASH_INFO);
        File file = new File(b + "/");
        if (!file.exists()) {
            file.mkdirs();
        }
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        File file2 = new File(b + "/" + "sdkcrash" + format + ".txt");
        try {
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file2)));
            printWriter.println(m24594a(this.f21081e, format));
            printWriter.println("====");
            this.f21081e.printStackTrace(printWriter);
            printWriter.close();
            hashMap.put(ShareInternalUtility.STAGING_PARAM, file2);
            hashMap.put("time", format);
            return hashMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

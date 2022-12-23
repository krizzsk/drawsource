package com.ogury.p376cm;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ogury.core.OguryError;
import com.ogury.p376cm.internal.aabca;
import com.ogury.p376cm.internal.abbbb;
import com.ogury.p376cm.internal.abbbc;
import com.ogury.p376cm.internal.babbc;
import com.ogury.p376cm.internal.babca;
import com.ogury.p376cm.internal.bbabb;
import com.ogury.p376cm.internal.bbabc;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.ConsentActivity */
public class ConsentActivity extends Activity {

    /* renamed from: a */
    public static final aaaaa f24131a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final FrameLayout.LayoutParams f24132b = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: c */
    private HashMap f24133c;

    /* renamed from: com.ogury.cm.ConsentActivity$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }

        /* renamed from: a */
        private static int m27622a(int i, int i2) {
            int i3 = i % 1;
            return i3 >= 0 ? i3 : i3 + 1;
        }

        /* renamed from: a */
        public static int m27623a(int i, int i2, int i3) {
            return i >= i2 ? i2 : i2 - m27622a(m27622a(i2, 1) - m27622a(i, 1), 1);
        }

        /* renamed from: a */
        public static /* synthetic */ long m27624a(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
            bbabc.m28052b(inputStream, "receiver$0");
            bbabc.m28052b(outputStream, "out");
            byte[] bArr = new byte[8192];
            int read = inputStream.read(bArr);
            long j = 0;
            while (read >= 0) {
                outputStream.write(bArr, 0, read);
                j += (long) read;
                read = inputStream.read(bArr);
            }
            return j;
        }

        /* renamed from: a */
        private static long m27625a(Reader reader, Writer writer, int i) {
            bbabc.m28052b(reader, "receiver$0");
            bbabc.m28052b(writer, "out");
            char[] cArr = new char[8192];
            int read = reader.read(cArr);
            long j = 0;
            while (read >= 0) {
                writer.write(cArr, 0, read);
                j += (long) read;
                read = reader.read(cArr);
            }
            return j;
        }

        /* renamed from: a */
        public static NetworkInfo m27626a(Context context) {
            bbabc.m28052b(context, "receiver$0");
            bbabc.m28052b(context, "receiver$0");
            bbabc.m28052b("android.permission.ACCESS_NETWORK_STATE", "permission");
            if (!(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)) {
                return null;
            }
            Object systemService = context.getSystemService("connectivity");
            if (systemService != null) {
                return ((ConnectivityManager) systemService).getActiveNetworkInfo();
            }
            throw new babca("null cannot be cast to non-null type android.net.ConnectivityManager");
        }

        /* renamed from: a */
        public static <A, B> babbc<A, B> m27627a(A a, B b) {
            return new babbc<>(a, b);
        }

        /* renamed from: a */
        public static String m27628a(Reader reader) {
            bbabc.m28052b(reader, "receiver$0");
            StringWriter stringWriter = new StringWriter();
            m27625a(reader, (Writer) stringWriter, 8192);
            String stringWriter2 = stringWriter.toString();
            bbabc.m28049a((Object) stringWriter2, "buffer.toString()");
            return stringWriter2;
        }

        /* renamed from: a */
        public static void m27629a(Closeable closeable) {
            bbabc.m28052b(closeable, "receiver$0");
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        public static boolean m27630a(JSONObject jSONObject) {
            bbabc.m28052b(jSONObject, "receiver$0");
            return jSONObject.length() == 0;
        }

        /* renamed from: b */
        public static boolean m27631b(Context context) {
            bbabc.m28052b(context, "receiver$0");
            NetworkInfo a = m27626a(context);
            return a != null && a.isConnected();
        }

        /* renamed from: c */
        public static String m27632c(Context context) {
            PackageInfo packageInfo;
            bbabc.m28052b(context, "receiver$0");
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0)) == null) {
                return null;
            }
            return packageInfo.versionName;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f24133c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f24133c == null) {
            this.f24133c = new HashMap();
        }
        View view = (View) this.f24133c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f24133c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        aabca aabca = aabca.f24267a;
        aabca.m27763a("DISPLAYING");
        aaaac aaaac = aaaac.f24147a;
        if (aaaac.m27652c() != null) {
            Context context = this;
            FrameLayout frameLayout = new FrameLayout(context, (AttributeSet) null);
            frameLayout.setLayoutParams(this.f24132b);
            aaaac aaaac2 = aaaac.f24147a;
            aaaaa b = aaaac.m27651b();
            if (b != null) {
                b.mo63763a(context);
            }
            aaaac aaaac3 = aaaac.f24147a;
            WebView c = aaaac.m27652c();
            if (Build.VERSION.SDK_INT < 16 && c != null) {
                c.setLayerType(1, (Paint) null);
            }
            aaaac aaaac4 = aaaac.f24147a;
            frameLayout.addView(aaaac.m27652c(), this.f24132b);
            aaaac aaaac5 = aaaac.f24147a;
            aaaac.m27643a((WebView) null);
            setContentView(frameLayout);
            return;
        }
        aaaac aaaac6 = aaaac.f24147a;
        abbbb a = aaaac.m27641a();
        if (a != null) {
            a.mo63770a(new OguryError(1003, "Cached webview has been destroyed"));
        }
        abbbc abbbc = abbbc.f24336a;
        abbbc.m27857b("Cached webview has been destroyed");
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        aaaac aaaac = aaaac.f24147a;
        aaaac.m27643a((WebView) null);
        aaaac aaaac2 = aaaac.f24147a;
        aaaac.m27644a((aaaaa) null);
        super.onDestroy();
    }
}

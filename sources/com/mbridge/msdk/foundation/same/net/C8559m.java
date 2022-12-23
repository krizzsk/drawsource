package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.foundation.same.net.p306a.C8508a;
import com.mbridge.msdk.foundation.same.net.p308c.C8513b;
import com.mbridge.msdk.foundation.same.net.p310e.C8535c;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.tools.C8672v;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.net.m */
/* compiled from: SocketManager */
public final class C8559m {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static volatile AtomicInteger f21018a = new AtomicInteger(1);

    /* renamed from: b */
    private ExecutorService f21019b;

    /* renamed from: com.mbridge.msdk.foundation.same.net.m$b */
    /* compiled from: SocketManager */
    private static final class C8562b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C8559m f21030a = new C8559m();
    }

    private C8559m() {
        this.f21019b = new ThreadPoolExecutor(5, 10, 5, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("SocketThreadPool");
                return newThread;
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
    }

    /* renamed from: a */
    public static C8559m m24550a() {
        return C8562b.f21030a;
    }

    /* renamed from: a */
    public final void mo58017a(String str, int i, String str2, boolean z, C8532e eVar) {
        this.f21019b.execute(new C8561a(str, i, str2, z, eVar));
    }

    /* renamed from: com.mbridge.msdk.foundation.same.net.m$a */
    /* compiled from: SocketManager */
    private class C8561a implements Runnable {

        /* renamed from: b */
        private String f21022b;

        /* renamed from: c */
        private ByteBuffer f21023c;

        /* renamed from: d */
        private OutputStream f21024d;

        /* renamed from: e */
        private boolean f21025e = false;

        /* renamed from: f */
        private C8532e f21026f;

        /* renamed from: g */
        private Socket f21027g;

        /* renamed from: h */
        private String f21028h;

        /* renamed from: i */
        private int f21029i;

        C8561a(String str, int i, String str2, boolean z, C8532e eVar) {
            this.f21028h = str;
            this.f21029i = i;
            this.f21022b = str2;
            this.f21025e = z;
            this.f21026f = eVar;
        }

        public final void run() {
            int i;
            String str;
            byte[] bArr;
            try {
                Socket socket = new Socket(this.f21028h, this.f21029i);
                this.f21027g = socket;
                socket.setSoTimeout(15000);
                boolean contains = this.f21028h.contains(C8543d.m24463a().f20956e);
                C8672v.m24878d("SocketManager", "Socket connect : " + this.f21028h + " : " + this.f21029i + " isAnalytics : " + contains);
                this.f21024d = this.f21027g.getOutputStream();
                ByteBuffer wrap = ByteBuffer.wrap(new byte[8]);
                this.f21023c = wrap;
                wrap.order(ByteOrder.BIG_ENDIAN);
                this.f21023c.put((byte) 2);
                if (TextUtils.isEmpty(this.f21022b)) {
                    this.f21023c.put((byte) 1);
                } else {
                    this.f21023c.put(this.f21025e ? (byte) 3 : 2);
                }
                this.f21023c.putShort((short) C8559m.f21018a.getAndIncrement());
                if (TextUtils.isEmpty(this.f21022b)) {
                    this.f21023c.putInt(0);
                    this.f21024d.write(this.f21023c.array());
                    i = 0;
                } else {
                    if (this.f21025e) {
                        String str2 = this.f21022b;
                        if (TextUtils.isEmpty(str2)) {
                            bArr = null;
                        } else {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(str2.getBytes());
                            gZIPOutputStream.close();
                            bArr = byteArrayOutputStream.toByteArray();
                        }
                    } else {
                        bArr = this.f21022b.getBytes();
                    }
                    i = bArr.length;
                    this.f21023c.putInt(i);
                    this.f21024d.write(this.f21023c.array());
                    this.f21024d.write(bArr);
                }
                this.f21024d.flush();
                C8672v.m24874a("SocketManager", "Socket Request : header : " + Arrays.toString(this.f21023c.array()) + " length : " + i);
                InputStream inputStream = this.f21027g.getInputStream();
                byte[] bArr2 = new byte[8];
                inputStream.read(bArr2, 0, 8);
                ByteBuffer wrap2 = ByteBuffer.wrap(bArr2);
                this.f21023c = wrap2;
                wrap2.order(ByteOrder.BIG_ENDIAN);
                int i2 = this.f21023c.getInt(4);
                boolean z = bArr2[1] == 3;
                C8672v.m24878d("SocketManager", "Socket Response : header : " + Arrays.toString(bArr2) + " length : " + i2 + " isGzip : " + z);
                byte[] bArr3 = new byte[i2];
                new DataInputStream(this.f21027g.getInputStream()).readFully(bArr3);
                if (!z && i2 > 2 && ((bArr3[0] << 8) | (bArr3[1] & 255)) == 8075) {
                    z = true;
                }
                if (this.f21026f == null) {
                    Socket socket2 = this.f21027g;
                    if (socket2 != null) {
                        try {
                            socket2.close();
                            this.f21023c = null;
                            this.f21024d.close();
                        } catch (IOException e) {
                            C8672v.m24878d("SocketManager", e.getMessage());
                        }
                    }
                } else if (i2 < 1) {
                    m24554a("The response data less than 1");
                    Socket socket3 = this.f21027g;
                    if (socket3 != null) {
                        try {
                            socket3.close();
                            this.f21023c = null;
                            this.f21024d.close();
                        } catch (IOException e2) {
                            C8672v.m24878d("SocketManager", e2.getMessage());
                        }
                    }
                } else if (contains) {
                    if (bArr3[0] == 1) {
                        this.f21026f.mo57895a(C8557k.m24541a(null, new C8535c(200, (byte[]) null, (List<C8513b>) null)));
                    } else {
                        m24554a("The server returns fail");
                    }
                    Socket socket4 = this.f21027g;
                    if (socket4 != null) {
                        try {
                            socket4.close();
                            this.f21023c = null;
                            this.f21024d.close();
                        } catch (IOException e3) {
                            C8672v.m24878d("SocketManager", e3.getMessage());
                        }
                    }
                } else {
                    if (z) {
                        str = C8559m.this.mo58016a(bArr3);
                    } else {
                        str = new String(bArr3);
                    }
                    JSONObject jSONObject = !TextUtils.isEmpty(str) ? new JSONObject(str) : null;
                    C8672v.m24878d("SocketManager", "Socket Response length : " + i2 + " " + str.length());
                    this.f21026f.mo57895a(C8557k.m24541a(jSONObject, new C8535c(200, (byte[]) null, (List<C8513b>) null)));
                    inputStream.close();
                    Socket socket5 = this.f21027g;
                    if (socket5 != null) {
                        try {
                            socket5.close();
                            this.f21023c = null;
                            this.f21024d.close();
                        } catch (IOException e4) {
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    String message = th.getMessage();
                    C8672v.m24874a("SocketManager", "Socket exception: " + message);
                    m24554a(message);
                } finally {
                    Socket socket6 = this.f21027g;
                    if (socket6 != null) {
                        try {
                            socket6.close();
                            this.f21023c = null;
                            this.f21024d.close();
                        } catch (IOException e42) {
                            C8672v.m24878d("SocketManager", e42.getMessage());
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        private void m24554a(String str) {
            if (this.f21026f != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "Unknown exception";
                }
                this.f21026f.mo57894a(new C8508a(13, new C8535c(TTAdConstant.DEEPLINK_FALLBACK_CODE, str.getBytes(), (List<C8513b>) null)));
            }
        }
    }

    /* renamed from: a */
    public final String mo58016a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr2, 0, 1024);
            if (read > 0) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
        }
    }
}

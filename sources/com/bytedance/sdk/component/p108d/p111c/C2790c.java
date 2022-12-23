package com.bytedance.sdk.component.p108d.p111c;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.sdk.component.p108d.C2759b;
import com.bytedance.sdk.component.p108d.C2825g;
import com.bytedance.sdk.component.p108d.C2826h;
import com.bytedance.sdk.component.p108d.C2827i;
import com.bytedance.sdk.component.p108d.C2828j;
import com.bytedance.sdk.component.p108d.C2832n;
import com.bytedance.sdk.component.p108d.C2836r;
import com.bytedance.sdk.component.p108d.C2837s;
import com.bytedance.sdk.component.p108d.C2838t;
import com.bytedance.sdk.component.p108d.p111c.p112a.C2767a;
import com.bytedance.sdk.component.p108d.p117d.C2811c;
import com.bytedance.sdk.component.p108d.p117d.C2816h;
import com.bytedance.sdk.component.p108d.p117d.C2817i;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.bytedance.sdk.component.d.c.c */
/* compiled from: ImageRequest */
public class C2790c implements C2826h {

    /* renamed from: a */
    Future<?> f6236a;

    /* renamed from: b */
    private String f6237b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f6238c;

    /* renamed from: d */
    private String f6239d;

    /* renamed from: e */
    private C2832n f6240e;

    /* renamed from: f */
    private ImageView.ScaleType f6241f;

    /* renamed from: g */
    private Bitmap.Config f6242g;

    /* renamed from: h */
    private int f6243h;

    /* renamed from: i */
    private int f6244i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C2838t f6245j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public WeakReference<ImageView> f6246k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public volatile boolean f6247l;

    /* renamed from: m */
    private boolean f6248m;

    /* renamed from: n */
    private boolean f6249n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C2836r f6250o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C2837s f6251p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Queue<C2817i> f6252q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Handler f6253r;

    /* renamed from: s */
    private boolean f6254s;

    /* renamed from: t */
    private C2825g f6255t;

    /* renamed from: u */
    private int f6256u;

    /* renamed from: v */
    private C2804f f6257v;

    /* renamed from: w */
    private C2766a f6258w;

    /* renamed from: x */
    private C2759b f6259x;

    private C2790c(C2796b bVar) {
        C2837s sVar;
        this.f6252q = new LinkedBlockingQueue();
        this.f6253r = new Handler(Looper.getMainLooper());
        this.f6254s = true;
        this.f6237b = bVar.f6275d;
        this.f6240e = new C2792a(bVar.f6272a);
        this.f6246k = new WeakReference<>(bVar.f6273b);
        this.f6241f = bVar.f6276e;
        this.f6242g = bVar.f6277f;
        this.f6243h = bVar.f6278g;
        this.f6244i = bVar.f6279h;
        this.f6245j = bVar.f6280i == null ? C2838t.AUTO : bVar.f6280i;
        if (bVar.f6281j == null) {
            sVar = C2837s.MAIN;
        } else {
            sVar = bVar.f6281j;
        }
        this.f6251p = sVar;
        this.f6250o = bVar.f6282k;
        this.f6259x = m7655a(bVar);
        if (!TextUtils.isEmpty(bVar.f6274c)) {
            mo17611b(bVar.f6274c);
            mo17607a(bVar.f6274c);
        }
        this.f6248m = bVar.f6283l;
        this.f6249n = bVar.f6284m;
        this.f6257v = bVar.f6287p;
        this.f6252q.add(new C2811c());
    }

    /* renamed from: a */
    private C2759b m7655a(C2796b bVar) {
        if (bVar.f6286o != null) {
            return bVar.f6286o;
        }
        if (!TextUtils.isEmpty(bVar.f6285n)) {
            return C2767a.m7543a(new File(bVar.f6285n));
        }
        return C2767a.m7545f();
    }

    /* renamed from: a */
    public String mo17603a() {
        return this.f6237b;
    }

    /* renamed from: f */
    public C2832n mo17615f() {
        return this.f6240e;
    }

    /* renamed from: g */
    public String mo17616g() {
        return this.f6239d;
    }

    /* renamed from: a */
    public void mo17607a(String str) {
        this.f6239d = str;
    }

    /* renamed from: e */
    public String mo17614e() {
        return this.f6238c;
    }

    /* renamed from: b */
    public void mo17611b(String str) {
        WeakReference<ImageView> weakReference = this.f6246k;
        if (!(weakReference == null || weakReference.get() == null)) {
            ((ImageView) this.f6246k.get()).setTag(1094453505, str);
        }
        this.f6238c = str;
    }

    /* renamed from: d */
    public ImageView.ScaleType mo17613d() {
        return this.f6241f;
    }

    /* renamed from: h */
    public Bitmap.Config mo17617h() {
        return this.f6242g;
    }

    /* renamed from: b */
    public int mo17610b() {
        return this.f6243h;
    }

    /* renamed from: c */
    public int mo17612c() {
        return this.f6244i;
    }

    /* renamed from: i */
    public C2838t mo17618i() {
        return this.f6245j;
    }

    /* renamed from: j */
    public boolean mo17619j() {
        return this.f6248m;
    }

    /* renamed from: k */
    public boolean mo17620k() {
        return this.f6249n;
    }

    /* renamed from: a */
    public void mo17608a(boolean z) {
        this.f6254s = z;
    }

    /* renamed from: l */
    public boolean mo17621l() {
        return this.f6254s;
    }

    /* renamed from: m */
    public C2825g mo17622m() {
        return this.f6255t;
    }

    /* renamed from: a */
    public void mo17606a(C2825g gVar) {
        this.f6255t = gVar;
    }

    /* renamed from: n */
    public int mo17623n() {
        return this.f6256u;
    }

    /* renamed from: a */
    public void mo17604a(int i) {
        this.f6256u = i;
    }

    /* renamed from: o */
    public C2766a mo17624o() {
        return this.f6258w;
    }

    /* renamed from: a */
    public void mo17605a(C2766a aVar) {
        this.f6258w = aVar;
    }

    /* renamed from: p */
    public C2804f mo17625p() {
        return this.f6257v;
    }

    /* renamed from: q */
    public C2759b mo17626q() {
        return this.f6259x;
    }

    /* renamed from: a */
    public boolean mo17609a(C2817i iVar) {
        if (this.f6247l) {
            return false;
        }
        return this.f6252q.add(iVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public C2826h m7667s() {
        try {
            if (this.f6257v == null) {
                if (this.f6240e != null) {
                    this.f6240e.mo17178a(1005, "not init !", (Throwable) null);
                }
                return this;
            }
            ExecutorService e = this.f6257v.mo17673e();
            if (e != null) {
                this.f6236a = e.submit(new Runnable() {
                    public void run() {
                        while (true) {
                            try {
                                if (C2790c.this.f6247l) {
                                    break;
                                }
                                C2817i iVar = (C2817i) C2790c.this.f6252q.poll();
                                if (iVar == null) {
                                    break;
                                }
                                if (C2790c.this.f6250o != null) {
                                    C2790c.this.f6250o.mo17680a(iVar.mo17677a(), C2790c.this);
                                }
                                iVar.mo17678a(C2790c.this);
                                if (C2790c.this.f6250o != null) {
                                    C2790c.this.f6250o.mo17681b(iVar.mo17677a(), C2790c.this);
                                }
                            } catch (Throwable th) {
                                C2790c.this.m7656a(2000, th.getMessage(), th);
                                if (C2790c.this.f6250o != null) {
                                    C2790c.this.f6250o.mo17681b("exception", C2790c.this);
                                    return;
                                }
                                return;
                            }
                        }
                        if (C2790c.this.f6247l) {
                            C2790c.this.m7656a(1003, "canceled", (Throwable) null);
                        }
                    }
                });
            }
            return this;
        } catch (Exception e2) {
            Log.e("ImageRequest", e2.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7656a(int i, String str, Throwable th) {
        new C2816h(i, str, th).mo17678a(this);
        this.f6252q.clear();
    }

    /* renamed from: r */
    public String mo17627r() {
        return mo17614e() + mo17618i();
    }

    /* renamed from: com.bytedance.sdk.component.d.c.c$b */
    /* compiled from: ImageRequest */
    public static class C2796b implements C2827i {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C2832n f6272a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public ImageView f6273b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f6274c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f6275d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public ImageView.ScaleType f6276e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Bitmap.Config f6277f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f6278g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f6279h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C2838t f6280i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C2837s f6281j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C2836r f6282k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f6283l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public boolean f6284m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public String f6285n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public C2759b f6286o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public C2804f f6287p;

        public C2796b(C2804f fVar) {
            this.f6287p = fVar;
        }

        /* renamed from: c */
        public C2827i mo17643c(String str) {
            this.f6275d = str;
            return this;
        }

        /* renamed from: a */
        public C2827i mo17639a(String str) {
            this.f6274c = str;
            return this;
        }

        /* renamed from: a */
        public C2827i mo17636a(ImageView.ScaleType scaleType) {
            this.f6276e = scaleType;
            return this;
        }

        /* renamed from: a */
        public C2827i mo17635a(Bitmap.Config config) {
            this.f6277f = config;
            return this;
        }

        /* renamed from: a */
        public C2827i mo17634a(int i) {
            this.f6278g = i;
            return this;
        }

        /* renamed from: b */
        public C2827i mo17641b(int i) {
            this.f6279h = i;
            return this;
        }

        /* renamed from: a */
        public C2827i mo17638a(C2838t tVar) {
            this.f6280i = tVar;
            return this;
        }

        /* renamed from: a */
        public C2827i mo17637a(C2836r rVar) {
            this.f6282k = rVar;
            return this;
        }

        /* renamed from: a */
        public C2827i mo17640a(boolean z) {
            this.f6284m = z;
            return this;
        }

        /* renamed from: b */
        public C2827i mo17642b(String str) {
            this.f6285n = str;
            return this;
        }

        /* renamed from: a */
        public C2826h mo17633a(C2832n nVar) {
            this.f6272a = nVar;
            return new C2790c(this).m7667s();
        }

        /* renamed from: a */
        public C2826h mo17632a(ImageView imageView) {
            this.f6273b = imageView;
            return new C2790c(this).m7667s();
        }
    }

    /* renamed from: com.bytedance.sdk.component.d.c.c$a */
    /* compiled from: ImageRequest */
    private class C2792a implements C2832n {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C2832n f6262b;

        public C2792a(C2832n nVar) {
            this.f6262b = nVar;
        }

        /* renamed from: a */
        public void mo17179a(final C2828j jVar) {
            final ImageView imageView = (ImageView) C2790c.this.f6246k.get();
            if (imageView != null && C2790c.this.f6245j != C2838t.RAW && m7694a(imageView) && (jVar.mo17647b() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) jVar.mo17647b();
                C2790c.this.f6253r.post(new Runnable() {
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            if (C2790c.this.f6251p == C2837s.MAIN) {
                C2790c.this.f6253r.post(new Runnable() {
                    public void run() {
                        if (C2792a.this.f6262b != null) {
                            C2792a.this.f6262b.mo17179a(jVar);
                        }
                    }
                });
                return;
            }
            C2832n nVar = this.f6262b;
            if (nVar != null) {
                nVar.mo17179a(jVar);
            }
        }

        /* renamed from: a */
        private boolean m7694a(ImageView imageView) {
            Object tag;
            if (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(C2790c.this.f6238c)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public void mo17178a(final int i, final String str, final Throwable th) {
            if (C2790c.this.f6251p == C2837s.MAIN) {
                C2790c.this.f6253r.post(new Runnable() {
                    public void run() {
                        if (C2792a.this.f6262b != null) {
                            C2792a.this.f6262b.mo17178a(i, str, th);
                        }
                    }
                });
                return;
            }
            C2832n nVar = this.f6262b;
            if (nVar != null) {
                nVar.mo17178a(i, str, th);
            }
        }
    }
}

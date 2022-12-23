package com.mbridge.msdk.foundation.same.p302c;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.C8536f;
import com.mbridge.msdk.foundation.same.net.C8557k;
import com.mbridge.msdk.foundation.same.net.p306a.C8508a;
import com.mbridge.msdk.foundation.same.net.p312g.C8548b;
import com.mbridge.msdk.foundation.same.p304e.C8490a;
import java.io.File;

/* renamed from: com.mbridge.msdk.foundation.same.c.d */
/* compiled from: CommonImageTask */
public final class C8485d extends C8490a {

    /* renamed from: a */
    private String f20815a;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f20816e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f20817f;

    /* renamed from: g */
    private boolean f20818g = false;

    /* renamed from: h */
    private C8487a f20819h;

    /* renamed from: com.mbridge.msdk.foundation.same.c.d$a */
    /* compiled from: CommonImageTask */
    public interface C8487a {
        /* renamed from: a */
        void mo57888a(String str, String str2);

        /* renamed from: b */
        void mo57889b(String str, String str2);
    }

    /* renamed from: b */
    public final void mo37111b() {
    }

    /* renamed from: a */
    public final void mo57891a(boolean z) {
        this.f20818g = z;
    }

    /* renamed from: a */
    public final void mo57890a(C8487a aVar) {
        this.f20819h = aVar;
    }

    public C8485d(String str, String str2, String str3) {
        this.f20815a = str;
        this.f20816e = str2;
        this.f20817f = str3;
    }

    /* renamed from: e */
    private void m24330e() {
        try {
            File file = new File(this.f20817f);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            C8548b.m24478a(file, this.f20816e, new C8536f<Void>() {
                /* renamed from: a */
                public final void mo57893a(long j, long j2) {
                }

                /* renamed from: b */
                public final void mo57896b() {
                }

                /* renamed from: a */
                public final void mo57895a(C8557k kVar) {
                    String unused = C8485d.this.f20817f;
                    C8485d.this.mo57892c();
                }

                /* renamed from: a */
                public final void mo57894a(C8508a aVar) {
                    C8485d dVar = C8485d.this;
                    String b = dVar.f20816e;
                    dVar.m24328a(b, "load image from http faild because http return code: " + aVar.f20851a + ".image url is " + C8485d.this.f20816e);
                }
            });
        } catch (Exception e) {
            m24328a(this.f20816e, e.getMessage());
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        } catch (OutOfMemoryError e2) {
            m24328a(this.f20816e, e2.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo57892c() {
        if (new File(this.f20817f).exists()) {
            String str = this.f20816e;
            String str2 = this.f20817f;
            C8487a aVar = this.f20819h;
            if (aVar != null) {
                aVar.mo57888a(str, str2);
                return;
            }
            return;
        }
        m24328a(this.f20816e, "load image faild.because file[" + this.f20817f + "] is not exist!");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24328a(String str, String str2) {
        C8487a aVar = this.f20819h;
        if (aVar != null) {
            aVar.mo57889b(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo37110a() {
        if (this.f20818g) {
            m24330e();
        } else if (TextUtils.isEmpty(this.f20817f)) {
            m24328a(this.f20816e, "save path is null.");
        } else {
            File file = new File(this.f20817f);
            if (!file.exists() || file.length() <= 0) {
                m24330e();
            } else {
                mo57892c();
            }
        }
    }
}

package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.facebook.share.internal.ShareConstants;
import com.fyber.inneractive.sdk.player.controller.C4582g;
import com.fyber.inneractive.sdk.player.enums.C4610b;
import com.fyber.inneractive.sdk.player.mediaplayer.C5018a;
import com.fyber.inneractive.sdk.player.mediaplayer.C5032b;
import com.fyber.inneractive.sdk.player.mediaplayer.C5033c;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.controller.a */
public class C4573a extends C4582g {

    /* renamed from: p */
    public C5018a f11340p;

    /* renamed from: q */
    public int f11341q = 0;

    /* renamed from: r */
    public int f11342r = 2;

    /* renamed from: s */
    public int f11343s = 0;

    /* renamed from: t */
    public boolean f11344t = false;

    public C4573a(Context context) {
        super(context);
        IAlog.m16446a("Creating IAAndroidMediaPlayerController", new Object[0]);
    }

    /* renamed from: a */
    public void mo24782a(int i, boolean z) {
        C5018a aVar = this.f11340p;
        if (aVar != null) {
            IAlog.m16446a("%s seek to called with = %d mPlayAfterSeek = %s", aVar.mo25615c(), Integer.valueOf(i), Boolean.valueOf(z));
            if (!aVar.mo25614b()) {
                IAlog.m16446a("%s seek called when player is not ready!", aVar.mo25615c());
                return;
            }
            C4610b bVar = aVar.f13379b;
            C4610b bVar2 = C4610b.Seeking;
            if (bVar == bVar2) {
                IAlog.m16446a("%s seek called when player is already seeking!", aVar.mo25615c());
                return;
            }
            aVar.mo25610a(bVar2);
            aVar.f13380c = z;
            aVar.mo25611a((Runnable) new C5032b(aVar, i));
        }
    }

    /* renamed from: a */
    public boolean mo24786a() {
        return false;
    }

    /* renamed from: b */
    public void mo24787b() {
        C5018a aVar = this.f11340p;
        if (aVar != null) {
            aVar.reset();
            this.f11340p.release();
            this.f11340p = null;
        }
        super.mo24787b();
    }

    /* renamed from: c */
    public int mo24789c() {
        C5018a aVar = this.f11340p;
        if (aVar != null) {
            return aVar.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: d */
    public void mo24791d(boolean z) {
        mo24834c(false);
        if (mo24796i() || !this.f11391n) {
            this.f11391n = z;
            C5018a aVar = this.f11340p;
            if (aVar != null) {
                IAlog.m16446a("%s unmute", aVar.mo25615c());
                aVar.f13381d = false;
                if (aVar.mo25614b()) {
                    aVar.mo25611a((Runnable) new C5033c(aVar));
                    return;
                }
                IAlog.m16446a("%s unmute called when player is not ready!", aVar.mo25615c());
            }
        }
    }

    /* renamed from: e */
    public Bitmap mo24792e() {
        return null;
    }

    /* renamed from: f */
    public String mo24793f() {
        return ShareConstants.WEB_DIALOG_PARAM_MEDIA;
    }

    /* renamed from: g */
    public int mo24794g() {
        C5018a aVar = this.f11340p;
        if (aVar != null) {
            return aVar.f13397t;
        }
        return 0;
    }

    /* renamed from: h */
    public int mo24795h() {
        C5018a aVar = this.f11340p;
        if (aVar != null) {
            return aVar.f13396s;
        }
        return 0;
    }

    /* renamed from: i */
    public boolean mo24796i() {
        C5018a aVar = this.f11340p;
        if (aVar != null) {
            return aVar.f13381d;
        }
        return false;
    }

    /* renamed from: k */
    public void mo24797k() {
        C5018a aVar = this.f11340p;
        if (aVar != null) {
            aVar.pause();
        }
    }

    /* renamed from: l */
    public void mo24798l() {
        C5018a aVar = this.f11340p;
        if (aVar != null) {
            aVar.start();
        }
    }

    /* renamed from: b */
    public void mo24788b(boolean z) {
        mo24834c(true);
        if (!mo24796i() || !this.f11391n) {
            this.f11391n = z;
            C5018a aVar = this.f11340p;
            if (aVar != null) {
                aVar.mo25617e();
            }
        }
    }

    /* renamed from: a */
    public void mo24783a(Surface surface) {
        C5018a aVar = this.f11340p;
        if (aVar != null) {
            aVar.setSurface(surface);
        }
    }

    /* renamed from: a */
    public void mo24785a(boolean z) {
        if (this.f11340p == null) {
            IAlog.m16446a("MediaPlayerController: creating media player", new Object[0]);
            this.f11340p = new C5018a(this.f11378a, this, this.f11386i);
        }
    }

    /* renamed from: d */
    public int mo24790d() {
        C5018a aVar = this.f11340p;
        if (aVar != null) {
            return aVar.f13395r;
        }
        return 0;
    }

    /* renamed from: a */
    public void mo24784a(String str, int i) {
        this.f11340p.mo25612a(str);
    }

    /* renamed from: a */
    public void mo24781a(int i) {
        this.f11386i.post(new C4582g.C4584b(i));
        if (i >= mo24790d()) {
            mo24832a(C4610b.f11462i);
        } else if (i == this.f11341q) {
            IAlog.m16446a("%sVideo is stuck! Progress doesn't change", IAlog.m16443a((Object) this));
            int i2 = this.f11343s + 1;
            this.f11343s = i2;
            if (i2 == this.f11342r) {
                mo24832a(C4610b.Buffering);
                this.f11344t = true;
            }
        } else if (this.f11344t) {
            IAlog.m16446a("%sVideo progress was stuck! but now it goes forward. Remove buffering state", IAlog.m16443a((Object) this));
            mo24832a(C4610b.Playing);
            this.f11343s = 0;
            this.f11344t = false;
        }
        this.f11341q = i;
    }
}

package com.fyber.inneractive.sdk.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.fyber.inneractive.sdk.config.C4204a0;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.config.global.features.C4234j;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.C4392y;
import com.fyber.inneractive.sdk.measurement.C4401a;
import com.fyber.inneractive.sdk.measurement.C4408g;
import com.fyber.inneractive.sdk.model.vast.C4421c;
import com.fyber.inneractive.sdk.model.vast.C4431m;
import com.fyber.inneractive.sdk.model.vast.C4435q;
import com.fyber.inneractive.sdk.network.C4489h0;
import com.fyber.inneractive.sdk.network.C4501m0;
import com.fyber.inneractive.sdk.network.C4509p;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.player.controller.C4573a;
import com.fyber.inneractive.sdk.player.controller.C4575c;
import com.fyber.inneractive.sdk.player.controller.C4577d;
import com.fyber.inneractive.sdk.player.controller.C4582g;
import com.fyber.inneractive.sdk.player.enums.C4610b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.response.C5235g;
import com.fyber.inneractive.sdk.response.C5237i;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.C5307q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.player.c */
public abstract class C4533c implements C4582g.C4588f, C4582g.C4587e {

    /* renamed from: a */
    public Context f11204a;

    /* renamed from: b */
    public C4582g f11205b;

    /* renamed from: c */
    public String f11206c;

    /* renamed from: d */
    public final C4251s f11207d;

    /* renamed from: e */
    public Runnable f11208e;

    /* renamed from: f */
    public C4392y f11209f;

    /* renamed from: g */
    public InneractiveAdRequest f11210g;

    /* renamed from: h */
    public C4401a f11211h;

    /* renamed from: i */
    public C4408g f11212i;

    /* renamed from: j */
    public C5013g f11213j = null;

    /* renamed from: k */
    public boolean f11214k = true;

    /* renamed from: l */
    public Bitmap f11215l;

    /* renamed from: m */
    public C5307q f11216m;

    /* renamed from: n */
    public C5307q.C5308a f11217n;

    /* renamed from: o */
    public boolean f11218o = false;

    /* renamed from: p */
    public volatile boolean f11219p = false;

    /* renamed from: q */
    public boolean f11220q = false;

    /* renamed from: r */
    public boolean f11221r = false;

    /* renamed from: s */
    public int f11222s = 0;

    /* renamed from: t */
    public C5014h f11223t;

    /* renamed from: u */
    public int f11224u;

    /* renamed from: v */
    public C4431m f11225v;

    /* renamed from: w */
    public C4582g.C4586d f11226w = new C4535b();

    /* renamed from: com.fyber.inneractive.sdk.player.c$a */
    public class C4534a implements Runnable {
        public C4534a() {
        }

        public void run() {
            C4533c cVar = C4533c.this;
            IAlog.m16446a("IAMediaPlayerFlowManager: onBufferTimeout reached: mBufferTimeoutRunnable = %s isDestroyed = %s", cVar.f11208e, Boolean.valueOf(cVar.f11219p));
            if (cVar.f11208e != null && !cVar.f11219p) {
                cVar.f11221r = true;
                int c = cVar.f11205b.mo24789c();
                int d = cVar.f11205b.mo24790d();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", d);
                    jSONObject.put("position", c);
                } catch (JSONException unused) {
                }
                cVar.f11208e = null;
                if (!cVar.f11218o) {
                    C4582g gVar = cVar.f11205b;
                    if (gVar != null) {
                        gVar.mo24787b();
                        cVar.f11205b = null;
                        cVar.mo24719b();
                    }
                    cVar.mo24715a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_PRE_BUFFER_TIMEOUT), (JSONObject) null);
                    return;
                }
                cVar.mo24715a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_BUFFER_TIMEOUT), jSONObject);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c$b */
    public class C4535b implements C4582g.C4586d {
        public C4535b() {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c$c */
    public interface C4536c {
        /* renamed from: a */
        void mo24727a(C4533c cVar);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c$d */
    public class C4537d extends Exception {
    }

    public C4533c(Context context, Set<Vendor> set, C4251s sVar) {
        this.f11204a = context;
        this.f11207d = sVar;
        mo24719b();
    }

    /* renamed from: a */
    public void mo24714a(Bitmap bitmap) {
        IAlog.m16446a("IAMediaPlayerFlowManager: saving snapshot %s", bitmap);
        this.f11215l = null;
        this.f11215l = bitmap;
    }

    /* renamed from: a */
    public abstract void mo24715a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject);

    /* renamed from: a */
    public abstract void mo24716a(C5237i iVar, VideoClickOrigin videoClickOrigin, C4435q... qVarArr);

    /* renamed from: a */
    public abstract void mo24718a(boolean z);

    /* renamed from: b */
    public final void mo24719b() {
        C4582g gVar;
        boolean z;
        Context context = this.f11204a;
        C4251s sVar = this.f11207d;
        if (sVar != null) {
            try {
                z = ((C4234j) sVar.mo24264a(C4234j.class)).mo24239a("use_fmp_cache_mechanism", false);
            } catch (Throwable th) {
                if (IAlog.f13936a <= 3) {
                    IAlog.m16446a("Failed creating exo player", new Object[0]);
                    th.printStackTrace();
                }
                gVar = null;
            }
        } else {
            z = false;
        }
        gVar = new C4577d(context, z, sVar);
        if (gVar == null) {
            gVar = new C4573a(context);
        }
        this.f11205b = gVar;
        List<C4582g.C4588f> list = gVar.f11379b;
        if (list != null && !list.contains(this)) {
            gVar.f11379b.add(this);
        }
        C4582g gVar2 = this.f11205b;
        List<C4582g.C4587e> list2 = gVar2.f11380c;
        if (list2 != null && !list2.contains(this)) {
            gVar2.f11380c.add(this);
        }
        this.f11205b.f11383f = this.f11226w;
    }

    /* renamed from: c */
    public abstract View mo24721c();

    /* renamed from: d */
    public abstract C4575c mo24722d();

    /* renamed from: e */
    public void mo24723e(boolean z) {
        JSONArray jSONArray;
        String str;
        try {
            C4392y yVar = this.f11209f;
            C5235g gVar = yVar != null ? (C5235g) yVar.f10713b : null;
            C4509p pVar = C4509p.VAST_MEDIA_LOAD_RETRY_ATTEMPTED;
            InneractiveAdRequest inneractiveAdRequest = this.f11210g;
            C4392y yVar2 = this.f11209f;
            if (yVar2 == null) {
                jSONArray = null;
            } else {
                jSONArray = yVar2.f10714c.mo24268c();
            }
            C4511q.C4512a aVar = new C4511q.C4512a(gVar);
            aVar.f11164c = pVar;
            aVar.f11162a = inneractiveAdRequest;
            aVar.f11165d = jSONArray;
            if (!(this.f11225v == null || gVar == null)) {
                C4511q.C4514b a = new C4511q.C4514b().mo24695a("waudio", String.valueOf(z)).mo24695a("url", this.f11225v.f10916g).mo24695a(MediaFile.BITRATE, this.f11225v.f10914e);
                if (TextUtils.isEmpty(this.f11225v.f10913d)) {
                    str = "na";
                } else {
                    str = this.f11225v.f10913d;
                }
                aVar.f11167f.put(a.mo24695a("mime", str).mo24695a(MediaFile.DELIVERY, this.f11225v.f10910a).mo24695a("media_file_index", Integer.valueOf(this.f11222s)).mo24695a("player", this.f11205b.mo24793f()).f11177a);
            }
            aVar.mo24693a((String) null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public abstract C4421c mo24724f();

    /* renamed from: g */
    public void mo24725g() {
        C4582g gVar = this.f11205b;
        if (gVar != null) {
            C4610b bVar = gVar.f11382e;
            if (bVar == C4610b.f11462i || bVar == C4610b.Prepared) {
                gVar.mo24782a(1, true);
            } else {
                gVar.mo24798l();
            }
        }
    }

    /* renamed from: a */
    public void mo24717a(Exception exc) {
        Object[] objArr = new Object[1];
        objArr[0] = exc != null ? exc.getMessage() : "no exception";
        IAlog.m16446a("IMediaPlayerFlowManager: onPlayerError called with: %s", objArr);
        InneractiveVideoError inneractiveVideoError = new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, exc);
        if (exc instanceof C4537d) {
            ((C4537d) exc).getClass();
        }
        mo24715a(inneractiveVideoError, (JSONObject) null);
        if (this.f11218o) {
            IAlog.m16446a("IMediaPlayerFlowManager: onPlayerError video was prepared. This is a critical error. Aborting!", new Object[0]);
            mo24715a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, exc), (JSONObject) null);
        }
    }

    /* renamed from: a */
    public static void m13816a(List<String> list) {
        for (String next : list) {
            C4489h0 h0Var = new C4489h0(new C4532b(next, System.currentTimeMillis()), next);
            IAConfigManager.f10324J.f10354t.f11186a.offer(h0Var);
            h0Var.f11027f = C4501m0.QUEUED;
        }
    }

    /* renamed from: a */
    public void mo24712a() {
        Runnable runnable = this.f11208e;
        if (runnable != null) {
            C5299n.f14024b.removeCallbacks(runnable);
            this.f11208e = null;
            IAlog.m16446a("IMediaPlayerFlowManager:: cancelBufferTimeout - running timeout runnable cancelled", new Object[0]);
        }
    }

    /* renamed from: b */
    public void mo24720b(boolean z) {
        this.f11214k = z;
    }

    /* renamed from: a */
    public void mo24713a(long j) {
        mo24712a();
        C4534a aVar = new C4534a();
        this.f11208e = aVar;
        C5299n.f14024b.postDelayed(aVar, j);
        IAlog.m16446a("IMediaPlayerFlowManager:: startBufferTimeout called with %d m/sec", Long.valueOf(j));
    }

    /* renamed from: a */
    public static int m13815a(C4533c cVar) {
        T t;
        C4392y yVar = cVar.f11209f;
        if (yVar == null || (t = yVar.f10713b) == null) {
            return -1;
        }
        return ((C5235g) t).f13887w;
    }

    /* renamed from: a */
    public static boolean m13817a(int i, C4288z zVar, int i2) {
        if (i2 == 1) {
            return true;
        }
        if (i <= 15999) {
            return false;
        }
        C4204a0 a0Var = ((C4287y) zVar).f10549f;
        if (a0Var == null || a0Var.f10376h == Skip.DEFAULT || a0Var.f10378j == UnitDisplayType.REWARDED) {
            return false;
        }
        return true;
    }
}

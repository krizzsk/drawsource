package com.fyber.inneractive.sdk.flow;

import android.app.Activity;
import android.content.res.Resources;
import android.os.CountDownTimer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.interfaces.C4397c;
import com.fyber.inneractive.sdk.network.C4509p;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5253a;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.C5326w0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.s */
public abstract class C4375s<AdContent extends C4361j, EventsListener extends InneractiveUnitController.EventsListener> extends C4363l<AdContent, EventsListener> implements C4397c {

    /* renamed from: k */
    public C4397c.C4398a f10755k;

    /* renamed from: l */
    public Runnable f10756l;

    /* renamed from: m */
    public C5326w0 f10757m;

    /* renamed from: n */
    public Runnable f10758n;

    /* renamed from: o */
    public C5326w0 f10759o;

    /* renamed from: p */
    public boolean f10760p = false;

    /* renamed from: q */
    public boolean f10761q = false;

    /* renamed from: r */
    public long f10762r;

    /* renamed from: s */
    public boolean f10763s = false;

    /* renamed from: t */
    public boolean f10764t = false;

    /* renamed from: u */
    public final C5253a f10765u = new C5253a();

    /* renamed from: v */
    public CountDownTimer f10766v;

    /* renamed from: com.fyber.inneractive.sdk.flow.s$a */
    public class C4376a extends CountDownTimer {
        public C4376a(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            CountDownTimer countDownTimer = C4375s.this.f10766v;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            C4375s.this.mo24553e(false);
        }

        public void onTick(long j) {
            int i = ((int) j) / 1000;
            C4397c.C4398a aVar = C4375s.this.f10755k;
            if (aVar != null) {
                aVar.updateCloseCountdown(i);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.s$b */
    public class C4377b implements C5326w0.C5328b {
        public C4377b() {
        }

        /* renamed from: a */
        public void mo24200a(C5326w0 w0Var) {
            C5299n.f14024b.post(C4375s.this.f10756l);
            C4375s sVar = C4375s.this;
            C5326w0 w0Var2 = sVar.f10757m;
            if (w0Var2 != null) {
                w0Var2.f14065e = null;
                sVar.f10757m = null;
            }
            boolean unused = sVar.f10761q = false;
        }
    }

    /* renamed from: E */
    public abstract boolean mo24333E();

    /* renamed from: F */
    public void mo24549F() {
        if (this.f10756l == null) {
            this.f10762r = mo24336I();
            AdContent adcontent = this.f10720b;
            boolean b = adcontent != null ? mo24342b(adcontent) : false;
            this.f10756l = new C4373r(this, this.f10762r);
            IAlog.m16446a("%senabling close with delay %d", IAlog.m16443a((Object) this), Long.valueOf(this.f10762r));
            if (!b || mo24333E()) {
                mo24550K();
            } else if (b) {
                C4397c.C4398a aVar = this.f10755k;
                if (aVar != null) {
                    aVar.showCloseCountdown();
                }
                C4376a aVar2 = new C4376a(100 + this.f10762r, 1000);
                this.f10766v = aVar2;
                aVar2.start();
            }
        }
    }

    /* renamed from: G */
    public abstract int mo24334G();

    /* renamed from: H */
    public abstract int mo24335H();

    /* renamed from: I */
    public abstract long mo24336I();

    /* renamed from: J */
    public abstract boolean mo24337J();

    /* renamed from: K */
    public void mo24550K() {
        if (!this.f10761q) {
            this.f10761q = true;
            C5326w0 w0Var = new C5326w0(TimeUnit.MILLISECONDS, this.f10762r);
            this.f10757m = w0Var;
            w0Var.f14065e = new C4377b();
            w0Var.mo26411c();
        }
    }

    /* renamed from: a */
    public abstract long mo24338a(long j);

    /* renamed from: b */
    public abstract boolean mo24342b(AdContent adcontent);

    /* renamed from: c */
    public void mo24551c(boolean z) {
    }

    /* renamed from: d */
    public void mo24552d(boolean z) {
        C4511q.C4512a aVar;
        if (this.f10720b == null) {
            C4509p pVar = C4509p.MRAID_CUSTOM_CLOSE_DETECTED;
            aVar = new C4511q.C4512a((C5233e) null);
            aVar.f11164c = pVar;
            aVar.f11162a = null;
            aVar.f11165d = null;
        } else {
            C4509p pVar2 = C4509p.MRAID_CUSTOM_CLOSE_DETECTED;
            AdContent adcontent = this.f10720b;
            InneractiveAdRequest inneractiveAdRequest = adcontent.f10712a;
            C5233e c = adcontent.mo24293c();
            JSONArray c2 = this.f10720b.f10714c.mo24268c();
            aVar = new C4511q.C4512a(c);
            aVar.f11164c = pVar2;
            aVar.f11162a = inneractiveAdRequest;
            aVar.f11165d = c2;
        }
        JSONObject jSONObject = new JSONObject();
        Boolean valueOf = Boolean.valueOf(z);
        try {
            jSONObject.put("fyber_close_enabled", valueOf);
        } catch (Exception unused) {
            IAlog.m16450e("Got exception adding param to json object: %s, %s", "fyber_close_enabled", valueOf);
        }
        aVar.f11167f.put(jSONObject);
        aVar.mo24693a((String) null);
    }

    public void destroy() {
        Runnable runnable = this.f10756l;
        if (runnable != null) {
            C5299n.f14024b.removeCallbacks(runnable);
            this.f10756l = null;
        }
        Runnable runnable2 = this.f10758n;
        if (runnable2 != null) {
            C5299n.f14024b.removeCallbacks(runnable2);
            this.f10758n = null;
        }
        C4397c.C4398a aVar = this.f10755k;
        if (aVar != null) {
            aVar.destroy();
        }
        this.f10755k = null;
        CountDownTimer countDownTimer = this.f10766v;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f10766v = null;
        }
        C5326w0 w0Var = this.f10759o;
        if (w0Var != null) {
            w0Var.f14065e = null;
            this.f10759o = null;
        }
        C5326w0 w0Var2 = this.f10757m;
        if (w0Var2 != null) {
            w0Var2.f14065e = null;
            this.f10757m = null;
        }
        super.destroy();
    }

    /* renamed from: e */
    public void mo24553e(boolean z) {
        C4511q.C4512a aVar;
        this.f10760p = true;
        if (z) {
            if (this.f10720b == null) {
                C4509p pVar = C4509p.FAIL_SAFE_ACTIVATED;
                aVar = new C4511q.C4512a((C5233e) null);
                aVar.f11164c = pVar;
                aVar.f11162a = null;
                aVar.f11165d = null;
            } else {
                C4509p pVar2 = C4509p.FAIL_SAFE_ACTIVATED;
                AdContent adcontent = this.f10720b;
                InneractiveAdRequest inneractiveAdRequest = adcontent.f10712a;
                C5233e c = adcontent.mo24293c();
                JSONArray c2 = this.f10720b.f10714c.mo24268c();
                aVar = new C4511q.C4512a(c);
                aVar.f11164c = pVar2;
                aVar.f11162a = inneractiveAdRequest;
                aVar.f11165d = c2;
            }
            JSONObject jSONObject = new JSONObject();
            Boolean valueOf = Boolean.valueOf(mo24337J());
            try {
                jSONObject.put("is_endcard", valueOf);
            } catch (Exception unused) {
                IAlog.m16450e("Got exception adding param to json object: %s, %s", "is_endcard", valueOf);
            }
            aVar.f11167f.put(jSONObject);
            aVar.mo24693a((String) null);
        }
        C4397c.C4398a aVar2 = this.f10755k;
        if (aVar2 != null) {
            aVar2.showCloseButton(z, mo24335H(), mo24334G());
            if (!z) {
                this.f10765u.mo26362a(false);
            }
        }
    }

    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.f10719a = inneractiveAdSpot;
        this.f10720b = inneractiveAdSpot.getAdContent();
        this.f10721c = inneractiveAdSpot.getSelectedUnitController().getEventsListener();
        this.f10765u.f13939a = inneractiveAdSpot;
    }

    /* renamed from: o */
    public void mo24554o() {
        C5326w0 w0Var = this.f10757m;
        if (w0Var != null) {
            w0Var.mo26410b();
        }
        C5326w0 w0Var2 = this.f10759o;
        if (w0Var2 != null) {
            w0Var2.mo26410b();
        }
    }

    /* renamed from: s */
    public void mo24555s() {
        C5326w0 w0Var = this.f10757m;
        if (w0Var != null) {
            w0Var.mo26408a();
        }
        C5326w0 w0Var2 = this.f10759o;
        if (w0Var2 != null) {
            w0Var2.mo26408a();
        }
    }

    /* renamed from: w */
    public int mo24531w() {
        C4397c.C4398a aVar = this.f10755k;
        if (aVar == null || aVar.getLayout() == null) {
            return 1;
        }
        return this.f10755k.getLayout().getHeight();
    }

    /* renamed from: x */
    public int mo24532x() {
        C4397c.C4398a aVar = this.f10755k;
        if (aVar == null || aVar.getLayout() == null) {
            return 1;
        }
        return this.f10755k.getLayout().getWidth();
    }

    /* renamed from: z */
    public void mo24534z() {
        super.mo24534z();
    }

    /* renamed from: a */
    public void mo24339a(C4397c.C4398a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError, Resources.NotFoundException {
        if (this.f10719a == null) {
            IAlog.m16450e("%sYou must set the spot to render before calling renderAd", IAlog.m16443a((Object) this));
            throw new InneractiveUnitController.AdDisplayError("No spot ad to render");
        } else if (aVar != null) {
            this.f10755k = aVar;
        } else {
            IAlog.m16450e("%srenderAd called with a null activity!", IAlog.m16443a((Object) this));
            throw new InneractiveUnitController.AdDisplayError("Activity is null");
        }
    }
}

package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJError;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TapjoyConnectCore;
import com.tapjoy.TapjoyLog;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.tapjoy.internal.gc */
abstract class C11504gc<R> {

    /* renamed from: b */
    volatile C11504gc<R>.a f27615b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract TJPlacement mo70009a(Context context, TJPlacementListener tJPlacementListener, R r);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo70010a(R r);

    C11504gc() {
    }

    /* renamed from: c */
    public final boolean mo70035c(R r) {
        if (!mo70011a()) {
            return false;
        }
        C11504gc<R>.a aVar = null;
        synchronized (this) {
            if (this.f27615b == null) {
                aVar = mo70026b(r);
                this.f27615b = aVar;
            }
        }
        if (aVar == null) {
            return false;
        }
        aVar.mo70036a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C11504gc<R>.a mo70026b(R r) {
        return new C11505a(this, r);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo70011a() {
        return !TapjoyConnectCore.isFullScreenViewOpen();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo70025a(Observer observer) {
        if (TapjoyConnectCore.isFullScreenViewOpen()) {
            C11491fu.f27588e.addObserver(observer);
            if (TapjoyConnectCore.isFullScreenViewOpen()) {
                return false;
            }
            C11491fu.f27588e.deleteObserver(observer);
        }
        if (C11558hj.m31644a().mo70128d()) {
            return true;
        }
        C11491fu.f27586c.addObserver(observer);
        if (!C11558hj.m31644a().mo70128d()) {
            return false;
        }
        C11491fu.f27586c.deleteObserver(observer);
        return true;
    }

    /* renamed from: com.tapjoy.internal.gc$a */
    class C11505a implements TJPlacementListener, Observer {

        /* renamed from: b */
        private final R f27617b;

        /* renamed from: c */
        private final C11474fk f27618c;

        /* renamed from: d */
        private volatile boolean f27619d;

        /* renamed from: e */
        private TJPlacement f27620e;

        public final void onClick(TJPlacement tJPlacement) {
        }

        public final void onContentDismiss(TJPlacement tJPlacement) {
        }

        public final void onContentShow(TJPlacement tJPlacement) {
        }

        public final void onPurchaseRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str) {
        }

        public final void onRequestSuccess(TJPlacement tJPlacement) {
        }

        public final void onRewardRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str, int i) {
        }

        C11505a(C11504gc gcVar, R r) {
            this(r, new C11474fk(10000));
        }

        C11505a(R r, C11474fk fkVar) {
            this.f27617b = r;
            this.f27618c = fkVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo70036a() {
            synchronized (this) {
                if (!this.f27619d) {
                    if (this.f27618c.mo69991a()) {
                        m31490a("Timed out");
                        return;
                    }
                    if (!TapjoyConnectCore.isConnected()) {
                        C11491fu.f27584a.addObserver(this);
                        if (TapjoyConnectCore.isConnected()) {
                            C11491fu.f27584a.deleteObserver(this);
                        } else {
                            return;
                        }
                    }
                    if (this.f27620e == null) {
                        if (!C11504gc.this.mo70011a()) {
                            m31490a("Cannot request");
                            return;
                        }
                        TJPlacement a = C11504gc.this.mo70009a(TapjoyConnectCore.getContext(), this, this.f27617b);
                        this.f27620e = a;
                        a.requestContent();
                    } else if (this.f27620e.isContentReady()) {
                        if (C11504gc.this.mo70025a((Observer) this)) {
                            this.f27620e.showContent();
                            m31490a((String) null);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        private void m31490a(String str) {
            synchronized (this) {
                String a = C11504gc.this.mo70010a(this.f27617b);
                if (str == null) {
                    TapjoyLog.m30842i("SystemPlacement", "Placement " + a + " is presented now");
                } else {
                    TapjoyLog.m30842i("SystemPlacement", "Cannot show placement " + a + " now (" + str + ")");
                }
                this.f27619d = true;
                this.f27620e = null;
                C11491fu.f27584a.deleteObserver(this);
                C11491fu.f27588e.deleteObserver(this);
                C11491fu.f27586c.deleteObserver(this);
            }
            C11504gc.m31483a(C11504gc.this, this);
        }

        public final void update(Observable observable, Object obj) {
            mo70036a();
        }

        public final void onRequestFailure(TJPlacement tJPlacement, TJError tJError) {
            m31490a(tJError.message);
        }

        public final void onContentReady(TJPlacement tJPlacement) {
            mo70036a();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m31483a(C11504gc gcVar, C11505a aVar) {
        synchronized (gcVar) {
            if (gcVar.f27615b == aVar) {
                gcVar.f27615b = null;
            }
        }
    }
}

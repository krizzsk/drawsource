package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.inmobi.media.C5963ef;
import com.inmobi.media.C5977el;
import com.inmobi.media.C6074ft;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.inmobi.media.ej */
/* compiled from: NativeAdTracker */
public class C5971ej {

    /* renamed from: a */
    static final Map<Context, C5963ef> f15135a = new WeakHashMap();

    /* renamed from: b */
    private static final String f15136b = C5971ej.class.getSimpleName();

    /* renamed from: c */
    private static final Map<Context, C5977el> f15137c = new WeakHashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Map<View, C5975a> f15138d = new HashMap();

    /* renamed from: e */
    private static final C5963ef.C5965a f15139e = new C5963ef.C5965a() {
        /* renamed from: a */
        public final void mo35096a(View view, Object obj) {
            ((C6281n) obj).mo35522a(view);
        }
    };

    /* renamed from: f */
    private static final C5977el.C5978a f15140f = new C5977el.C5978a() {

        /* renamed from: a */
        private final Rect f15143a = new Rect();

        /* renamed from: a */
        public final boolean mo35103a(View view, View view2, int i) {
            return true;
        }

        /* renamed from: a */
        public final boolean mo35104a(View view, View view2, int i, Object obj) {
            C6029fg mediaPlayer;
            if (!(obj instanceof C6281n) || ((C6281n) obj).f15846j) {
                return false;
            }
            if (((view2 instanceof C6038fm) && (mediaPlayer = ((C6038fm) view2).getMediaPlayer()) != null && 3 != mediaPlayer.f15287a) || view2 == null || view == null || !view2.isShown() || view.getParent() == null || !view2.getGlobalVisibleRect(this.f15143a)) {
                return false;
            }
            long height = ((long) this.f15143a.height()) * ((long) this.f15143a.width());
            long width = ((long) view.getWidth()) * ((long) view.getHeight());
            if (width <= 0 || height * 100 < ((long) i) * width) {
                return false;
            }
            return true;
        }
    };

    /* renamed from: g */
    private boolean f15141g;

    /* renamed from: h */
    private byte f15142h;

    /* renamed from: com.inmobi.media.ej$a */
    /* compiled from: NativeAdTracker */
    public interface C5975a {
        /* renamed from: a */
        void mo35105a(View view, boolean z);
    }

    C5971ej(byte b) {
        this.f15142h = b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35101a(Context context, View view, C6281n nVar, C6074ft.C6091m mVar) {
        C5963ef a = m17763a(context, mVar);
        if (this.f15142h != 0) {
            a.mo35090a(view, nVar, mVar.impressionMinPercentageViewed, mVar.impressionMinTimeViewed);
        } else {
            a.mo35090a(view, nVar, mVar.video.impressionMinPercentageViewed, mVar.video.impressionMinTimeViewed);
        }
    }

    /* renamed from: a */
    private C5963ef m17763a(Context context, C6074ft.C6091m mVar) {
        C5963ef efVar = f15135a.get(context);
        if (efVar == null) {
            if (context instanceof Activity) {
                efVar = new C5963ef(mVar, new C5959ed(f15140f, (Activity) context), f15139e);
                if (!this.f15141g) {
                    this.f15141g = true;
                }
            } else {
                efVar = new C5963ef(mVar, new C5976ek(f15140f, mVar, (byte) 1), f15139e);
            }
            f15135a.put(context, efVar);
        }
        return efVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35102a(Context context, C6281n nVar) {
        C5963ef efVar = f15135a.get(context);
        if (efVar != null) {
            efVar.mo35091a((Object) nVar);
            if (!efVar.mo35093c()) {
                mo35098a(context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35098a(Context context) {
        C5963ef remove = f15135a.remove(context);
        if (remove != null) {
            remove.mo35094d();
        }
        if ((context instanceof Activity) && f15135a.isEmpty() && this.f15141g) {
            this.f15141g = false;
        }
    }

    /* renamed from: a */
    public final void mo35099a(Context context, View view, C6281n nVar) {
        C5977el elVar = f15137c.get(context);
        if (elVar != null) {
            elVar.mo35108a((Object) nVar);
            if (!elVar.mo35110g()) {
                m17767d(context);
            }
        }
        f15138d.remove(view);
    }

    /* renamed from: d */
    private void m17767d(Context context) {
        C5977el remove = f15137c.remove(context);
        if (remove != null) {
            remove.mo35085e();
        }
        if ((context instanceof Activity) && f15137c.isEmpty() && this.f15141g) {
            this.f15141g = false;
        }
    }

    /* renamed from: b */
    static void m17765b(Context context) {
        C5963ef efVar = f15135a.get(context);
        if (efVar != null) {
            efVar.mo35092b();
        }
    }

    /* renamed from: c */
    static void m17766c(Context context) {
        C5963ef efVar = f15135a.get(context);
        if (efVar != null) {
            efVar.mo35088a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35100a(Context context, View view, C6281n nVar, C5975a aVar, C6074ft.C6091m mVar) {
        C5977el elVar;
        C5977el elVar2 = f15137c.get(context);
        if (elVar2 == null) {
            boolean z = context instanceof Activity;
            if (z) {
                elVar = new C5959ed(f15140f, (Activity) context);
            } else {
                elVar = new C5976ek(f15140f, mVar, (byte) 1);
            }
            elVar.f15148c = new C5977el.C5980c() {
                /* renamed from: a */
                public final void mo35095a(List<View> list, List<View> list2) {
                    for (View next : list) {
                        C5975a aVar = (C5975a) C5971ej.f15138d.get(next);
                        if (aVar != null) {
                            aVar.mo35105a(next, true);
                        }
                    }
                    for (View next2 : list2) {
                        C5975a aVar2 = (C5975a) C5971ej.f15138d.get(next2);
                        if (aVar2 != null) {
                            aVar2.mo35105a(next2, false);
                        }
                    }
                }
            };
            f15137c.put(context, elVar);
            if (z && !this.f15141g) {
                this.f15141g = true;
            }
            elVar2 = elVar;
        }
        f15138d.put(view, aVar);
        if (this.f15142h != 0) {
            elVar2.mo35107a(view, nVar, mVar.displayMinPercentageAnimate);
        } else {
            elVar2.mo35107a(view, nVar, mVar.video.videoMinPercentagePlay);
        }
    }
}

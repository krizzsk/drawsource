package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C5851bz;
import com.inmobi.media.C5860ce;
import com.inmobi.media.C5862cf;
import com.inmobi.media.C6008fc;
import com.squareup.picasso.Callback;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* renamed from: com.inmobi.media.fo */
/* compiled from: NativeViewFactory */
public class C6052fo {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f15350a = C6052fo.class.getSimpleName();

    /* renamed from: c */
    private static final Map<Class, Byte> f15351c;

    /* renamed from: e */
    private static volatile WeakReference<C6052fo> f15352e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static WeakReference<Context> f15353f;

    /* renamed from: g */
    private static int f15354g = 1;

    /* renamed from: h */
    private static int f15355h = 1;

    /* renamed from: b */
    private int f15356b;

    /* renamed from: d */
    private Map<Byte, C6068d> f15357d = new HashMap();

    /* renamed from: a */
    static /* synthetic */ int m17994a(C6052fo foVar) {
        int i = foVar.f15356b;
        foVar.f15356b = i + 1;
        return i;
    }

    /* renamed from: b */
    static /* synthetic */ int m18012b(C6052fo foVar) {
        int i = foVar.f15356b;
        foVar.f15356b = i - 1;
        return i;
    }

    static {
        HashMap hashMap = new HashMap();
        f15351c = hashMap;
        hashMap.put(C6030fh.class, (byte) 0);
        f15351c.put(C6071fr.class, (byte) 1);
        f15351c.put(C6070fq.class, (byte) 2);
        f15351c.put(C6008fc.class, (byte) 3);
        f15351c.put(ImageView.class, (byte) 6);
        f15351c.put(C6051fn.class, (byte) 7);
        f15351c.put(C6066b.class, (byte) 4);
        f15351c.put(Button.class, (byte) 5);
        f15351c.put(C5865ch.class, (byte) 8);
        f15351c.put(C6301q.class, (byte) 9);
        f15351c.put(C6005fa.class, (byte) 10);
    }

    /* renamed from: com.inmobi.media.fo$d */
    /* compiled from: NativeViewFactory */
    abstract class C6068d {

        /* renamed from: a */
        private int f15377a = 0;

        /* renamed from: b */
        LinkedList<View> f15378b = new LinkedList<>();

        /* renamed from: d */
        private int f15380d = 0;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract View mo35262a(Context context);

        public C6068d() {
        }

        /* renamed from: a */
        public boolean mo35264a(View view) {
            C6052fo.m18016b(view);
            view.setOnClickListener((View.OnClickListener) null);
            this.f15378b.addLast(view);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            C6052fo.m17994a(C6052fo.this);
            return true;
        }

        /* renamed from: a */
        public final View mo35270a(Context context, C5847bw bwVar, C6074ft ftVar) {
            View view;
            WeakReference unused = C6052fo.f15353f = new WeakReference(context);
            if (this.f15378b.isEmpty()) {
                this.f15377a++;
                view = mo35262a(context);
            } else {
                this.f15380d++;
                view = this.f15378b.removeFirst();
                C6052fo.m18012b(C6052fo.this);
            }
            if (view != null) {
                mo35263a(view, bwVar, ftVar);
            }
            return view;
        }

        /* renamed from: a */
        public final void mo35271a() {
            if (this.f15378b.size() > 0) {
                this.f15378b.removeFirst();
            }
        }

        public String toString() {
            return "Size:" + this.f15378b.size() + " Miss Count:" + this.f15377a + " Hit Count:" + this.f15380d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo35263a(View view, C5847bw bwVar, C6074ft ftVar) {
            view.setVisibility(bwVar.f14726x);
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* renamed from: a */
    static void m17999a(int i) {
        f15354g = i;
    }

    /* renamed from: b */
    static void m18014b(int i) {
        f15355h = i;
    }

    /* renamed from: c */
    static int m18017c(int i) {
        int i2;
        Context context = (Context) f15353f.get();
        if ((context == null || !(context instanceof InMobiAdActivity)) && (i2 = f15354g) != 0) {
            return (int) (((double) i) * ((((double) i2) * 1.0d) / ((double) f15355h)));
        }
        return i;
    }

    private C6052fo(Context context) {
        f15353f = new WeakReference<>(context);
        this.f15357d.put((byte) 0, new C6068d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35262a(Context context) {
                return new C6030fh(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35263a(View view, C5847bw bwVar, C6074ft ftVar) {
                super.mo35263a(view, bwVar, ftVar);
                C6052fo.m18002a(view, bwVar.f14705c);
            }
        });
        this.f15357d.put((byte) 3, new C6068d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35262a(Context context) {
                return new C6008fc(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35263a(View view, C5847bw bwVar, C6074ft ftVar) {
                super.mo35263a(view, bwVar, ftVar);
                C6052fo.m18002a(view, bwVar.f14705c);
            }
        });
        this.f15357d.put((byte) 1, new C6068d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35262a(Context context) {
                return new C6071fr(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35263a(View view, C5847bw bwVar, C6074ft ftVar) {
                super.mo35263a(view, bwVar, ftVar);
                C6052fo.m18002a(view, bwVar.f14705c);
            }

            /* renamed from: a */
            public final boolean mo35264a(View view) {
                ((C6071fr) view).f15384a = null;
                return super.mo35264a(view);
            }
        });
        this.f15357d.put((byte) 2, new C6068d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35262a(Context context) {
                return new C6070fq(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35263a(View view, C5847bw bwVar, C6074ft ftVar) {
                super.mo35263a(view, bwVar, ftVar);
                C6052fo.m18002a(view, bwVar.f14705c);
            }
        });
        this.f15357d.put((byte) 6, new C6068d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35262a(Context context) {
                return new ImageView(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35263a(View view, C5847bw bwVar, C6074ft ftVar) {
                super.mo35263a(view, bwVar, ftVar);
                C6052fo.m18004a((ImageView) view, bwVar);
            }

            /* renamed from: a */
            public final boolean mo35264a(View view) {
                if (!(view instanceof ImageView)) {
                    return false;
                }
                ((ImageView) view).setImageDrawable((Drawable) null);
                return super.mo35264a(view);
            }
        });
        this.f15357d.put((byte) 10, new C6068d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35262a(Context context) {
                return new C6005fa(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35263a(View view, C5847bw bwVar, C6074ft ftVar) {
                super.mo35263a(view, bwVar, ftVar);
                C6052fo.m18008a((C6005fa) view, bwVar);
            }

            /* renamed from: a */
            public final boolean mo35264a(View view) {
                if (!(view instanceof C6005fa)) {
                    return false;
                }
                ((C6005fa) view).setGifImpl((C6000ey) null);
                return super.mo35264a(view);
            }
        });
        this.f15357d.put((byte) 7, new C6068d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35262a(Context context) {
                return new C6051fn(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35263a(View view, C5847bw bwVar, C6074ft ftVar) {
                super.mo35263a(view, bwVar, ftVar);
                C6052fo.m18009a((C6051fn) view, bwVar);
            }

            /* renamed from: a */
            public final boolean mo35264a(View view) {
                if (!(view instanceof C6051fn)) {
                    return false;
                }
                C6051fn fnVar = (C6051fn) view;
                fnVar.getProgressBar().setVisibility(8);
                fnVar.getPoster().setImageBitmap((Bitmap) null);
                fnVar.getVideoView().mo35211e();
                return super.mo35264a(view);
            }
        });
        this.f15357d.put((byte) 4, new C6068d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35262a(Context context) {
                return new C6066b(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35263a(View view, C5847bw bwVar, C6074ft ftVar) {
                super.mo35263a(view, bwVar, ftVar);
                C6052fo.m18006a((TextView) view, bwVar);
            }

            /* renamed from: a */
            public final boolean mo35264a(View view) {
                if (!(view instanceof TextView)) {
                    return false;
                }
                C6052fo.m18005a((TextView) view);
                return super.mo35264a(view);
            }
        });
        this.f15357d.put((byte) 5, new C6068d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35262a(Context context) {
                return new Button(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35263a(View view, C5847bw bwVar, C6074ft ftVar) {
                super.mo35263a(view, bwVar, ftVar);
                C6052fo.m18003a((Button) view, bwVar);
            }

            /* renamed from: a */
            public final boolean mo35264a(View view) {
                if (!(view instanceof Button)) {
                    return false;
                }
                C6052fo.m18005a((TextView) (Button) view);
                return super.mo35264a(view);
            }
        });
        this.f15357d.put((byte) 8, new C6068d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35262a(Context context) {
                return new C5865ch(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35263a(View view, C5847bw bwVar, C6074ft ftVar) {
                super.mo35263a(view, bwVar, ftVar);
                C6052fo.m18010a(C6052fo.this, (C5865ch) view, bwVar);
            }

            /* renamed from: a */
            public final boolean mo35264a(View view) {
                return (view instanceof C5865ch) && super.mo35264a(view);
            }
        });
        this.f15357d.put((byte) 9, new C6068d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo35262a(Context context) {
                C6301q qVar = null;
                try {
                    C6301q qVar2 = new C6301q(context.getApplicationContext(), (byte) 0, (Set<C5951dx>) null, (String) null, Boolean.FALSE, "DEFAULT");
                    try {
                        qVar2.setShouldFireRenderBeacon(false);
                        return qVar2;
                    } catch (Exception e) {
                        e = e;
                        qVar = qVar2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    String unused = C6052fo.f15350a;
                    C6130gj.m18161a().mo35310a(new C6167hk(e));
                    return qVar;
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo35263a(View view, C5847bw bwVar, C6074ft ftVar) {
                super.mo35263a(view, bwVar, ftVar);
                C6052fo.m18011a((C6301q) view, bwVar, ftVar);
            }

            /* renamed from: a */
            public final boolean mo35264a(View view) {
                return (view instanceof C6301q) && !((C6301q) view).f15961u && super.mo35264a(view);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.inmobi.media.fo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.inmobi.media.C6052fo m17996a(android.content.Context r3) {
        /*
            java.lang.ref.WeakReference<com.inmobi.media.fo> r0 = f15352e
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r0 = r1
            goto L_0x000f
        L_0x0007:
            java.lang.ref.WeakReference<com.inmobi.media.fo> r0 = f15352e
            java.lang.Object r0 = r0.get()
            com.inmobi.media.fo r0 = (com.inmobi.media.C6052fo) r0
        L_0x000f:
            if (r0 != 0) goto L_0x0037
            java.lang.Class<com.inmobi.media.fo> r2 = com.inmobi.media.C6052fo.class
            monitor-enter(r2)
            java.lang.ref.WeakReference<com.inmobi.media.fo> r0 = f15352e     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x0019
            goto L_0x0022
        L_0x0019:
            java.lang.ref.WeakReference<com.inmobi.media.fo> r0 = f15352e     // Catch:{ all -> 0x0034 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0034 }
            r1 = r0
            com.inmobi.media.fo r1 = (com.inmobi.media.C6052fo) r1     // Catch:{ all -> 0x0034 }
        L_0x0022:
            if (r1 != 0) goto L_0x0031
            com.inmobi.media.fo r0 = new com.inmobi.media.fo     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r3.<init>(r0)     // Catch:{ all -> 0x0034 }
            f15352e = r3     // Catch:{ all -> 0x0034 }
            goto L_0x0032
        L_0x0031:
            r0 = r1
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0037
        L_0x0034:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            throw r3
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6052fo.m17996a(android.content.Context):com.inmobi.media.fo");
    }

    /* renamed from: a */
    public final View mo35259a(Context context, C5847bw bwVar, C6074ft ftVar) {
        C6068d dVar;
        byte a = m17993a(bwVar);
        if (-1 == a || (dVar = this.f15357d.get(Byte.valueOf(a))) == null) {
            return null;
        }
        return dVar.mo35270a(context, bwVar, ftVar);
    }

    /* renamed from: a */
    public final void mo35261a(ViewGroup viewGroup) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            viewGroup.removeViewAt(childCount);
            mo35260a(childAt);
        }
    }

    /* renamed from: a */
    public final void mo35260a(View view) {
        if ((view instanceof C6030fh) || (view instanceof C6008fc)) {
            C6008fc fcVar = (C6008fc) view;
            if (fcVar.getChildCount() != 0) {
                Stack stack = new Stack();
                stack.push(fcVar);
                while (!stack.isEmpty()) {
                    C6008fc fcVar2 = (C6008fc) stack.pop();
                    for (int childCount = fcVar2.getChildCount() - 1; childCount >= 0; childCount--) {
                        View childAt = fcVar2.getChildAt(childCount);
                        fcVar2.removeViewAt(childCount);
                        if (childAt instanceof C6008fc) {
                            stack.push((C6008fc) childAt);
                        } else {
                            m18019c(childAt);
                        }
                    }
                    m18019c((View) fcVar2);
                }
                return;
            }
        }
        m18019c(view);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r10.equals(com.facebook.share.internal.ShareConstants.VIDEO_URL) != false) goto L_0x007d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte m17993a(com.inmobi.media.C5847bw r10) {
        /*
            boolean r0 = r10 instanceof com.inmobi.media.C5849by
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x001e
            com.inmobi.media.by r10 = (com.inmobi.media.C5849by) r10
            boolean r0 = r10.mo34835a()
            if (r0 == 0) goto L_0x0011
            return r3
        L_0x0011:
            boolean r0 = r10.mo34836b()
            if (r0 == 0) goto L_0x001d
            byte r10 = r10.f14739A
            if (r10 == r4) goto L_0x001c
            return r4
        L_0x001c:
            return r2
        L_0x001d:
            return r1
        L_0x001e:
            java.lang.String r10 = r10.f14704b
            int r0 = r10.hashCode()
            r5 = 5
            r6 = 7
            r7 = 6
            r8 = 4
            r9 = -1
            switch(r0) {
                case 67056: goto L_0x0072;
                case 70564: goto L_0x0068;
                case 2241657: goto L_0x005e;
                case 2571565: goto L_0x0054;
                case 69775675: goto L_0x004a;
                case 79826725: goto L_0x0040;
                case 81665115: goto L_0x0037;
                case 1942407129: goto L_0x002d;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x007c
        L_0x002d:
            java.lang.String r0 = "WEBVIEW"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = r7
            goto L_0x007d
        L_0x0037:
            java.lang.String r0 = "VIDEO"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            goto L_0x007d
        L_0x0040:
            java.lang.String r0 = "TIMER"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = r5
            goto L_0x007d
        L_0x004a:
            java.lang.String r0 = "IMAGE"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = r4
            goto L_0x007d
        L_0x0054:
            java.lang.String r0 = "TEXT"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = r3
            goto L_0x007d
        L_0x005e:
            java.lang.String r0 = "ICON"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = r2
            goto L_0x007d
        L_0x0068:
            java.lang.String r0 = "GIF"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = r6
            goto L_0x007d
        L_0x0072:
            java.lang.String r0 = "CTA"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = r8
            goto L_0x007d
        L_0x007c:
            r1 = r9
        L_0x007d:
            switch(r1) {
                case 0: goto L_0x008d;
                case 1: goto L_0x008c;
                case 2: goto L_0x008c;
                case 3: goto L_0x008b;
                case 4: goto L_0x008a;
                case 5: goto L_0x0087;
                case 6: goto L_0x0084;
                case 7: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            return r9
        L_0x0081:
            r10 = 10
            return r10
        L_0x0084:
            r10 = 9
            return r10
        L_0x0087:
            r10 = 8
            return r10
        L_0x008a:
            return r5
        L_0x008b:
            return r6
        L_0x008c:
            return r7
        L_0x008d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6052fo.m17993a(com.inmobi.media.bw):byte");
    }

    /* renamed from: c */
    private void m18019c(View view) {
        C6068d dVar;
        byte byteValue = f15351c.get(view.getClass()).byteValue();
        if (-1 != byteValue && (dVar = this.f15357d.get(Integer.valueOf(byteValue))) != null) {
            if (this.f15356b >= 300) {
                m18018c();
            }
            dVar.mo35264a(view);
        }
    }

    /* renamed from: c */
    private void m18018c() {
        C6068d d = m18020d();
        if (d != null) {
            d.mo35271a();
        }
    }

    /* renamed from: d */
    private C6068d m18020d() {
        int i = 0;
        C6068d dVar = null;
        for (Map.Entry next : this.f15357d.entrySet()) {
            if (((C6068d) next.getValue()).f15378b.size() > i) {
                C6068d dVar2 = (C6068d) next.getValue();
                dVar = dVar2;
                i = dVar2.f15378b.size();
            }
        }
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m18015b(Context context, ImageView imageView) {
        Bitmap bitmap;
        if (imageView.getDrawable() == null) {
            float f = C6215il.m18444a().f15674c;
            C5879cs csVar = new C5879cs(context, f, (byte) 0);
            if (Build.VERSION.SDK_INT < 28) {
                csVar.layout(0, 0, (int) (((float) m18017c(40)) * f), (int) (((float) m18017c(40)) * f));
                csVar.setDrawingCacheEnabled(true);
                csVar.buildDrawingCache();
                bitmap = csVar.getDrawingCache();
            } else {
                csVar.layout(0, 0, (int) (((float) m18017c(40)) * f), (int) (((float) m18017c(40)) * f));
                bitmap = Bitmap.createBitmap((int) (((float) m18017c(40)) * f), (int) (((float) m18017c(40)) * f), Bitmap.Config.ARGB_8888);
                csVar.draw(new Canvas(bitmap));
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: com.inmobi.media.fo$c */
    /* compiled from: NativeViewFactory */
    static class C6067c implements InvocationHandler {

        /* renamed from: a */
        private WeakReference<Context> f15374a;

        /* renamed from: b */
        private WeakReference<ImageView> f15375b;

        /* renamed from: c */
        private C5847bw f15376c;

        C6067c(Context context, ImageView imageView, C5847bw bwVar) {
            this.f15374a = new WeakReference<>(context);
            this.f15375b = new WeakReference<>(imageView);
            this.f15376c = bwVar;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String unused = C6052fo.f15350a;
            if (method == null || !"onError".equalsIgnoreCase(method.getName())) {
                return null;
            }
            C6052fo.m18001a((Context) this.f15374a.get(), (ImageView) this.f15375b.get(), this.f15376c);
            return null;
        }
    }

    /* renamed from: com.inmobi.media.fo$a */
    /* compiled from: NativeViewFactory */
    static final class C6065a implements Runnable {

        /* renamed from: a */
        private WeakReference<Context> f15372a;

        /* renamed from: b */
        private WeakReference<ImageView> f15373b;

        C6065a(Context context, ImageView imageView) {
            this.f15372a = new WeakReference<>(context);
            this.f15373b = new WeakReference<>(imageView);
        }

        public final void run() {
            Context context = (Context) this.f15372a.get();
            ImageView imageView = (ImageView) this.f15373b.get();
            if (context != null && imageView != null) {
                C6052fo.m18015b(context, imageView);
            }
        }
    }

    /* renamed from: a */
    private static void m18007a(TextView textView, String[] strArr) {
        int paintFlags = textView.getPaintFlags();
        int i = 0;
        for (String str : strArr) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1178781136:
                    if (str.equals("italic")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1026963764:
                    if (str.equals("underline")) {
                        c = 3;
                        break;
                    }
                    break;
                case -891985998:
                    if (str.equals("strike")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3029637:
                    if (str.equals("bold")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                i |= 1;
            } else if (c == 1) {
                i |= 2;
            } else if (c == 2) {
                paintFlags |= 16;
            } else if (c == 3) {
                paintFlags |= 8;
            }
        }
        textView.setTypeface(Typeface.DEFAULT, i);
        textView.setPaintFlags(paintFlags);
    }

    /* renamed from: a */
    static void m18002a(View view, C5848bx bxVar) {
        int parseColor = Color.parseColor("#00000000");
        try {
            parseColor = Color.parseColor(bxVar.mo34831e());
        } catch (IllegalArgumentException e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        }
        view.setBackgroundColor(parseColor);
        if ("line".equals(bxVar.mo34827a())) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(parseColor);
            if ("curved".equals(bxVar.mo34828b())) {
                gradientDrawable.setCornerRadius(bxVar.mo34829c());
            }
            int parseColor2 = Color.parseColor("#ff000000");
            try {
                parseColor2 = Color.parseColor(bxVar.mo34830d());
            } catch (IllegalArgumentException e2) {
                C6130gj.m18161a().mo35310a(new C6167hk(e2));
            }
            gradientDrawable.setStroke(1, parseColor2);
            if (Build.VERSION.SDK_INT < 16) {
                view.setBackgroundDrawable(gradientDrawable);
            } else {
                view.setBackground(gradientDrawable);
            }
        }
    }

    /* renamed from: com.inmobi.media.fo$b */
    /* compiled from: NativeViewFactory */
    static final class C6066b extends TextView {
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public C6066b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            int lineHeight = getLineHeight() > 0 ? i2 / getLineHeight() : 0;
            if (lineHeight > 0) {
                setSingleLine(false);
                setLines(lineHeight);
            }
            if (lineHeight == 1) {
                setSingleLine();
            }
        }
    }

    /* renamed from: a */
    public static ViewGroup.LayoutParams m17995a(C5847bw bwVar, ViewGroup viewGroup) {
        Point point = bwVar.f14705c.f14728a;
        Point point2 = bwVar.f14705c.f14730c;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(m18017c(point.x), m18017c(point.y));
        if (viewGroup instanceof C6008fc) {
            C6008fc.C6009a aVar = new C6008fc.C6009a(m18017c(point.x), m18017c(point.y));
            C6008fc.C6009a aVar2 = aVar;
            int c = m18017c(point2.x);
            int c2 = m18017c(point2.y);
            aVar2.f15229a = c;
            aVar2.f15230b = c2;
            return aVar;
        } else if (viewGroup instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(m18017c(point.x), m18017c(point.y));
            layoutParams2.setMargins(m18017c(point2.x), m18017c(point2.y), 0, 0);
            return layoutParams2;
        } else if (viewGroup instanceof AbsListView) {
            return new AbsListView.LayoutParams(m18017c(point.x), m18017c(point.y));
        } else {
            if (!(viewGroup instanceof FrameLayout)) {
                return layoutParams;
            }
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(m18017c(point.x), m18017c(point.y));
            layoutParams3.setMargins(m18017c(point2.x), m18017c(point2.y), 0, 0);
            return layoutParams3;
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m18016b(View view) {
        if (Build.VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable((Drawable) null);
        } else {
            view.setBackground((Drawable) null);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m18004a(ImageView imageView, C5847bw bwVar) {
        int i;
        int i2;
        int i3;
        String str = (String) bwVar.f14707e;
        if (str != null) {
            int c = m18017c(bwVar.f14705c.f14728a.x);
            int c2 = m18017c(bwVar.f14705c.f14728a.y);
            String f = bwVar.f14705c.mo34832f();
            char c3 = 65535;
            int hashCode = f.hashCode();
            int i4 = 0;
            if (hashCode != -1362001767) {
                if (hashCode == 727618043 && f.equals("aspectFill")) {
                    c3 = 1;
                }
            } else if (f.equals("aspectFit")) {
                c3 = 0;
            }
            if (c3 == 0) {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else if (c3 != 1) {
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            } else {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            Context context = (Context) f15353f.get();
            if (context != null && c > 0 && c2 > 0 && str.trim().length() != 0) {
                C5930dl.m17614a(context).load(str).into(imageView, (Callback) C5930dl.m17616a((InvocationHandler) new C6067c(context, imageView, bwVar)));
                if ("cross_button".equalsIgnoreCase(bwVar.f14706d) && bwVar.f14720r.length() == 0) {
                    new Handler().postDelayed(new C6065a(context, imageView), 2000);
                }
            }
            C5847bw bwVar2 = bwVar.f14722t;
            if (bwVar2 == null || !"line".equals(bwVar2.f14705c.mo34827a())) {
                i3 = 0;
                i2 = 0;
                i = 0;
            } else {
                int i5 = bwVar2.f14705c.f14730c.x == bwVar.f14705c.f14730c.x ? 1 : 0;
                i2 = m18017c(bwVar2.f14705c.f14728a.x) == m18017c(bwVar.f14705c.f14728a.x) + bwVar.f14705c.f14730c.x ? 1 : 0;
                i = m18017c(bwVar2.f14705c.f14730c.y) == m18017c(bwVar.f14705c.f14730c.y) ? 1 : 0;
                if (m18017c(bwVar2.f14705c.f14728a.y) == m18017c(bwVar.f14705c.f14728a.y) + m18017c(bwVar.f14705c.f14730c.y)) {
                    i4 = 1;
                }
                if (m18017c(bwVar2.f14705c.f14728a.x) == m18017c(bwVar.f14705c.f14728a.x)) {
                    i3 = i4;
                    i2 = 1;
                    i4 = 1;
                } else {
                    i3 = i4;
                    i4 = i5;
                }
            }
            if (Build.VERSION.SDK_INT < 17) {
                imageView.setPadding(i4, i, i2, i3);
            } else {
                imageView.setPaddingRelative(i4, i, i2, i3);
            }
            m18002a((View) imageView, bwVar.f14705c);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m18008a(C6005fa faVar, C5847bw bwVar) {
        faVar.setLayoutParams(new ViewGroup.LayoutParams(m18017c(bwVar.f14705c.f14728a.x), m18017c(bwVar.f14705c.f14728a.y)));
        faVar.setContentMode(bwVar.f14705c.mo34832f());
        faVar.setGifImpl(((C5857cb) bwVar).f14781z);
        m18002a((View) faVar, bwVar.f14705c);
    }

    /* renamed from: a */
    static /* synthetic */ void m18009a(C6051fn fnVar, C5847bw bwVar) {
        m18002a((View) fnVar, bwVar.f14705c);
        if (bwVar.f14725w != null) {
            fnVar.setPosterImage((Bitmap) bwVar.f14725w);
        }
        fnVar.getProgressBar().setVisibility(0);
    }

    /* renamed from: a */
    static /* synthetic */ void m18006a(TextView textView, C5847bw bwVar) {
        C5860ce.C5861a aVar = (C5860ce.C5861a) bwVar.f14705c;
        textView.setLayoutParams(new ViewGroup.LayoutParams(m18017c(aVar.f14728a.x), m18017c(aVar.f14728a.y)));
        textView.setText((CharSequence) bwVar.f14707e);
        textView.setTypeface(Typeface.DEFAULT);
        byte b = aVar.f14786p;
        if (b == 1) {
            textView.setGravity(8388629);
        } else if (b != 2) {
            textView.setGravity(8388627);
        } else {
            textView.setGravity(17);
        }
        textView.setTextSize(1, (float) m18017c(aVar.mo34850h()));
        int parseColor = Color.parseColor("#ff000000");
        try {
            parseColor = Color.parseColor(aVar.mo34851i());
        } catch (IllegalArgumentException e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        }
        textView.setTextColor(parseColor);
        int parseColor2 = Color.parseColor("#00000000");
        try {
            parseColor2 = Color.parseColor(aVar.mo34831e());
        } catch (IllegalArgumentException e2) {
            C6130gj.m18161a().mo35310a(new C6167hk(e2));
        }
        textView.setBackgroundColor(parseColor2);
        if (Build.VERSION.SDK_INT >= 17) {
            textView.setTextAlignment(1);
        }
        m18007a(textView, aVar.mo34852j());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setHorizontallyScrolling(true);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        m18002a((View) textView, (C5848bx) aVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m18005a(TextView textView) {
        textView.setTypeface(Typeface.DEFAULT, 0);
        textView.setPaintFlags(textView.getPaintFlags() & -17);
        textView.setPaintFlags(textView.getPaintFlags() & -9);
    }

    /* renamed from: a */
    static /* synthetic */ void m18003a(Button button, C5847bw bwVar) {
        C5851bz.C5852a aVar = (C5851bz.C5852a) bwVar.f14705c;
        button.setLayoutParams(new ViewGroup.LayoutParams(m18017c(aVar.f14728a.x), m18017c(aVar.f14728a.y)));
        button.setText((CharSequence) bwVar.f14707e);
        button.setTextSize(1, (float) m18017c(aVar.mo34850h()));
        int parseColor = Color.parseColor("#ff000000");
        try {
            parseColor = Color.parseColor(aVar.mo34851i());
        } catch (IllegalArgumentException e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        }
        button.setTextColor(parseColor);
        int parseColor2 = Color.parseColor("#00000000");
        try {
            parseColor2 = Color.parseColor(aVar.mo34831e());
        } catch (IllegalArgumentException e2) {
            C6130gj.m18161a().mo35310a(new C6167hk(e2));
        }
        button.setBackgroundColor(parseColor2);
        if (Build.VERSION.SDK_INT >= 17) {
            button.setTextAlignment(4);
        }
        button.setGravity(17);
        m18007a((TextView) button, aVar.mo34852j());
        m18002a((View) button, (C5848bx) aVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m18010a(C6052fo foVar, final C5865ch chVar, C5847bw bwVar) {
        long j;
        chVar.setVisibility(4);
        final C5864cg cgVar = (C5864cg) bwVar;
        C5862cf.C5863a aVar = cgVar.f14793A.f14787a;
        C5862cf.C5863a aVar2 = cgVar.f14793A.f14788b;
        if (aVar != null) {
            try {
                j = aVar.mo34853a();
            } catch (Exception e) {
                C6130gj.m18161a().mo35310a(new C6167hk(e));
                return;
            }
        } else {
            j = 0;
        }
        long a = aVar2 != null ? aVar2.mo34853a() : 0;
        if (a >= 0) {
            chVar.setTimerValue(a);
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    if (C6052fo.f15353f.get() != null) {
                        if (cgVar.f14794z) {
                            chVar.setVisibility(0);
                        }
                        chVar.mo34854a();
                    }
                }
            }, j * 1000);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m18011a(com.inmobi.media.C6301q r4, com.inmobi.media.C5847bw r5, com.inmobi.media.C6074ft r6) {
        /*
            r0 = r5
            com.inmobi.media.ck r0 = (com.inmobi.media.C5871ck) r0     // Catch:{ Exception -> 0x004f }
            com.inmobi.media.s r1 = com.inmobi.media.C6301q.f15888a     // Catch:{ Exception -> 0x004f }
            r2 = 0
            r4.mo35576a(r1, r6, r2, r2)     // Catch:{ Exception -> 0x004f }
            r6 = 1
            r4.f15949i = r6     // Catch:{ Exception -> 0x004f }
            java.lang.Object r5 = r5.f14707e     // Catch:{ Exception -> 0x004f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x004f }
            java.lang.String r0 = r0.f14829z     // Catch:{ Exception -> 0x004f }
            r1 = -1
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x004f }
            switch(r3) {
                case -1081286672: goto L_0x0038;
                case 84303: goto L_0x002e;
                case 2228139: goto L_0x0024;
                case 83774455: goto L_0x001b;
                default: goto L_0x001a;
            }     // Catch:{ Exception -> 0x004f }
        L_0x001a:
            goto L_0x0042
        L_0x001b:
            java.lang.String r3 = "REF_HTML"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0024:
            java.lang.String r2 = "HTML"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x0042
            r2 = r6
            goto L_0x0043
        L_0x002e:
            java.lang.String r2 = "URL"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x0042
            r2 = 3
            goto L_0x0043
        L_0x0038:
            java.lang.String r2 = "REF_IFRAME"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x0042
            r2 = 2
            goto L_0x0043
        L_0x0042:
            r2 = r1
        L_0x0043:
            if (r2 == 0) goto L_0x004b
            if (r2 == r6) goto L_0x004b
            r4.mo35581b((java.lang.String) r5)     // Catch:{ Exception -> 0x004f }
            return
        L_0x004b:
            r4.mo35578a((java.lang.String) r5)     // Catch:{ Exception -> 0x004f }
            return
        L_0x004f:
            r4 = move-exception
            com.inmobi.media.gj r5 = com.inmobi.media.C6130gj.m18161a()
            com.inmobi.media.hk r6 = new com.inmobi.media.hk
            r6.<init>(r4)
            r5.mo35310a((com.inmobi.media.C6167hk) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6052fo.m18011a(com.inmobi.media.q, com.inmobi.media.bw, com.inmobi.media.ft):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m18001a(Context context, ImageView imageView, C5847bw bwVar) {
        if (!(context == null || imageView == null)) {
            String str = bwVar.f14720r;
            if ("cross_button".equalsIgnoreCase(bwVar.f14706d) && str.trim().length() == 0) {
                m18015b(context, imageView);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("[ERRORCODE]", "603");
        bwVar.mo34823a("error", hashMap);
    }
}

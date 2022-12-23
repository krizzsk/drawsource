package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.foundation.same.p302c.C8484c;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.nativex.view.mbfullview.BaseView;
import java.lang.ref.WeakReference;

/* renamed from: com.mbridge.msdk.nativex.view.mbfullview.a */
/* compiled from: FullViewManager */
public class C8937a {

    /* renamed from: b */
    private static volatile C8937a f22091b;

    /* renamed from: a */
    private WeakReference<Context> f22092a;

    private C8937a(Context context) {
        this.f22092a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static C8937a m25852a(Context context) {
        if (f22091b == null) {
            synchronized (C8937a.class) {
                if (f22091b == null) {
                    f22091b = new C8937a(context);
                }
            }
        }
        return f22091b;
    }

    /* renamed from: com.mbridge.msdk.nativex.view.mbfullview.a$a */
    /* compiled from: FullViewManager */
    private class C8940a implements C8484c {

        /* renamed from: b */
        private WeakReference<MBridgeTopFullView> f22098b;

        public final void onFailedLoad(String str, String str2) {
        }

        public C8940a(MBridgeTopFullView mBridgeTopFullView) {
            this.f22098b = new WeakReference<>(mBridgeTopFullView);
        }

        public final void onSuccessLoad(Bitmap bitmap, String str) {
            WeakReference<MBridgeTopFullView> weakReference = this.f22098b;
            if (weakReference != null && weakReference.get() != null) {
                ((MBridgeTopFullView) this.f22098b.get()).getMBridgeFullViewDisplayIcon().setImageBitmap(C8937a.m25851a(C8937a.this, bitmap, 25));
            }
        }
    }

    /* renamed from: com.mbridge.msdk.nativex.view.mbfullview.a$2 */
    /* compiled from: FullViewManager */
    static /* synthetic */ class C89392 {

        /* renamed from: a */
        static final /* synthetic */ int[] f22096a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.mbridge.msdk.nativex.view.mbfullview.BaseView$a[] r0 = com.mbridge.msdk.nativex.view.mbfullview.BaseView.C8936a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22096a = r0
                com.mbridge.msdk.nativex.view.mbfullview.BaseView$a r1 = com.mbridge.msdk.nativex.view.mbfullview.BaseView.C8936a.FULL_TOP_VIEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22096a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.mbridge.msdk.nativex.view.mbfullview.BaseView$a r1 = com.mbridge.msdk.nativex.view.mbfullview.BaseView.C8936a.FULL_MIDDLE_VIEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.nativex.view.mbfullview.C8937a.C89392.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final void mo58850a(BaseView.C8936a aVar, CampaignEx campaignEx, BaseView baseView) {
        int i = C89392.f22096a[aVar.ordinal()];
        if (i == 1) {
            MBridgeTopFullView mBridgeTopFullView = (MBridgeTopFullView) baseView;
            if (mBridgeTopFullView != null) {
                Context context = (Context) this.f22092a.get();
                if (context != null) {
                    C8481b.m24310a(context).mo57883a(campaignEx.getIconUrl(), (C8484c) new C8940a(mBridgeTopFullView));
                }
                mBridgeTopFullView.getMBridgeFullViewDisplayTitle().setText(campaignEx.getAppName());
                mBridgeTopFullView.getMBridgeFullViewDisplayDscription().setText(campaignEx.getAppDesc());
                mBridgeTopFullView.getMBridgeFullTvInstall().setText(campaignEx.getAdCall());
                mBridgeTopFullView.getStarLevelLayoutView().setRating((int) campaignEx.getRating());
            }
        } else if (i == 2) {
            baseView.getMBridgeFullTvInstall().setText(campaignEx.getAdCall());
        }
    }

    /* renamed from: a */
    public final void mo58852a(boolean z, BaseView baseView, int i) {
        RelativeLayout.LayoutParams layoutParams;
        Context context = (Context) this.f22092a.get();
        if (context != null) {
            if (z) {
                layoutParams = new RelativeLayout.LayoutParams((int) (m25850a(z) / 3.0f), C8677z.m24924b(context, 45.0f));
                layoutParams.addRule(11);
                layoutParams.addRule(12);
                layoutParams.bottomMargin = C8677z.m24924b(context, 10.0f);
                layoutParams.rightMargin = C8677z.m24749a(context) && i == 0 ? C8677z.m24953k(context) + C8677z.m24924b(context, 8.0f) : C8677z.m24924b(context, 8.0f);
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-1, C8677z.m24924b(context, 45.0f));
                layoutParams.addRule(12);
            }
            baseView.getmAnimationContent().setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private float m25850a(boolean z) {
        try {
            Context context = (Context) this.f22092a.get();
            if (context == null) {
                return 0.0f;
            }
            float i = (float) C8677z.m24949i(context);
            return z ? i + ((float) C8677z.m24953k(context)) : i;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    /* renamed from: a */
    public final void mo58853a(final boolean z, boolean z2, final BaseView baseView) {
        int parseColor = Color.parseColor("#ff264870");
        baseView.getmAnimationPlayer().setBackgroundColor(parseColor);
        Context context = (Context) this.f22092a.get();
        if (z) {
            if (baseView.style == BaseView.C8936a.FULL_TOP_VIEW && context != null) {
                baseView.getmAnimationContent().setBackgroundResource(C8658p.m24799a(context, "mbridge_nativex_fullview_background", "drawable"));
                baseView.getmAnimationPlayer().setBackgroundColor(parseColor);
            }
            if (z2) {
                baseView.getmAnimationPlayer().getBackground().setAlpha(80);
            } else {
                baseView.getmAnimationPlayer().setBackgroundColor(Color.parseColor("#ff4c8fdf"));
                baseView.getmAnimationPlayer().getBackground().setAlpha(200);
            }
        } else if (baseView.style != BaseView.C8936a.FULL_MIDDLE_VIEW) {
            if (context != null) {
                baseView.getmAnimationContent().setBackgroundResource(C8658p.m24799a(context, "mbridge_nativex_cta_por_pre", "drawable"));
                baseView.getmAnimationPlayer().setBackgroundResource(C8658p.m24799a(context, "mbridge_nativex_cta_por_pre", "drawable"));
                return;
            }
            return;
        }
        if (z2) {
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    baseView.getmAnimationPlayer().setBackgroundColor(Color.parseColor("#ff4c8fdf"));
                    baseView.getmAnimationPlayer().getBackground().setAlpha(z ? 200 : 255);
                    C8937a.m25853a(C8937a.this, (View) baseView.getmAnimationPlayer());
                }
            }, 1000);
        }
    }

    /* renamed from: a */
    public final void mo58849a(View view, BaseView baseView) {
        if (view != null && baseView != null) {
            view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            baseView.f22083i.addView(view);
        }
    }

    /* renamed from: a */
    public final void mo58851a(BaseView baseView, boolean z) {
        if (baseView != null && Build.VERSION.SDK_INT >= 11) {
            baseView.setSystemUiVisibility(z ? 0 : InputDeviceCompat.SOURCE_TOUCHSCREEN);
        }
    }

    /* renamed from: a */
    static /* synthetic */ Bitmap m25851a(C8937a aVar, Bitmap bitmap, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        bitmap.getWidth();
        float f = (float) i;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* renamed from: a */
    static /* synthetic */ void m25853a(C8937a aVar, View view) {
        if (view != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
            alphaAnimation.setDuration(800);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            alphaAnimation.setRepeatCount(2);
            alphaAnimation.setRepeatMode(1);
            view.startAnimation(alphaAnimation);
        }
    }
}

package com.mbridge.msdk.dycreator.binding;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.MBApkInfoView;
import com.mbridge.msdk.dycreator.baseview.MBFeedBack;
import com.mbridge.msdk.dycreator.baseview.MBLogoTextView;
import com.mbridge.msdk.dycreator.baseview.MBSplashClickView;
import com.mbridge.msdk.dycreator.baseview.MBSplashImageBgView;
import com.mbridge.msdk.dycreator.baseview.MBSplashPortView;
import com.mbridge.msdk.dycreator.baseview.MBSplashShakeView;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.p293d.C8367a;
import com.mbridge.msdk.dycreator.p294e.C8372c;
import com.mbridge.msdk.dycreator.p295f.p296a.C8377a;
import com.mbridge.msdk.dycreator.p297g.C8379b;
import com.mbridge.msdk.dycreator.p297g.C8380c;
import com.mbridge.msdk.dycreator.p297g.C8381d;
import com.mbridge.msdk.dycreator.p297g.C8382e;
import com.mbridge.msdk.dycreator.p297g.C8383f;
import com.mbridge.msdk.dycreator.p297g.C8384g;
import com.mbridge.msdk.dycreator.p297g.C8385h;
import com.mbridge.msdk.dycreator.p297g.C8386i;
import com.mbridge.msdk.dycreator.viewmodel.BaseViewModel;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.p085b.C2470b;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.foundation.same.p302c.C8484c;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8671u;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.shake.C9192a;
import com.mbridge.msdk.shake.C9195b;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.model.AdvertisementDBAdapter;

/* renamed from: com.mbridge.msdk.dycreator.binding.b */
/* compiled from: MBDataBinding */
public final class C8354b {

    /* renamed from: a */
    private static volatile C8354b f20342a;

    /* renamed from: b */
    private C8381d f20343b = ((C8381d) C8367a.m23815a().mo56877a(C8367a.C8369a.VIEW_OBSERVER));

    /* renamed from: c */
    private C8380c f20344c = ((C8380c) C8367a.m23815a().mo56877a(C8367a.C8369a.CLICK_OBSERVER));

    /* renamed from: d */
    private C8383f f20345d = ((C8383f) C8367a.m23815a().mo56877a(C8367a.C8369a.EFFECT_OBSERVER));

    /* renamed from: e */
    private C8385h f20346e = ((C8385h) C8367a.m23815a().mo56877a(C8367a.C8369a.REPORT_OBSERVER));

    /* renamed from: f */
    private BaseViewModel f20347f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C9195b f20348g;

    private C8354b() {
    }

    /* renamed from: a */
    public static C8354b m23777a() {
        if (f20342a == null) {
            synchronized (C8354b.class) {
                if (f20342a == null) {
                    f20342a = new C8354b();
                }
            }
        }
        return f20342a;
    }

    /* renamed from: a */
    public final void mo56799a(final View view) {
        C83551 r0 = new C8384g() {
            /* renamed from: a */
            public final void mo56805a(Object obj) {
                try {
                    if (view instanceof InterBase) {
                        C8354b.m23781a(C8354b.this, (InterBase) view, obj);
                    }
                } catch (Exception e) {
                    C8672v.m24878d("MBDataBinding", e.getMessage());
                }
            }
        };
        int id = view.getId();
        C8385h hVar = this.f20346e;
        if (hVar != null) {
            hVar.mo56881a(r0, id);
        }
    }

    /* renamed from: b */
    public final void mo56802b(final View view) {
        C83562 r0 = new C8382e() {
            /* renamed from: a */
            public final void mo56806a(Object obj) {
                try {
                    if (view instanceof InterBase) {
                        C8354b.m23782b(C8354b.this, (InterBase) view, obj);
                    }
                } catch (Exception e) {
                    C8672v.m24878d("MBDataBinding", e.getMessage());
                }
            }
        };
        int id = view.getId();
        C8383f fVar = this.f20345d;
        if (fVar != null) {
            fVar.mo56881a(r0, id);
        }
    }

    /* renamed from: c */
    public final void mo56803c(final View view) {
        C83573 r0 = new C8386i() {
            /* renamed from: a */
            public final void mo56807a(Object obj) {
                try {
                    if (view instanceof InterBase) {
                        C8354b.m23783c(C8354b.this, (InterBase) view, obj);
                    }
                } catch (Exception e) {
                    C8672v.m24878d("MBDataBinding", e.getMessage());
                }
            }
        };
        int id = view.getId();
        C8381d dVar = this.f20343b;
        if (dVar != null) {
            dVar.mo56881a(r0, id);
        }
    }

    /* renamed from: d */
    public final void mo56804d(final View view) {
        if (view != null) {
            try {
                if (view instanceof InterBase) {
                    String actionDes = ((InterBase) view).getActionDes();
                    if (TextUtils.isEmpty(actionDes)) {
                        return;
                    }
                    if (actionDes.startsWith("click")) {
                        C83584 r0 = new C8379b() {
                            /* renamed from: a */
                            public final void mo56808a(Object obj) {
                                if (obj != null) {
                                    try {
                                        if (C8372c.m23825a(view, (C8377a) obj)) {
                                            C8354b.m23780a(C8354b.this, view, obj);
                                        }
                                    } catch (Exception e) {
                                        C8672v.m24878d("MBDataBinding", e.getMessage());
                                    }
                                }
                            }
                        };
                        int id = view.getId();
                        if (this.f20344c != null) {
                            this.f20344c.mo56881a(r0, id);
                        }
                    } else if (!actionDes.equals("move")) {
                        if (!actionDes.equals("long_click")) {
                            actionDes.equals("wobble");
                        }
                    }
                }
            } catch (Exception e) {
                C8672v.m24878d("MBDataBinding", e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo56801b() {
        if (this.f20344c != null) {
            this.f20344c.mo56880a();
        }
        if (this.f20343b != null) {
            this.f20343b.mo56880a();
        }
        if (this.f20345d != null) {
            this.f20345d.mo56880a();
        }
        if (this.f20347f != null) {
            this.f20347f = null;
        }
        if (this.f20348g != null) {
            this.f20348g = null;
        }
        if (f20342a != null) {
            f20342a = null;
        }
    }

    /* renamed from: a */
    public final void mo56800a(BaseViewModel baseViewModel) {
        this.f20347f = baseViewModel;
        if (baseViewModel != null) {
            baseViewModel.setClickSubject(this.f20344c);
            this.f20347f.setConcreteSubject(this.f20343b);
            this.f20347f.setEffectSubject(this.f20345d);
            this.f20347f.setReportSubject(this.f20346e);
        }
    }

    /* renamed from: a */
    private C9195b m23778a(View view, MBSplashData mBSplashData) {
        if (mBSplashData != null) {
            try {
                DyOption dyOption = mBSplashData.getDyOption();
                if (dyOption != null && dyOption.isShakeVisible() && this.f20348g == null) {
                    final View view2 = view;
                    final MBSplashData mBSplashData2 = mBSplashData;
                    this.f20348g = new C9195b(dyOption.getShakeStrenght(), dyOption.getShakeTime() * 1000) {
                        /* renamed from: a */
                        public final void mo56810a() {
                            View view = view2;
                            if (view != null) {
                                try {
                                    if (view.getGlobalVisibleRect(new Rect())) {
                                        SplashResData splashResData = new SplashResData();
                                        mBSplashData2.setClickType(4);
                                        splashResData.setBaseViewData(mBSplashData2);
                                        splashResData.seteAction(EAction.DOWNLOAD);
                                        EventBus.getDefault().post(splashResData);
                                        C9192a.m26189a().mo61405b(C8354b.this.f20348g);
                                    }
                                } catch (Exception e) {
                                    C8672v.m24878d("MBDataBinding", e.getMessage());
                                }
                            }
                        }
                    };
                }
            } catch (Exception e) {
                C8672v.m24878d("MBDataBinding", e.getMessage());
            }
        }
        return this.f20348g;
    }

    /* renamed from: a */
    static /* synthetic */ void m23781a(C8354b bVar, InterBase interBase, Object obj) {
        if (interBase != null && obj != null) {
            String reportDes = interBase.getReportDes();
            if (!TextUtils.isEmpty(reportDes)) {
                try {
                    if ((obj instanceof C8377a) && ((C8377a) obj).getBindData() != null) {
                        interBase.setDynamicReport(reportDes, ((C8377a) obj).getBindData());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m23782b(C8354b bVar, InterBase interBase, Object obj) {
        final boolean z;
        if (interBase != null && obj != null) {
            String effectDes = interBase.getEffectDes();
            if (!TextUtils.isEmpty(effectDes)) {
                try {
                    if (interBase instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) interBase;
                        C8377a aVar = (C8377a) obj;
                        if (effectDes != null && (effectDes instanceof String)) {
                            if (effectDes.equals("wobble") && (viewGroup instanceof MBSplashShakeView)) {
                                if (aVar.getEffectData().isShakeVisible()) {
                                    if (bVar.f20348g != null) {
                                        C9192a.m26189a().mo61405b(bVar.f20348g);
                                    }
                                    C9192a.m26189a().mo61404a(bVar.m23778a(viewGroup, (MBSplashData) aVar));
                                } else if (bVar.f20348g != null) {
                                    C9192a.m26189a().mo61405b(bVar.f20348g);
                                }
                            }
                            if (effectDes.equals(TJAdUnitConstants.String.VISIBLE) && (viewGroup instanceof MBApkInfoView)) {
                                if (!aVar.getEffectData().isApkInfoVisible()) {
                                    viewGroup.setVisibility(8);
                                } else if (!(aVar instanceof MBSplashData) || TextUtils.isEmpty(((MBSplashData) aVar).getAppInfo())) {
                                    viewGroup.setVisibility(4);
                                } else {
                                    viewGroup.setVisibility(0);
                                }
                            }
                            effectDes.equals("anim");
                        }
                    } else if (interBase instanceof View) {
                        View view = (View) interBase;
                        if (effectDes != null && (effectDes instanceof String)) {
                            C8377a aVar2 = (C8377a) obj;
                            if (effectDes.equals(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_COUNTDOWN) && view != null && (view instanceof TextView) && aVar2 != null) {
                                final String str = (String) ((TextView) view).getText();
                                final String d = C8660r.m24817d(view.getContext());
                                DyOption effectData = aVar2.getEffectData();
                                int i = 5;
                                if (effectData != null) {
                                    z = effectData.isCanSkip();
                                    i = effectData.getCountDownTime();
                                } else {
                                    z = false;
                                }
                                ((TextView) view).setText(C8372c.m23823a(z, i, str, d));
                                final View view2 = view;
                                ((C8377a) obj).getEffectData().setDyCountDownListenerWrapper(new DyCountDownListenerWrapper() {
                                    public final void getCountDownValue(int i) {
                                        if (i == 0) {
                                            SplashResData splashResData = new SplashResData();
                                            splashResData.seteAction(EAction.CLOSE);
                                            EventBus.getDefault().post(splashResData);
                                            return;
                                        }
                                        ((TextView) view2).setText(C8372c.m23823a(z, i, str, d));
                                    }
                                });
                            }
                            effectDes.equals("anim");
                            if (effectDes.equals(TJAdUnitConstants.String.VISIBLE)) {
                                if (view instanceof MBFeedBack) {
                                    if (C2470b.m6168a().mo16428b()) {
                                        view.setVisibility(0);
                                    } else {
                                        view.setVisibility(8);
                                    }
                                }
                                if ((view instanceof MBLogoTextView) && aVar2 != null && aVar2.getEffectData() != null && !aVar2.getEffectData().isLogoVisible()) {
                                    ((MBLogoTextView) view).setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m23783c(C8354b bVar, InterBase interBase, Object obj) {
        if (interBase != null && obj != null) {
            String bindDataDes = interBase.getBindDataDes();
            if (!TextUtils.isEmpty(bindDataDes)) {
                try {
                    Object a = C8372c.m23822a(obj, bindDataDes);
                    if (a != null) {
                        if (interBase instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) interBase;
                            C8377a aVar = (C8377a) obj;
                            if (viewGroup != null) {
                                if (viewGroup instanceof MBSplashClickView) {
                                    if (!(aVar == null || aVar.getEffectData() == null || !aVar.getEffectData().isClickButtonVisible())) {
                                        if (!aVar.getEffectData().isShakeVisible()) {
                                            if (a != null && !TextUtils.isEmpty(a.toString())) {
                                                viewGroup.setVisibility(0);
                                                ((MBSplashClickView) viewGroup).initView(a.toString());
                                            }
                                        }
                                    }
                                    viewGroup.setVisibility(8);
                                }
                                if (!(viewGroup instanceof MBSplashShakeView)) {
                                    return;
                                }
                                if (aVar == null || aVar.getEffectData() == null || !aVar.getEffectData().isShakeVisible()) {
                                    viewGroup.setVisibility(8);
                                } else if (a != null && !TextUtils.isEmpty(a.toString())) {
                                    viewGroup.setVisibility(0);
                                    ((MBSplashShakeView) viewGroup).initView(a.toString());
                                }
                            }
                        } else if (interBase instanceof View) {
                            final View view = (View) interBase;
                            final C8377a aVar2 = (C8377a) obj;
                            if (view != null && a != null) {
                                try {
                                    if (view instanceof TextView) {
                                        try {
                                            ((TextView) view).setText(String.valueOf(a).replace("\\n", "\n"));
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    } else if ((view instanceof ImageView) && a != null) {
                                        if (a instanceof Integer) {
                                            ((ImageView) view).setImageResource(((Integer) a).intValue());
                                        }
                                        if (a instanceof String) {
                                            C8481b.m24310a(C8388a.m23845e().mo56913g()).mo57883a(a.toString(), (C8484c) new C8484c() {
                                                public final void onSuccessLoad(Bitmap bitmap, String str) {
                                                    int i;
                                                    if (bitmap != null) {
                                                        try {
                                                            if (!bitmap.isRecycled()) {
                                                                boolean z = bitmap.getWidth() > bitmap.getHeight();
                                                                if (aVar2.getEffectData().getOrientation() == 1) {
                                                                    i = view.getResources().getConfiguration().orientation;
                                                                } else {
                                                                    i = aVar2.getEffectData().getOrientation();
                                                                }
                                                                if (i == 1) {
                                                                    if (z) {
                                                                        if (view instanceof MBSplashPortView) {
                                                                            if (view.getParent() != null) {
                                                                                ((ViewGroup) view.getParent()).setVisibility(8);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        } else if (view instanceof MBSplashImageBgView) {
                                                                            view.setVisibility(0);
                                                                            Bitmap a = C8671u.m24871a(bitmap);
                                                                            ((MBSplashImageBgView) view).setScaleType(ImageView.ScaleType.CENTER_CROP);
                                                                            ((MBSplashImageBgView) view).setImageBitmap(a);
                                                                            return;
                                                                        }
                                                                    } else if (view instanceof MBSplashPortView) {
                                                                        view.setVisibility(0);
                                                                        ((MBSplashPortView) view).setScaleType(ImageView.ScaleType.FIT_CENTER);
                                                                        ((MBSplashPortView) view).setImageBitmap(bitmap);
                                                                        return;
                                                                    } else if (view instanceof MBSplashImageBgView) {
                                                                        view.setVisibility(8);
                                                                        return;
                                                                    } else if (view instanceof InterBase) {
                                                                        String effectDes = ((InterBase) view).getEffectDes();
                                                                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                                                                        if (viewGroup != null) {
                                                                            C8372c.m23824a(effectDes, viewGroup, true);
                                                                        }
                                                                    }
                                                                } else if (z) {
                                                                    if (view instanceof MBSplashPortView) {
                                                                        view.setVisibility(0);
                                                                        ((MBSplashPortView) view).setScaleType(ImageView.ScaleType.FIT_XY);
                                                                        ((ImageView) view).setImageBitmap(bitmap);
                                                                        return;
                                                                    } else if (view instanceof MBSplashImageBgView) {
                                                                        view.setVisibility(8);
                                                                        ((MBSplashImageBgView) view).setImageBitmap(C8671u.m24871a(bitmap));
                                                                        return;
                                                                    } else if (view instanceof InterBase) {
                                                                        String effectDes2 = ((InterBase) view).getEffectDes();
                                                                        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                                                                        if (viewGroup2 != null) {
                                                                            C8372c.m23824a(effectDes2, viewGroup2, true);
                                                                        }
                                                                    }
                                                                } else if (view instanceof MBSplashPortView) {
                                                                    view.setVisibility(0);
                                                                    ((MBSplashPortView) view).setImageBitmap(bitmap);
                                                                    return;
                                                                } else if (view instanceof MBSplashImageBgView) {
                                                                    view.setVisibility(0);
                                                                    Bitmap a2 = C8671u.m24871a(bitmap);
                                                                    ((MBSplashImageBgView) view).setScaleType(ImageView.ScaleType.CENTER_CROP);
                                                                    ((MBSplashImageBgView) view).setImageBitmap(a2);
                                                                    return;
                                                                } else if (view instanceof InterBase) {
                                                                    String effectDes3 = ((InterBase) view).getEffectDes();
                                                                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                                                                    if (viewGroup3 != null) {
                                                                        C8372c.m23824a(effectDes3, viewGroup3, true);
                                                                    }
                                                                }
                                                                ((ImageView) view).setImageBitmap(bitmap);
                                                                return;
                                                            }
                                                        } catch (Exception e) {
                                                            C8672v.m24878d("MBDataBinding", e.getMessage());
                                                            return;
                                                        }
                                                    }
                                                    ((ImageView) view).setBackgroundColor(-7829368);
                                                }

                                                public final void onFailedLoad(String str, String str2) {
                                                    View view = view;
                                                    if (view != null) {
                                                        ((ImageView) view).setBackgroundColor(-7829368);
                                                    }
                                                }
                                            });
                                        }
                                    }
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                        }
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m23780a(C8354b bVar, View view, Object obj) {
        if (view != null && obj != null && (obj instanceof C8377a)) {
            view.setOnClickListener(new C8346a((C8377a) obj));
        }
    }
}

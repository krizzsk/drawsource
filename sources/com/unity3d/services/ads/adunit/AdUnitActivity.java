package com.unity3d.services.ads.adunit;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.tapjoy.TJAdUnitConstants;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.ads.configuration.IAdsModuleConfiguration;
import com.unity3d.services.core.api.Intent;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12081k;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

public class AdUnitActivity extends Activity {

    /* renamed from: a */
    protected C11813e f28651a;

    /* renamed from: b */
    private String[] f28652b;

    /* renamed from: c */
    private int f28653c = -1;

    /* renamed from: d */
    private int f28654d;

    /* renamed from: e */
    private int f28655e;

    /* renamed from: f */
    private ArrayList<Integer> f28656f;

    /* renamed from: g */
    boolean f28657g;

    /* renamed from: h */
    private Map<String, C11814f> f28658h;

    /* renamed from: i */
    private int f28659i;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo70704a(java.lang.String r3, int r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            com.unity3d.services.ads.adunit.f r0 = r2.mo70711c((java.lang.String) r3)
            java.lang.String r1 = "adunit"
            boolean r3 = r3.equals(r1)
            r1 = 0
            if (r3 == 0) goto L_0x001b
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r6, r7)
            r3.setMargins(r4, r5, r1, r1)
            com.unity3d.services.ads.adunit.e r0 = r2.f28651a
            r0.setLayoutParams(r3)
            goto L_0x0022
        L_0x001b:
            if (r0 == 0) goto L_0x0022
            android.view.View r3 = r0.mo70745b()
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            if (r3 == 0) goto L_0x0030
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r0.<init>(r6, r7)
            r0.setMargins(r4, r5, r1, r1)
            r3.setLayoutParams(r0)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.adunit.AdUnitActivity.mo70704a(java.lang.String, int, int, int, int):void");
    }

    /* renamed from: b */
    public C11813e mo70708b() {
        return this.f28651a;
    }

    /* renamed from: c */
    public String[] mo70713c() {
        return this.f28652b;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C11810b bVar;
        super.onCreate(bundle);
        if (C12136a.m33103c() == null) {
            C12065a.m32848c("Unity Ads web app is null, closing Unity Ads activity from onCreate");
            finish();
            return;
        }
        AdUnit.setAdUnitActivity(this);
        Intent.setActiveActivity(this);
        mo70702a();
        C12081k.m32885a(this.f28651a);
        C11813e eVar = this.f28651a;
        addContentView(eVar, eVar.getLayoutParams());
        if (bundle == null) {
            this.f28652b = getIntent().getStringArrayExtra("views");
            this.f28656f = getIntent().getIntegerArrayListExtra("keyEvents");
            if (getIntent().hasExtra(TJAdUnitConstants.String.ORIENTATION)) {
                this.f28653c = getIntent().getIntExtra(TJAdUnitConstants.String.ORIENTATION, -1);
            }
            if (getIntent().hasExtra("systemUiVisibility")) {
                this.f28654d = getIntent().getIntExtra("systemUiVisibility", 0);
            }
            if (getIntent().hasExtra("activityId")) {
                this.f28655e = getIntent().getIntExtra("activityId", -1);
            }
            if (getIntent().hasExtra("displayCutoutMode")) {
                this.f28659i = getIntent().getIntExtra("displayCutoutMode", 0);
            }
            bVar = C11810b.ON_CREATE;
        } else {
            this.f28652b = bundle.getStringArray("views");
            this.f28653c = bundle.getInt(TJAdUnitConstants.String.ORIENTATION, -1);
            this.f28654d = bundle.getInt("systemUiVisibility", 0);
            this.f28656f = bundle.getIntegerArrayList("keyEvents");
            this.f28657g = bundle.getBoolean("keepScreenOn");
            this.f28655e = bundle.getInt("activityId", -1);
            this.f28659i = bundle.getInt("displayCutoutMode", 0);
            mo70707a(this.f28657g);
            bVar = C11810b.ON_RESTORE;
        }
        mo70710b(this.f28653c);
        mo70712c(this.f28654d);
        mo70703a(this.f28659i);
        String[] strArr = this.f28652b;
        if (strArr != null) {
            for (String c : strArr) {
                C11814f c2 = mo70711c(c);
                if (c2 != null) {
                    c2.mo70743a(this, bundle);
                }
            }
        }
        C12136a.m33103c().mo71310a((Enum) C12143b.ADUNIT, (Enum) bVar, Integer.valueOf(this.f28655e));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (C12136a.m33103c() != null) {
            C12136a.m33103c().mo71310a((Enum) C12143b.ADUNIT, (Enum) C11810b.ON_DESTROY, Boolean.valueOf(isFinishing()), Integer.valueOf(this.f28655e));
            Map<String, C11814f> map = this.f28658h;
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    if (next.getValue() != null) {
                        ((C11814f) next.getValue()).mo70750f(this);
                    }
                }
            }
            if (AdUnit.getCurrentAdUnitActivityId() == this.f28655e) {
                AdUnit.setAdUnitActivity((AdUnitActivity) null);
            }
            Intent.removeActiveActivity(this);
        } else if (!isFinishing()) {
            C12065a.m32848c("Unity Ads web app is null, closing Unity Ads activity from onDestroy");
            finish();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        ArrayList<Integer> arrayList = this.f28656f;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(i))) {
            return false;
        }
        C12136a.m33103c().mo71310a((Enum) C12143b.ADUNIT, (Enum) C11810b.KEY_DOWN, Integer.valueOf(i), Long.valueOf(keyEvent.getEventTime()), Long.valueOf(keyEvent.getDownTime()), Integer.valueOf(keyEvent.getRepeatCount()), Integer.valueOf(this.f28655e));
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (C12136a.m33103c() != null) {
            if (C12136a.m33103c().mo71319g() == null) {
                C12065a.m32851e("Unity Ads web view is null, from onPause");
            } else if (isFinishing()) {
                C12081k.m32885a(C12136a.m33103c().mo71319g());
            }
            Map<String, C11814f> map = this.f28658h;
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    if (next.getValue() != null) {
                        ((C11814f) next.getValue()).mo70746b(this);
                    }
                }
            }
            C12136a.m33103c().mo71310a((Enum) C12143b.ADUNIT, (Enum) C11810b.ON_PAUSE, Boolean.valueOf(isFinishing()), Integer.valueOf(this.f28655e));
        } else if (!isFinishing()) {
            C12065a.m32848c("Unity Ads web app is null, closing Unity Ads activity from onPause");
            finish();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            for (String put : strArr) {
                jSONArray.put(put);
            }
            for (int put2 : iArr) {
                jSONArray2.put(put2);
            }
            C12136a.m33103c().mo71310a((Enum) C12143b.PERMISSIONS, (Enum) C11815g.PERMISSIONS_RESULT, Integer.valueOf(i), jSONArray, jSONArray2);
        } catch (Exception e) {
            C12136a.m33103c().mo71310a((Enum) C12143b.PERMISSIONS, (Enum) C11815g.PERMISSIONS_ERROR, e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (C12136a.m33103c() != null) {
            mo70706a(this.f28652b);
            Map<String, C11814f> map = this.f28658h;
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    if (next.getValue() != null) {
                        ((C11814f) next.getValue()).mo70747c(this);
                    }
                }
            }
            C12136a.m33103c().mo71310a((Enum) C12143b.ADUNIT, (Enum) C11810b.ON_RESUME, Integer.valueOf(this.f28655e));
        } else if (!isFinishing()) {
            C12065a.m32848c("Unity Ads web app is null, closing Unity Ads activity from onResume");
            finish();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(TJAdUnitConstants.String.ORIENTATION, this.f28653c);
        bundle.putInt("systemUiVisibility", this.f28654d);
        bundle.putIntegerArrayList("keyEvents", this.f28656f);
        bundle.putBoolean("keepScreenOn", this.f28657g);
        bundle.putStringArray("views", this.f28652b);
        bundle.putInt("activityId", this.f28655e);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (C12136a.m33103c() != null) {
            Map<String, C11814f> map = this.f28658h;
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    if (next.getValue() != null) {
                        ((C11814f) next.getValue()).mo70748d(this);
                    }
                }
            }
            C12136a.m33103c().mo71310a((Enum) C12143b.ADUNIT, (Enum) C11810b.ON_START, Integer.valueOf(this.f28655e));
        } else if (!isFinishing()) {
            C12065a.m32848c("Unity Ads web app is null, closing Unity Ads activity from onStart");
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (C12136a.m33103c() != null) {
            Map<String, C11814f> map = this.f28658h;
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    if (next.getValue() != null) {
                        ((C11814f) next.getValue()).mo70742a(this);
                    }
                }
            }
            C12136a.m33103c().mo71310a((Enum) C12143b.ADUNIT, (Enum) C11810b.ON_STOP, Integer.valueOf(this.f28655e));
        } else if (!isFinishing()) {
            C12065a.m32848c("Unity Ads web app is null, closing Unity Ads activity from onStop");
            finish();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (z) {
            C12136a.m33103c().mo71310a((Enum) C12143b.ADUNIT, (Enum) C11810b.ON_FOCUS_GAINED, Integer.valueOf(this.f28655e));
        } else {
            C12136a.m33103c().mo71310a((Enum) C12143b.ADUNIT, (Enum) C11810b.ON_FOCUS_LOST, Integer.valueOf(this.f28655e));
        }
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    public Map<String, Integer> mo70709b(String str) {
        C11814f c = mo70711c(str);
        if (str.equals("adunit")) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28651a.getLayoutParams();
            HashMap hashMap = new HashMap();
            hashMap.put("x", Integer.valueOf(layoutParams.leftMargin));
            hashMap.put("y", Integer.valueOf(layoutParams.topMargin));
            hashMap.put("width", Integer.valueOf(this.f28651a.getWidth()));
            hashMap.put("height", Integer.valueOf(this.f28651a.getHeight()));
            return hashMap;
        }
        View b = c != null ? c.mo70745b() : null;
        if (b == null) {
            return null;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) b.getLayoutParams();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("x", Integer.valueOf(layoutParams2.leftMargin));
        hashMap2.put("y", Integer.valueOf(layoutParams2.topMargin));
        hashMap2.put("width", Integer.valueOf(b.getWidth()));
        hashMap2.put("height", Integer.valueOf(b.getHeight()));
        return hashMap2;
    }

    /* renamed from: c */
    public boolean mo70712c(int i) {
        this.f28654d = i;
        if (Build.VERSION.SDK_INT >= 11) {
            try {
                getWindow().getDecorView().setSystemUiVisibility(i);
                return true;
            } catch (Exception e) {
                C12065a.m32842a("Error while setting SystemUIVisibility", e);
            }
        }
        return false;
    }

    /* renamed from: c */
    public C11814f mo70711c(String str) {
        Map<String, C11814f> map = this.f28658h;
        if (map != null && map.containsKey(str)) {
            return this.f28658h.get(str);
        }
        C11814f a = m32254a(str);
        if (a != null) {
            if (this.f28658h == null) {
                this.f28658h = new HashMap();
            }
            this.f28658h.put(str, a);
        }
        return a;
    }

    /* renamed from: a */
    public void mo70706a(String[] strArr) {
        if (strArr == null) {
            strArr = new String[0];
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        if (this.f28652b == null) {
            this.f28652b = new String[0];
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(this.f28652b));
        arrayList2.removeAll(arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            mo70711c((String) it.next()).mo70744a();
        }
        this.f28652b = strArr;
        for (String str : strArr) {
            if (str != null) {
                C11814f c = mo70711c(str);
                c.mo70749e(this);
                if (!m32255a(c.mo70745b())) {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo70710b(int i) {
        this.f28653c = i;
        setRequestedOrientation(i);
    }

    /* renamed from: a */
    private boolean m32255a(View view) {
        if (view == null) {
            finish();
            C12065a.m32848c("Could not place view because it is null, finishing activity");
            return false;
        } else if (view.getParent() == null || !view.getParent().equals(this.f28651a)) {
            C12081k.m32885a(view);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            layoutParams.setMargins(0, 0, 0, 0);
            view.setPadding(0, 0, 0, 0);
            this.f28651a.addView(view, layoutParams);
            return true;
        } else {
            this.f28651a.bringChildToFront(view);
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo70707a(boolean z) {
        this.f28657g = z;
        if (getWindow() == null) {
            return false;
        }
        if (z) {
            getWindow().addFlags(128);
            return true;
        }
        getWindow().clearFlags(128);
        return true;
    }

    /* renamed from: a */
    public void mo70705a(ArrayList<Integer> arrayList) {
        this.f28656f = arrayList;
    }

    /* renamed from: a */
    public void mo70703a(int i) {
        this.f28659i = i;
        if (Build.VERSION.SDK_INT >= 28 && getWindow() != null) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            try {
                attributes.getClass().getField("layoutInDisplayCutoutMode").setInt(attributes, i);
            } catch (IllegalAccessException e) {
                C12065a.m32843a("Error setting layoutInDisplayCutoutMode", e);
            } catch (NoSuchFieldException e2) {
                C12065a.m32843a("Error getting layoutInDisplayCutoutMode", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70702a() {
        if (this.f28651a == null) {
            C11813e eVar = new C11813e(this);
            this.f28651a = eVar;
            eVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            C12081k.m32886a((View) this.f28651a, (Drawable) new ColorDrawable(ViewCompat.MEASURED_STATE_MASK));
        }
    }

    /* renamed from: a */
    private C11814f m32254a(String str) {
        Map<String, Class> adUnitViewHandlers;
        if (C12136a.m33103c() != null) {
            Configuration b = C12136a.m33103c().mo71312b();
            String[] moduleConfigurationList = b.getModuleConfigurationList();
            int length = moduleConfigurationList.length;
            int i = 0;
            while (i < length) {
                IModuleConfiguration moduleConfiguration = b.getModuleConfiguration(moduleConfigurationList[i]);
                if (!(moduleConfiguration instanceof IAdsModuleConfiguration) || (adUnitViewHandlers = ((IAdsModuleConfiguration) moduleConfiguration).getAdUnitViewHandlers()) == null || !adUnitViewHandlers.containsKey(str)) {
                    i++;
                } else {
                    try {
                        return (C11814f) adUnitViewHandlers.get(str).newInstance();
                    } catch (Exception unused) {
                        C12065a.m32848c("Error creating view: " + str);
                        return null;
                    }
                }
            }
        }
        return null;
    }
}

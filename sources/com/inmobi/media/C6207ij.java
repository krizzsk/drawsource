package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.Map;

/* renamed from: com.inmobi.media.ij */
/* compiled from: AppSetIdInfoHelper */
public final class C6207ij {

    /* renamed from: a */
    AppSetIdInfo f15661a;

    /* renamed from: com.inmobi.media.ij$a */
    /* compiled from: AppSetIdInfoHelper */
    public static class C6209a {

        /* renamed from: a */
        public static final C6207ij f15663a = new C6207ij((byte) 0);
    }

    /* synthetic */ C6207ij(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo35426a(Map<String, String> map) {
        AppSetIdInfo appSetIdInfo;
        if (m18420a() && (appSetIdInfo = this.f15661a) != null) {
            map.put("d-app-set-id", appSetIdInfo.getId());
            StringBuilder sb = new StringBuilder();
            sb.append(this.f15661a.getScope());
            map.put("d-app-set-scope", sb.toString());
        }
    }

    private C6207ij() {
        Context c;
        this.f15661a = null;
        if (m18420a() && (c = C6183hw.m18324c()) != null) {
            AppSet.getClient(c).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() {
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    C6207ij.this.f15661a = (AppSetIdInfo) obj;
                }
            });
        }
    }

    /* renamed from: a */
    private static boolean m18420a() {
        try {
            AppSetIdInfo.class.getName();
            Task.class.getName();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }
}

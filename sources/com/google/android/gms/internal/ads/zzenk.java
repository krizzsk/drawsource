package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzenk implements zzetg {
    private final zzfvm zza;
    private final zzfvm zzb;
    private final Context zzc;
    private final zzfcd zzd;
    private final View zze;

    public zzenk(zzfvm zzfvm, zzfvm zzfvm2, Context context, zzfcd zzfcd, ViewGroup viewGroup) {
        this.zza = zzfvm;
        this.zzb = zzfvm2;
        this.zzc = context;
        this.zzd = zzfcd;
        this.zze = viewGroup;
    }

    private final List zze() {
        ArrayList arrayList = new ArrayList();
        View view = this.zze;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    public final int zza() {
        return 3;
    }

    public final zzfvl zzb() {
        zzbhz.zzc(this.zzc);
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzir)).booleanValue()) {
            return this.zzb.zzb(new zzeni(this));
        }
        return this.zza.zzb(new zzenj(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzenl zzc() throws Exception {
        return new zzenl(this.zzc, this.zzd.zze, zze());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzenl zzd() throws Exception {
        return new zzenl(this.zzc, this.zzd.zze, zze());
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdoh {
    private final zzg zza;
    private final zzfcd zzb;
    private final zzdnm zzc;
    private final zzdnh zzd;
    private final zzdos zze;
    private final zzdpa zzf;
    private final Executor zzg;
    private final Executor zzh;
    private final zzbkp zzi;
    private final zzdne zzj;

    public zzdoh(zzg zzg2, zzfcd zzfcd, zzdnm zzdnm, zzdnh zzdnh, zzdos zzdos, zzdpa zzdpa, Executor executor, Executor executor2, zzdne zzdne) {
        this.zza = zzg2;
        this.zzb = zzfcd;
        this.zzi = zzfcd.zzi;
        this.zzc = zzdnm;
        this.zzd = zzdnh;
        this.zze = zzdos;
        this.zzf = zzdpa;
        this.zzg = executor;
        this.zzh = executor2;
        this.zzj = zzdne;
    }

    private final boolean zzh(ViewGroup viewGroup, boolean z) {
        FrameLayout.LayoutParams layoutParams;
        View zzf2 = z ? this.zzd.zzf() : this.zzd.zzg();
        if (zzf2 == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzf2.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzf2.getParent()).removeView(zzf2);
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzcT)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzf2, layoutParams);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        zzdnh zzdnh = this.zzd;
        if (zzdnh.zzf() == null) {
            return;
        }
        if (zzdnh.zzc() == 2 || zzdnh.zzc() == 1) {
            this.zza.zzI(this.zzb.zzf, String.valueOf(zzdnh.zzc()), z);
        } else if (zzdnh.zzc() == 6) {
            this.zza.zzI(this.zzb.zzf, "2", z);
            this.zza.zzI(this.zzb.zzf, "1", z);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzdpc zzdpc) {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        zzbky zza2;
        Drawable drawable;
        IObjectWrapper iObjectWrapper = null;
        if (this.zzc.zzf() || this.zzc.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            int i = 0;
            while (true) {
                if (i >= 2) {
                    break;
                }
                View zzg2 = zzdpc.zzg(strArr[i]);
                if (zzg2 != null && (zzg2 instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg2;
                    break;
                }
                i++;
            }
        }
        viewGroup = null;
        Context context = zzdpc.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdnh zzdnh = this.zzd;
        if (zzdnh.zze() != null) {
            view = zzdnh.zze();
            zzbkp zzbkp = this.zzi;
            if (zzbkp != null && viewGroup == null) {
                zzg(layoutParams, zzbkp.zze);
                view.setLayoutParams(layoutParams);
            }
        } else if (!(zzdnh.zzl() instanceof zzbkk)) {
            view = null;
        } else {
            zzbkk zzbkk = (zzbkk) zzdnh.zzl();
            if (viewGroup == null) {
                zzg(layoutParams, zzbkk.zzc());
            }
            zzbkl zzbkl = new zzbkl(context, zzbkk, layoutParams);
            zzbkl.setContentDescription((CharSequence) zzay.zzc().zzb(zzbhz.zzcR));
            view = zzbkl;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                zza zza3 = new zza(zzdpc.zzf().getContext());
                zza3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zza3.addView(view);
                FrameLayout zzh2 = zzdpc.zzh();
                if (zzh2 != null) {
                    zzh2.addView(zza3);
                }
            }
            zzdpc.zzq(zzdpc.zzk(), view, true);
        }
        zzfrj zzfrj = zzdod.zza;
        int size = zzfrj.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzg3 = zzdpc.zzg((String) zzfrj.get(i2));
            i2++;
            if (zzg3 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzg3;
                break;
            }
        }
        this.zzh.execute(new zzdoe(this, viewGroup2));
        if (viewGroup2 != null) {
            if (zzh(viewGroup2, true)) {
                zzdnh zzdnh2 = this.zzd;
                if (zzdnh2.zzr() != null) {
                    zzdnh2.zzr().zzaq(new zzdog(zzdpc, viewGroup2));
                    return;
                }
                return;
            }
            if (!((Boolean) zzay.zzc().zzb(zzbhz.zzhX)).booleanValue() || !zzh(viewGroup2, false)) {
                viewGroup2.removeAllViews();
                View zzf2 = zzdpc.zzf();
                Context context2 = zzf2 != null ? zzf2.getContext() : null;
                if (context2 != null && (zza2 = this.zzj.zza()) != null) {
                    try {
                        IObjectWrapper zzi2 = zza2.zzi();
                        if (zzi2 != null && (drawable = (Drawable) ObjectWrapper.unwrap(zzi2)) != null) {
                            ImageView imageView = new ImageView(context2);
                            imageView.setImageDrawable(drawable);
                            if (zzdpc != null) {
                                iObjectWrapper = zzdpc.zzj();
                            }
                            if (iObjectWrapper != null) {
                                if (((Boolean) zzay.zzc().zzb(zzbhz.zzff)).booleanValue()) {
                                    imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapper));
                                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    viewGroup2.addView(imageView);
                                }
                            }
                            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            viewGroup2.addView(imageView);
                        }
                    } catch (RemoteException unused) {
                        zze.zzj("Could not get main image drawable");
                    }
                }
            } else {
                zzdnh zzdnh3 = this.zzd;
                if (zzdnh3.zzp() != null) {
                    zzdnh3.zzp().zzaq(new zzdog(zzdpc, viewGroup2));
                }
            }
        }
    }

    public final void zzc(zzdpc zzdpc) {
        if (zzdpc != null && this.zze != null && zzdpc.zzh() != null && this.zzc.zzg()) {
            try {
                zzdpc.zzh().addView(this.zze.zza());
            } catch (zzclt e) {
                zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final void zzd(zzdpc zzdpc) {
        if (zzdpc != null) {
            Context context = zzdpc.zzf().getContext();
            if (zzbx.zzh(context, this.zzc.zza)) {
                if (!(context instanceof Activity)) {
                    zze.zze("Activity context is needed for policy validator.");
                } else if (this.zzf != null && zzdpc.zzh() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(this.zzf.zza(zzdpc.zzh(), windowManager), zzbx.zzb());
                    } catch (zzclt e) {
                        zze.zzb("web view can not be obtained", e);
                    }
                }
            }
        }
    }

    public final void zze(zzdpc zzdpc) {
        this.zzg.execute(new zzdof(this, zzdpc));
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzh(viewGroup, true);
    }

    private static void zzg(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }
}

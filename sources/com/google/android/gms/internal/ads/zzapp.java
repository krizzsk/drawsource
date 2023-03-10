package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.internal.client.zzay;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzapp extends zzaqn {
    private static final zzaqo zzi = new zzaqo();
    private final Context zzj;

    public zzapp(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2, Context context, zzalb zzalb) {
        super(zzapc, "8zPzMumx8VK4Q4ZZMffWEJsAX0/i9gohXVA/VhPpWBNlLRmzgRsEh/j6Aaymt8Wu", "GsEHhtmZy7+TitdN6KLdSnSR7WpVlkZahwBwH9Jv1wQ=", zzali, i, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzaly zzc = this.zzb.zzc();
            if (zzc == null || !zzc.zzai()) {
                return null;
            }
            return zzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzamo zzamo;
        int i;
        Boolean bool;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzamo zzamo2 = (zzamo) zza.get();
            if (zzamo2 == null || zzapf.zzg(zzamo2.zza) || zzamo2.zza.equals(ExifInterface.LONGITUDE_EAST) || zzamo2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!zzapf.zzg((String) null)) {
                    i = 5;
                } else {
                    if (!zzapf.zzg((String) null)) {
                        bool = false;
                    } else {
                        bool = false;
                    }
                    i = (!bool.booleanValue() || !this.zzb.zzp()) ? 3 : 4;
                }
                Boolean valueOf = Boolean.valueOf(i == 3);
                Boolean bool2 = (Boolean) zzay.zzc().zzb(zzbhz.zzbW);
                String zzb = ((Boolean) zzay.zzc().zzb(zzbhz.zzbV)).booleanValue() ? zzb() : null;
                if (bool2.booleanValue() && this.zzb.zzp() && zzapf.zzg(zzb)) {
                    zzb = zzc();
                }
                zzamo zzamo3 = new zzamo((String) this.zzf.invoke((Object) null, new Object[]{this.zzj, valueOf, zzb}));
                if (zzapf.zzg(zzamo3.zza) || zzamo3.zza.equals(ExifInterface.LONGITUDE_EAST)) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String zzc = zzc();
                        if (!zzapf.zzg(zzc)) {
                            zzamo3.zza = zzc;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                zza.set(zzamo3);
            }
            zzamo = (zzamo) zza.get();
        }
        synchronized (this.zze) {
            if (zzamo != null) {
                this.zze.zzw(zzamo.zza);
                this.zze.zzW(zzamo.zzb);
                this.zze.zzY(zzamo.zzc);
                this.zze.zzh(zzamo.zzd);
                this.zze.zzv(zzamo.zze);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String zzb() {
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            byte[] zzi2 = zzapf.zzi((String) zzay.zzc().zzb(zzbhz.zzbX));
            ArrayList arrayList = new ArrayList();
            arrayList.add(instance.generateCertificate(new ByteArrayInputStream(zzi2)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(instance.generateCertificate(new ByteArrayInputStream(zzapf.zzi((String) zzay.zzc().zzb(zzbhz.zzbY)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals(ExifInterface.LATITUDE_SOUTH)) {
                return null;
            }
            zzfvt zzf = zzfvt.zzf();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new zzaqp(zzf));
            return (String) zzf.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}

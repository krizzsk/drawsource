package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfln {
    private final Context zza;
    private final Executor zzb;
    private final zzfku zzc;
    private final zzfkw zzd;
    private final zzflm zze;
    private final zzflm zzf;
    private Task zzg;
    private Task zzh;

    zzfln(Context context, Executor executor, zzfku zzfku, zzfkw zzfkw, zzflk zzflk, zzfll zzfll) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfku;
        this.zzd = zzfkw;
        this.zze = zzflk;
        this.zzf = zzfll;
    }

    public static zzfln zze(Context context, Executor executor, zzfku zzfku, zzfkw zzfkw) {
        zzfln zzfln = new zzfln(context, executor, zzfku, zzfkw, new zzflk(), new zzfll());
        if (zzfln.zzd.zzd()) {
            zzfln.zzg = zzfln.zzh(new zzflh(zzfln));
        } else {
            zzfln.zzg = Tasks.forResult(zzfln.zze.zza());
        }
        zzfln.zzh = zzfln.zzh(new zzfli(zzfln));
        return zzfln;
    }

    private static zzaly zzg(Task task, zzaly zzaly) {
        if (!task.isSuccessful()) {
            return zzaly;
        }
        return (zzaly) task.getResult();
    }

    private final Task zzh(Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, (OnFailureListener) new zzflj(this));
    }

    public final zzaly zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzaly zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzaly zzc() throws Exception {
        Context context = this.zza;
        zzali zza2 = zzaly.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zza2.zzr(id);
            zza2.zzq(advertisingIdInfo.isLimitAdTrackingEnabled());
            zza2.zzaa(6);
        }
        return (zzaly) zza2.zzal();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzaly zzd() throws Exception {
        Context context = this.zza;
        return zzflc.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1, exc);
    }
}

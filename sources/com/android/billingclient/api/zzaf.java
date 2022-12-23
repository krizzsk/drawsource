package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@3.0.3 */
final class zzaf implements Callable<Void> {
    final /* synthetic */ zzah zza;

    zzaf(zzah zzah) {
        this.zza = zzah;
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        /*
            r10 = this;
            com.android.billingclient.api.zzah r0 = r10.zza
            java.lang.Object r0 = r0.zzb
            monitor-enter(r0)
            com.android.billingclient.api.zzah r1 = r10.zza     // Catch:{ all -> 0x0160 }
            boolean r1 = r1.zzc     // Catch:{ all -> 0x0160 }
            r2 = 0
            if (r1 == 0) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0160 }
            goto L_0x015f
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0160 }
            r0 = 3
            r1 = 0
            com.android.billingclient.api.zzah r3 = r10.zza     // Catch:{ Exception -> 0x0138 }
            com.android.billingclient.api.BillingClientImpl r3 = r3.zza     // Catch:{ Exception -> 0x0138 }
            android.content.Context r3 = r3.zzf     // Catch:{ Exception -> 0x0138 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ Exception -> 0x0138 }
            r4 = 16
            r6 = r0
            r5 = r4
        L_0x0026:
            if (r5 < r0) goto L_0x003f
            com.android.billingclient.api.zzah r7 = r10.zza     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.BillingClientImpl r7 = r7.zza     // Catch:{ Exception -> 0x003c }
            com.google.android.gms.internal.play_billing.zzd r7 = r7.zzg     // Catch:{ Exception -> 0x003c }
            java.lang.String r8 = "subs"
            int r6 = r7.zza(r5, r3, r8)     // Catch:{ Exception -> 0x003c }
            if (r6 != 0) goto L_0x0039
            goto L_0x0040
        L_0x0039:
            int r5 = r5 + -1
            goto L_0x0026
        L_0x003c:
            r0 = r6
            goto L_0x0138
        L_0x003f:
            r5 = r1
        L_0x0040:
            com.android.billingclient.api.zzah r7 = r10.zza     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.BillingClientImpl r7 = r7.zza     // Catch:{ Exception -> 0x003c }
            r8 = 5
            r9 = 1
            if (r5 < r8) goto L_0x004a
            r8 = r9
            goto L_0x004b
        L_0x004a:
            r8 = r1
        L_0x004b:
            boolean unused = r7.zzj = r8     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.zzah r7 = r10.zza     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.BillingClientImpl r7 = r7.zza     // Catch:{ Exception -> 0x003c }
            if (r5 < r0) goto L_0x0056
            r8 = r9
            goto L_0x0057
        L_0x0056:
            r8 = r1
        L_0x0057:
            boolean unused = r7.zzi = r8     // Catch:{ Exception -> 0x003c }
            if (r5 >= r0) goto L_0x0063
            java.lang.String r5 = "BillingClient"
            java.lang.String r7 = "In-app billing API does not support subscription on this device."
            com.google.android.gms.internal.play_billing.zza.zza(r5, r7)     // Catch:{ Exception -> 0x003c }
        L_0x0063:
            r5 = r4
        L_0x0064:
            if (r5 < r0) goto L_0x0081
            com.android.billingclient.api.zzah r7 = r10.zza     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.BillingClientImpl r7 = r7.zza     // Catch:{ Exception -> 0x003c }
            com.google.android.gms.internal.play_billing.zzd r7 = r7.zzg     // Catch:{ Exception -> 0x003c }
            java.lang.String r8 = "inapp"
            int r6 = r7.zza(r5, r3, r8)     // Catch:{ Exception -> 0x003c }
            if (r6 != 0) goto L_0x007e
            com.android.billingclient.api.zzah r3 = r10.zza     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.BillingClientImpl r3 = r3.zza     // Catch:{ Exception -> 0x003c }
            int unused = r3.zzk = r5     // Catch:{ Exception -> 0x003c }
            goto L_0x0081
        L_0x007e:
            int r5 = r5 + -1
            goto L_0x0064
        L_0x0081:
            com.android.billingclient.api.zzah r3 = r10.zza     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.BillingClientImpl r3 = r3.zza     // Catch:{ Exception -> 0x003c }
            int r5 = r3.zzk     // Catch:{ Exception -> 0x003c }
            if (r5 < r4) goto L_0x008d
            r4 = r9
            goto L_0x008e
        L_0x008d:
            r4 = r1
        L_0x008e:
            boolean unused = r3.zzs = r4     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.zzah r3 = r10.zza     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.BillingClientImpl r3 = r3.zza     // Catch:{ Exception -> 0x003c }
            int r4 = r3.zzk     // Catch:{ Exception -> 0x003c }
            r5 = 15
            if (r4 < r5) goto L_0x009f
            r4 = r9
            goto L_0x00a0
        L_0x009f:
            r4 = r1
        L_0x00a0:
            boolean unused = r3.zzr = r4     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.zzah r3 = r10.zza     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.BillingClientImpl r3 = r3.zza     // Catch:{ Exception -> 0x003c }
            int r4 = r3.zzk     // Catch:{ Exception -> 0x003c }
            r5 = 14
            if (r4 < r5) goto L_0x00b1
            r4 = r9
            goto L_0x00b2
        L_0x00b1:
            r4 = r1
        L_0x00b2:
            boolean unused = r3.zzq = r4     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.zzah r3 = r10.zza     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.BillingClientImpl r3 = r3.zza     // Catch:{ Exception -> 0x003c }
            int r4 = r3.zzk     // Catch:{ Exception -> 0x003c }
            r5 = 12
            if (r4 < r5) goto L_0x00c3
            r4 = r9
            goto L_0x00c4
        L_0x00c3:
            r4 = r1
        L_0x00c4:
            boolean unused = r3.zzp = r4     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.zzah r3 = r10.zza     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.BillingClientImpl r3 = r3.zza     // Catch:{ Exception -> 0x003c }
            int r4 = r3.zzk     // Catch:{ Exception -> 0x003c }
            r5 = 10
            if (r4 < r5) goto L_0x00d5
            r4 = r9
            goto L_0x00d6
        L_0x00d5:
            r4 = r1
        L_0x00d6:
            boolean unused = r3.zzo = r4     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.zzah r3 = r10.zza     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.BillingClientImpl r3 = r3.zza     // Catch:{ Exception -> 0x003c }
            int r4 = r3.zzk     // Catch:{ Exception -> 0x003c }
            r5 = 9
            if (r4 < r5) goto L_0x00e7
            r4 = r9
            goto L_0x00e8
        L_0x00e7:
            r4 = r1
        L_0x00e8:
            boolean unused = r3.zzn = r4     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.zzah r3 = r10.zza     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.BillingClientImpl r3 = r3.zza     // Catch:{ Exception -> 0x003c }
            int r4 = r3.zzk     // Catch:{ Exception -> 0x003c }
            r5 = 8
            if (r4 < r5) goto L_0x00f9
            r4 = r9
            goto L_0x00fa
        L_0x00f9:
            r4 = r1
        L_0x00fa:
            boolean unused = r3.zzm = r4     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.zzah r3 = r10.zza     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.BillingClientImpl r3 = r3.zza     // Catch:{ Exception -> 0x003c }
            int r4 = r3.zzk     // Catch:{ Exception -> 0x003c }
            r5 = 6
            if (r4 < r5) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r9 = r1
        L_0x010a:
            boolean unused = r3.zzl = r9     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.zzah r3 = r10.zza     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.BillingClientImpl r3 = r3.zza     // Catch:{ Exception -> 0x003c }
            int r3 = r3.zzk     // Catch:{ Exception -> 0x003c }
            if (r3 >= r0) goto L_0x011e
            java.lang.String r0 = "BillingClient"
            java.lang.String r3 = "In-app billing API version 3 is not supported on this device."
            com.google.android.gms.internal.play_billing.zza.zzb(r0, r3)     // Catch:{ Exception -> 0x003c }
        L_0x011e:
            if (r6 != 0) goto L_0x0129
            com.android.billingclient.api.zzah r0 = r10.zza     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.BillingClientImpl r0 = r0.zza     // Catch:{ Exception -> 0x003c }
            r3 = 2
            int unused = r0.zza = r3     // Catch:{ Exception -> 0x003c }
            goto L_0x014e
        L_0x0129:
            com.android.billingclient.api.zzah r0 = r10.zza     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.BillingClientImpl r0 = r0.zza     // Catch:{ Exception -> 0x003c }
            int unused = r0.zza = r1     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.zzah r0 = r10.zza     // Catch:{ Exception -> 0x003c }
            com.android.billingclient.api.BillingClientImpl r0 = r0.zza     // Catch:{ Exception -> 0x003c }
            com.google.android.gms.internal.play_billing.zzd unused = r0.zzg = r2     // Catch:{ Exception -> 0x003c }
            goto L_0x014e
        L_0x0138:
            java.lang.String r3 = "BillingClient"
            java.lang.String r4 = "Exception while checking if billing is supported; try to reconnect"
            com.google.android.gms.internal.play_billing.zza.zzb(r3, r4)
            com.android.billingclient.api.zzah r3 = r10.zza
            com.android.billingclient.api.BillingClientImpl r3 = r3.zza
            int unused = r3.zza = r1
            com.android.billingclient.api.zzah r1 = r10.zza
            com.android.billingclient.api.BillingClientImpl r1 = r1.zza
            com.google.android.gms.internal.play_billing.zzd unused = r1.zzg = r2
            r6 = r0
        L_0x014e:
            if (r6 != 0) goto L_0x0158
            com.android.billingclient.api.zzah r0 = r10.zza
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzam.zzp
            r0.zzf(r1)
            goto L_0x015f
        L_0x0158:
            com.android.billingclient.api.zzah r0 = r10.zza
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzam.zza
            r0.zzf(r1)
        L_0x015f:
            return r2
        L_0x0160:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0160 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzaf.call():java.lang.Object");
    }
}

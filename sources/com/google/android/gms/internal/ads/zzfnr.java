package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzfnr extends zzfnf {
    private zzfpj<Integer> zza;
    private zzfpj<Integer> zzb;
    private zzfnq zzc;
    private HttpURLConnection zzd;

    zzfnr() {
        this(zzfno.zza, zzfnp.zza, (zzfnq) null);
    }

    zzfnr(zzfpj<Integer> zzfpj, zzfpj<Integer> zzfpj2, zzfnq zzfnq) {
        this.zza = zzfpj;
        this.zzb = zzfpj2;
        this.zzc = zzfnq;
    }

    static /* synthetic */ Integer zzf() {
        return -1;
    }

    static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfng.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfng.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfnq zzfnq = this.zzc;
        if (zzfnq != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) zzfnq.zza();
            this.zzd = httpURLConnection;
            return httpURLConnection;
        }
        throw null;
    }

    public HttpURLConnection zzn(zzfnq zzfnq, int i, int i2) throws IOException {
        this.zza = new zzfnh(i);
        this.zzb = new zzfni(i2);
        this.zzc = zzfnq;
        return zzm();
    }

    public HttpURLConnection zzo(Network network, URL url, int i, int i2) throws IOException {
        this.zza = new zzfnj(i);
        this.zzb = new zzfnk(i2);
        this.zzc = new zzfnl(network, url);
        return zzm();
    }

    public URLConnection zzr(URL url, int i) throws IOException {
        this.zza = new zzfnm(i);
        this.zzc = new zzfnn(url);
        return zzm();
    }
}

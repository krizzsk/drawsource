package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzdwc;
import com.google.android.gms.internal.ads.zzdwm;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzc {
    /* access modifiers changed from: private */
    public final int zza;
    private final long zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final Map zze;
    /* access modifiers changed from: private */
    public final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final zzdwm zzh;
    private Map zzi;

    public zzc(zzdwm zzdwm) {
        this.zzh = zzdwm;
        this.zza = ((Integer) zzay.zzc().zzb(zzbhz.zzfV)).intValue();
        this.zzb = ((Long) zzay.zzc().zzb(zzbhz.zzfW)).longValue();
        this.zzc = ((Boolean) zzay.zzc().zzb(zzbhz.zzgb)).booleanValue();
        this.zzd = ((Boolean) zzay.zzc().zzb(zzbhz.zzfZ)).booleanValue();
        this.zze = Collections.synchronizedMap(new zzb(this));
    }

    private final synchronized void zzg(zzdwc zzdwc) {
        if (this.zzc) {
            ArrayDeque clone = this.zzg.clone();
            this.zzg.clear();
            ArrayDeque clone2 = this.zzf.clone();
            this.zzf.clear();
            zzcfv.zza.execute(new zza(this, zzdwc, clone, clone2));
        }
    }

    private final void zzh(zzdwc zzdwc, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdwc.zza());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzf.zza(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzj(this.zzi, "e_type", (String) pair.first);
                zzj(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zze(this.zzi);
        }
    }

    private final synchronized void zzi() {
        long currentTimeMillis = zzt.zzA().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            zzt.zzo().zzt(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void zzj(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public final synchronized String zzb(String str, zzdwc zzdwc) {
        Pair pair = (Pair) this.zze.get(str);
        zzdwc.zza().put("rid", str);
        if (pair != null) {
            String str2 = (String) pair.second;
            this.zze.remove(str);
            zzdwc.zza().put("mhit", "true");
            return str2;
        }
        zzdwc.zza().put("mhit", "false");
        return null;
    }

    public final synchronized void zzd(String str, String str2, zzdwc zzdwc) {
        this.zze.put(str, new Pair(Long.valueOf(zzt.zzA().currentTimeMillis()), str2));
        zzi();
        zzg(zzdwc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzdwc zzdwc, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzh(zzdwc, arrayDeque, "to");
        zzh(zzdwc, arrayDeque2, "of");
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }
}

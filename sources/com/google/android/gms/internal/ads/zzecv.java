package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzecv implements zzffi {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfhh zzc;
    private final zzfhs zzd;

    public zzecv(String str, zzfhs zzfhs, zzfhh zzfhh) {
        this.zzb = str;
        this.zzd = zzfhs;
        this.zzc = zzfhh;
    }

    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        String str;
        zzecu zzecu = (zzecu) obj;
        int optInt = zzecu.zza.optInt("http_timeout_millis", 60000);
        zzbzy zza2 = zzecu.zzb;
        if (zza2.zza() == -2) {
            HashMap hashMap = new HashMap();
            String str2 = "";
            if (zzecu.zzb.zzh() && !TextUtils.isEmpty(this.zzb)) {
                if (((Boolean) zzay.zzc().zzb(zzbhz.zzaI)).booleanValue()) {
                    String str3 = this.zzb;
                    if (TextUtils.isEmpty(str3)) {
                        str = str2;
                    } else {
                        Matcher matcher = zza.matcher(str3);
                        str = str2;
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null && (group.toLowerCase(Locale.ROOT).startsWith("id=") || group.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat("; ");
                                }
                                str = str.concat(group);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put(HttpHeaders.COOKIE, str);
                    }
                } else {
                    hashMap.put(HttpHeaders.COOKIE, this.zzb);
                }
            }
            if (zzecu.zzb.zzi()) {
                JSONObject optJSONObject = zzecu.zza.optJSONObject("pii");
                if (optJSONObject != null) {
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos", str2))) {
                        hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", str2));
                    }
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", str2))) {
                        hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", str2));
                    }
                } else {
                    zze.zza("DSID signal does not exist.");
                }
            }
            if (zzecu.zzb != null && !TextUtils.isEmpty(zzecu.zzb.zzd())) {
                str2 = zzecu.zzb.zzd();
            }
            zzfhs zzfhs = this.zzd;
            zzfhh zzfhh = this.zzc;
            zzfhh.zze(true);
            zzfhs.zza(zzfhh);
            return new zzecq(zzecu.zzb.zze(), optInt, hashMap, str2.getBytes(zzfoi.zzc), "");
        }
        zzfhs zzfhs2 = this.zzd;
        zzfhh zzfhh2 = this.zzc;
        zzfhh2.zze(false);
        zzfhs2.zza(zzfhh2);
        if (zza2.zza() == 1) {
            if (zza2.zzf() != null) {
                zze.zzg(TextUtils.join(", ", zza2.zzf()));
            }
            throw new zzdzl(2, "Error building request URL.");
        }
        throw new zzdzl(1);
    }
}

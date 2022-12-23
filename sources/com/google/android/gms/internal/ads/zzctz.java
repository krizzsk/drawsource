package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zzt;
import com.tapjoy.TJAdUnitConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzctz implements zzbst {
    private final Context zza;
    private final zzbaj zzb;
    private final PowerManager zzc;

    public zzctz(Context context, zzbaj zzbaj) {
        this.zza = context;
        this.zzb = zzbaj;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: zza */
    public final JSONObject zzb(zzcuc zzcuc) throws JSONException {
        JSONObject jSONObject;
        boolean z;
        Integer num;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbam zzbam = zzcuc.zzf;
        if (zzbam == null) {
            jSONObject = new JSONObject();
        } else if (this.zzb.zzd() != null) {
            boolean z2 = zzbam.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcuc.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false);
            boolean z3 = zzcuc.zzc;
            JSONObject put2 = put.put("isStopped", false).put("isPaused", zzcuc.zzb).put("isNative", this.zzb.zze());
            if (Build.VERSION.SDK_INT >= 20) {
                z = this.zzc.isInteractive();
            } else {
                z = this.zzc.isScreenOn();
            }
            put2.put("isScreenOn", z).put("appMuted", zzt.zzr().zze()).put("appVolume", (double) zzt.zzr().zza()).put("deviceVolume", (double) zzab.zzb(this.zza.getApplicationContext()));
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzeH)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService("audio");
                if (audioManager == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(audioManager.getMode());
                }
                if (num != null) {
                    jSONObject3.put("audioMode", num);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzbam.zzb).put("isAttachedToWindow", z2).put("viewBox", new JSONObject().put("top", zzbam.zzc.top).put(TJAdUnitConstants.String.BOTTOM, zzbam.zzc.bottom).put("left", zzbam.zzc.left).put("right", zzbam.zzc.right)).put("adBox", new JSONObject().put("top", zzbam.zzd.top).put(TJAdUnitConstants.String.BOTTOM, zzbam.zzd.bottom).put("left", zzbam.zzd.left).put("right", zzbam.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzbam.zze.top).put(TJAdUnitConstants.String.BOTTOM, zzbam.zze.bottom).put("left", zzbam.zze.left).put("right", zzbam.zze.right)).put("globalVisibleBoxVisible", zzbam.zzf).put("localVisibleBox", new JSONObject().put("top", zzbam.zzg.top).put(TJAdUnitConstants.String.BOTTOM, zzbam.zzg.bottom).put("left", zzbam.zzg.left).put("right", zzbam.zzg.right)).put("localVisibleBoxVisible", zzbam.zzh).put("hitBox", new JSONObject().put("top", zzbam.zzi.top).put(TJAdUnitConstants.String.BOTTOM, zzbam.zzi.bottom).put("left", zzbam.zzi.left).put("right", zzbam.zzi.right)).put("screenDensity", (double) this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcuc.zza);
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzbi)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbam.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put(TJAdUnitConstants.String.BOTTOM, rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcuc.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}

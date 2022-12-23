package com.mbridge.msdk.video.p347bt.p348a;

import android.util.Base64;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.video.p347bt.module.MBridgeBTVideoView;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.a.a */
/* compiled from: H5MediaPlayerManager */
public class C9256a {

    /* renamed from: c */
    private static final String f22593c = C9256a.class.getSimpleName();

    /* renamed from: e */
    private static LinkedHashMap<String, MBridgeBTVideoView> f22594e = new LinkedHashMap<>();

    /* renamed from: a */
    int f22595a = 0;

    /* renamed from: b */
    int f22596b = 1;

    /* renamed from: d */
    private String f22597d = "handlerNativeResult";

    /* renamed from: com.mbridge.msdk.video.bt.a.a$a */
    /* compiled from: H5MediaPlayerManager */
    private static final class C9257a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C9256a f22598a = new C9256a();
    }

    /* renamed from: a */
    public static C9256a m26201a() {
        return C9257a.f22598a;
    }

    /* renamed from: a */
    public final void mo62483a(String str, MBridgeBTVideoView mBridgeBTVideoView) {
        f22594e.put(str, mBridgeBTVideoView);
    }

    /* renamed from: a */
    public final void mo62482a(String str) {
        f22594e.remove(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00db A[Catch:{ all -> 0x0155 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62481a(java.lang.Object r11, java.lang.String r12, org.json.JSONArray r13, int r14) {
        /*
            r10 = this;
            java.lang.String r14 = ""
            java.lang.String r0 = "value"
            r1 = 7
            java.lang.String r2 = "type"
            java.lang.String r3 = "key"
            if (r13 == 0) goto L_0x002e
            int r4 = r13.length()     // Catch:{ all -> 0x0155 }
            if (r4 <= 0) goto L_0x002e
            r4 = 0
            org.json.JSONObject r4 = r13.optJSONObject(r4)     // Catch:{ all -> 0x0155 }
            if (r4 == 0) goto L_0x002e
            java.lang.String r5 = r4.optString(r3)     // Catch:{ all -> 0x0155 }
            int r6 = r4.optInt(r2, r1)     // Catch:{ all -> 0x0155 }
            java.lang.String r7 = "instanceId"
            boolean r5 = r7.equalsIgnoreCase(r5)     // Catch:{ all -> 0x0155 }
            if (r5 == 0) goto L_0x002e
            if (r6 != 0) goto L_0x002e
            java.lang.String r14 = r4.optString(r0)     // Catch:{ all -> 0x0155 }
        L_0x002e:
            boolean r4 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0155 }
            if (r4 == 0) goto L_0x003c
            int r12 = r10.f22596b     // Catch:{ all -> 0x0155 }
            java.lang.String r13 = "instanceId find error"
            r10.m26202a(r12, r13, r11)     // Catch:{ all -> 0x0155 }
            return
        L_0x003c:
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.video.bt.module.MBridgeBTVideoView> r4 = f22594e     // Catch:{ all -> 0x0155 }
            boolean r4 = r4.containsKey(r14)     // Catch:{ all -> 0x0155 }
            if (r4 != 0) goto L_0x004c
            int r12 = r10.f22596b     // Catch:{ all -> 0x0155 }
            java.lang.String r13 = "can not find player"
            r10.m26202a(r12, r13, r11)     // Catch:{ all -> 0x0155 }
            return
        L_0x004c:
            java.lang.String r4 = "play"
            boolean r4 = r4.equalsIgnoreCase(r12)     // Catch:{ all -> 0x0155 }
            java.lang.String r5 = "player is null"
            if (r4 == 0) goto L_0x006a
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.video.bt.module.MBridgeBTVideoView> r12 = f22594e     // Catch:{ all -> 0x0155 }
            java.lang.Object r12 = r12.get(r14)     // Catch:{ all -> 0x0155 }
            com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r12 = (com.mbridge.msdk.video.p347bt.module.MBridgeBTVideoView) r12     // Catch:{ all -> 0x0155 }
            if (r12 == 0) goto L_0x0064
            r12.play()     // Catch:{ all -> 0x0155 }
            goto L_0x0069
        L_0x0064:
            int r12 = r10.f22596b     // Catch:{ all -> 0x0155 }
            r10.m26202a(r12, r5, r11)     // Catch:{ all -> 0x0155 }
        L_0x0069:
            return
        L_0x006a:
            java.lang.String r4 = "pause"
            boolean r4 = r4.equalsIgnoreCase(r12)     // Catch:{ all -> 0x0155 }
            if (r4 == 0) goto L_0x0086
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.video.bt.module.MBridgeBTVideoView> r12 = f22594e     // Catch:{ all -> 0x0155 }
            java.lang.Object r12 = r12.get(r14)     // Catch:{ all -> 0x0155 }
            com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r12 = (com.mbridge.msdk.video.p347bt.module.MBridgeBTVideoView) r12     // Catch:{ all -> 0x0155 }
            if (r12 == 0) goto L_0x0080
            r12.pause()     // Catch:{ all -> 0x0155 }
            goto L_0x0085
        L_0x0080:
            int r12 = r10.f22596b     // Catch:{ all -> 0x0155 }
            r10.m26202a(r12, r5, r11)     // Catch:{ all -> 0x0155 }
        L_0x0085:
            return
        L_0x0086:
            java.lang.String r4 = "stop"
            boolean r4 = r4.equalsIgnoreCase(r12)     // Catch:{ all -> 0x0155 }
            if (r4 == 0) goto L_0x00a2
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.video.bt.module.MBridgeBTVideoView> r12 = f22594e     // Catch:{ all -> 0x0155 }
            java.lang.Object r12 = r12.get(r14)     // Catch:{ all -> 0x0155 }
            com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r12 = (com.mbridge.msdk.video.p347bt.module.MBridgeBTVideoView) r12     // Catch:{ all -> 0x0155 }
            if (r12 == 0) goto L_0x009c
            r12.stop()     // Catch:{ all -> 0x0155 }
            goto L_0x00a1
        L_0x009c:
            int r12 = r10.f22596b     // Catch:{ all -> 0x0155 }
            r10.m26202a(r12, r5, r11)     // Catch:{ all -> 0x0155 }
        L_0x00a1:
            return
        L_0x00a2:
            java.lang.String r4 = "setVolume"
            boolean r4 = r4.equalsIgnoreCase(r12)     // Catch:{ all -> 0x0155 }
            r6 = 3
            r7 = 1
            if (r4 == 0) goto L_0x010a
            r12 = 0
            if (r13 == 0) goto L_0x00f5
            int r4 = r13.length()     // Catch:{ all -> 0x0155 }
            r8 = 2
            if (r4 <= r8) goto L_0x00f5
            org.json.JSONObject r4 = r13.optJSONObject(r7)     // Catch:{ all -> 0x0155 }
            org.json.JSONObject r13 = r13.optJSONObject(r8)     // Catch:{ all -> 0x0155 }
            if (r4 == 0) goto L_0x00d8
            java.lang.String r7 = r4.optString(r3)     // Catch:{ all -> 0x0155 }
            int r8 = r4.optInt(r2, r1)     // Catch:{ all -> 0x0155 }
            java.lang.String r9 = "leftVolume"
            boolean r7 = r9.equalsIgnoreCase(r7)     // Catch:{ all -> 0x0155 }
            if (r7 == 0) goto L_0x00d8
            if (r8 != r6) goto L_0x00d8
            double r7 = r4.optDouble(r0)     // Catch:{ all -> 0x0155 }
            float r4 = (float) r7     // Catch:{ all -> 0x0155 }
            goto L_0x00d9
        L_0x00d8:
            r4 = r12
        L_0x00d9:
            if (r13 == 0) goto L_0x00f2
            java.lang.String r3 = r13.optString(r3)     // Catch:{ all -> 0x0155 }
            int r1 = r13.optInt(r2, r1)     // Catch:{ all -> 0x0155 }
            java.lang.String r2 = "rightVolume"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0155 }
            if (r2 == 0) goto L_0x00f2
            if (r1 != r6) goto L_0x00f2
            double r12 = r13.optDouble(r0)     // Catch:{ all -> 0x0155 }
            float r12 = (float) r12     // Catch:{ all -> 0x0155 }
        L_0x00f2:
            r13 = r12
            r12 = r4
            goto L_0x00f6
        L_0x00f5:
            r13 = r12
        L_0x00f6:
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.video.bt.module.MBridgeBTVideoView> r0 = f22594e     // Catch:{ all -> 0x0155 }
            java.lang.Object r14 = r0.get(r14)     // Catch:{ all -> 0x0155 }
            com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r14 = (com.mbridge.msdk.video.p347bt.module.MBridgeBTVideoView) r14     // Catch:{ all -> 0x0155 }
            if (r14 == 0) goto L_0x0104
            r14.setVolume(r12, r13)     // Catch:{ all -> 0x0155 }
            goto L_0x0109
        L_0x0104:
            int r12 = r10.f22596b     // Catch:{ all -> 0x0155 }
            r10.m26202a(r12, r5, r11)     // Catch:{ all -> 0x0155 }
        L_0x0109:
            return
        L_0x010a:
            java.lang.String r4 = "setPlaybackParams"
            boolean r12 = r4.equalsIgnoreCase(r12)     // Catch:{ all -> 0x0155 }
            if (r12 == 0) goto L_0x014d
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x0139
            int r4 = r13.length()     // Catch:{ all -> 0x0155 }
            if (r4 <= r7) goto L_0x0139
            org.json.JSONObject r13 = r13.optJSONObject(r7)     // Catch:{ all -> 0x0155 }
            if (r13 == 0) goto L_0x0139
            java.lang.String r3 = r13.optString(r3)     // Catch:{ all -> 0x0155 }
            int r1 = r13.optInt(r2, r1)     // Catch:{ all -> 0x0155 }
            java.lang.String r2 = "speed"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0155 }
            if (r2 == 0) goto L_0x0139
            if (r1 != r6) goto L_0x0139
            double r12 = r13.optDouble(r0)     // Catch:{ all -> 0x0155 }
            float r12 = (float) r12     // Catch:{ all -> 0x0155 }
        L_0x0139:
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.video.bt.module.MBridgeBTVideoView> r13 = f22594e     // Catch:{ all -> 0x0155 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x0155 }
            com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r13 = (com.mbridge.msdk.video.p347bt.module.MBridgeBTVideoView) r13     // Catch:{ all -> 0x0155 }
            if (r13 == 0) goto L_0x0147
            r13.setPlaybackParams(r12)     // Catch:{ all -> 0x0155 }
            goto L_0x014c
        L_0x0147:
            int r12 = r10.f22596b     // Catch:{ all -> 0x0155 }
            r10.m26202a(r12, r5, r11)     // Catch:{ all -> 0x0155 }
        L_0x014c:
            return
        L_0x014d:
            int r12 = r10.f22596b     // Catch:{ all -> 0x0155 }
            java.lang.String r13 = "method not found"
            r10.m26202a(r12, r13, r11)     // Catch:{ all -> 0x0155 }
            goto L_0x0179
        L_0x0155:
            r12 = move-exception
            java.lang.String r13 = f22593c
            java.lang.String r14 = r12.getMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24874a(r13, r14)
            int r13 = r10.f22596b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "exception："
            r14.append(r0)
            java.lang.String r12 = r12.getMessage()
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r10.m26202a(r13, r12, r11)
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p347bt.p348a.C9256a.mo62481a(java.lang.Object, java.lang.String, org.json.JSONArray, int):void");
    }

    /* renamed from: a */
    private void m26202a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("message", str);
            C8887g.m25669a().mo58688a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            C8672v.m24874a(f22593c, e.getMessage());
        } catch (Throwable th) {
            C8672v.m24874a(f22593c, th.getMessage());
        }
    }
}

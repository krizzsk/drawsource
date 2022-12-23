package com.inmobi.media;

import com.facebook.share.internal.ShareConstants;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.cd */
/* compiled from: NativeImageAsset */
public final class C5859cd extends C5847bw {
    public C5859cd(String str, String str2, C5848bx bxVar, String str3, byte b, JSONObject jSONObject) {
        this(str, str2, bxVar, str3, new LinkedList(), b, jSONObject);
    }

    public C5859cd(String str, String str2, C5848bx bxVar, String str3, List<C5868ci> list, byte b, JSONObject jSONObject) {
        super(str, str2, ShareConstants.IMAGE_URL, bxVar, list);
        this.f14707e = str3;
        if (jSONObject != null) {
            this.f14711i = b;
            this.f14708f = jSONObject;
        }
    }
}

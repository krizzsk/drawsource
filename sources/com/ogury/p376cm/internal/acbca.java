package com.ogury.p376cm.internal;

import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.acbca */
public final class acbca {

    /* renamed from: a */
    public static final aaaaa f24455a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.acbca$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public static acbcb m27954a(String str) {
        bbabc.m28052b(str, "response");
        try {
            Object obj = new JSONObject(str).get("status");
            return bbabc.m28051a(obj, (Object) "NOOP") ? acbcb.NOOP : bbabc.m28051a(obj, (Object) DebugCoroutineInfoImplKt.CREATED) ? acbcb.CREATED : bbabc.m28051a(obj, (Object) "UPDATED") ? acbcb.UPDATED : acbcb.UNKNOWN;
        } catch (JSONException unused) {
            return acbcb.UNKNOWN;
        }
    }
}

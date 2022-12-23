package com.unity3d.services.core.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.broadcast.c */
/* compiled from: BroadcastEventReceiver */
public class C11981c extends BroadcastReceiver {

    /* renamed from: a */
    private String f29129a;

    public C11981c(String str) {
        this.f29129a = str;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            String dataString = intent.getDataString() != null ? intent.getDataString() : "";
            JSONObject jSONObject = new JSONObject();
            try {
                if (intent.getExtras() != null) {
                    Bundle extras = intent.getExtras();
                    for (String str : extras.keySet()) {
                        jSONObject.put(str, extras.get(str));
                    }
                }
            } catch (JSONException e) {
                C12065a.m32845b("JSONException when composing extras for broadcast action " + action + ": " + e.getMessage());
            }
            C12136a c = C12136a.m33103c();
            if (c != null && c.mo71321i()) {
                c.mo71310a((Enum) C12143b.BROADCAST, (Enum) C11980b.f29127a, this.f29129a, action, dataString, jSONObject);
            }
        }
    }
}

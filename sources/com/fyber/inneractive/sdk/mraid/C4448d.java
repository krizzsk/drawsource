package com.fyber.inneractive.sdk.mraid;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.C5290k;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5349d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.d */
public class C4448d extends C4443a {
    public C4448d(Map<String, String> map, C5349d dVar, C5306p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo24635a() {
        L l;
        C5349d dVar = this.f10963c;
        Map<String, String> map = this.f10962b;
        Context g = dVar.mo26479g();
        boolean z = true;
        if (C5290k.m16488a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event"))) {
            try {
                Map<String, Object> a = dVar.mo26468a(map);
                Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event");
                HashMap hashMap = (HashMap) a;
                for (String str : hashMap.keySet()) {
                    Object obj = hashMap.get(str);
                    if (obj instanceof Long) {
                        type.putExtra(str, ((Long) obj).longValue());
                    } else if (obj instanceof Integer) {
                        type.putExtra(str, ((Integer) obj).intValue());
                    } else {
                        type.putExtra(str, (String) obj);
                    }
                }
                type.setFlags(268435456);
                g.startActivity(type);
            } catch (ActivityNotFoundException unused) {
                IAlog.m16446a("There is no calendar app installed!", new Object[0]);
                dVar.mo26470a(C4450f.CREATE_CALENDAR_EVENT, "Action is unsupported on this device - no calendar app installed");
            } catch (IllegalArgumentException e) {
                IAlog.m16446a("invalid parameters for create calendar ", e.getMessage());
                dVar.mo26470a(C4450f.CREATE_CALENDAR_EVENT, e.getMessage());
            } catch (Exception unused2) {
                IAlog.m16446a("Failed to create calendar event.", new Object[0]);
                dVar.mo26470a(C4450f.CREATE_CALENDAR_EVENT, "could not create calendar event");
            }
        } else {
            IAlog.m16446a("createCalendarEvent supported for devices post-ICS", new Object[0]);
            dVar.mo26470a(C4450f.CREATE_CALENDAR_EVENT, "Action is unsupported on this device (need Android version Ice Cream Sandwich or above)");
            z = false;
        }
        if (z && (l = dVar.f14084g) != null) {
            ((C5349d.C5355f) l).mo24895b();
        }
    }

    /* renamed from: c */
    public String mo24632c() {
        return null;
    }
}

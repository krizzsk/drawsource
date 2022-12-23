package com.fyber.inneractive.sdk.util;

import android.location.Location;
import com.fyber.inneractive.sdk.util.C5284i;
import com.google.android.gms.tasks.OnSuccessListener;

/* renamed from: com.fyber.inneractive.sdk.util.h */
public class C5281h implements OnSuccessListener<Location> {

    /* renamed from: a */
    public final /* synthetic */ C5284i.C5285a f13994a;

    public C5281h(C5284i.C5285a aVar) {
        this.f13994a = aVar;
    }

    public void onSuccess(Object obj) {
        Location location = (Location) obj;
        C5284i.C5285a aVar = this.f13994a;
        if (aVar != null) {
            ((C5323v) aVar).f14059a.f14071b = location;
        }
    }
}

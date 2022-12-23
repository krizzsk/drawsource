package com.fyber.inneractive.sdk.mraid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.fyber.inneractive.sdk.util.C5290k;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5349d;
import com.fyber.inneractive.sdk.web.C5365i;
import com.fyber.inneractive.sdk.web.C5367k;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.q */
public class C4461q extends C4443a {
    public C4461q(Map<String, String> map, C5349d dVar, C5306p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo24635a() {
        String str = this.f10962b.get("uri");
        if (str == null || "".equals(str)) {
            this.f10963c.mo26470a(C4450f.STORE_PICTURE, "Image can't be stored with null or empty URL");
            IAlog.m16446a("Mraid Store Picture -Invalid URI ", new Object[0]);
            return;
        }
        C5349d dVar = this.f10963c;
        Context g = dVar.mo26479g();
        if (!C5290k.m16496n()) {
            dVar.mo26470a(C4450f.STORE_PICTURE, "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
            IAlog.m16446a("Error downloading file. Please check if the Android permission is not granted, or maybe the device does not have an SD card mounted? ", new Object[0]);
        } else if (g instanceof Activity) {
            new AlertDialog.Builder(dVar.mo26479g()).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Okay", new C5367k(dVar, str)).setCancelable(true).show();
        } else {
            C5299n.f14024b.post(new C5365i(dVar, "Downloading image to Picture gallery..."));
            dVar.mo26472a(str);
        }
    }

    /* renamed from: c */
    public String mo24632c() {
        return this.f10962b.get("uri");
    }
}

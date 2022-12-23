package com.iab.omid.library.vungle.adsession;

import android.view.View;
import com.iab.omid.library.vungle.p275d.C8060e;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;

public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C8060e.m23014a();
        C8060e.m23017a((Object) adSessionConfiguration, "AdSessionConfiguration is null");
        C8060e.m23017a((Object) adSessionContext, "AdSessionContext is null");
        return new C8039a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str);

    public abstract void error(ErrorType errorType, String str);

    public abstract void finish();

    public abstract String getAdSessionId();

    public abstract AdSessionStatePublisher getAdSessionStatePublisher();

    public abstract void registerAdView(View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(View view);

    public abstract void start();
}

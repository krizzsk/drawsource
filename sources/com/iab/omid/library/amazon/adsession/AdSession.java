package com.iab.omid.library.amazon.adsession;

import android.view.View;
import com.iab.omid.library.amazon.p233d.C7694e;
import com.iab.omid.library.amazon.publisher.AdSessionStatePublisher;

public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C7694e.m21327a();
        C7694e.m21330a((Object) adSessionConfiguration, "AdSessionConfiguration is null");
        C7694e.m21330a((Object) adSessionContext, "AdSessionContext is null");
        return new C7673a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str);

    public abstract void error(ErrorType errorType, String str);

    public abstract void finish();

    public abstract String getAdSessionId();

    public abstract AdSessionStatePublisher getAdSessionStatePublisher();

    public abstract void registerAdView(View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(View view);

    public abstract void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener);

    public abstract void start();
}

package com.iab.omid.library.applovin.adsession;

import android.view.View;
import com.iab.omid.library.applovin.p239d.C7744e;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;

public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C7744e.m21557a();
        C7744e.m21560a((Object) adSessionConfiguration, "AdSessionConfiguration is null");
        C7744e.m21560a((Object) adSessionContext, "AdSessionContext is null");
        return new C7723a(adSessionConfiguration, adSessionContext);
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

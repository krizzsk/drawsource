package com.iab.omid.library.smaato.adsession;

import android.view.View;
import com.iab.omid.library.smaato.publisher.AdSessionStatePublisher;
import p397e.C12469e;

public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C12469e.m33305a();
        C12469e.m33308a((Object) adSessionConfiguration, "AdSessionConfiguration is null");
        C12469e.m33308a((Object) adSessionContext, "AdSessionContext is null");
        return new C8021a(adSessionConfiguration, adSessionContext);
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

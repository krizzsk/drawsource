package com.saygames.saypromo;

import android.app.Activity;
import kotlin.Metadata;

@Metadata(mo72582d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\nH&¨\u0006\u000b"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoAd;", "", "destroy", "", "load", "callback", "Lcom/saygames/saypromo/SayPromoAdLoadCallback;", "show", "activity", "Landroid/app/Activity;", "Lcom/saygames/saypromo/SayPromoAdShowCallback;", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
public interface SayPromoAd {
    void destroy();

    void load(SayPromoAdLoadCallback sayPromoAdLoadCallback);

    void show(Activity activity, SayPromoAdShowCallback sayPromoAdShowCallback);
}

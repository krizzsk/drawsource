package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.sdk.AppLovinSdk;
import com.saygames.saypromo.SayPromo;
import com.saygames.saypromo.SayPromoAd;
import com.saygames.saypromo.SayPromoAdLoadError;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.text.StringsKt;

@Metadata(mo72581bv = {}, mo72582d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\n\u001a\u0004\u0018\u00010\f*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J \u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0017H\u0016J \u0010\u0019\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0017H\u0016J \u0010\u001b\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u001aH\u0016J \u0010\u001c\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u001aH\u0016J \u0010\u001f\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u001eH\u0016R\u0014\u0010\"\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u001a\u0010)\u001a\u0004\u0018\u00010\f*\u00020\u001d8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010(R\u0018\u0010-\u001a\u00020+*\u00020*8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010,R\u001c\u0010/\u001a\u0004\u0018\u00010\f*\u0004\u0018\u00010\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010.¨\u00064"}, mo72583d2 = {"Lcom/applovin/mediation/adapters/SayGamesMediationAdapter;", "Lcom/applovin/mediation/adapters/MediationAdapterBase;", "Lcom/applovin/mediation/adapter/MaxInterstitialAdapter;", "Lcom/applovin/mediation/adapter/MaxRewardedAdapter;", "Lcom/applovin/mediation/adapter/MaxSignalProvider;", "Landroid/app/Activity;", "activity", "Lcom/applovin/mediation/adapter/parameters/MaxAdapterResponseParameters;", "maxAdapterResponseParameters", "Lcom/saygames/saypromo/SayPromoAd;", "a", "Landroid/os/Bundle;", "", "key", "Lcom/applovin/mediation/adapter/parameters/MaxAdapterInitializationParameters;", "parameters", "Lcom/applovin/mediation/adapter/MaxAdapter$OnCompletionListener;", "listener", "", "initialize", "getSdkVersion", "getAdapterVersion", "onDestroy", "Lcom/applovin/mediation/adapter/listeners/MaxInterstitialAdapterListener;", "loadInterstitialAd", "showInterstitialAd", "Lcom/applovin/mediation/adapter/listeners/MaxRewardedAdapterListener;", "loadRewardedAd", "showRewardedAd", "Lcom/applovin/mediation/adapter/parameters/MaxAdapterSignalCollectionParameters;", "Lcom/applovin/mediation/adapter/listeners/MaxSignalCollectionListener;", "collectSignal", "", "Ljava/lang/Object;", "lock", "b", "Lcom/saygames/saypromo/SayPromoAd;", "interstitialSayPromoAd", "c", "rewardedSayPromoAd", "(Lcom/applovin/mediation/adapter/parameters/MaxAdapterSignalCollectionParameters;)Ljava/lang/String;", "adFormatLabel", "Lcom/saygames/saypromo/SayPromoAdLoadError;", "Lcom/applovin/mediation/adapter/MaxAdapterError;", "(Lcom/saygames/saypromo/SayPromoAdLoadError;)Lcom/applovin/mediation/adapter/MaxAdapterError;", "toMaxAdapterError", "(Ljava/lang/String;)Ljava/lang/String;", "trimOrNullIfBlank", "Lcom/applovin/sdk/AppLovinSdk;", "appLovinSdk", "<init>", "(Lcom/applovin/sdk/AppLovinSdk;)V", "adapter_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1})
public final class SayGamesMediationAdapter extends MediationAdapterBase implements MaxInterstitialAdapter, MaxRewardedAdapter, MaxSignalProvider {

    /* renamed from: a */
    private final Object f4161a = new Object();

    /* renamed from: b */
    private SayPromoAd f4162b;

    /* renamed from: c */
    private SayPromoAd f4163c;

    public SayGamesMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final MaxAdapterError m5145a(SayPromoAdLoadError sayPromoAdLoadError) {
        MaxAdapterError maxAdapterError;
        if (!(sayPromoAdLoadError instanceof SayPromoAdLoadError.Format)) {
            if (!(sayPromoAdLoadError instanceof SayPromoAdLoadError.IoFile) && !(sayPromoAdLoadError instanceof SayPromoAdLoadError.IoServer)) {
                if (!(sayPromoAdLoadError instanceof SayPromoAdLoadError.NoFill)) {
                    if (sayPromoAdLoadError instanceof SayPromoAdLoadError.NoInternet) {
                        maxAdapterError = MaxAdapterError.NO_CONNECTION;
                    } else if (!(sayPromoAdLoadError instanceof SayPromoAdLoadError.NoSpace)) {
                        if (sayPromoAdLoadError instanceof SayPromoAdLoadError.Server) {
                            maxAdapterError = MaxAdapterError.SERVER_ERROR;
                        } else if (sayPromoAdLoadError instanceof SayPromoAdLoadError.State) {
                            maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                        } else if (sayPromoAdLoadError instanceof SayPromoAdLoadError.Timeout) {
                            maxAdapterError = MaxAdapterError.TIMEOUT;
                        } else if (!(sayPromoAdLoadError instanceof SayPromoAdLoadError.Unknown)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    maxAdapterError.setAdLoadFailureInfo(sayPromoAdLoadError.getMessage());
                    return maxAdapterError;
                }
            }
            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
            maxAdapterError.setAdLoadFailureInfo(sayPromoAdLoadError.getMessage());
            return maxAdapterError;
        }
        maxAdapterError = MaxAdapterError.NO_FILL;
        maxAdapterError.setAdLoadFailureInfo(sayPromoAdLoadError.getMessage());
        return maxAdapterError;
    }

    /* renamed from: a */
    private final SayPromoAd m5146a(Activity activity, MaxAdapterResponseParameters maxAdapterResponseParameters) {
        String a;
        String a2;
        String a3;
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        if (serverParameters == null || (a = m5149a(serverParameters.getString("app_id"))) == null || (a2 = m5149a(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) == null || (a3 = m5149a(maxAdapterResponseParameters.getBidResponse())) == null) {
            return null;
        }
        return SayPromo.Companion.getInstance(activity).createAd(a, a2, a3);
    }

    /* renamed from: a */
    private final String m5147a(Bundle bundle, String str) {
        return m5149a(bundle.getString(str));
    }

    /* renamed from: a */
    private final String m5148a(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters) {
        MaxAdFormat adFormat = maxAdapterSignalCollectionParameters.getAdFormat();
        String a = m5149a(adFormat != null ? adFormat.getLabel() : null);
        if (a != null) {
            return a.toLowerCase(Locale.ENGLISH);
        }
        return null;
    }

    /* renamed from: a */
    private final String m5149a(String str) {
        if (str == null) {
            return null;
        }
        String obj = StringsKt.trim((CharSequence) str).toString();
        if (obj.length() > 0) {
            return obj;
        }
        return null;
    }

    public final void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        Bundle serverParameters = maxAdapterSignalCollectionParameters.getServerParameters();
        if (serverParameters == null) {
            maxSignalCollectionListener.onSignalCollectionFailed("Server parameters is null");
            return;
        }
        String a = m5149a(serverParameters.getString("app_id"));
        if (a == null) {
            maxSignalCollectionListener.onSignalCollectionFailed("App id is null or blank");
            return;
        }
        Bundle bundle = serverParameters.getBundle("placement_ids");
        if (bundle == null) {
            maxSignalCollectionListener.onSignalCollectionFailed("Place ids is null");
            return;
        }
        String a2 = m5148a(maxAdapterSignalCollectionParameters);
        if (a2 == null) {
            maxSignalCollectionListener.onSignalCollectionFailed("Place id key is null or blank");
            return;
        }
        String a3 = m5149a(bundle.getString(a2));
        if (a3 == null) {
            maxSignalCollectionListener.onSignalCollectionFailed("Place id is null or blank");
        } else {
            SayPromo.Companion.getInstance(activity).loadToken(a, a3, new C2184a(maxSignalCollectionListener));
        }
    }

    public final String getAdapterVersion() {
        return "11.0.19.0";
    }

    public final String getSdkVersion() {
        return SayPromo.Companion.getVersion();
    }

    public final void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        SayPromo.Companion.getInstance(activity);
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, (String) null);
    }

    public final void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        boolean z;
        SayPromoAd a = m5146a(activity, maxAdapterResponseParameters);
        if (a == null) {
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            return;
        }
        synchronized (this.f4161a) {
            if (this.f4162b != null) {
                z = false;
            } else {
                this.f4162b = a;
                z = true;
            }
        }
        if (!z) {
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.INVALID_LOAD_STATE);
        } else {
            a.load(new C2195b(maxInterstitialAdapterListener, this));
        }
    }

    public final void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        boolean z;
        SayPromoAd a = m5146a(activity, maxAdapterResponseParameters);
        if (a == null) {
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            return;
        }
        synchronized (this.f4161a) {
            if (this.f4163c != null) {
                z = false;
            } else {
                this.f4163c = a;
                z = true;
            }
        }
        if (!z) {
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.INVALID_LOAD_STATE);
        } else {
            a.load(new C2201c(maxRewardedAdapterListener, this));
        }
    }

    public final void onDestroy() {
        SayPromoAd sayPromoAd;
        SayPromoAd sayPromoAd2;
        synchronized (this.f4161a) {
            sayPromoAd = this.f4162b;
            sayPromoAd2 = this.f4163c;
            this.f4162b = null;
            this.f4163c = null;
            Unit unit = Unit.INSTANCE;
        }
        if (sayPromoAd != null) {
            sayPromoAd.destroy();
        }
        if (sayPromoAd2 != null) {
            sayPromoAd2.destroy();
        }
    }

    public final void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        SayPromoAd sayPromoAd;
        synchronized (this.f4161a) {
            sayPromoAd = this.f4162b;
        }
        if (sayPromoAd == null) {
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.AD_NOT_READY);
        } else {
            sayPromoAd.show(activity, new C2202d(maxInterstitialAdapterListener));
        }
    }

    public final void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        SayPromoAd sayPromoAd;
        synchronized (this.f4161a) {
            sayPromoAd = this.f4163c;
        }
        if (sayPromoAd == null) {
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.AD_NOT_READY);
        } else {
            sayPromoAd.show(activity, new C2203e(maxRewardedAdapterListener, this));
        }
    }
}

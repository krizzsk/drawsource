package com.saygames.saypromo;

import android.content.Context;
import com.saygames.saypromo.p378a.C10569b5;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(mo72582d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J \u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0005H&¨\u0006\u0014"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromo;", "", "createAd", "Lcom/saygames/saypromo/SayPromoAd;", "appId", "", "placeId", "bidResponse", "generateId", "size", "", "loadAdvertisingId", "", "callback", "Lcom/saygames/saypromo/SayPromoAdvertisingIdCallback;", "loadToken", "Lcom/saygames/saypromo/SayPromoTokenCallback;", "setDeviceId", "deviceId", "Companion", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
public interface SayPromo {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(mo72582d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromo$Companion;", "", "()V", "version", "", "getVersion$annotations", "getVersion", "()Ljava/lang/String;", "getInstance", "Lcom/saygames/saypromo/SayPromo;", "context", "Landroid/content/Context;", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String version = "11.0.19";

        private Companion() {
        }

        @JvmStatic
        public static /* synthetic */ void getVersion$annotations() {
        }

        @JvmStatic
        public final SayPromo getInstance(Context context) {
            return C10569b5.m30355a(context);
        }

        public final String getVersion() {
            return version;
        }
    }

    @JvmStatic
    static SayPromo getInstance(Context context) {
        return Companion.getInstance(context);
    }

    static String getVersion() {
        return Companion.getVersion();
    }

    SayPromoAd createAd(String str, String str2);

    SayPromoAd createAd(String str, String str2, String str3);

    String generateId(int i);

    void loadAdvertisingId(SayPromoAdvertisingIdCallback sayPromoAdvertisingIdCallback);

    void loadToken(String str, String str2, SayPromoTokenCallback sayPromoTokenCallback);

    void setDeviceId(String str);
}

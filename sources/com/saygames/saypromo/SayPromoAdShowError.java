package com.saygames.saypromo;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo72582d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoAdShowError;", "", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "Finished", "State", "Video", "Web", "Lcom/saygames/saypromo/SayPromoAdShowError$Finished;", "Lcom/saygames/saypromo/SayPromoAdShowError$State;", "Lcom/saygames/saypromo/SayPromoAdShowError$Video;", "Lcom/saygames/saypromo/SayPromoAdShowError$Web;", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
public abstract class SayPromoAdShowError {
    private final String message;

    @Metadata(mo72582d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoAdShowError$Finished;", "Lcom/saygames/saypromo/SayPromoAdShowError;", "message", "", "(Ljava/lang/String;)V", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
    public static final class Finished extends SayPromoAdShowError {
        public Finished(String str) {
            super(str, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo72582d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoAdShowError$State;", "Lcom/saygames/saypromo/SayPromoAdShowError;", "message", "", "(Ljava/lang/String;)V", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
    public static final class State extends SayPromoAdShowError {
        public State(String str) {
            super(str, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo72582d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoAdShowError$Video;", "Lcom/saygames/saypromo/SayPromoAdShowError;", "message", "", "(Ljava/lang/String;)V", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
    public static final class Video extends SayPromoAdShowError {
        public Video(String str) {
            super(str, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo72582d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoAdShowError$Web;", "Lcom/saygames/saypromo/SayPromoAdShowError;", "message", "", "(Ljava/lang/String;)V", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
    public static final class Web extends SayPromoAdShowError {
        public Web(String str) {
            super(str, (DefaultConstructorMarker) null);
        }
    }

    private SayPromoAdShowError(String str) {
        this.message = str;
    }

    public /* synthetic */ SayPromoAdShowError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getMessage() {
        return this.message;
    }
}

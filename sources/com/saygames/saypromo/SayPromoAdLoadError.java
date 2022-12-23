package com.saygames.saypromo;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo72582d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoAdLoadError;", "", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "Format", "IoFile", "IoServer", "NoFill", "NoInternet", "NoSpace", "Server", "State", "Timeout", "Unknown", "Lcom/saygames/saypromo/SayPromoAdLoadError$Format;", "Lcom/saygames/saypromo/SayPromoAdLoadError$IoFile;", "Lcom/saygames/saypromo/SayPromoAdLoadError$IoServer;", "Lcom/saygames/saypromo/SayPromoAdLoadError$NoFill;", "Lcom/saygames/saypromo/SayPromoAdLoadError$NoInternet;", "Lcom/saygames/saypromo/SayPromoAdLoadError$NoSpace;", "Lcom/saygames/saypromo/SayPromoAdLoadError$Server;", "Lcom/saygames/saypromo/SayPromoAdLoadError$State;", "Lcom/saygames/saypromo/SayPromoAdLoadError$Timeout;", "Lcom/saygames/saypromo/SayPromoAdLoadError$Unknown;", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
public abstract class SayPromoAdLoadError {
    private final String message;

    @Metadata(mo72582d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoAdLoadError$Format;", "Lcom/saygames/saypromo/SayPromoAdLoadError;", "message", "", "(Ljava/lang/String;)V", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
    public static final class Format extends SayPromoAdLoadError {
        public Format(String str) {
            super(str, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo72582d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoAdLoadError$IoFile;", "Lcom/saygames/saypromo/SayPromoAdLoadError;", "message", "", "(Ljava/lang/String;)V", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
    public static final class IoFile extends SayPromoAdLoadError {
        public IoFile(String str) {
            super(str, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo72582d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoAdLoadError$IoServer;", "Lcom/saygames/saypromo/SayPromoAdLoadError;", "message", "", "(Ljava/lang/String;)V", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
    public static final class IoServer extends SayPromoAdLoadError {
        public IoServer(String str) {
            super(str, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo72582d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoAdLoadError$NoFill;", "Lcom/saygames/saypromo/SayPromoAdLoadError;", "message", "", "(Ljava/lang/String;)V", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
    public static final class NoFill extends SayPromoAdLoadError {
        public NoFill(String str) {
            super(str, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo72582d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoAdLoadError$NoInternet;", "Lcom/saygames/saypromo/SayPromoAdLoadError;", "message", "", "(Ljava/lang/String;)V", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
    public static final class NoInternet extends SayPromoAdLoadError {
        public NoInternet(String str) {
            super(str, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo72582d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoAdLoadError$NoSpace;", "Lcom/saygames/saypromo/SayPromoAdLoadError;", "message", "", "(Ljava/lang/String;)V", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
    public static final class NoSpace extends SayPromoAdLoadError {
        public NoSpace(String str) {
            super(str, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo72582d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoAdLoadError$Server;", "Lcom/saygames/saypromo/SayPromoAdLoadError;", "message", "", "(Ljava/lang/String;)V", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
    public static final class Server extends SayPromoAdLoadError {
        public Server(String str) {
            super(str, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo72582d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoAdLoadError$State;", "Lcom/saygames/saypromo/SayPromoAdLoadError;", "message", "", "(Ljava/lang/String;)V", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
    public static final class State extends SayPromoAdLoadError {
        public State(String str) {
            super(str, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo72582d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoAdLoadError$Timeout;", "Lcom/saygames/saypromo/SayPromoAdLoadError;", "message", "", "(Ljava/lang/String;)V", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
    public static final class Timeout extends SayPromoAdLoadError {
        public Timeout(String str) {
            super(str, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo72582d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoAdLoadError$Unknown;", "Lcom/saygames/saypromo/SayPromoAdLoadError;", "message", "", "(Ljava/lang/String;)V", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
    public static final class Unknown extends SayPromoAdLoadError {
        public Unknown(String str) {
            super(str, (DefaultConstructorMarker) null);
        }
    }

    private SayPromoAdLoadError(String str) {
        this.message = str;
    }

    public /* synthetic */ SayPromoAdLoadError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getMessage() {
        return this.message;
    }
}

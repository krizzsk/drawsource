package com.saygames.saypromo;

import kotlin.Metadata;

@Metadata(mo72581bv = {}, mo72582d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoThrowable;", "", "Load", "Show", "Lcom/saygames/saypromo/SayPromoThrowable$Load;", "Lcom/saygames/saypromo/SayPromoThrowable$Show;", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1})
public abstract class SayPromoThrowable extends Throwable {

    /* renamed from: a */
    private final String f25727a;

    /* renamed from: b */
    private final Throwable f25728b;

    @Metadata(mo72581bv = {}, mo72582d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoThrowable$Load;", "Lcom/saygames/saypromo/SayPromoThrowable;", "Format", "IoFile", "IoServer", "NoFill", "NoInternet", "NoSpace", "Server", "Lcom/saygames/saypromo/SayPromoThrowable$Load$Format;", "Lcom/saygames/saypromo/SayPromoThrowable$Load$IoFile;", "Lcom/saygames/saypromo/SayPromoThrowable$Load$IoServer;", "Lcom/saygames/saypromo/SayPromoThrowable$Load$NoFill;", "Lcom/saygames/saypromo/SayPromoThrowable$Load$NoInternet;", "Lcom/saygames/saypromo/SayPromoThrowable$Load$NoSpace;", "Lcom/saygames/saypromo/SayPromoThrowable$Load$Server;", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1})
    public static abstract class Load extends SayPromoThrowable {

        @Metadata(mo72581bv = {}, mo72582d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoThrowable$Load$Format;", "Lcom/saygames/saypromo/SayPromoThrowable$Load;", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1})
        public static final class Format extends Load {
            public Format(String str, Throwable th) {
                super(str, th, 0);
            }
        }

        @Metadata(mo72581bv = {}, mo72582d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoThrowable$Load$IoFile;", "Lcom/saygames/saypromo/SayPromoThrowable$Load;", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1})
        public static final class IoFile extends Load {
            public IoFile(Throwable th) {
                super("Failed to write file", th, 0);
            }
        }

        @Metadata(mo72581bv = {}, mo72582d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoThrowable$Load$IoServer;", "Lcom/saygames/saypromo/SayPromoThrowable$Load;", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1})
        public static final class IoServer extends Load {
            public IoServer(Throwable th) {
                super("Failed to load file", th, 0);
            }
        }

        @Metadata(mo72581bv = {}, mo72582d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoThrowable$Load$NoFill;", "Lcom/saygames/saypromo/SayPromoThrowable$Load;", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1})
        public static final class NoFill extends Load {
            public NoFill() {
                super("Data does not filled", (Throwable) null, 0);
            }
        }

        @Metadata(mo72581bv = {}, mo72582d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoThrowable$Load$NoInternet;", "Lcom/saygames/saypromo/SayPromoThrowable$Load;", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1})
        public static final class NoInternet extends Load {
            public NoInternet(Throwable th) {
                super("Failed to load data", th, 0);
            }
        }

        @Metadata(mo72581bv = {}, mo72582d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoThrowable$Load$NoSpace;", "Lcom/saygames/saypromo/SayPromoThrowable$Load;", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1})
        public static final class NoSpace extends Load {
            public NoSpace() {
                super("No free space", (Throwable) null, 0);
            }
        }

        @Metadata(mo72581bv = {}, mo72582d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoThrowable$Load$Server;", "Lcom/saygames/saypromo/SayPromoThrowable$Load;", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1})
        public static final class Server extends Load {
            public Server(String str) {
                super(str, (Throwable) null, 0);
            }
        }

        private Load(String str, Throwable th) {
            super(str, th, 0);
        }

        public /* synthetic */ Load(String str, Throwable th, int i) {
            this(str, th);
        }
    }

    @Metadata(mo72581bv = {}, mo72582d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoThrowable$Show;", "Lcom/saygames/saypromo/SayPromoThrowable;", "Finished", "Video", "Web", "Lcom/saygames/saypromo/SayPromoThrowable$Show$Finished;", "Lcom/saygames/saypromo/SayPromoThrowable$Show$Video;", "Lcom/saygames/saypromo/SayPromoThrowable$Show$Web;", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1})
    public static abstract class Show extends SayPromoThrowable {

        @Metadata(mo72581bv = {}, mo72582d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoThrowable$Show$Finished;", "Lcom/saygames/saypromo/SayPromoThrowable$Show;", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1})
        public static final class Finished extends Show {
            public Finished() {
                super("AdActivity was destroyed", (Throwable) null, 0);
            }
        }

        @Metadata(mo72581bv = {}, mo72582d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoThrowable$Show$Video;", "Lcom/saygames/saypromo/SayPromoThrowable$Show;", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1})
        public static final class Video extends Show {
            public Video(String str) {
                super(str, (Throwable) null, 0);
            }
        }

        @Metadata(mo72581bv = {}, mo72582d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo72583d2 = {"Lcom/saygames/saypromo/SayPromoThrowable$Show$Web;", "Lcom/saygames/saypromo/SayPromoThrowable$Show;", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1})
        public static final class Web extends Show {
            public Web(String str, Throwable th) {
                super(str, th, 0);
            }
        }

        private Show(String str, Throwable th) {
            super(str, th, 0);
        }

        public /* synthetic */ Show(String str, Throwable th, int i) {
            this(str, th);
        }
    }

    private SayPromoThrowable(String str, Throwable th) {
        super(str, th);
        this.f25727a = str;
        this.f25728b = th;
    }

    public /* synthetic */ SayPromoThrowable(String str, Throwable th, int i) {
        this(str, th);
    }

    public final Throwable getCause() {
        return this.f25728b;
    }

    public final String getMessage() {
        return this.f25727a;
    }
}

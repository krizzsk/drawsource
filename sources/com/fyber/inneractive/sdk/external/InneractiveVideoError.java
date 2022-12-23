package com.fyber.inneractive.sdk.external;

public class InneractiveVideoError extends InneractiveError {

    /* renamed from: a */
    public final Error f10645a;

    /* renamed from: b */
    public Throwable f10646b;

    public enum Error {
        ERROR_NO_MEDIA_FILES("ErrorNoMediaFiles", true),
        ERROR_FAILED_PLAYING_MEDIA_FILE("ErrorPlayingMediaFile", false),
        ERROR_FAILED_PLAYING_ALL_MEDIA_FILES("ErrorPlayingAllMediaFile", true),
        ERROR_PRE_BUFFER_TIMEOUT("ErrorPreBufferTimeout", false),
        ERROR_BUFFER_TIMEOUT("ErrorBufferTimeout", false);
        

        /* renamed from: a */
        public String f10648a;

        /* renamed from: b */
        public boolean f10649b;

        /* access modifiers changed from: public */
        Error(String str, boolean z) {
            this.f10648a = str;
            this.f10649b = z;
        }

        public String getErrorString() {
            return this.f10648a;
        }

        public boolean isFatal() {
            return this.f10649b;
        }
    }

    public InneractiveVideoError(Error error) {
        this.f10645a = error;
    }

    public String description() {
        if (this.f10646b == null) {
            return this.f10645a.getErrorString();
        }
        return this.f10645a.getErrorString() + ": " + this.f10646b;
    }

    public Throwable getCause() {
        return this.f10646b;
    }

    public Error getPlayerError() {
        return this.f10645a;
    }

    public InneractiveVideoError(Error error, Throwable th) {
        this(error);
        this.f10646b = th;
    }
}

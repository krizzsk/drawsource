package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.utils.VastModels;

public class VastBeacon {

    /* renamed from: ID */
    public static final String f26434ID = "id";

    /* renamed from: id */
    public final String f26435id;
    public final String uri;

    VastBeacon(String str, String str2) {
        this.uri = str;
        this.f26435id = str2;
    }

    public static class Builder {

        /* renamed from: id */
        private String f26436id;
        private String uri;

        public Builder setId(String str) {
            this.f26436id = str;
            return this;
        }

        public Builder setUri(String str) {
            this.uri = str;
            return this;
        }

        public VastBeacon build() throws VastElementMissingException {
            VastModels.requireNonNull(this.uri, "Cannot build VastBeacon: uri is missing");
            return new VastBeacon(this.uri, this.f26436id);
        }
    }
}

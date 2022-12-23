package com.smaato.sdk.video.vast.model;

public class Advertiser {

    /* renamed from: ID */
    public static final String f26422ID = "id";
    public static final String NAME = "Advertiser";

    /* renamed from: id */
    public final String f26423id;
    public final String name;

    Advertiser(String str, String str2) {
        this.f26423id = str;
        this.name = str2;
    }

    public static class Builder {

        /* renamed from: id */
        private String f26424id;
        private String name;

        public Builder setId(String str) {
            this.f26424id = str;
            return this;
        }

        public Builder setName(String str) {
            this.name = str;
            return this;
        }

        public Advertiser build() {
            return new Advertiser(this.f26424id, this.name);
        }
    }
}

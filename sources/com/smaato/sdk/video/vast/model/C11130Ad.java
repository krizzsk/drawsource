package com.smaato.sdk.video.vast.model;

/* renamed from: com.smaato.sdk.video.vast.model.Ad */
public class C11130Ad {
    public static final String AD_TYPE = "adType";
    public static final String CONDITIONAL_AD = "conditionalAd";

    /* renamed from: ID */
    public static final String f26419ID = "id";
    public static final String INLINE = "InLine";
    public static final String NAME = "Ad";
    public static final String SEQUENCE = "sequence";
    public static final String WRAPPER = "Wrapper";
    public final VideoAdType adType;
    public final Boolean conditionalAd;

    /* renamed from: id */
    public final String f26420id;
    public final InLine inLine;
    public final Integer sequence;
    public final Wrapper wrapper;

    C11130Ad(String str, InLine inLine2, Wrapper wrapper2, Integer num, Boolean bool, VideoAdType videoAdType) {
        this.inLine = inLine2;
        this.wrapper = wrapper2;
        this.f26420id = str;
        this.sequence = num;
        this.conditionalAd = bool;
        this.adType = videoAdType;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    /* renamed from: com.smaato.sdk.video.vast.model.Ad$Builder */
    public static class Builder {
        private VideoAdType adType = VideoAdType.VIDEO;
        private Boolean conditionalAd;

        /* renamed from: id */
        private String f26421id;
        private InLine inLine;
        private Integer sequence;
        private Wrapper wrapper;

        public Builder() {
        }

        public Builder(C11130Ad ad) {
            this.inLine = ad.inLine;
            this.wrapper = ad.wrapper;
            this.f26421id = ad.f26420id;
            this.sequence = ad.sequence;
            this.conditionalAd = ad.conditionalAd;
            this.adType = ad.adType;
        }

        public Builder setId(String str) {
            this.f26421id = str;
            return this;
        }

        public Builder setInLine(InLine inLine2) {
            this.inLine = inLine2;
            return this;
        }

        public Builder setWrapper(Wrapper wrapper2) {
            this.wrapper = wrapper2;
            return this;
        }

        public Builder setSequence(Integer num) {
            this.sequence = num;
            return this;
        }

        public Builder setConditionalAd(Boolean bool) {
            this.conditionalAd = bool;
            return this;
        }

        public Builder setAdType(String str) {
            VideoAdType parse = VideoAdType.parse(str);
            if (parse == null) {
                parse = this.adType;
            }
            this.adType = parse;
            return this;
        }

        public C11130Ad build() {
            return new C11130Ad(this.f26421id, this.inLine, this.wrapper, this.sequence, this.conditionalAd, this.adType);
        }
    }
}

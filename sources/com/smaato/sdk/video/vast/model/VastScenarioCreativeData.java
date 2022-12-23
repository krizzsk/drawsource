package com.smaato.sdk.video.vast.model;

public final class VastScenarioCreativeData {
    public final String adId;
    public final String apiFramework;

    /* renamed from: id */
    public final String f26439id;
    public final Integer sequence;
    public final UniversalAdId universalAdId;

    private VastScenarioCreativeData(UniversalAdId universalAdId2, String str, String str2, Integer num, String str3) {
        this.universalAdId = universalAdId2;
        this.f26439id = str;
        this.adId = str2;
        this.sequence = num;
        this.apiFramework = str3;
    }

    public static class Builder {
        private String adId;
        private String apiFramework;

        /* renamed from: id */
        private String f26440id;
        private Integer sequence;
        private UniversalAdId universalAdId;

        public Builder setUniversalAdId(UniversalAdId universalAdId2) {
            this.universalAdId = universalAdId2;
            return this;
        }

        public Builder setId(String str) {
            this.f26440id = str;
            return this;
        }

        public Builder setAdId(String str) {
            this.adId = str;
            return this;
        }

        public Builder setSequence(Integer num) {
            this.sequence = num;
            return this;
        }

        public Builder setApiFramework(String str) {
            this.apiFramework = str;
            return this;
        }

        public VastScenarioCreativeData build() {
            if (this.universalAdId == null) {
                this.universalAdId = UniversalAdId.DEFAULT;
            }
            return new VastScenarioCreativeData(this.universalAdId, this.f26440id, this.adId, this.sequence, this.apiFramework);
        }
    }
}

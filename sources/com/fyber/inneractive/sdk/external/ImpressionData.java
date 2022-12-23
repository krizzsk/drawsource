package com.fyber.inneractive.sdk.external;

public class ImpressionData {

    /* renamed from: a */
    public Pricing f10598a = new Pricing();

    /* renamed from: b */
    public Video f10599b;

    /* renamed from: c */
    public String f10600c;

    /* renamed from: d */
    public Long f10601d;

    /* renamed from: e */
    public String f10602e;

    /* renamed from: f */
    public String f10603f;

    /* renamed from: g */
    public String f10604g;

    /* renamed from: h */
    public String f10605h;

    /* renamed from: i */
    public String f10606i;

    public static class Pricing {

        /* renamed from: a */
        public double f10607a;

        /* renamed from: b */
        public String f10608b;

        public String getCurrency() {
            return this.f10608b;
        }

        public double getValue() {
            return this.f10607a;
        }

        public void setValue(double d) {
            this.f10607a = d;
        }

        public String toString() {
            return "Pricing{value=" + this.f10607a + ", currency='" + this.f10608b + '\'' + '}';
        }
    }

    public static class Video {

        /* renamed from: a */
        public boolean f10609a;

        /* renamed from: b */
        public long f10610b;

        public Video(boolean z, long j) {
            this.f10609a = z;
            this.f10610b = j;
        }

        public long getDuration() {
            return this.f10610b;
        }

        public boolean isSkippable() {
            return this.f10609a;
        }

        public String toString() {
            return "Video{skippable=" + this.f10609a + ", duration=" + this.f10610b + '}';
        }
    }

    public String getAdvertiserDomain() {
        return this.f10606i;
    }

    public String getCampaignId() {
        return this.f10605h;
    }

    public String getCountry() {
        return this.f10602e;
    }

    public String getCreativeId() {
        return this.f10604g;
    }

    public Long getDemandId() {
        return this.f10601d;
    }

    public String getDemandSource() {
        return this.f10600c;
    }

    public String getImpressionId() {
        return this.f10603f;
    }

    public Pricing getPricing() {
        return this.f10598a;
    }

    public Video getVideo() {
        return this.f10599b;
    }

    public void setAdvertiserDomain(String str) {
        this.f10606i = str;
    }

    public void setCampaignId(String str) {
        this.f10605h = str;
    }

    public void setCountry(String str) {
        this.f10602e = str;
    }

    public void setCpmValue(String str) {
        double d;
        try {
            d = Double.parseDouble(str);
        } catch (Exception unused) {
            d = 0.0d;
        }
        this.f10598a.f10607a = d;
    }

    public void setCreativeId(String str) {
        this.f10604g = str;
    }

    public void setCurrency(String str) {
        this.f10598a.f10608b = str;
    }

    public void setDemandId(Long l) {
        this.f10601d = l;
    }

    public void setDemandSource(String str) {
        this.f10600c = str;
    }

    public void setDuration(long j) {
        this.f10599b.f10610b = j;
    }

    public void setImpressionId(String str) {
        this.f10603f = str;
    }

    public void setPricing(Pricing pricing) {
        this.f10598a = pricing;
    }

    public void setVideo(Video video) {
        this.f10599b = video;
    }

    public String toString() {
        return "ImpressionData{pricing=" + this.f10598a + ", video=" + this.f10599b + ", demandSource='" + this.f10600c + '\'' + ", country='" + this.f10602e + '\'' + ", impressionId='" + this.f10603f + '\'' + ", creativeId='" + this.f10604g + '\'' + ", campaignId='" + this.f10605h + '\'' + ", advertiserDomain='" + this.f10606i + '\'' + '}';
    }
}

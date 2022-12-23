package com.applovin.mediation.nativeAds;

import android.view.View;

public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    public static class Builder {

        /* renamed from: a */
        private final View f4465a;

        /* renamed from: b */
        private final int f4466b;

        /* renamed from: c */
        private int f4467c;

        /* renamed from: d */
        private int f4468d;

        /* renamed from: e */
        private int f4469e;

        /* renamed from: f */
        private int f4470f;

        /* renamed from: g */
        private int f4471g;

        /* renamed from: h */
        private int f4472h;

        /* renamed from: i */
        private int f4473i;

        /* renamed from: j */
        private int f4474j;

        /* renamed from: k */
        private int f4475k;

        /* renamed from: l */
        private int f4476l;

        /* renamed from: m */
        private String f4477m;

        public Builder(int i) {
            this(i, (View) null);
        }

        private Builder(int i, View view) {
            this.f4467c = -1;
            this.f4468d = -1;
            this.f4469e = -1;
            this.f4470f = -1;
            this.f4471g = -1;
            this.f4472h = -1;
            this.f4473i = -1;
            this.f4474j = -1;
            this.f4475k = -1;
            this.f4476l = -1;
            this.f4466b = i;
            this.f4465a = view;
        }

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f4465a, this.f4466b, this.f4467c, this.f4468d, this.f4469e, this.f4470f, this.f4471g, this.f4472h, this.f4473i, this.f4474j, this.f4475k, this.f4476l, this.f4477m);
        }

        public Builder setAdvertiserTextViewId(int i) {
            this.f4468d = i;
            return this;
        }

        public Builder setBodyTextViewId(int i) {
            this.f4469e = i;
            return this;
        }

        public Builder setCallToActionButtonId(int i) {
            this.f4476l = i;
            return this;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public Builder setIconContentViewId(int i) {
            this.f4471g = i;
            return this;
        }

        public Builder setIconImageViewId(int i) {
            this.f4470f = i;
            return this;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public Builder setMediaContentFrameLayoutId(int i) {
            this.f4475k = i;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i) {
            this.f4474j = i;
            return this;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public Builder setOptionsContentFrameLayoutId(int i) {
            this.f4473i = i;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i) {
            this.f4472h = i;
            return this;
        }

        /* access modifiers changed from: protected */
        public Builder setTemplateType(String str) {
            this.f4477m = str;
            return this;
        }

        public Builder setTitleTextViewId(int i) {
            this.f4467c = i;
            return this;
        }
    }

    private MaxNativeAdViewBinder(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, String str) {
        this.mainView = view;
        this.layoutResourceId = i;
        this.titleTextViewId = i2;
        this.advertiserTextViewId = i3;
        this.bodyTextViewId = i4;
        this.iconImageViewId = i5;
        this.iconContentViewId = i6;
        this.optionsContentViewGroupId = i7;
        this.optionsContentFrameLayoutId = i8;
        this.mediaContentViewGroupId = i9;
        this.mediaContentFrameLayoutId = i10;
        this.callToActionButtonId = i11;
        this.templateType = str;
    }
}

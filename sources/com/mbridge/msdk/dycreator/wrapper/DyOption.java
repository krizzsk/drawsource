package com.mbridge.msdk.dycreator.wrapper;

import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;

public class DyOption {

    /* renamed from: a */
    private String f5124a;

    /* renamed from: b */
    private File f5125b;

    /* renamed from: c */
    private CampaignEx f5126c;

    /* renamed from: d */
    private DyAdType f5127d;

    /* renamed from: e */
    private String f5128e;

    /* renamed from: f */
    private boolean f5129f;

    /* renamed from: g */
    private boolean f5130g;

    /* renamed from: h */
    private boolean f5131h;

    /* renamed from: i */
    private boolean f5132i;

    /* renamed from: j */
    private boolean f5133j;

    /* renamed from: k */
    private boolean f5134k;

    /* renamed from: l */
    private int f5135l;

    /* renamed from: m */
    private int f5136m;

    /* renamed from: n */
    private int f5137n;

    /* renamed from: o */
    private int f5138o;

    /* renamed from: p */
    private int f5139p;

    /* renamed from: q */
    private int f5140q;

    /* renamed from: r */
    private DyCountDownListenerWrapper f5141r;

    public interface IViewOptionBuilder {
        IViewOptionBuilder adChoiceLink(String str);

        DyOption build();

        IViewOptionBuilder campaignEx(CampaignEx campaignEx);

        IViewOptionBuilder canSkip(boolean z);

        IViewOptionBuilder countDownTime(int i);

        IViewOptionBuilder dyAdType(DyAdType dyAdType);

        IViewOptionBuilder file(File file);

        IViewOptionBuilder fileDir(String str);

        IViewOptionBuilder isApkInfoVisible(boolean z);

        IViewOptionBuilder isClickButtonVisible(boolean z);

        IViewOptionBuilder isLogoVisible(boolean z);

        IViewOptionBuilder isScreenClick(boolean z);

        IViewOptionBuilder isShakeVisible(boolean z);

        IViewOptionBuilder orientation(int i);

        IViewOptionBuilder shakeStrenght(int i);

        IViewOptionBuilder shakeTime(int i);

        IViewOptionBuilder templateType(int i);
    }

    public String getFileDir() {
        return this.f5124a;
    }

    public File getFile() {
        return this.f5125b;
    }

    public CampaignEx getCampaignEx() {
        return this.f5126c;
    }

    public DyAdType getDyAdType() {
        return this.f5127d;
    }

    public boolean isCanSkip() {
        return this.f5130g;
    }

    public String getAdChoiceLink() {
        return this.f5128e;
    }

    public boolean isClickScreen() {
        return this.f5129f;
    }

    public boolean isClickButtonVisible() {
        return this.f5131h;
    }

    public boolean isApkInfoVisible() {
        return this.f5133j;
    }

    public boolean isShakeVisible() {
        return this.f5132i;
    }

    public boolean isLogoVisible() {
        return this.f5134k;
    }

    public int getShakeStrenght() {
        return this.f5135l;
    }

    public int getShakeTime() {
        return this.f5136m;
    }

    public int getOrientation() {
        return this.f5137n;
    }

    public int getCountDownTime() {
        return this.f5138o;
    }

    public int getCurrentCountDown() {
        return this.f5139p;
    }

    public int getTemplateType() {
        return this.f5140q;
    }

    public void setDyCountDownListener(int i) {
        DyCountDownListenerWrapper dyCountDownListenerWrapper = this.f5141r;
        if (dyCountDownListenerWrapper != null) {
            dyCountDownListenerWrapper.getCountDownValue(i);
        }
        this.f5139p = i;
    }

    public void setDyCountDownListenerWrapper(DyCountDownListenerWrapper dyCountDownListenerWrapper) {
        this.f5141r = dyCountDownListenerWrapper;
    }

    public DyOption(Builder builder) {
        this.f5124a = builder.f5142a;
        this.f5125b = builder.f5143b;
        this.f5126c = builder.f5144c;
        this.f5127d = builder.f5145d;
        this.f5130g = builder.f5146e;
        this.f5128e = builder.f5147f;
        this.f5129f = builder.f5148g;
        this.f5131h = builder.f5149h;
        this.f5133j = builder.f5151j;
        this.f5132i = builder.f5150i;
        this.f5134k = builder.f5152k;
        this.f5135l = builder.f5153l;
        this.f5136m = builder.f5154m;
        this.f5137n = builder.f5155n;
        this.f5138o = builder.f5156o;
        this.f5140q = builder.f5157p;
    }

    public static class Builder implements IViewOptionBuilder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f5142a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public File f5143b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public CampaignEx f5144c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public DyAdType f5145d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f5146e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f5147f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f5148g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public boolean f5149h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f5150i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public boolean f5151j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f5152k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public int f5153l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public int f5154m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public int f5155n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public int f5156o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f5157p;

        public IViewOptionBuilder fileDir(String str) {
            this.f5142a = str;
            return this;
        }

        public IViewOptionBuilder file(File file) {
            this.f5143b = file;
            return this;
        }

        public IViewOptionBuilder campaignEx(CampaignEx campaignEx) {
            this.f5144c = campaignEx;
            return this;
        }

        public IViewOptionBuilder dyAdType(DyAdType dyAdType) {
            this.f5145d = dyAdType;
            return this;
        }

        public IViewOptionBuilder canSkip(boolean z) {
            this.f5146e = z;
            return this;
        }

        public IViewOptionBuilder isScreenClick(boolean z) {
            this.f5148g = z;
            return this;
        }

        public IViewOptionBuilder adChoiceLink(String str) {
            this.f5147f = str;
            return this;
        }

        public IViewOptionBuilder isClickButtonVisible(boolean z) {
            this.f5149h = z;
            return this;
        }

        public IViewOptionBuilder isApkInfoVisible(boolean z) {
            this.f5151j = z;
            return this;
        }

        public IViewOptionBuilder isShakeVisible(boolean z) {
            this.f5150i = z;
            return this;
        }

        public IViewOptionBuilder isLogoVisible(boolean z) {
            this.f5152k = z;
            return this;
        }

        public IViewOptionBuilder shakeStrenght(int i) {
            this.f5153l = i;
            return this;
        }

        public IViewOptionBuilder shakeTime(int i) {
            this.f5154m = i;
            return this;
        }

        public IViewOptionBuilder orientation(int i) {
            this.f5155n = i;
            return this;
        }

        public IViewOptionBuilder countDownTime(int i) {
            this.f5156o = i;
            return this;
        }

        public IViewOptionBuilder templateType(int i) {
            this.f5157p = i;
            return this;
        }

        public DyOption build() {
            return new DyOption(this);
        }
    }
}

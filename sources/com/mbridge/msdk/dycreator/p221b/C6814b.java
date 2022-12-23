package com.mbridge.msdk.dycreator.p221b;

/* renamed from: com.mbridge.msdk.dycreator.b.b */
/* compiled from: FixedError */
public enum C6814b {
    NOT_FOUND_VIEWOPTION(-101, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-102, "context is null"),
    FILE_CREATE_VIEW_FILE(-103, "file create view is null"),
    CAMPAIGNEX_IS_NULL(-104, "Campaign size only one"),
    NOT_FOUND_CAMPAIGN(-105, "campaign is null"),
    NOT_FOUND_DYNAMIC_FILE(-106, "dynamic file is not exits"),
    BIND_DATA_FILE_OR_DIR(-107, "data file or file dir is not exits "),
    NOT_FOUND_DYNAMIC_OPTION(-108, "dynamic_option is not exits");
    

    /* renamed from: i */
    private int f18072i;

    /* renamed from: j */
    private String f18073j;

    private C6814b(int i, String str) {
        this.f18072i = i;
        this.f18073j = str;
    }

    /* renamed from: a */
    public final int mo37139a() {
        return this.f18072i;
    }

    /* renamed from: b */
    public final String mo37140b() {
        return this.f18073j;
    }
}

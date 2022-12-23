package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public class FilterWord {

    /* renamed from: a */
    private String f6625a;

    /* renamed from: b */
    private String f6626b;

    /* renamed from: c */
    private boolean f6627c;

    /* renamed from: d */
    private List<FilterWord> f6628d;

    public FilterWord(String str, String str2) {
        this.f6625a = str;
        this.f6626b = str2;
    }

    public FilterWord() {
    }

    public String getId() {
        return this.f6625a;
    }

    public void setId(String str) {
        this.f6625a = str;
    }

    public String getName() {
        return this.f6626b;
    }

    public void setName(String str) {
        this.f6626b = str;
    }

    public boolean getIsSelected() {
        return this.f6627c;
    }

    public void setIsSelected(boolean z) {
        this.f6627c = z;
    }

    public List<FilterWord> getOptions() {
        return this.f6628d;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord != null) {
            if (this.f6628d == null) {
                this.f6628d = new ArrayList();
            }
            this.f6628d.add(filterWord);
        }
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(this.f6625a) && !TextUtils.isEmpty(this.f6626b);
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.f6628d;
        return list != null && !list.isEmpty();
    }
}

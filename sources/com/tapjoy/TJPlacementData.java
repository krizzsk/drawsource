package com.tapjoy;

import android.text.TextUtils;
import java.io.Serializable;

public class TJPlacementData implements Serializable {

    /* renamed from: a */
    private String f26675a;

    /* renamed from: b */
    private String f26676b;

    /* renamed from: c */
    private String f26677c;

    /* renamed from: d */
    private String f26678d;

    /* renamed from: e */
    private String f26679e;

    /* renamed from: f */
    private String f26680f;

    /* renamed from: g */
    private int f26681g;

    /* renamed from: h */
    private String f26682h;

    /* renamed from: i */
    private String f26683i;

    /* renamed from: j */
    private int f26684j;

    /* renamed from: k */
    private boolean f26685k;

    /* renamed from: l */
    private String f26686l;

    /* renamed from: m */
    private boolean f26687m;

    /* renamed from: n */
    private String f26688n;

    /* renamed from: o */
    private String f26689o;

    /* renamed from: p */
    private boolean f26690p = false;

    /* renamed from: q */
    private boolean f26691q;

    public TJPlacementData(String str, String str2) {
        setKey(str);
        updateUrl(str2);
        setPlacementType(TapjoyConstants.TJC_APP_PLACEMENT);
    }

    public TJPlacementData(String str, String str2, String str3) {
        setBaseURL(str);
        setHttpResponse(str2);
        this.f26688n = str3;
        setPlacementType(TapjoyConstants.TJC_APP_PLACEMENT);
    }

    public void resetPlacementRequestData() {
        setHttpResponse((String) null);
        setHttpStatusCode(0);
        setRedirectURL((String) null);
        setHasProgressSpinner(false);
        setPrerenderingRequested(false);
        setPreloadDisabled(false);
        setContentViewId((String) null);
        setHandleDismissOnPause(false);
    }

    public String getCallbackID() {
        return this.f26688n;
    }

    public void setKey(String str) {
        this.f26675a = str;
    }

    public void setBaseURL(String str) {
        this.f26677c = str;
    }

    public void setMediationURL(String str) {
        this.f26678d = str;
    }

    public void setAuctionMediationURL(String str) {
        this.f26679e = str;
    }

    public void setHttpResponse(String str) {
        this.f26680f = str;
    }

    public void setHttpStatusCode(int i) {
        this.f26681g = i;
    }

    public void setPlacementName(String str) {
        this.f26682h = str;
    }

    public void setPlacementType(String str) {
        this.f26683i = str;
    }

    public void setViewType(int i) {
        this.f26684j = i;
    }

    public void setRedirectURL(String str) {
        this.f26686l = str;
    }

    public void setHasProgressSpinner(boolean z) {
        this.f26685k = z;
    }

    public void setContentViewId(String str) {
        this.f26689o = str;
    }

    public String getUrl() {
        return this.f26676b;
    }

    public String getKey() {
        return this.f26675a;
    }

    public String getBaseURL() {
        return this.f26677c;
    }

    public String getMediationURL() {
        return this.f26678d;
    }

    public String getAuctionMediationURL() {
        return this.f26679e;
    }

    public String getHttpResponse() {
        return this.f26680f;
    }

    public int getHttpStatusCode() {
        return this.f26681g;
    }

    public String getPlacementName() {
        return this.f26682h;
    }

    public String getPlacementType() {
        return this.f26683i;
    }

    public int getViewType() {
        return this.f26684j;
    }

    public String getRedirectURL() {
        return this.f26686l;
    }

    public String getContentViewId() {
        return this.f26689o;
    }

    public boolean hasProgressSpinner() {
        return this.f26685k;
    }

    public void setPreloadDisabled(boolean z) {
        this.f26690p = z;
    }

    public boolean isPreloadDisabled() {
        return this.f26690p;
    }

    public boolean isPrerenderingRequested() {
        return this.f26687m;
    }

    public void setPrerenderingRequested(boolean z) {
        this.f26687m = z;
    }

    public void setHandleDismissOnPause(boolean z) {
        this.f26691q = z;
    }

    public boolean shouldHandleDismissOnPause() {
        return this.f26691q;
    }

    public void updateUrl(String str) {
        this.f26676b = str;
        if (!TextUtils.isEmpty(str)) {
            setBaseURL(str.substring(0, str.indexOf(47, str.indexOf("//") + 3)));
        }
    }
}

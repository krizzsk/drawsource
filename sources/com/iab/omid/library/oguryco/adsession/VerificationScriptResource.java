package com.iab.omid.library.oguryco.adsession;

import com.iab.omid.library.oguryco.p269d.C7997e;
import java.net.URL;

public final class VerificationScriptResource {
    private final URL resourceUrl;
    private final String vendorKey;
    private final String verificationParameters;

    private VerificationScriptResource(String str, URL url, String str2) {
        this.vendorKey = str;
        this.resourceUrl = url;
        this.verificationParameters = str2;
    }

    public static VerificationScriptResource createVerificationScriptResourceWithParameters(String str, URL url, String str2) {
        C7997e.m22698a(str, "VendorKey is null or empty");
        C7997e.m22696a((Object) url, "ResourceURL is null");
        C7997e.m22698a(str2, "VerificationParameters is null or empty");
        return new VerificationScriptResource(str, url, str2);
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(String str, URL url) {
        C7997e.m22698a(str, "VendorKey is null or empty");
        C7997e.m22696a((Object) url, "ResourceURL is null");
        return new VerificationScriptResource(str, url, (String) null);
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(URL url) {
        C7997e.m22696a((Object) url, "ResourceURL is null");
        return new VerificationScriptResource((String) null, url, (String) null);
    }

    public final URL getResourceUrl() {
        return this.resourceUrl;
    }

    public final String getVendorKey() {
        return this.vendorKey;
    }

    public final String getVerificationParameters() {
        return this.verificationParameters;
    }
}

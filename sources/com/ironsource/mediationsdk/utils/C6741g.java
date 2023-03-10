package com.ironsource.mediationsdk.utils;

import android.text.TextUtils;
import com.ironsource.environment.C6363a;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;

/* renamed from: com.ironsource.mediationsdk.utils.g */
public final class C6741g {

    /* renamed from: d */
    private static final C6741g f17597d = new C6741g();

    /* renamed from: a */
    private String f17598a = "";

    /* renamed from: b */
    private String f17599b = "";

    /* renamed from: c */
    private String f17600c = "";

    /* renamed from: a */
    public static C6741g m20413a() {
        return f17597d;
    }

    /* renamed from: b */
    public final String mo36969b() {
        if (TextUtils.isEmpty(this.f17598a)) {
            this.f17598a = "C38FB23A402222A0C17D34A92F971D1F";
        }
        return this.f17598a;
    }

    /* renamed from: c */
    public final synchronized String mo36970c() {
        if (TextUtils.isEmpty(this.f17599b)) {
            StringBuilder sb = new StringBuilder();
            Random random = new Random();
            for (int i = 0; i < 32; i++) {
                sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".charAt(random.nextInt(93)));
            }
            this.f17599b = sb.toString();
        }
        return this.f17599b;
    }

    /* renamed from: d */
    public final String mo36971d() {
        if (TextUtils.isEmpty(this.f17600c)) {
            try {
                this.f17600c = C6363a.C63641.m19005a(mo36970c(), "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB");
            } catch (Exception e) {
                String str = "Session key encryption exception: " + e.getLocalizedMessage();
                IronLog.INTERNAL.error(str);
                throw new JSONException(str);
            }
        }
        return this.f17600c;
    }
}

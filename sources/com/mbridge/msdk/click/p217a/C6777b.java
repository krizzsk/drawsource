package com.mbridge.msdk.click.p217a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* renamed from: com.mbridge.msdk.click.a.b */
/* compiled from: RetryUrlRecordData */
public final class C6777b {

    /* renamed from: a */
    public static int f17872a = 0;

    /* renamed from: b */
    public static int f17873b = 1;

    /* renamed from: c */
    private String f17874c;

    /* renamed from: d */
    private int f17875d;

    /* renamed from: e */
    private HashSet<String> f17876e = new HashSet<>();

    /* renamed from: f */
    private long f17877f = System.currentTimeMillis();

    /* renamed from: g */
    private CampaignEx f17878g;

    /* renamed from: h */
    private String f17879h;

    /* renamed from: i */
    private int f17880i;

    /* renamed from: j */
    private boolean f17881j;

    /* renamed from: k */
    private boolean f17882k;

    /* renamed from: l */
    private int f17883l;

    /* renamed from: a */
    public final boolean mo37061a() {
        return this.f17881j;
    }

    /* renamed from: a */
    public final void mo37060a(boolean z) {
        this.f17881j = z;
    }

    /* renamed from: b */
    public final boolean mo37065b() {
        return this.f17882k;
    }

    /* renamed from: b */
    public final void mo37064b(boolean z) {
        this.f17882k = z;
    }

    /* renamed from: c */
    public final int mo37066c() {
        return this.f17883l;
    }

    /* renamed from: a */
    public final void mo37057a(int i) {
        this.f17883l = i;
    }

    /* renamed from: d */
    public final int mo37067d() {
        return this.f17880i;
    }

    /* renamed from: b */
    public final void mo37062b(int i) {
        this.f17880i = i;
    }

    public C6777b(String str, String str2) {
        this.f17874c = str;
        mo37063b(str2);
    }

    /* renamed from: e */
    public final String mo37068e() {
        return this.f17879h;
    }

    /* renamed from: a */
    public final void mo37059a(String str) {
        this.f17879h = str;
    }

    /* renamed from: f */
    public final CampaignEx mo37069f() {
        return this.f17878g;
    }

    /* renamed from: a */
    public final void mo37058a(CampaignEx campaignEx) {
        this.f17878g = campaignEx;
    }

    /* renamed from: g */
    public final String mo37070g() {
        return this.f17874c;
    }

    /* renamed from: h */
    public final int mo37071h() {
        return this.f17875d;
    }

    /* renamed from: i */
    public final HashSet<String> mo37072i() {
        return this.f17876e;
    }

    /* renamed from: b */
    public final void mo37063b(String str) {
        this.f17875d++;
        this.f17876e.add(str);
    }

    /* renamed from: j */
    public final long mo37073j() {
        return this.f17877f;
    }
}

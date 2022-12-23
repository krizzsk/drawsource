package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.p083a.p084a.C2461a;

public class AuthorityInfoBean {
    public int getAuthGenDataStatus() {
        if (!C2461a.m6124a().mo16390b(MBridgeConstans.AUTHORITY_GENERAL_DATA).equals("")) {
            return Integer.parseInt(C2461a.m6124a().mo16390b(MBridgeConstans.AUTHORITY_GENERAL_DATA));
        }
        return 1;
    }

    public int getAuthDeviceIdStatus() {
        if (!C2461a.m6124a().mo16390b(MBridgeConstans.AUTHORITY_DEVICE_ID).equals("")) {
            return Integer.parseInt(C2461a.m6124a().mo16390b(MBridgeConstans.AUTHORITY_DEVICE_ID));
        }
        return 1;
    }

    public int getAuthSerialIdStatus() {
        if (!C2461a.m6124a().mo16390b(MBridgeConstans.AUTHORITY_SERIAL_ID).equals("")) {
            return Integer.parseInt(C2461a.m6124a().mo16390b(MBridgeConstans.AUTHORITY_SERIAL_ID));
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AuthorityInfoBean mo56928a(int i) {
        C2461a.m6124a().mo16388a(MBridgeConstans.AUTHORITY_GENERAL_DATA, String.valueOf(i));
        C2461a.m6124a().mo16388a(MBridgeConstans.AUTHORITY_DEVICE_ID, String.valueOf(i));
        C2461a.m6124a().mo16388a(MBridgeConstans.AUTHORITY_SERIAL_ID, String.valueOf(i));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final AuthorityInfoBean mo56929b(int i) {
        C2461a.m6124a().mo16388a(MBridgeConstans.AUTHORITY_GENERAL_DATA, String.valueOf(i));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final AuthorityInfoBean mo56930c(int i) {
        C2461a.m6124a().mo16388a(MBridgeConstans.AUTHORITY_DEVICE_ID, String.valueOf(i));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final AuthorityInfoBean mo56931d(int i) {
        C2461a.m6124a().mo16388a(MBridgeConstans.AUTHORITY_SERIAL_ID, String.valueOf(i));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final AuthorityInfoBean mo56932e(int i) {
        C2461a.m6124a().mo16388a(MBridgeConstans.AUTHORITY_OTHER, String.valueOf(i));
        return this;
    }
}

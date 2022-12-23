package com.mbridge.msdk.video.signal.p371a;

import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.C9616f;

/* renamed from: com.mbridge.msdk.video.signal.a.e */
/* compiled from: DefaultJSNotifyProxy */
public class C9509e implements C9616f {
    /* renamed from: a */
    public void mo63267a(int i) {
        C8672v.m24874a("DefaultJSNotifyProxy", "onVideoStatusNotify:" + i);
    }

    /* renamed from: a */
    public void mo63269a(int i, String str) {
        C8672v.m24874a("DefaultJSNotifyProxy", "onClick:" + i + ",pt:" + str);
    }

    /* renamed from: a */
    public void mo63270a(MBridgeVideoView.C9471a aVar) {
        C8672v.m24874a("DefaultJSNotifyProxy", "onProgressNotify:" + aVar.toString());
    }

    /* renamed from: a */
    public void mo63271a(Object obj) {
        C8672v.m24874a("DefaultJSNotifyProxy", "onWebviewShow:" + obj);
    }

    /* renamed from: a */
    public void mo63268a(int i, int i2, int i3, int i4) {
        C8672v.m24874a("DefaultJSNotifyProxy", "showDataInfo");
    }
}

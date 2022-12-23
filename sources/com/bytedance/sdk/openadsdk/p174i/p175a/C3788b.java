package com.bytedance.sdk.openadsdk.p174i.p175a;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.utils.C2892d;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.i.a.b */
/* compiled from: GifRequestResult */
public class C3788b {

    /* renamed from: a */
    int f9755a;

    /* renamed from: b */
    private byte[] f9756b = null;

    /* renamed from: c */
    private Bitmap f9757c = null;

    /* renamed from: d */
    private List<Object> f9758d = null;

    /* renamed from: e */
    private Map<String, String> f9759e = null;

    public C3788b(byte[] bArr, int i) {
        this.f9756b = bArr;
        this.f9755a = i;
    }

    public C3788b(Bitmap bitmap, int i) {
        this.f9757c = bitmap;
        this.f9755a = i;
    }

    /* renamed from: a */
    public Bitmap mo20605a() {
        return this.f9757c;
    }

    /* renamed from: b */
    public byte[] mo20606b() {
        try {
            if (this.f9756b == null) {
                this.f9756b = C2892d.m8075a(this.f9757c);
            }
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        return this.f9756b;
    }

    /* renamed from: c */
    public boolean mo20607c() {
        if (this.f9757c != null) {
            return true;
        }
        byte[] bArr = this.f9756b;
        if (bArr == null || bArr.length <= 0) {
            return false;
        }
        return true;
    }
}

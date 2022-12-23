package com.bytedance.sdk.openadsdk.core.video.p161b;

import com.bytedance.sdk.component.utils.C2894f;
import com.bytedance.sdk.openadsdk.p127a.C2953b;
import java.io.File;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.b.c */
/* compiled from: TotalCountLruDiskDir */
public class C3605c extends C2953b {
    public C3605c(int i, int i2) {
        super(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18277a(List<File> list) {
        int size = list.size();
        if (!mo18278a(0, size)) {
            for (File next : list) {
                C2894f.m8086c(next);
                size--;
                if (mo18279a(next, 0, size)) {
                    return;
                }
            }
        }
    }
}

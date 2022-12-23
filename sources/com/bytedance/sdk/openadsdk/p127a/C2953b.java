package com.bytedance.sdk.openadsdk.p127a;

import com.bytedance.sdk.component.utils.C2905l;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.bytedance.sdk.openadsdk.a.b */
/* compiled from: TotalCountLruDiskFile */
public class C2953b extends C2950a {

    /* renamed from: a */
    private int f6711a = 15;

    /* renamed from: b */
    private int f6712b = 3;

    /* renamed from: c */
    private volatile boolean f6713c;

    public C2953b(int i, int i2) {
        if (i > 0) {
            this.f6711a = i;
            this.f6712b = i2;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }

    public C2953b(int i, int i2, boolean z) {
        if (i > 0) {
            this.f6711a = i;
            this.f6712b = i2;
            this.f6713c = z;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18278a(long j, int i) {
        return i <= this.f6711a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18279a(File file, long j, int i) {
        return i <= this.f6712b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18277a(List<File> list) {
        if (this.f6713c) {
            m8292d(list);
            this.f6713c = false;
            return;
        }
        m8291c(list);
    }

    /* renamed from: c */
    private void m8291c(List<File> list) {
        long b = mo18280b(list);
        int size = list.size();
        if (!mo18278a(b, size)) {
            for (File next : list) {
                long length = next.length();
                if (next.delete()) {
                    size--;
                    b -= length;
                    C2905l.m8114c("TotalCountLruDiskFile", "Cache file " + next + " is deleted because it exceeds cache limit");
                } else {
                    C2905l.m8114c("TotalCountLruDiskFile", "Error deleting file " + next + " for trimming cache");
                }
                if (mo18279a(next, b, size)) {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    private void m8292d(List<File> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    long b = mo18280b(list);
                    int size = list.size();
                    boolean a = mo18278a(b, size);
                    if (a) {
                        C2905l.m8114c("splashLoadAd", "Do not meet the delete condition, do not perform a delete operation(true)" + a);
                        return;
                    }
                    TreeMap treeMap = new TreeMap();
                    for (File next : list) {
                        treeMap.put(Long.valueOf(next.lastModified()), next);
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (entry != null) {
                            if (!a) {
                                C2905l.m8118e("splashLoadAd", "LRUDeleteFile deleting fileTime " + ((Long) entry.getKey()).longValue());
                                File file = (File) entry.getValue();
                                long length = file.length();
                                if (file.delete()) {
                                    size--;
                                    b -= length;
                                    C2905l.m8114c("splashLoadAd", "Delete, the current total number of a Cache file：" + size);
                                } else {
                                    C2905l.m8118e("splashLoadAd", "Error deleting file " + file + " for trimming cache");
                                }
                                if (mo18279a(file, b, size)) {
                                    C2905l.m8114c("splashLoadAd", "Stop deleting, the current total number totalCount：" + size + " Maximum storage limit number maxCount " + this.f6711a + " Minimum number " + this.f6712b);
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}

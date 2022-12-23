package com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a;

import android.os.Build;
import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.p069a.C2396a;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bykv.p054vk.openvk.component.video.p055a.p056a.C2277a;
import com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2284b;
import com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b.C2286c;
import com.bykv.p054vk.openvk.component.video.p055a.p068e.C2393c;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bykv.vk.openvk.component.video.a.a.a.a */
/* compiled from: MediaCacheDirImpl */
public class C2278a implements C2396a {

    /* renamed from: a */
    private String f4551a = "video_feed";

    /* renamed from: b */
    private String f4552b = "video_reward_full";

    /* renamed from: c */
    private String f4553c = "video_brand";

    /* renamed from: d */
    private String f4554d = "video_splash";

    /* renamed from: e */
    private String f4555e = "video_default";

    /* renamed from: f */
    private String f4556f = null;

    /* renamed from: g */
    private String f4557g = null;

    /* renamed from: h */
    private String f4558h = null;

    /* renamed from: i */
    private String f4559i = null;

    /* renamed from: j */
    private String f4560j = null;

    /* renamed from: k */
    private String f4561k = null;

    /* renamed from: a */
    public void mo15662a(String str) {
        this.f4556f = str;
    }

    /* renamed from: a */
    public String mo15661a() {
        if (this.f4557g == null) {
            this.f4557g = this.f4556f + File.separator + this.f4551a;
            File file = new File(this.f4557g);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f4557g;
    }

    /* renamed from: b */
    public String mo15665b() {
        if (this.f4558h == null) {
            this.f4558h = this.f4556f + File.separator + this.f4552b;
            File file = new File(this.f4558h);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f4558h;
    }

    /* renamed from: c */
    public void mo15666c() {
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 23) {
            for (C2277a next : C2277a.f4546a.values()) {
                if (!(next == null || next.mo15657a() == null)) {
                    C2401c a = next.mo15657a();
                    hashSet.add(C2393c.m5619b(a.mo15966a(), a.mo15992k()).getAbsolutePath());
                }
            }
            for (C2284b next2 : C2286c.f4582a.values()) {
                if (!(next2 == null || next2.mo15676a() == null)) {
                    C2401c a2 = next2.mo15676a();
                    hashSet.add(C2393c.m5619b(a2.mo15966a(), a2.mo15992k()).getAbsolutePath());
                }
            }
        }
        m5183a(new File(mo15661a()), 30, hashSet);
        m5183a(new File(mo15665b()), 20, hashSet);
    }

    /* renamed from: a */
    public boolean mo15663a(C2401c cVar) {
        if (TextUtils.isEmpty(cVar.mo15966a()) || TextUtils.isEmpty(cVar.mo15992k())) {
            return false;
        }
        return new File(cVar.mo15966a(), cVar.mo15992k()).exists();
    }

    /* renamed from: b */
    public long mo15664b(C2401c cVar) {
        if (TextUtils.isEmpty(cVar.mo15966a()) || TextUtils.isEmpty(cVar.mo15992k())) {
            return 0;
        }
        return C2393c.m5617a(cVar.mo15966a(), cVar.mo15992k());
    }

    /* renamed from: a */
    private static void m5183a(File file, int i, Set<String> set) {
        if (i >= 0 && file.exists() && !file.isFile()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > i) {
                    List asList = Arrays.asList(listFiles);
                    Collections.sort(asList, new Comparator<File>() {
                        /* renamed from: a */
                        public int compare(File file, File file2) {
                            int i = ((file2.lastModified() - file.lastModified()) > 0 ? 1 : ((file2.lastModified() - file.lastModified()) == 0 ? 0 : -1));
                            if (i == 0) {
                                return 0;
                            }
                            return i < 0 ? -1 : 1;
                        }
                    });
                    while (i < asList.size()) {
                        File file2 = (File) asList.get(i);
                        if (set != null && !set.contains(file2.getAbsolutePath())) {
                            ((File) asList.get(i)).delete();
                        }
                        i++;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}

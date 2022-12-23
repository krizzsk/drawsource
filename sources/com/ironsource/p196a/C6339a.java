package com.ironsource.p196a;

import android.util.Pair;
import androidx.browser.trusted.sharing.ShareTarget;
import java.util.ArrayList;

/* renamed from: com.ironsource.a.a */
public final class C6339a {

    /* renamed from: a */
    String f16049a;

    /* renamed from: b */
    public boolean f16050b;

    /* renamed from: c */
    String f16051c;

    /* renamed from: d */
    C6344d f16052d;

    /* renamed from: e */
    boolean f16053e = false;

    /* renamed from: f */
    ArrayList<Pair<String, String>> f16054f;

    /* renamed from: com.ironsource.a.a$a */
    public static class C6340a {

        /* renamed from: a */
        String f16055a = "";

        /* renamed from: b */
        public boolean f16056b = false;

        /* renamed from: c */
        public String f16057c = ShareTarget.METHOD_POST;

        /* renamed from: d */
        public C6344d f16058d;

        /* renamed from: e */
        public boolean f16059e = false;

        /* renamed from: f */
        public ArrayList<Pair<String, String>> f16060f = new ArrayList<>();

        public C6340a(String str) {
            if (str != null && !str.isEmpty()) {
                this.f16055a = str;
            }
        }
    }

    public C6339a(C6340a aVar) {
        this.f16049a = aVar.f16055a;
        this.f16050b = aVar.f16056b;
        this.f16051c = aVar.f16057c;
        this.f16052d = aVar.f16058d;
        this.f16053e = aVar.f16059e;
        if (aVar.f16060f != null) {
            this.f16054f = new ArrayList<>(aVar.f16060f);
        }
    }
}

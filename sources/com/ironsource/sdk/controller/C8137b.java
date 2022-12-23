package com.ironsource.sdk.controller;

import java.util.ArrayList;

/* renamed from: com.ironsource.sdk.controller.b */
public final class C8137b {

    /* renamed from: a */
    private int f19751a = C8138a.f19754a;

    /* renamed from: b */
    private ArrayList f19752b = new ArrayList();

    /* renamed from: c */
    private String f19753c;

    /* renamed from: com.ironsource.sdk.controller.b$a */
    enum C8138a {
        ;
        

        /* renamed from: a */
        public static final int f19754a = 1;

        /* renamed from: b */
        public static final int f19755b = 2;

        static {
            f19756c = new int[]{1, 2};
        }
    }

    public C8137b(String str) {
        this.f19753c = str;
    }

    /* renamed from: a */
    public final synchronized void mo56393a() {
        this.f19751a = C8138a.f19755b;
    }

    /* renamed from: a */
    public final synchronized void mo56394a(Runnable runnable) {
        if (this.f19751a != C8138a.f19755b) {
            this.f19752b.add(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: b */
    public final synchronized void mo56395b() {
        Object[] array = this.f19752b.toArray();
        for (int i = 0; i < array.length; i++) {
            ((Runnable) array[i]).run();
            array[i] = null;
        }
        this.f19752b.clear();
    }
}

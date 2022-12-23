package com.ogury.p377ed.internal;

import android.widget.FrameLayout;
import com.ogury.p377ed.internal.C10093ho;
import p401io.presage.mraid.browser.ShortcutActivity;

/* renamed from: com.ogury.ed.internal.hr */
public final class C10099hr {

    /* renamed from: a */
    public static final C10100a f25354a = new C10100a((byte) 0);

    /* renamed from: b */
    private final C10104hu f25355b;

    /* renamed from: c */
    private final ShortcutActivity f25356c;

    /* renamed from: d */
    private final C10141iv f25357d;

    /* renamed from: e */
    private final C10108hw f25358e;

    /* renamed from: f */
    private final C10093ho.C10094a f25359f;

    /* renamed from: g */
    private C10093ho f25360g;

    private C10099hr(C10104hu huVar, ShortcutActivity shortcutActivity, C10141iv ivVar, C10108hw hwVar, C10093ho.C10094a aVar) {
        C10263mq.m29882b(huVar, "shortcutPrefs");
        C10263mq.m29882b(shortcutActivity, "activity");
        C10263mq.m29882b(ivVar, "foregroundHandlerFactory");
        C10263mq.m29882b(hwVar, "webViewArgsParser");
        C10263mq.m29882b(aVar, "browserFactory");
        this.f25355b = huVar;
        this.f25356c = shortcutActivity;
        this.f25357d = ivVar;
        this.f25358e = hwVar;
        this.f25359f = aVar;
    }

    public /* synthetic */ C10099hr(C10104hu huVar, ShortcutActivity shortcutActivity, C10141iv ivVar) {
        this(huVar, shortcutActivity, ivVar, C10108hw.f25383a, C10093ho.f25329a);
    }

    /* renamed from: com.ogury.ed.internal.hr$a */
    public static final class C10100a {
        public /* synthetic */ C10100a(byte b) {
            this();
        }

        private C10100a() {
        }

        /* renamed from: a */
        public static C10099hr m29389a(C10104hu huVar, ShortcutActivity shortcutActivity, C10141iv ivVar) {
            C10263mq.m29882b(huVar, "shortcutPrefs");
            C10263mq.m29882b(shortcutActivity, "activity");
            C10263mq.m29882b(ivVar, "foregroundHandlerFactory");
            return new C10099hr(huVar, shortcutActivity, ivVar);
        }
    }

    /* renamed from: a */
    public final boolean mo64852a(String str, String str2, FrameLayout frameLayout) {
        C10106hv a;
        C10263mq.m29882b(str, "intentArgs");
        C10263mq.m29882b(str2, "shortcutId");
        C10263mq.m29882b(frameLayout, TtmlNode.RUBY_CONTAINER);
        String b = this.f25355b.mo64856b(str2);
        if (b.length() > 0) {
            str = b;
        }
        if ((str.length() == 0) || (a = C10108hw.m29431a(str)) == null) {
            return false;
        }
        if (!this.f25355b.mo64855a(a.mo64866c()) && !this.f25355b.mo64857c(a.mo64866c())) {
            return false;
        }
        m29386a(frameLayout, a);
        return true;
    }

    /* renamed from: a */
    private final void m29386a(FrameLayout frameLayout, C10106hv hvVar) {
        C9981eb ebVar = new C9981eb();
        ebVar.mo64521h("http://ogury.io");
        C10093ho a = C10093ho.C10094a.m29363a(this.f25356c, ebVar, frameLayout, this.f25357d);
        this.f25360g = a;
        if (a != null) {
            a.mo64829a(hvVar);
        }
    }

    /* renamed from: a */
    public final void mo64851a() {
        C10093ho hoVar = this.f25360g;
        if (hoVar != null) {
            hoVar.mo64839d();
        }
    }
}

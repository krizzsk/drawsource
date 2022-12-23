package com.ogury.p377ed.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import java.util.Collection;
import java.util.List;
import p401io.presage.mraid.browser.Android8AndLaterShortcutActivity;
import p401io.presage.mraid.browser.ShortcutActivity;

/* renamed from: com.ogury.ed.internal.hs */
public final class C10101hs {

    /* renamed from: a */
    public static final C10102a f25361a = new C10102a((byte) 0);

    /* renamed from: b */
    private Context f25362b;

    /* renamed from: c */
    private final C10144ix f25363c;

    /* renamed from: d */
    private final C10037fv f25364d;

    /* renamed from: e */
    private C10114ib f25365e;

    /* renamed from: f */
    private C10104hu f25366f;

    /* renamed from: g */
    private ShortcutInfo f25367g;

    private C10101hs(Context context, C10144ix ixVar, C10037fv fvVar, C10114ib ibVar, C10104hu huVar) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(ixVar, "mraidShortcutIcon");
        C10263mq.m29882b(fvVar, "bitmapDownloader");
        C10263mq.m29882b(ibVar, "shortcutManagerFactory");
        C10263mq.m29882b(huVar, "prefs");
        this.f25362b = context;
        this.f25363c = ixVar;
        this.f25364d = fvVar;
        this.f25365e = ibVar;
        this.f25366f = huVar;
    }

    public /* synthetic */ C10101hs(Context context, C10144ix ixVar) {
        this(context, ixVar, new C10037fv(), new C10114ib(), new C10104hu(context));
    }

    /* renamed from: com.ogury.ed.internal.hs$a */
    public static final class C10102a {
        public /* synthetic */ C10102a(byte b) {
            this();
        }

        private C10102a() {
        }
    }

    /* renamed from: a */
    public final void mo64853a() {
        Bitmap b;
        if (!this.f25363c.mo64943e() && (b = m29395b()) != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f25367g = m29391a(b);
                ShortcutManager a = C10114ib.m29468a(this.f25362b);
                ShortcutInfo shortcutInfo = this.f25367g;
                ShortcutInfo shortcutInfo2 = null;
                if (shortcutInfo == null) {
                    C10263mq.m29880a("shortcutInfo");
                    shortcutInfo = null;
                }
                String id = shortcutInfo.getId();
                C10263mq.m29879a((Object) id, "shortcutInfo.id");
                if (m29394a(a, id)) {
                    ShortcutInfo shortcutInfo3 = this.f25367g;
                    if (shortcutInfo3 == null) {
                        C10263mq.m29880a("shortcutInfo");
                    } else {
                        shortcutInfo2 = shortcutInfo3;
                    }
                    m29397b(shortcutInfo2, a);
                } else {
                    ShortcutInfo shortcutInfo4 = this.f25367g;
                    if (shortcutInfo4 == null) {
                        C10263mq.m29880a("shortcutInfo");
                    } else {
                        shortcutInfo2 = shortcutInfo4;
                    }
                    m29392a(shortcutInfo2, a);
                }
            } else {
                if (this.f25366f.mo64855a(this.f25363c.mo64939a()) || this.f25366f.mo64857c(this.f25363c.mo64939a())) {
                    m29393a(this.f25363c.mo64940b());
                }
                m29396b(b);
            }
            this.f25366f.mo64854a(this.f25363c.mo64939a(), this.f25363c.mo64942d());
        }
    }

    /* renamed from: b */
    private final Bitmap m29395b() {
        return C10037fv.m29154a(this.f25363c.mo64941c());
    }

    /* renamed from: a */
    private static boolean m29394a(ShortcutManager shortcutManager, String str) {
        List<ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
        C10263mq.m29879a((Object) pinnedShortcuts, "shortcutManager.pinnedShortcuts");
        Iterable<ShortcutInfo> iterable = pinnedShortcuts;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (ShortcutInfo id : iterable) {
            if (C10263mq.m29881a((Object) str, (Object) id.getId())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final ShortcutInfo m29391a(Bitmap bitmap) {
        ShortcutInfo build = new ShortcutInfo.Builder(this.f25362b, this.f25363c.mo64939a()).setShortLabel(this.f25363c.mo64940b()).setIcon(Icon.createWithBitmap(bitmap)).setIntent(m29390a((Class<?>) Android8AndLaterShortcutActivity.class)).build();
        C10263mq.m29879a((Object) build, "Builder(context, mraidSh…va))\n            .build()");
        return build;
    }

    /* renamed from: a */
    private static void m29392a(ShortcutInfo shortcutInfo, ShortcutManager shortcutManager) {
        if (shortcutManager.isRequestPinShortcutSupported()) {
            shortcutManager.requestPinShortcut(shortcutInfo, (IntentSender) null);
        }
    }

    /* renamed from: b */
    private static boolean m29397b(ShortcutInfo shortcutInfo, ShortcutManager shortcutManager) {
        return shortcutManager.updateShortcuts(C10190km.m29753a(shortcutInfo));
    }

    /* renamed from: b */
    private final void m29396b(Bitmap bitmap) {
        Intent intent = new Intent();
        intent.putExtra("android.intent.extra.shortcut.INTENT", m29390a((Class<?>) ShortcutActivity.class));
        intent.putExtra("android.intent.extra.shortcut.NAME", this.f25363c.mo64940b());
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
        intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        try {
            this.f25362b.sendBroadcast(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private final Intent m29390a(Class<?> cls) {
        Intent intent = new Intent(this.f25362b.getApplicationContext(), cls);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        intent.putExtra("identifier", this.f25363c.mo64939a());
        intent.addFlags(8388608);
        intent.addFlags(67108864);
        intent.setAction("android.intent.action.MAIN");
        return intent;
    }

    /* renamed from: a */
    private final void m29393a(String str) {
        Intent intent = new Intent();
        intent.putExtra("android.intent.extra.shortcut.NAME", str);
        intent.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
        try {
            this.f25362b.sendBroadcast(intent);
        } catch (Exception unused) {
        }
    }
}

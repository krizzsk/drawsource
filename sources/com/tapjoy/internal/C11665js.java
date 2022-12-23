package com.tapjoy.internal;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* renamed from: com.tapjoy.internal.js */
public final class C11665js {

    /* renamed from: com.tapjoy.internal.js$a */
    public static class C11666a {

        /* renamed from: a */
        final Bundle f28111a;

        /* renamed from: b */
        final C11672jv[] f28112b;

        /* renamed from: c */
        final C11672jv[] f28113c;

        /* renamed from: d */
        boolean f28114d;

        /* renamed from: e */
        public int f28115e;

        /* renamed from: f */
        public CharSequence f28116f;

        /* renamed from: g */
        public PendingIntent f28117g;
    }

    /* renamed from: com.tapjoy.internal.js$c */
    public static class C11668c {

        /* renamed from: A */
        Bundle f28119A;

        /* renamed from: B */
        int f28120B = 0;

        /* renamed from: C */
        int f28121C = 0;

        /* renamed from: D */
        Notification f28122D;

        /* renamed from: E */
        RemoteViews f28123E;

        /* renamed from: F */
        RemoteViews f28124F;

        /* renamed from: G */
        RemoteViews f28125G;

        /* renamed from: H */
        String f28126H;

        /* renamed from: I */
        int f28127I = 0;

        /* renamed from: J */
        String f28128J;

        /* renamed from: K */
        long f28129K;

        /* renamed from: L */
        int f28130L = 0;

        /* renamed from: M */
        public Notification f28131M;
        @Deprecated

        /* renamed from: N */
        public ArrayList<String> f28132N;

        /* renamed from: a */
        public Context f28133a;

        /* renamed from: b */
        public ArrayList<C11666a> f28134b = new ArrayList<>();

        /* renamed from: c */
        CharSequence f28135c;

        /* renamed from: d */
        CharSequence f28136d;

        /* renamed from: e */
        public PendingIntent f28137e;

        /* renamed from: f */
        PendingIntent f28138f;

        /* renamed from: g */
        RemoteViews f28139g;

        /* renamed from: h */
        public Bitmap f28140h;

        /* renamed from: i */
        CharSequence f28141i;

        /* renamed from: j */
        int f28142j;

        /* renamed from: k */
        public int f28143k;

        /* renamed from: l */
        boolean f28144l = true;

        /* renamed from: m */
        boolean f28145m;

        /* renamed from: n */
        C11669d f28146n;

        /* renamed from: o */
        CharSequence f28147o;

        /* renamed from: p */
        CharSequence[] f28148p;

        /* renamed from: q */
        int f28149q;

        /* renamed from: r */
        int f28150r;

        /* renamed from: s */
        boolean f28151s;

        /* renamed from: t */
        String f28152t;

        /* renamed from: u */
        boolean f28153u;

        /* renamed from: v */
        String f28154v;

        /* renamed from: w */
        boolean f28155w = false;

        /* renamed from: x */
        boolean f28156x;

        /* renamed from: y */
        boolean f28157y;

        /* renamed from: z */
        String f28158z;

        public C11668c(Context context, String str) {
            Notification notification = new Notification();
            this.f28131M = notification;
            this.f28133a = context;
            this.f28126H = str;
            notification.when = System.currentTimeMillis();
            this.f28131M.audioStreamType = -1;
            this.f28143k = 0;
            this.f28132N = new ArrayList<>();
        }

        /* renamed from: a */
        public final C11668c mo70301a(CharSequence charSequence) {
            this.f28135c = m32016d(charSequence);
            return this;
        }

        /* renamed from: b */
        public final C11668c mo70302b(CharSequence charSequence) {
            this.f28136d = m32016d(charSequence);
            return this;
        }

        /* renamed from: c */
        public final C11668c mo70303c(CharSequence charSequence) {
            this.f28131M.tickerText = m32016d(charSequence);
            return this;
        }

        /* renamed from: a */
        public final C11668c mo70300a(C11669d dVar) {
            if (this.f28146n != dVar) {
                this.f28146n = dVar;
                if (dVar != null) {
                    dVar.mo70304a(this);
                }
            }
            return this;
        }

        /* renamed from: d */
        protected static CharSequence m32016d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }
    }

    /* renamed from: com.tapjoy.internal.js$d */
    public static abstract class C11669d {

        /* renamed from: a */
        protected C11668c f28159a;

        /* renamed from: b */
        CharSequence f28160b;

        /* renamed from: c */
        CharSequence f28161c;

        /* renamed from: d */
        boolean f28162d = false;

        /* renamed from: a */
        public void mo70298a(C11664jr jrVar) {
        }

        /* renamed from: a */
        public final void mo70304a(C11668c cVar) {
            if (this.f28159a != cVar) {
                this.f28159a = cVar;
                if (cVar != null) {
                    cVar.mo70300a(this);
                }
            }
        }
    }

    /* renamed from: com.tapjoy.internal.js$b */
    public static class C11667b extends C11669d {

        /* renamed from: e */
        private CharSequence f28118e;

        /* renamed from: a */
        public final C11667b mo70297a(CharSequence charSequence) {
            this.f28160b = C11668c.m32016d(charSequence);
            return this;
        }

        /* renamed from: b */
        public final C11667b mo70299b(CharSequence charSequence) {
            this.f28118e = C11668c.m32016d(charSequence);
            return this;
        }

        /* renamed from: a */
        public final void mo70298a(C11664jr jrVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(jrVar.mo70296a()).setBigContentTitle(this.f28160b).bigText(this.f28118e);
                if (this.f28162d) {
                    bigText.setSummaryText(this.f28161c);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m32012a(Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return C11671ju.m32028a(notification);
        }
        return null;
    }
}

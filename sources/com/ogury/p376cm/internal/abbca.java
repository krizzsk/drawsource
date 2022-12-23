package com.ogury.p376cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.ads.AdRequest;
import com.ogury.p376cm.internal.aaccc;

/* renamed from: com.ogury.cm.internal.abbca */
public final class abbca {

    /* renamed from: a */
    public static final aaaaa f24337a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final SharedPreferences f24338b;

    /* renamed from: c */
    private final Context f24339c;

    /* renamed from: d */
    private final accba f24340d;

    /* renamed from: e */
    private final aabbb f24341e;

    /* renamed from: com.ogury.cm.internal.abbca$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    private abbca(Context context, accba accba, aabbb aabbb) {
        bbabc.m28052b(context, "context");
        bbabc.m28052b(accba, "sharedPrefsHandler");
        bbabc.m28052b(aabbb, "consentExternalCache");
        this.f24339c = context;
        this.f24340d = accba;
        this.f24341e = aabbb;
        SharedPreferences sharedPreferences = context.getSharedPreferences("migration", 0);
        bbabc.m28049a((Object) sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f24338b = sharedPreferences;
    }

    public /* synthetic */ abbca(Context context, accba accba, aabbb aabbb, int i, bbabb bbabb) {
        this(context, new accba((accca) null, (accbc) null, 3, (bbabb) null), new aabbb(context, abaab.f24291a));
    }

    /* renamed from: a */
    public final void mo63840a() {
        String string = this.f24338b.getString("migrated_version", AdRequest.VERSION);
        bbabc.m28049a((Object) string, "sharedPreferences.getStr…TED_VERSION_KEY, \"0.0.0\")");
        aaccc.aaaaa aaaaa2 = aaccc.f24284a;
        bbabc.m28052b(string, "version");
        bbcac b = new bbcbb("(0|[1-9]\\d*)?(?:\\.)?(0|[1-9]\\d*)?(?:\\.)?(0|[1-9]\\d*)?(?:-([\\dA-z\\-]+(?:\\.[\\dA-z\\-]+)*))?(?:\\+([\\dA-z\\-]+(?:\\.[\\dA-z\\-]+)*))?").mo64027b(string);
        if (b != null) {
            boolean z = true;
            int parseInt = b.mo64024a().get(1).length() == 0 ? 0 : Integer.parseInt(b.mo64024a().get(1));
            int parseInt2 = b.mo64024a().get(2).length() == 0 ? 0 : Integer.parseInt(b.mo64024a().get(2));
            int parseInt3 = b.mo64024a().get(3).length() == 0 ? 0 : Integer.parseInt(b.mo64024a().get(3));
            String str = b.mo64024a().get(4).length() == 0 ? null : b.mo64024a().get(4);
            if (b.mo64024a().get(5).length() != 0) {
                z = false;
            }
            aaccc aaccc = new aaccc(parseInt, parseInt2, parseInt3, str, z ? null : b.mo64024a().get(5));
            if (new aaccc(aaccc.mo63823a(), aaccc.mo63825b(), aaccc.mo63826c(), (String) null, (String) null, 24, (bbabb) null).compareTo(new aaccc(3, 3, 0, (String) null, (String) null, 24, (bbabb) null)) == -1) {
                this.f24340d.mo63922e(this.f24339c);
                this.f24341e.mo63816a();
            }
            SharedPreferences.Editor edit = this.f24338b.edit();
            edit.putString("migrated_version", "3.3.0");
            edit.apply();
            return;
        }
        throw new IllegalArgumentException("Invalid version string [" + string + ']');
    }
}

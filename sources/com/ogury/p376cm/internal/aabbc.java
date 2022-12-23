package com.ogury.p376cm.internal;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.ogury.p376cm.ConsentActivity;

/* renamed from: com.ogury.cm.internal.aabbc */
public final class aabbc {

    /* renamed from: a */
    private final abccb f24254a = new abccb();

    /* renamed from: com.ogury.cm.internal.aabbc$aaaaa */
    public static final class aaaaa implements acabb {

        /* renamed from: a */
        final /* synthetic */ acabb f24255a;

        /* renamed from: com.ogury.cm.internal.aabbc$aaaaa$aaaaa  reason: collision with other inner class name */
        static final class C12661aaaaa extends bbaca implements bbaaa<babcc> {

            /* renamed from: a */
            final /* synthetic */ aaaaa f24256a;

            /* renamed from: b */
            final /* synthetic */ String f24257b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12661aaaaa(aaaaa aaaaa, String str) {
                super(0);
                this.f24256a = aaaaa;
                this.f24257b = str;
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo63787a() {
                this.f24256a.f24255a.mo63784a(this.f24257b);
                return babcc.f24512a;
            }
        }

        /* renamed from: com.ogury.cm.internal.aabbc$aaaaa$aaaab */
        static final class aaaab extends bbaca implements bbaaa<babcc> {

            /* renamed from: a */
            final /* synthetic */ aaaaa f24258a;

            /* renamed from: b */
            final /* synthetic */ int f24259b;

            /* renamed from: c */
            final /* synthetic */ String f24260c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            aaaab(aaaaa aaaaa, int i, String str) {
                super(0);
                this.f24258a = aaaaa;
                this.f24259b = i;
                this.f24260c = str;
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo63787a() {
                this.f24258a.f24255a.mo63783a(this.f24259b, this.f24260c);
                return babcc.f24512a;
            }
        }

        aaaaa(acabb acabb) {
            this.f24255a = acabb;
        }

        /* renamed from: a */
        public final void mo63783a(int i, String str) {
            bbabc.m28052b(str, "error");
            abbac abbac = abbac.f24317a;
            abbac.m27818b().mo63835a(new aaaab(this, i, str));
        }

        /* renamed from: a */
        public final void mo63784a(String str) {
            bbabc.m28052b(str, "response");
            abbac abbac = abbac.f24317a;
            abbac.m27818b().mo63835a(new C12661aaaaa(this, str));
        }
    }

    /* renamed from: com.ogury.cm.internal.aabbc$aaaab */
    static final class aaaab extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ aabbc f24261a;

        /* renamed from: b */
        final /* synthetic */ aaacc f24262b;

        /* renamed from: c */
        final /* synthetic */ Context f24263c;

        /* renamed from: d */
        final /* synthetic */ String f24264d;

        /* renamed from: e */
        final /* synthetic */ String f24265e;

        /* renamed from: f */
        final /* synthetic */ acabb f24266f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaab(aabbc aabbc, aaacc aaacc, Context context, String str, String str2, acabb acabb) {
            super(0);
            this.f24261a = aabbc;
            this.f24262b = aaacc;
            this.f24263c = context;
            this.f24264d = str;
            this.f24265e = str2;
            this.f24266f = acabb;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo63787a() {
            acabc acabc;
            String str;
            String str2;
            abcbc abcbc;
            acaba a = new acaba().mo63900a(ShareTarget.METHOD_POST);
            aaacc aaacc = this.f24262b;
            if (aaacc instanceof aabab) {
                acaca acaca = acaca.f24445a;
                acabc = acabc.EXTERNAL_TCF_CONSENT;
            } else if (aaacc instanceof aabaa) {
                acaca acaca2 = acaca.f24445a;
                acabc = acabc.EXTERNAL_BOOLEAN_CONSENT;
            } else {
                throw new babbb();
            }
            acaba c = a.mo63905c(acaca.m27937a(acabc));
            Context context = this.f24263c;
            String str3 = this.f24264d;
            String str4 = this.f24265e;
            aaacc aaacc2 = this.f24262b;
            new bacbb();
            bbabc.m28052b(context, "context");
            bbabc.m28052b(str3, "appKey");
            bbabc.m28052b(aaacc2, "externalConsentData");
            bbabc.m28052b(str4, "consentToken");
            if (aaacc2 instanceof aabab) {
                if (aaacc2 instanceof aabac) {
                    Context applicationContext = context.getApplicationContext();
                    bbabc.m28049a((Object) applicationContext, "context.applicationContext");
                    String packageName = applicationContext.getPackageName();
                    bbabc.m28049a((Object) packageName, "context.applicationContext.packageName");
                    String c2 = ConsentActivity.aaaaa.m27632c(context);
                    aabab aabab = (aabab) aaacc2;
                    String b = aabab.mo63813b();
                    Integer[] d = ((aabac) aaacc2).mo63815d();
                    String name = aabab.mo63814c().name();
                    String str5 = packageName;
                    String str6 = "3.3.0";
                    str = abcbc.mo63888a().mo63884a().toString();
                    str2 = "requestBodyBuilder.build…serializedJson.toString()";
                } else {
                    Context applicationContext2 = context.getApplicationContext();
                    bbabc.m28049a((Object) applicationContext2, "context.applicationContext");
                    String packageName2 = applicationContext2.getPackageName();
                    bbabc.m28049a((Object) packageName2, "context.applicationContext.packageName");
                    aabab aabab2 = (aabab) aaacc2;
                    new abcbc(str3, "android", packageName2, "3.3.0", ConsentActivity.aaaaa.m27632c(context), str4, (Boolean) null, aabab2.mo63813b(), (String) null, aabab2.mo63814c().name(), (Integer[]) null, 1344, (bbabb) null);
                    str = abcbc.mo63888a().mo63884a().toString();
                    str2 = "requestBodyBuilder.build…serializedJson.toString()";
                }
                bbabc.m28049a((Object) str, str2);
            } else if (aaacc2 instanceof aabaa) {
                Context applicationContext3 = context.getApplicationContext();
                bbabc.m28049a((Object) applicationContext3, "context.applicationContext");
                String packageName3 = applicationContext3.getPackageName();
                bbabc.m28049a((Object) packageName3, "context.applicationContext.packageName");
                aabaa aabaa = (aabaa) aaacc2;
                str = new abcbc(str3, "android", packageName3, "3.3.0", ConsentActivity.aaaaa.m27632c(context), str4, Boolean.valueOf(aabaa.mo63810a()), (String) null, aabaa.mo63811b(), aabba.MANUAL.name(), (Integer[]) null, 1152, (bbabb) null).mo63888a().mo63884a().toString();
                bbabc.m28049a((Object) str, "requestBodyBuilder.build…serializedJson.toString()");
            } else {
                throw new babbb();
            }
            abccb.m27913a(c.mo63903b(str).mo63899a(this.f24266f).mo63909f());
            return babcc.f24512a;
        }
    }

    /* renamed from: a */
    public final void mo63820a(Context context, String str, String str2, aaacc aaacc, acabb acabb) {
        bbabc.m28052b(context, "context");
        bbabc.m28052b(str, "assetKey");
        bbabc.m28052b(str2, "consentToken");
        bbabc.m28052b(aaacc, "externalConsentData");
        bbabc.m28052b(acabb, "requestCallback");
        abbac abbac = abbac.f24317a;
        abbac.m27817a().mo63835a(new aaaab(this, aaacc, context, str, str2, new aaaaa(acabb)));
    }
}

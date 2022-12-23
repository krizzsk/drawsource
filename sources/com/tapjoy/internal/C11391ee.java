package com.tapjoy.internal;

import android.text.TextUtils;
import com.tapjoy.internal.C11372du;
import com.tapjoy.internal.C11385ea;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.ee */
public final class C11391ee extends C11383dz {
    public C11391ee(C11385ea.C11387b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void onPostExecute(String str) {
        C11351dd a;
        if (!TextUtils.isEmpty(str) && (a = C11351dd.m31050a()) != null) {
            for (T t : Collections.unmodifiableCollection(a.f27111a)) {
                if (this.f27179a.contains(t.f27082f)) {
                    C11372du duVar = t.f27079c;
                    if (this.f27181c >= duVar.f27145d) {
                        duVar.f27144c = C11372du.C11373a.f27148b;
                        C11356dh.m31057a().mo69807b(duVar.mo69822c(), str);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C11365do.m31087b(this.f27180b, this.f27190e.mo69834a())) {
            return null;
        }
        this.f27190e.mo69835a(this.f27180b);
        return this.f27180b.toString();
    }
}

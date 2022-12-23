package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2032q;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.g */
public class C2016g extends C1887a {

    /* renamed from: a */
    private static final long f3895a = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: c */
    private final AtomicLong f3896c = new AtomicLong();

    /* renamed from: d */
    private final C2012f f3897d;

    /* renamed from: e */
    private final C2102v f3898e;

    C2016g(C2012f fVar, C1969m mVar) {
        super("PersistentPostbackQueueSaveTask", mVar);
        this.f3898e = mVar.mo14509A();
        this.f3897d = fVar;
    }

    /* renamed from: a */
    private void m4732a(List<C2017h> list) {
        JSONArray jSONArray = new JSONArray();
        for (C2017h n : list) {
            try {
                jSONArray.put(n.mo14789n());
            } catch (Throwable th) {
                if (C2102v.m5104a()) {
                    this.f3898e.mo15013b("PersistentPostbackQueueSaveTask", "Unable to serialize postback request to JSON.", th);
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pb", jSONArray);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
            C2032q ab = this.f3496b.mo14552ab();
            ab.mo14854a((InputStream) byteArrayInputStream, ab.mo14847a("persistent_postback_cache.json", this.f3496b.mo14520L()));
            if (C2102v.m5104a()) {
                this.f3898e.mo15012b("PersistentPostbackQueueSaveTask", "Wrote updated postback queue to disk.");
            }
        } catch (Throwable th2) {
            if (C2102v.m5104a()) {
                this.f3898e.mo15013b("PersistentPostbackQueueSaveTask", "Failed to persist postbacks", th2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<C2017h> mo14771a(int i) {
        ArrayList<C2017h> arrayList = new ArrayList<>();
        try {
            C2032q ab = this.f3496b.mo14552ab();
            if (ab.mo14857b("persistent_postback_cache.json", this.f3496b.mo14520L())) {
                String a = ab.mo14851a(ab.mo14847a("persistent_postback_cache.json", this.f3496b.mo14520L()));
                if (StringUtils.isValidString(a)) {
                    JSONArray jSONArray = new JSONObject(a).getJSONArray("pb");
                    if (C2102v.m5104a()) {
                        C2102v vVar = this.f3898e;
                        vVar.mo15012b("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s).");
                    }
                    arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
                    int intValue = ((Integer) this.f3496b.mo14534a(C1867b.f3214cJ)).intValue();
                    for (int i2 = 0; i2 < jSONArray.length() && arrayList.size() < i; i2++) {
                        C2017h hVar = new C2017h(jSONArray.getJSONObject(i2), this.f3496b);
                        if (hVar.mo14786k() < intValue) {
                            arrayList.add(hVar);
                        } else if (C2102v.m5104a()) {
                            C2102v vVar2 = this.f3898e;
                            vVar2.mo15012b("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + hVar);
                        }
                    }
                    if (C2102v.m5104a()) {
                        C2102v vVar3 = this.f3898e;
                        vVar3.mo15012b("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
                    }
                }
            }
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                this.f3898e.mo15013b("PersistentPostbackQueueSaveTask", "Failed to deserialize postback queue", th);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14772a() {
        this.f3896c.set(System.currentTimeMillis());
        this.f3496b.mo14526S().mo14430a((C1887a) this, C1918o.C1920a.POSTBACKS, f3895a);
    }

    public void run() {
        if (this.f3897d.mo14763a() > this.f3896c.get()) {
            m4732a(this.f3897d.mo14767b());
        }
        mo14772a();
    }
}

package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.warren.model.ReportDBAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ap */
/* compiled from: LoadWithResponseWorker */
final class C5757ap extends C5769au<C5794bd> {

    /* renamed from: a */
    private final WeakReference<C5873cm> f14457a;

    /* renamed from: b */
    private byte[] f14458b;

    /* renamed from: c */
    private long f14459c;

    /* renamed from: d */
    private byte f14460d = 0;

    /* renamed from: e */
    private String f14461e = null;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo34372a(Object obj) {
        C5794bd bdVar = (C5794bd) obj;
        C5873cm cmVar = (C5873cm) this.f14457a.get();
        if (cmVar == null) {
            return;
        }
        if (bdVar == null) {
            if (this.f14460d != 0) {
                HashMap hashMap = new HashMap();
                hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Byte.valueOf(this.f14460d));
                hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, this.f14461e);
                cmVar.f14832a.mo34444b((Map<String, Object>) hashMap);
            }
            cmVar.f14832a.mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 0);
            return;
        }
        cmVar.f14832a.mo34452c(bdVar);
    }

    C5757ap(C5706af afVar, C5873cm cmVar, byte[] bArr, long j) {
        super(afVar, (byte) 3);
        this.f14457a = new WeakReference<>(cmVar);
        this.f14458b = bArr;
        this.f14459c = j;
    }

    /* renamed from: b */
    public final void mo34373b() {
        super.mo34373b();
        C5873cm cmVar = (C5873cm) this.f14457a.get();
        if (cmVar != null) {
            cmVar.f14832a.mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), true, (byte) 40);
        }
    }

    /* renamed from: a */
    public final void mo34371a() {
        C5873cm cmVar = (C5873cm) this.f14457a.get();
        if (cmVar == null) {
            mo34645b(null);
            return;
        }
        byte[] bArr = this.f14458b;
        C6157hb hbVar = new C6157hb();
        hbVar.mo35348a(bArr);
        try {
            JSONObject jSONObject = new JSONObject(new C5877cq((C5876cp) null, hbVar).f14846a.mo35350b());
            if (this.f14459c == jSONObject.getLong(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID)) {
                mo34645b(cmVar.f14832a.mo34488r().mo34770a(jSONObject));
                return;
            }
            C6195ic.m18378a((byte) 1, "InMobi", "Placement Id of Request and response doesn't match");
            this.f14460d = 46;
            throw new C5843bs(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), this.f14460d);
        } catch (C5843bs unused) {
            m17071c();
        } catch (JSONException e) {
            this.f14461e = e.getMessage();
            m17071c();
        }
    }

    /* renamed from: c */
    private void m17071c() {
        String str = C5706af.f14331a;
        this.f14460d = 1;
        mo34645b(null);
    }
}

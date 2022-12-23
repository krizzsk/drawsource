package com.inmobi.media;

import android.content.ContentValues;
import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.hm */
/* compiled from: TelemetryDao */
public class C6171hm extends C6137go {

    /* renamed from: a */
    private static final String f15583a = C6171hm.class.getSimpleName();

    public C6171hm() {
        C6164hh a = C6164hh.m18246a();
        a.mo35362a("telemetry", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)");
        a.mo35365b();
    }

    /* renamed from: a */
    public static void m18280a(C6172hn hnVar) {
        C6164hh a = C6164hh.m18246a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventType", hnVar.f15585b);
        contentValues.put("payload", hnVar.mo35380a());
        contentValues.put(CampaignEx.JSON_KEY_ST_TS, String.valueOf(hnVar.f15586c));
        a.mo35359a("telemetry", contentValues);
        a.mo35365b();
    }

    /* renamed from: a */
    public static List<C6172hn> m18279a(int i) {
        C6164hh a = C6164hh.m18246a();
        List<ContentValues> a2 = a.mo35360a("telemetry", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, "ts ASC", String.valueOf(i));
        ArrayList arrayList = new ArrayList();
        a.mo35365b();
        for (ContentValues a3 : a2) {
            arrayList.add(C6172hn.m18288a(a3));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo35316a(long j) {
        List<C6172hn> a = m18279a(1);
        if (a.size() <= 0 || TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - a.get(0).f15586c) < j) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo35317a(long j, long j2) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + j;
        List<C6172hn> a = m18279a(1);
        if (a.size() <= 0 || seconds - TimeUnit.MILLISECONDS.toSeconds(a.get(0).f15586c) <= j2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo35314a() {
        C6164hh a = C6164hh.m18246a();
        int a2 = a.mo35357a("telemetry");
        a.mo35365b();
        return a2;
    }

    /* renamed from: b */
    public final void mo35318b(long j) {
        C6164hh a = C6164hh.m18246a();
        a.mo35358a("telemetry", "ts<?", new String[]{String.valueOf(System.currentTimeMillis() - (j * 1000))});
        a.mo35365b();
    }

    /* renamed from: a */
    public final void mo35315a(List<Integer> list) {
        if (!list.isEmpty()) {
            C6164hh a = C6164hh.m18246a();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size() - 1; i++) {
                sb.append(list.get(i));
                sb.append(",");
            }
            sb.append(String.valueOf(list.get(list.size() - 1)));
            a.mo35358a("telemetry", "id IN (" + sb + ")", (String[]) null);
            a.mo35365b();
        }
    }

    /* renamed from: c */
    public final void mo35320c(long j) {
        Context c = C6183hw.m18324c();
        if (c != null) {
            C6165hi.m18257a(c, "batch_processing_info").mo35368a("telemetry_last_batch_process", j);
        }
    }

    /* renamed from: c */
    public final long mo35319c() {
        Context c = C6183hw.m18324c();
        if (c == null) {
            return -1;
        }
        return C6165hi.m18257a(c, "batch_processing_info").mo35371b("telemetry_last_batch_process", -1);
    }
}

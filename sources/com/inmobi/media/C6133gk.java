package com.inmobi.media;

import android.content.ContentValues;
import android.content.Context;
import com.google.android.gms.measurement.AppMeasurement;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.gk */
/* compiled from: CrashDao */
public class C6133gk extends C6137go {

    /* renamed from: a */
    private static final String f15450a = C6133gk.class.getSimpleName();

    public C6133gk() {
        C6164hh a = C6164hh.m18246a();
        a.mo35362a(AppMeasurement.CRASH_ORIGIN, "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)");
        a.mo35365b();
    }

    /* renamed from: a */
    public static void m18170a(C6134gl glVar) {
        C6164hh a = C6164hh.m18246a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventId", glVar.f15453b);
        contentValues.put("componentType", glVar.f15455d);
        contentValues.put("eventType", glVar.f15454c);
        contentValues.put("payload", glVar.mo35321a());
        contentValues.put(CampaignEx.JSON_KEY_ST_TS, String.valueOf(glVar.f15456e));
        a.mo35359a(AppMeasurement.CRASH_ORIGIN, contentValues);
        a.mo35365b();
    }

    /* renamed from: a */
    public static List<C6134gl> m18169a(int i) {
        C6164hh a = C6164hh.m18246a();
        List<ContentValues> a2 = a.mo35360a(AppMeasurement.CRASH_ORIGIN, (String[]) null, (String) null, (String[]) null, (String) null, (String) null, "ts ASC", String.valueOf(i));
        ArrayList arrayList = new ArrayList();
        a.mo35365b();
        for (ContentValues a3 : a2) {
            arrayList.add(C6134gl.m18179a(a3));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo35316a(long j) {
        List<C6134gl> a = m18169a(1);
        if (a.size() <= 0 || TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - a.get(0).f15456e) <= j) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo35317a(long j, long j2) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + j;
        List<C6134gl> a = m18169a(1);
        if (a.size() <= 0 || seconds - TimeUnit.MILLISECONDS.toSeconds(a.get(0).f15456e) < j2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo35314a() {
        C6164hh a = C6164hh.m18246a();
        int a2 = a.mo35357a(AppMeasurement.CRASH_ORIGIN);
        a.mo35365b();
        return a2;
    }

    /* renamed from: b */
    public final void mo35318b(long j) {
        C6164hh a = C6164hh.m18246a();
        a.mo35358a(AppMeasurement.CRASH_ORIGIN, "ts<?", new String[]{String.valueOf(System.currentTimeMillis() - (j * 1000))});
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
            a.mo35358a(AppMeasurement.CRASH_ORIGIN, "id IN (" + sb + ")", (String[]) null);
            a.mo35365b();
        }
    }

    /* renamed from: b */
    public static void m18171b() {
        C6164hh a = C6164hh.m18246a();
        List<ContentValues> a2 = a.mo35360a(AppMeasurement.CRASH_ORIGIN, (String[]) null, (String) null, (String[]) null, (String) null, (String) null, "ts ASC", "1");
        if (!a2.isEmpty()) {
            String asString = a2.get(0).getAsString("id");
            a.mo35358a(AppMeasurement.CRASH_ORIGIN, "id IN (" + asString + ")", (String[]) null);
        }
        a.mo35365b();
    }

    /* renamed from: c */
    public final void mo35320c(long j) {
        Context c = C6183hw.m18324c();
        if (c != null) {
            C6165hi.m18257a(c, "batch_processing_info").mo35368a("crash_last_batch_process", j);
        }
    }

    /* renamed from: c */
    public final long mo35319c() {
        Context c = C6183hw.m18324c();
        if (c != null) {
            return C6165hi.m18257a(c, "batch_processing_info").mo35371b("crash_last_batch_process", -1);
        }
        return -1;
    }
}

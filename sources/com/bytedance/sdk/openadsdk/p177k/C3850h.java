package com.bytedance.sdk.openadsdk.p177k;

import android.content.ContentValues;
import android.content.Context;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3947c;
import com.bytedance.sdk.openadsdk.multipro.p179a.C3909a;
import com.tapjoy.TapjoyConstants;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.k.h */
/* compiled from: TrackRetryRepertoryImpl */
public class C3850h implements C3849g {

    /* renamed from: a */
    private Context f9898a;

    public C3850h(Context context) {
        this.f9898a = context;
    }

    /* renamed from: a */
    public synchronized List<C3848f> mo20707a() {
        LinkedList linkedList;
        linkedList = new LinkedList();
        C3947c cVar = new C3947c(C3909a.m12910a(this.f9898a, "trackurl", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null));
        while (cVar.moveToNext()) {
            try {
                linkedList.add(new C3848f(cVar.getString(cVar.getColumnIndex("id")), cVar.getString(cVar.getColumnIndex("url")), cVar.getInt(cVar.getColumnIndex(TapjoyConstants.TJC_RETRY))));
            } finally {
                cVar.close();
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    public synchronized void mo20708a(C3848f fVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", fVar.mo20703a());
        contentValues.put("url", fVar.mo20705b());
        contentValues.put("replaceholder", 1);
        contentValues.put(TapjoyConstants.TJC_RETRY, Integer.valueOf(fVar.mo20706c()));
        C3909a.m12912a(this.f9898a, "trackurl", contentValues);
    }

    /* renamed from: b */
    public synchronized void mo20709b(C3848f fVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", fVar.mo20703a());
        contentValues.put("url", fVar.mo20705b());
        contentValues.put("replaceholder", 1);
        contentValues.put(TapjoyConstants.TJC_RETRY, Integer.valueOf(fVar.mo20706c()));
        C3909a.m12906a(this.f9898a, "trackurl", contentValues, "id=?", new String[]{fVar.mo20703a()});
    }

    /* renamed from: c */
    public synchronized void mo20710c(C3848f fVar) {
        C3909a.m12907a(this.f9898a, "trackurl", "id=?", new String[]{fVar.mo20703a()});
    }

    /* renamed from: b */
    public static String m12571b() {
        return "CREATE TABLE IF NOT EXISTS " + "trackurl" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "id" + " TEXT UNIQUE," + "url" + " TEXT ," + "replaceholder" + " INTEGER default 0, " + TapjoyConstants.TJC_RETRY + " INTEGER default 0" + ")";
    }
}

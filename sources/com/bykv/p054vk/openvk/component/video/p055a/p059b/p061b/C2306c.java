package com.bykv.p054vk.openvk.component.video.p055a.p059b.p061b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.sdk.component.p123f.C2886h;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.b.c */
/* compiled from: VideoProxyDB */
public class C2306c {

    /* renamed from: b */
    private static volatile C2306c f4642b;

    /* renamed from: a */
    private final SparseArray<Map<String, C2304a>> f4643a = new SparseArray<>(2);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2309d f4644c;

    /* renamed from: d */
    private final Executor f4645d = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new C2886h(5, "video_proxy_db"));
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile SQLiteStatement f4646e;

    private C2306c(Context context) {
        this.f4644c = new C2309d(context.getApplicationContext());
        this.f4643a.put(0, new ConcurrentHashMap());
        this.f4643a.put(1, new ConcurrentHashMap());
    }

    /* renamed from: a */
    public static C2306c m5297a(Context context) {
        if (f4642b == null) {
            synchronized (C2306c.class) {
                if (f4642b == null) {
                    f4642b = new C2306c(context);
                }
            }
        }
        return f4642b;
    }

    /* renamed from: a */
    public C2304a mo15728a(String str, int i) {
        C2304a aVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map map = this.f4643a.get(i);
        if (map == null) {
            aVar = null;
        } else {
            aVar = (C2304a) map.get(str);
        }
        if (aVar != null) {
            return aVar;
        }
        try {
            Cursor query = this.f4644c.getReadableDatabase().query("video_http_header_t", (String[]) null, "key=? AND flag=?", new String[]{str, String.valueOf(i)}, (String) null, (String) null, (String) null, "1");
            if (query != null) {
                if (query.getCount() > 0 && query.moveToNext()) {
                    aVar = new C2304a(query.getString(query.getColumnIndex(SDKConstants.PARAM_KEY)), query.getString(query.getColumnIndex("mime")), query.getInt(query.getColumnIndex("contentLength")), i, query.getString(query.getColumnIndex("extra")));
                }
                query.close();
            }
            if (!(aVar == null || map == null)) {
                map.put(str, aVar);
            }
            return aVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo15730a(final C2304a aVar) {
        if (aVar != null) {
            Map map = this.f4643a.get(aVar.f4640d);
            if (map != null) {
                map.put(aVar.f4637a, aVar);
            }
            this.f4645d.execute(new Runnable() {
                public void run() {
                    try {
                        if (C2306c.this.f4646e == null) {
                            SQLiteStatement unused = C2306c.this.f4646e = C2306c.this.f4644c.getWritableDatabase().compileStatement("INSERT INTO video_http_header_t (key,mime,contentLength,flag,extra) VALUES(?,?,?,?,?)");
                        } else {
                            C2306c.this.f4646e.clearBindings();
                        }
                        C2306c.this.f4646e.bindString(1, aVar.f4637a);
                        C2306c.this.f4646e.bindString(2, aVar.f4638b);
                        C2306c.this.f4646e.bindLong(3, (long) aVar.f4639c);
                        C2306c.this.f4646e.bindLong(4, (long) aVar.f4640d);
                        C2306c.this.f4646e.bindString(5, aVar.f4641e);
                        C2306c.this.f4646e.executeInsert();
                    } catch (Throwable unused2) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo15731a(Collection<String> collection, int i) {
        if (collection != null && !collection.isEmpty()) {
            int size = collection.size() + 1;
            String[] strArr = new String[size];
            int i2 = -1;
            Map map = this.f4643a.get(i);
            for (String next : collection) {
                if (map != null) {
                    map.remove(next);
                }
                i2++;
                strArr[i2] = next;
            }
            strArr[i2 + 1] = String.valueOf(i);
            try {
                SQLiteDatabase writableDatabase = this.f4644c.getWritableDatabase();
                writableDatabase.delete("video_http_header_t", "key IN(" + m5299b(size) + ") AND " + "flag" + "=?", strArr);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private String m5299b(int i) {
        if (i <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i << 1);
        sb.append("?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo15729a(final int i) {
        Map map = this.f4643a.get(i);
        if (map != null) {
            map.clear();
        }
        this.f4645d.execute(new Runnable() {
            public void run() {
                try {
                    C2306c.this.f4644c.getWritableDatabase().delete("video_http_header_t", "flag=?", new String[]{String.valueOf(i)});
                } catch (Throwable unused) {
                }
            }
        });
    }
}

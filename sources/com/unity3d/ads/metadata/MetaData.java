package com.unity3d.ads.metadata;

import android.content.Context;
import com.unity3d.services.core.device.C12025f;
import com.unity3d.services.core.device.C12027h;
import com.unity3d.services.core.device.C12028i;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12077g;
import com.unity3d.services.core.misc.C12080j;
import java.util.Iterator;
import org.json.JSONObject;

public class MetaData extends C12077g {
    private String _category;
    protected Context _context;

    public MetaData(Context context) {
        this._context = context.getApplicationContext();
    }

    private String getActualKey(String str) {
        if (getCategory() == null) {
            return str;
        }
        return getCategory() + "." + str;
    }

    private synchronized boolean set(String str, boolean z) {
        return set(str, (Object) Boolean.valueOf(z));
    }

    public void commit() {
        if (C12028i.m32766a(this._context)) {
            C12025f a = C12028i.m32764a(C12028i.C12029a.PUBLIC);
            if (getData() != null && a != null) {
                Iterator<String> keys = getData().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = get(next);
                    if (a.get(next) != null && (a.get(next) instanceof JSONObject) && (get(next) instanceof JSONObject)) {
                        try {
                            obj = C12080j.m32878a((JSONObject) obj, (JSONObject) a.get(next));
                        } catch (Exception e) {
                            C12065a.m32842a("Exception merging JSONs", e);
                        }
                    }
                    a.set(next, obj);
                }
                a.mo71169f();
                a.mo71163a(C12027h.SET, getData());
                return;
            }
            return;
        }
        C12065a.m32848c("Unity Ads could not commit metadata due to storage error");
    }

    public String getCategory() {
        return this._category;
    }

    public void setCategory(String str) {
        this._category = str;
    }

    /* access modifiers changed from: protected */
    public synchronized boolean setRaw(String str, Object obj) {
        initData();
        return super.set(getActualKey(str), obj);
    }

    private synchronized boolean set(String str, int i) {
        return set(str, (Object) Integer.valueOf(i));
    }

    private synchronized boolean set(String str, long j) {
        return set(str, (Object) Long.valueOf(j));
    }

    public synchronized boolean set(String str, Object obj) {
        boolean z;
        initData();
        z = false;
        if (super.set(getActualKey(str) + ".value", obj)) {
            if (super.set(getActualKey(str) + ".ts", Long.valueOf(System.currentTimeMillis()))) {
                z = true;
            }
        }
        return z;
    }
}

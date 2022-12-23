package com.unity3d.services.core.device;

import com.unity3d.services.core.device.C12028i;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12077g;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;
import java.io.File;
import java.io.FileNotFoundException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.device.f */
/* compiled from: Storage */
public class C12025f extends C12077g {

    /* renamed from: a */
    private String f29353a;

    /* renamed from: b */
    private C12028i.C12029a f29354b;

    public C12025f(String str, C12028i.C12029a aVar) {
        this.f29353a = str;
        this.f29354b = aVar;
    }

    /* renamed from: a */
    public synchronized boolean mo71164a() {
        clearData();
        return new File(this.f29353a).delete();
    }

    /* renamed from: b */
    public C12028i.C12029a mo71165b() {
        return this.f29354b;
    }

    /* renamed from: c */
    public synchronized boolean mo71166c() {
        mo71167d();
        super.initData();
        return true;
    }

    /* renamed from: d */
    public synchronized boolean mo71167d() {
        try {
            byte[] a = C12080j.m32882a(new File(this.f29353a));
            if (a == null) {
                return false;
            }
            setData(new JSONObject(new String(a)));
            return true;
        } catch (FileNotFoundException e) {
            C12065a.m32843a("Storage JSON file not found in local cache:", e);
            return false;
        } catch (Exception e2) {
            C12065a.m32843a("Failed to read storage JSON file:", e2);
            return false;
        }
    }

    /* renamed from: e */
    public synchronized boolean mo71168e() {
        return new File(this.f29353a).exists();
    }

    /* renamed from: f */
    public synchronized boolean mo71169f() {
        File file = new File(this.f29353a);
        if (getData() == null) {
            return false;
        }
        return C12080j.m32881a(file, getData().toString());
    }

    /* renamed from: a */
    public synchronized void mo71163a(C12027h hVar, Object obj) {
        boolean z = false;
        if (C12136a.m33103c() != null) {
            z = C12136a.m33103c().mo71310a((Enum) C12143b.STORAGE, (Enum) hVar, this.f29354b.name(), obj);
        }
        if (!z) {
            C12065a.m32845b("Couldn't send storage event to WebApp");
        }
    }
}

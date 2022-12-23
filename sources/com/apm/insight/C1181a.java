package com.apm.insight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.apm.insight.a */
public class C1181a {

    /* renamed from: a */
    private Map<CrashType, List<AttachUserData>> f948a = new HashMap();

    /* renamed from: b */
    private Map<CrashType, List<AttachUserData>> f949b = new HashMap();

    /* renamed from: c */
    private Map<String, String> f950c = new HashMap();

    /* renamed from: d */
    private ICrashFilter f951d = null;

    /* renamed from: c */
    private void m1287c(CrashType crashType, AttachUserData attachUserData) {
        List list;
        if (this.f948a.get(crashType) == null) {
            list = new ArrayList();
            this.f948a.put(crashType, list);
        } else {
            list = this.f948a.get(crashType);
        }
        list.add(attachUserData);
    }

    /* renamed from: d */
    private void m1288d(CrashType crashType, AttachUserData attachUserData) {
        List list;
        if (this.f949b.get(crashType) == null) {
            list = new ArrayList();
            this.f949b.put(crashType, list);
        } else {
            list = this.f949b.get(crashType);
        }
        list.add(attachUserData);
    }

    /* renamed from: e */
    private void m1289e(CrashType crashType, AttachUserData attachUserData) {
        List list = this.f948a.get(crashType);
        if (list != null) {
            list.remove(attachUserData);
        }
    }

    /* renamed from: f */
    private void m1290f(CrashType crashType, AttachUserData attachUserData) {
        List list = this.f949b.get(crashType);
        if (list != null) {
            list.remove(attachUserData);
        }
    }

    /* renamed from: a */
    public List<AttachUserData> mo12388a(CrashType crashType) {
        return this.f948a.get(crashType);
    }

    /* renamed from: a */
    public Map<String, String> mo12389a() {
        return this.f950c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12390a(AttachUserData attachUserData, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            m1287c(CrashType.LAUNCH, attachUserData);
            m1287c(CrashType.JAVA, attachUserData);
            m1287c(CrashType.CUSTOM_JAVA, attachUserData);
            m1287c(CrashType.NATIVE, attachUserData);
            m1287c(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        m1287c(crashType, attachUserData);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12391a(CrashType crashType, AttachUserData attachUserData) {
        if (crashType == CrashType.ALL) {
            m1289e(CrashType.LAUNCH, attachUserData);
            m1289e(CrashType.JAVA, attachUserData);
            m1289e(CrashType.CUSTOM_JAVA, attachUserData);
            m1289e(CrashType.NATIVE, attachUserData);
            m1289e(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        m1289e(crashType, attachUserData);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12392a(ICrashFilter iCrashFilter) {
        this.f951d = iCrashFilter;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12393a(Map<? extends String, ? extends String> map) {
        this.f950c.putAll(map);
    }

    /* renamed from: b */
    public ICrashFilter mo12394b() {
        return this.f951d;
    }

    /* renamed from: b */
    public List<AttachUserData> mo12395b(CrashType crashType) {
        return this.f949b.get(crashType);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12396b(AttachUserData attachUserData, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            m1288d(CrashType.LAUNCH, attachUserData);
            m1288d(CrashType.JAVA, attachUserData);
            m1288d(CrashType.CUSTOM_JAVA, attachUserData);
            m1288d(CrashType.NATIVE, attachUserData);
            m1288d(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        m1288d(crashType, attachUserData);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12397b(CrashType crashType, AttachUserData attachUserData) {
        if (crashType == CrashType.ALL) {
            m1290f(CrashType.LAUNCH, attachUserData);
            m1290f(CrashType.JAVA, attachUserData);
            m1290f(CrashType.CUSTOM_JAVA, attachUserData);
            m1290f(CrashType.NATIVE, attachUserData);
            m1290f(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        m1290f(crashType, attachUserData);
    }
}

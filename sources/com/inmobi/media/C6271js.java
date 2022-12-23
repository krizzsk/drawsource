package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import com.inmobi.unifiedId.InMobiUserDataTypes;
import java.util.HashMap;

/* renamed from: com.inmobi.media.js */
/* compiled from: HashedPII */
public final class C6271js {

    /* renamed from: a */
    private static InMobiUserDataModel f15793a;

    /* renamed from: a */
    public static synchronized void m18647a(InMobiUserDataModel inMobiUserDataModel) {
        synchronized (C6271js.class) {
            f15793a = inMobiUserDataModel;
        }
    }

    /* renamed from: a */
    public static InMobiUserDataTypes m18645a() {
        InMobiUserDataModel inMobiUserDataModel = f15793a;
        if (inMobiUserDataModel == null) {
            return null;
        }
        return m18646a(inMobiUserDataModel.getPhoneNumber());
    }

    /* renamed from: b */
    public static InMobiUserDataTypes m18648b() {
        InMobiUserDataModel inMobiUserDataModel = f15793a;
        if (inMobiUserDataModel == null) {
            return null;
        }
        return m18646a(inMobiUserDataModel.getEmailId());
    }

    /* renamed from: a */
    private static InMobiUserDataTypes m18646a(InMobiUserDataTypes inMobiUserDataTypes) {
        if (inMobiUserDataTypes == null) {
            return null;
        }
        if (inMobiUserDataTypes.getMd5() == null && inMobiUserDataTypes.getSha1() == null && inMobiUserDataTypes.getSha256() == null) {
            return null;
        }
        return inMobiUserDataTypes;
    }

    /* renamed from: c */
    public static HashMap<String, String> m18650c() {
        InMobiUserDataModel inMobiUserDataModel = f15793a;
        if (inMobiUserDataModel == null) {
            return null;
        }
        return inMobiUserDataModel.getExtras();
    }

    /* renamed from: b */
    public static boolean m18649b(InMobiUserDataModel inMobiUserDataModel) {
        InMobiUserDataModel inMobiUserDataModel2;
        if (inMobiUserDataModel == null && f15793a == null) {
            return true;
        }
        if (inMobiUserDataModel == null || (inMobiUserDataModel2 = f15793a) == null) {
            return false;
        }
        return inMobiUserDataModel.equals(inMobiUserDataModel2);
    }
}

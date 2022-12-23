package com.unity3d.services.store.gpbl;

/* renamed from: com.unity3d.services.store.gpbl.a */
/* compiled from: BillingResultResponseCode */
public enum C12175a {
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8);
    

    /* renamed from: n */
    private final int f29749n;

    private C12175a(int i) {
        this.f29749n = i;
    }

    /* renamed from: a */
    public int mo71369a() {
        return this.f29749n;
    }

    /* renamed from: a */
    public static C12175a m33179a(int i) {
        for (C12175a aVar : values()) {
            if (aVar.mo71369a() == i) {
                return aVar;
            }
        }
        return null;
    }
}

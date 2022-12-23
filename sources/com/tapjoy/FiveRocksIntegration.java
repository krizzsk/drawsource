package com.tapjoy;

import com.tapjoy.internal.C11278at;
import com.tapjoy.internal.C11537gv;
import com.tapjoy.internal.C11538gw;
import com.tapjoy.internal.C11540gy;
import com.tapjoy.internal.C11558hj;
import com.tapjoy.internal.C11560hk;

public class FiveRocksIntegration {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static C11278at<String, TJPlacement> f26449a = new C11278at<>();

    public static void addPlacementCallback(String str, TJPlacement tJPlacement) {
        synchronized (f26449a) {
            f26449a.put(str, tJPlacement);
        }
    }

    /* renamed from: a */
    public static void m30637a() {
        C11558hj a = C11558hj.m31644a();
        if (!a.f27742c) {
            a.f27742c = true;
        }
        C111821 r0 = new C11540gy() {
            /* renamed from: a */
            public final void mo69155a(String str) {
            }

            /* renamed from: d */
            public final void mo69160d(String str) {
            }

            /* renamed from: b */
            public final void mo69158b(String str) {
                TJPlacement tJPlacement;
                synchronized (FiveRocksIntegration.f26449a) {
                    tJPlacement = (TJPlacement) FiveRocksIntegration.f26449a.get(str);
                }
                if (tJPlacement != null && tJPlacement.f26670a != null) {
                    tJPlacement.f26670a.onContentReady(tJPlacement);
                }
            }

            /* renamed from: c */
            public final void mo69159c(String str) {
                TJPlacement tJPlacement;
                synchronized (FiveRocksIntegration.f26449a) {
                    tJPlacement = (TJPlacement) FiveRocksIntegration.f26449a.get(str);
                }
                if (tJPlacement != null && tJPlacement.f26670a != null) {
                    tJPlacement.f26670a.onContentShow(tJPlacement);
                }
            }

            /* renamed from: a */
            public final void mo69156a(String str, C11537gv gvVar) {
                if (gvVar != null) {
                    gvVar.mo70082a(m30639e(str));
                }
            }

            /* renamed from: a */
            public final void mo69157a(String str, String str2, C11537gv gvVar) {
                TJPlacement tJPlacement;
                if (gvVar != null) {
                    gvVar.mo70082a(m30639e(str));
                }
                synchronized (FiveRocksIntegration.f26449a) {
                    tJPlacement = (TJPlacement) FiveRocksIntegration.f26449a.get(str);
                }
                if (tJPlacement != null) {
                    TapjoyConnectCore.viewDidClose(str2);
                    if (tJPlacement.f26670a != null) {
                        tJPlacement.f26670a.onContentDismiss(tJPlacement);
                    }
                }
            }

            /* renamed from: e */
            private C11538gw m30639e(final String str) {
                return new C11538gw() {
                    /* renamed from: a */
                    public final void mo69161a(final String str, String str2) {
                        TJPlacement tJPlacement;
                        synchronized (FiveRocksIntegration.f26449a) {
                            tJPlacement = (TJPlacement) FiveRocksIntegration.f26449a.get(str);
                        }
                        if (tJPlacement != null && tJPlacement.f26670a != null) {
                            tJPlacement.f26670a.onPurchaseRequest(tJPlacement, new TJActionRequest() {
                                public final void cancelled() {
                                }

                                public final void completed() {
                                }

                                public final String getToken() {
                                    return null;
                                }

                                public final String getRequestId() {
                                    return str;
                                }
                            }, str2);
                        }
                    }

                    /* renamed from: a */
                    public final void mo69162a(final String str, String str2, int i, final String str3) {
                        TJPlacement tJPlacement;
                        synchronized (FiveRocksIntegration.f26449a) {
                            tJPlacement = (TJPlacement) FiveRocksIntegration.f26449a.get(str);
                        }
                        if (tJPlacement != null && tJPlacement.f26670a != null) {
                            tJPlacement.f26670a.onRewardRequest(tJPlacement, new TJActionRequest() {
                                public final void cancelled() {
                                }

                                public final void completed() {
                                }

                                public final String getRequestId() {
                                    return str;
                                }

                                public final String getToken() {
                                    return str3;
                                }
                            }, str2, i);
                        }
                    }
                };
            }
        };
        C11558hj.m31644a().f27754o = C11560hk.m31676a((C11540gy) r0);
    }
}

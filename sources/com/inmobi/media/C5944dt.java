package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okio.Utf8;
import org.json.JSONException;

/* renamed from: com.inmobi.media.dt */
/* compiled from: VastProcessor */
public class C5944dt {

    /* renamed from: b */
    private static final String f15063b = C5944dt.class.getSimpleName();

    /* renamed from: a */
    public ExecutorService f15064a;

    /* renamed from: c */
    private HashMap<String, List<WeakReference<C5948du>>> f15065c;

    /* renamed from: com.inmobi.media.dt$a */
    /* compiled from: VastProcessor */
    static final class C5947a {

        /* renamed from: a */
        static final C5944dt f15075a = new C5944dt((byte) 0);
    }

    /* synthetic */ C5944dt(byte b) {
        this();
    }

    /* renamed from: a */
    public static C5944dt m17659a() {
        return C5947a.f15075a;
    }

    private C5944dt() {
        this.f15064a = Executors.newCachedThreadPool(new C6194ib(f15063b));
        this.f15065c = new HashMap<>(2);
    }

    /* renamed from: a */
    private synchronized boolean m17662a(String str, C5948du duVar) {
        List list = this.f15065c.get(str);
        if (list != null) {
            list.add(new WeakReference(duVar));
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WeakReference(duVar));
        this.f15065c.put(str, arrayList);
        return true;
    }

    /* renamed from: a */
    private synchronized void m17660a(C5783aw awVar, boolean z, byte b) {
        List<WeakReference> remove = this.f15065c.remove(awVar.mo34676f());
        if (remove != null) {
            for (WeakReference weakReference : remove) {
                final C5948du duVar = (C5948du) weakReference.get();
                if (duVar != null) {
                    final C5783aw awVar2 = awVar;
                    final boolean z2 = z;
                    final byte b2 = b;
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            duVar.mo34415a(awVar2, z2, b2);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m17661a(C5944dt dtVar, C5783aw awVar, C6074ft ftVar, C5948du duVar) {
        try {
            if (dtVar.m17662a(awVar.mo34676f(), duVar)) {
                C5783aw a = C5789ba.m17193a(awVar, ftVar);
                if (a == null) {
                    dtVar.m17660a(awVar, false, (byte) 75);
                } else {
                    dtVar.m17660a(a, true, (byte) 0);
                }
            }
        } catch (JSONException unused) {
            dtVar.m17660a(awVar, false, (byte) 58);
        } catch (C5845bu e) {
            int i = e.f14700a;
            if (i == 100) {
                e.f14701b = 59;
            } else if (i == 101) {
                e.f14701b = 69;
            } else if (i == 201) {
                e.f14701b = 71;
            } else if (i == 405) {
                e.f14701b = 66;
            } else if (i == 900) {
                e.f14701b = 70;
            } else if (i == 600) {
                e.f14701b = 61;
            } else if (i == 601) {
                e.f14701b = Ascii.ETB;
            } else if (i == 603) {
                e.f14701b = 60;
            } else if (i != 604) {
                switch (i) {
                    case 300:
                        e.f14701b = Utf8.REPLACEMENT_BYTE;
                        break;
                    case ErrorCode.WRAPPER_REQUEST_TIMEOUT_ERROR /*301*/:
                        e.f14701b = 72;
                        break;
                    case 302:
                        e.f14701b = 73;
                        break;
                    case ErrorCode.NO_VAST_AFTER_WRAPPER_ERROR /*303*/:
                        e.f14701b = 74;
                        break;
                    default:
                        switch (i) {
                            case 400:
                                e.f14701b = 62;
                                break;
                            case 401:
                                e.f14701b = SignedBytes.MAX_POWER_OF_TWO;
                                break;
                            case 402:
                                e.f14701b = 65;
                                break;
                            case 403:
                                e.f14701b = 68;
                                break;
                            default:
                                e.f14701b = 0;
                                break;
                        }
                }
            } else {
                e.f14701b = 67;
            }
            dtVar.m17660a(awVar, false, e.f14701b);
        }
    }
}

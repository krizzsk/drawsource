package com.inmobi.media;

import com.inmobi.ads.viewsv2.NativeRecyclerViewAdapter;

/* renamed from: com.inmobi.media.fk */
/* compiled from: NativeScrollableDataSourceFactory */
final class C6034fk {
    /* renamed from: a */
    public static C6033fj m17944a(byte b, C5854ca caVar, C6016ff ffVar) {
        if (b == 0) {
            return new C6010fd(caVar, ffVar);
        }
        if (b != 1) {
            return null;
        }
        try {
            return new NativeRecyclerViewAdapter(caVar, ffVar);
        } catch (NoClassDefFoundError e) {
            C6195ic.m18378a((byte) 1, "InMobi", "Error rendering ad! RecyclerView not found. Please check if the recyclerview support library was included");
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            return null;
        }
    }
}

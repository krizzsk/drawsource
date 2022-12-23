package com.ironsource.mediationsdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.j */
public final class C6636j {

    /* renamed from: a */
    private ConcurrentHashMap<String, ArrayList<C6637a>> f17242a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private int f17243b;

    /* renamed from: com.ironsource.mediationsdk.j$a */
    public enum C6637a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public C6636j(List<String> list, int i) {
        this.f17243b = i;
        for (String put : list) {
            ArrayList arrayList = new ArrayList();
            this.f17242a.put(put, arrayList);
        }
    }

    /* renamed from: a */
    public final String mo36686a(String str) {
        ArrayList arrayList = this.f17242a.get(str);
        String str2 = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            StringBuilder sb = new StringBuilder();
            while (true) {
                sb.append(str2);
                sb.append(((C6637a) it.next()).ordinal());
                str2 = sb.toString();
                if (!it.hasNext()) {
                    break;
                }
                str2 = str2 + ",";
                sb = new StringBuilder();
            }
        }
        return str2;
    }

    /* renamed from: a */
    public final void mo36687a(ConcurrentHashMap<String, C6637a> concurrentHashMap) {
        if (this.f17243b != 0) {
            for (String next : this.f17242a.keySet()) {
                C6637a aVar = C6637a.ISAuctionPerformanceNotPartOfWaterfall;
                if (concurrentHashMap.containsKey(next)) {
                    aVar = concurrentHashMap.get(next);
                }
                ArrayList arrayList = this.f17242a.get(next);
                if (this.f17243b != -1 && arrayList.size() == this.f17243b) {
                    arrayList.remove(0);
                }
                arrayList.add(aVar);
            }
        }
    }
}

package com.inmobi.media;

import android.media.MediaMetadataRetriever;

/* renamed from: com.inmobi.media.cf */
/* compiled from: NativeTimer */
public final class C5862cf {

    /* renamed from: a */
    public C5863a f14787a;

    /* renamed from: b */
    public C5863a f14788b;

    public C5862cf(C5863a aVar, C5863a aVar2) {
        this.f14787a = aVar;
        this.f14788b = aVar2;
    }

    /* renamed from: com.inmobi.media.cf$a */
    /* compiled from: NativeTimer */
    public static class C5863a {

        /* renamed from: a */
        private long f14789a;

        /* renamed from: b */
        private long f14790b;

        /* renamed from: c */
        private String f14791c;

        /* renamed from: d */
        private C5854ca f14792d;

        public C5863a(long j, long j2, String str, C5854ca caVar) {
            this.f14789a = j;
            this.f14790b = j2;
            this.f14791c = str;
            this.f14792d = caVar;
        }

        /* renamed from: a */
        public final long mo34853a() {
            String b;
            long j = this.f14789a;
            C5847bw b2 = this.f14792d.mo34844b(this.f14791c);
            if ((b2 instanceof C5869cj) && (b = ((C5869cj) b2).mo34867b().mo35061b()) != null) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(b);
                j = (long) (((double) j) + (((((double) this.f14790b) * 1.0d) / 100.0d) * ((double) (((long) Integer.valueOf(mediaMetadataRetriever.extractMetadata(9)).intValue()) / 1000))));
                mediaMetadataRetriever.release();
            }
            if (j >= 0) {
                return j;
            }
            return 0;
        }
    }
}

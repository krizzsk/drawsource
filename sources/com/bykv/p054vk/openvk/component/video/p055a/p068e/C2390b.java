package com.bykv.p054vk.openvk.component.video.p055a.p068e;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2415c;
import java.util.HashMap;

/* renamed from: com.bykv.vk.openvk.component.video.a.e.b */
/* compiled from: MediaUtils */
public class C2390b {

    /* renamed from: com.bykv.vk.openvk.component.video.a.e.b$b */
    /* compiled from: MediaUtils */
    public interface C2392b {
        /* renamed from: a */
        void mo15912a(Bitmap bitmap);
    }

    /* renamed from: a */
    public static void m5613a(long j, String str, C2392b bVar) {
        new C2391a(bVar, j).execute(new String[]{str});
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.e.b$a */
    /* compiled from: MediaUtils */
    public static class C2391a extends AsyncTask<String, Integer, Bitmap> {

        /* renamed from: a */
        private C2392b f4862a;

        /* renamed from: b */
        private long f4863b = 0;

        public C2391a(C2392b bVar, long j) {
            this.f4862a = bVar;
            this.f4863b = j;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                String str = strArr[0];
                if (str.startsWith("http")) {
                    mediaMetadataRetriever.setDataSource(str, new HashMap());
                } else {
                    mediaMetadataRetriever.setDataSource(str);
                }
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(this.f4863b * 1000, 3);
                mediaMetadataRetriever.release();
                return frameAtTime;
            } catch (Throwable th) {
                C2415c.m5836c("MediaUtils", "MediaUtils doInBackground : ", th);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            C2392b bVar = this.f4862a;
            if (bVar != null) {
                bVar.mo15912a(bitmap);
            }
        }
    }
}

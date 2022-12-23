package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* renamed from: com.inmobi.media.fn */
/* compiled from: NativeVideoWrapper */
public class C6051fn extends RelativeLayout {

    /* renamed from: a */
    private static final String f15346a = C6051fn.class.getSimpleName();

    /* renamed from: b */
    private C6038fm f15347b = new C6038fm(getContext());

    /* renamed from: c */
    private ImageView f15348c;

    /* renamed from: d */
    private ProgressBar f15349d;

    public C6051fn(Context context) {
        super(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.f15347b, layoutParams);
        ImageView imageView = new ImageView(getContext());
        this.f15348c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f15348c.setVisibility(8);
        addView(this.f15348c, layoutParams);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f15349d = progressBar;
        progressBar.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        addView(this.f15349d, layoutParams2);
        C6035fl flVar = new C6035fl(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(13);
        this.f15347b.setMediaController(flVar);
        addView(flVar, layoutParams3);
    }

    /* renamed from: a */
    public final void mo35254a() {
        RelativeLayout.LayoutParams layoutParams;
        double d;
        double d2;
        C5869cj cjVar = (C5869cj) this.f15347b.getTag();
        if (cjVar != null) {
            try {
                String b = cjVar.mo34867b().mo35061b();
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(b);
                int intValue = Integer.valueOf(mediaMetadataRetriever.extractMetadata(18)).intValue();
                int intValue2 = Integer.valueOf(mediaMetadataRetriever.extractMetadata(19)).intValue();
                mediaMetadataRetriever.release();
                Point point = cjVar.f14705c.f14728a;
                double d3 = (double) intValue;
                double d4 = (double) intValue2;
                if (((double) C6052fo.m18017c(point.x)) / ((double) C6052fo.m18017c(point.y)) > d3 / d4) {
                    d2 = d3 * ((((double) C6052fo.m18017c(point.y)) * 1.0d) / d4);
                    d = (double) C6052fo.m18017c(point.y);
                } else {
                    double c = (double) C6052fo.m18017c(point.x);
                    d = d4 * ((((double) C6052fo.m18017c(point.x)) * 1.0d) / d3);
                    d2 = c;
                }
                layoutParams = new RelativeLayout.LayoutParams((int) d2, (int) d);
            } catch (Exception e) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                C6130gj.m18161a().mo35310a(new C6167hk(e));
                layoutParams = layoutParams2;
            }
            layoutParams.addRule(13);
            this.f15347b.setLayoutParams(layoutParams);
        }
    }

    public void setPosterImage(Bitmap bitmap) {
        this.f15348c.setImageBitmap(bitmap);
    }

    public C6038fm getVideoView() {
        return this.f15347b;
    }

    public ImageView getPoster() {
        return this.f15348c;
    }

    public ProgressBar getProgressBar() {
        return this.f15349d;
    }
}

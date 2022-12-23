package com.inmobi.media;

import android.view.MotionEvent;
import org.json.JSONArray;

/* renamed from: com.inmobi.media.z */
/* compiled from: MovementGestureDetector */
public class C6328z {

    /* renamed from: a */
    public float f16008a;

    /* renamed from: b */
    public float f16009b;

    /* renamed from: c */
    public float f16010c;

    /* renamed from: d */
    public float f16011d;

    /* renamed from: e */
    public int f16012e;

    /* renamed from: f */
    public int f16013f;

    /* renamed from: g */
    public float f16014g;

    /* renamed from: h */
    public JSONArray f16015h;

    /* renamed from: i */
    public MotionEvent f16016i;

    /* renamed from: j */
    public int f16017j = Integer.MAX_VALUE;

    /* renamed from: k */
    public final C6329a f16018k;

    /* renamed from: l */
    private final String f16019l = C6328z.class.getSimpleName();

    /* renamed from: com.inmobi.media.z$a */
    /* compiled from: MovementGestureDetector */
    public interface C6329a {
        /* renamed from: a */
        void mo35574a(MotionEvent motionEvent);

        /* renamed from: a */
        void mo35575a(MotionEvent motionEvent, MotionEvent motionEvent2);

        /* renamed from: a */
        void mo35577a(C6328z zVar);
    }

    public C6328z(C6329a aVar) {
        this.f16018k = aVar;
        this.f16012e = -1;
        this.f16013f = -1;
    }

    /* renamed from: a */
    public static int m18948a(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (int) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    /* renamed from: a */
    public static float m18947a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float degrees = ((float) Math.toDegrees((double) (((float) Math.atan2((double) (f2 - f4), (double) (f - f3))) - ((float) Math.atan2((double) (f6 - f8), (double) (f5 - f7)))))) % 360.0f;
        if (degrees < -180.0f) {
            degrees += 360.0f;
        }
        return degrees > 180.0f ? degrees - 360.0f : degrees;
    }
}

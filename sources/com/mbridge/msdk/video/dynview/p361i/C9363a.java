package com.mbridge.msdk.video.dynview.p361i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;

/* renamed from: com.mbridge.msdk.video.dynview.i.a */
/* compiled from: BlurUtil */
public class C9363a {

    /* renamed from: a */
    private static volatile C9363a f22994a;

    /* renamed from: a */
    public static C9363a m26695a() {
        if (f22994a == null) {
            synchronized (C9363a.class) {
                if (f22994a == null) {
                    f22994a = new C9363a();
                }
            }
        }
        return f22994a;
    }

    /* renamed from: a */
    public final Bitmap mo62878a(Bitmap bitmap, int i) {
        try {
            if (Build.VERSION.SDK_INT < 17) {
                return m26694a(i);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript create = RenderScript.create(C8388a.m23845e().mo56913g());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(18.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Bitmap m26694a(int i) {
        Bitmap bitmap = null;
        try {
            bitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_4444);
            if (i == 1) {
                bitmap.eraseColor(Color.parseColor("#FF0000"));
            } else {
                bitmap.eraseColor(Color.parseColor("#FFFFFF"));
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return bitmap;
    }
}

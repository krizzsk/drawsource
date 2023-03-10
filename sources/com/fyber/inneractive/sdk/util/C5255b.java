package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.renderscript.RSRuntimeException;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Array;

/* renamed from: com.fyber.inneractive.sdk.util.b */
public class C5255b {
    /* renamed from: a */
    public static Bitmap m16456a(Context context, Bitmap bitmap, C5259c cVar) {
        boolean z;
        Bitmap bitmap2;
        int i = cVar.f13951a;
        int i2 = cVar.f13954d;
        int i3 = i / i2;
        int i4 = cVar.f13952b / i2;
        int[] iArr = {i3, i4};
        int i5 = 0;
        while (true) {
            if (i5 >= 2) {
                z = false;
                break;
            } else if (iArr[i5] == 0) {
                z = true;
                break;
            } else {
                i5++;
            }
        }
        if (z) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = 1.0f / ((float) cVar.f13954d);
        canvas.scale(f, f);
        Paint paint = new Paint();
        paint.setFlags(3);
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                bitmap2 = m16455a(context, createBitmap, cVar.f13953c);
            } catch (RSRuntimeException unused) {
                bitmap2 = m16457a(createBitmap, cVar.f13953c, true);
            }
        } else {
            bitmap2 = m16457a(createBitmap, cVar.f13953c, true);
        }
        if (cVar.f13954d == 1) {
            return bitmap2;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, cVar.f13951a, cVar.f13952b, true);
        bitmap2.recycle();
        return createScaledBitmap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.renderscript.RenderScript} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m16455a(android.content.Context r5, android.graphics.Bitmap r6, int r7) throws android.renderscript.RSRuntimeException {
        /*
            r0 = 0
            android.renderscript.RenderScript r5 = android.renderscript.RenderScript.create(r5)     // Catch:{ all -> 0x004c }
            android.renderscript.RenderScript$RSMessageHandler r1 = new android.renderscript.RenderScript$RSMessageHandler     // Catch:{ all -> 0x0046 }
            r1.<init>()     // Catch:{ all -> 0x0046 }
            r5.setMessageHandler(r1)     // Catch:{ all -> 0x0046 }
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch:{ all -> 0x0046 }
            r2 = 1
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r5, r6, r1, r2)     // Catch:{ all -> 0x0046 }
            android.renderscript.Type r2 = r1.getType()     // Catch:{ all -> 0x0043 }
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r5, r2)     // Catch:{ all -> 0x0043 }
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r5)     // Catch:{ all -> 0x003e }
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r5, r3)     // Catch:{ all -> 0x003e }
            r0.setInput(r1)     // Catch:{ all -> 0x003e }
            float r7 = (float) r7     // Catch:{ all -> 0x003e }
            r0.setRadius(r7)     // Catch:{ all -> 0x003e }
            r0.forEach(r2)     // Catch:{ all -> 0x003e }
            r2.copyTo(r6)     // Catch:{ all -> 0x003e }
            r5.destroy()
            r1.destroy()
            r2.destroy()
            r0.destroy()
            return r6
        L_0x003e:
            r6 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x0050
        L_0x0043:
            r6 = move-exception
            r2 = r0
            goto L_0x0049
        L_0x0046:
            r6 = move-exception
            r1 = r0
            r2 = r1
        L_0x0049:
            r0 = r5
            r5 = r2
            goto L_0x0050
        L_0x004c:
            r6 = move-exception
            r5 = r0
            r1 = r5
            r2 = r1
        L_0x0050:
            if (r0 == 0) goto L_0x0055
            r0.destroy()
        L_0x0055:
            if (r1 == 0) goto L_0x005a
            r1.destroy()
        L_0x005a:
            if (r2 == 0) goto L_0x005f
            r2.destroy()
        L_0x005f:
            if (r5 == 0) goto L_0x0064
            r5.destroy()
        L_0x0064:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C5255b.m16455a(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public static Bitmap m16457a(Bitmap bitmap, int i, boolean z) {
        Bitmap bitmap2;
        int[] iArr;
        int i2 = i;
        if (z) {
            bitmap2 = bitmap;
        } else {
            bitmap2 = bitmap.copy(bitmap.getConfig(), true);
        }
        if (i2 < 1) {
            return null;
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        bitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int i7 = (i6 + 1) >> 1;
        int i8 = i7 * i7;
        int i9 = i8 * 256;
        int[] iArr7 = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr7[i10] = i10 / i8;
        }
        int[] iArr8 = new int[2];
        iArr8[1] = 3;
        iArr8[0] = i6;
        int[][] iArr9 = (int[][]) Array.newInstance(int.class, iArr8);
        int i11 = i2 + 1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < height) {
            Bitmap bitmap3 = bitmap2;
            int i15 = height;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = -i2;
            int i25 = 0;
            while (i24 <= i2) {
                int i26 = i5;
                int[] iArr10 = iArr6;
                int i27 = iArr2[i13 + Math.min(i4, Math.max(i24, 0))];
                int[] iArr11 = iArr9[i24 + i2];
                iArr11[0] = (i27 & 16711680) >> 16;
                iArr11[1] = (i27 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr11[2] = i27 & 255;
                int abs = i11 - Math.abs(i24);
                i17 += iArr11[0] * abs;
                i16 += iArr11[1] * abs;
                i25 += iArr11[2] * abs;
                if (i24 > 0) {
                    i23 += iArr11[0];
                    i22 += iArr11[1];
                    i21 += iArr11[2];
                } else {
                    i20 += iArr11[0];
                    i19 += iArr11[1];
                    i18 += iArr11[2];
                }
                i24++;
                i5 = i26;
                iArr6 = iArr10;
            }
            int i28 = i5;
            int[] iArr12 = iArr6;
            int i29 = i2;
            int i30 = i25;
            int i31 = 0;
            while (i31 < width) {
                iArr3[i13] = iArr7[i17];
                iArr4[i13] = iArr7[i16];
                iArr5[i13] = iArr7[i30];
                int i32 = i17 - i20;
                int i33 = i16 - i19;
                int i34 = i30 - i18;
                int[] iArr13 = iArr9[((i29 - i2) + i6) % i6];
                int i35 = i20 - iArr13[0];
                int i36 = i19 - iArr13[1];
                int i37 = i18 - iArr13[2];
                if (i12 == 0) {
                    iArr = iArr7;
                    iArr12[i31] = Math.min(i31 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i38 = iArr2[i14 + iArr12[i31]];
                iArr13[0] = (i38 & 16711680) >> 16;
                iArr13[1] = (i38 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr13[2] = i38 & 255;
                int i39 = i23 + iArr13[0];
                int i40 = i22 + iArr13[1];
                int i41 = i21 + iArr13[2];
                i17 = i32 + i39;
                i16 = i33 + i40;
                i30 = i34 + i41;
                i29 = (i29 + 1) % i6;
                int[] iArr14 = iArr9[i29 % i6];
                i20 = i35 + iArr14[0];
                i19 = i36 + iArr14[1];
                i18 = i37 + iArr14[2];
                i23 = i39 - iArr14[0];
                i22 = i40 - iArr14[1];
                i21 = i41 - iArr14[2];
                i13++;
                i31++;
                iArr7 = iArr;
            }
            int[] iArr15 = iArr7;
            i14 += width;
            i12++;
            bitmap2 = bitmap3;
            height = i15;
            i5 = i28;
            iArr6 = iArr12;
        }
        Bitmap bitmap4 = bitmap2;
        int i42 = i5;
        int[] iArr16 = iArr6;
        int i43 = height;
        int[] iArr17 = iArr7;
        int i44 = 0;
        while (i44 < width) {
            int i45 = -i2;
            int i46 = i6;
            int[] iArr18 = iArr2;
            int i47 = 0;
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = i45;
            int i55 = i45 * width;
            int i56 = 0;
            int i57 = 0;
            while (i54 <= i2) {
                int i58 = width;
                int max = Math.max(0, i55) + i44;
                int[] iArr19 = iArr9[i54 + i2];
                iArr19[0] = iArr3[max];
                iArr19[1] = iArr4[max];
                iArr19[2] = iArr5[max];
                int abs2 = i11 - Math.abs(i54);
                i47 += iArr3[max] * abs2;
                i57 += iArr4[max] * abs2;
                i56 += iArr5[max] * abs2;
                if (i54 > 0) {
                    i51 += iArr19[0];
                    i52 += iArr19[1];
                    i53 += iArr19[2];
                } else {
                    i50 += iArr19[0];
                    i49 += iArr19[1];
                    i48 += iArr19[2];
                }
                int i59 = i42;
                if (i54 < i59) {
                    i55 += i58;
                }
                i54++;
                i42 = i59;
                width = i58;
            }
            int i60 = width;
            int i61 = i42;
            int i62 = i2;
            int i63 = i44;
            int i64 = i57;
            int i65 = i43;
            int i66 = i56;
            int i67 = 0;
            while (i67 < i65) {
                iArr18[i63] = (iArr18[i63] & ViewCompat.MEASURED_STATE_MASK) | (iArr17[i47] << 16) | (iArr17[i64] << 8) | iArr17[i66];
                int i68 = i47 - i50;
                int i69 = i64 - i49;
                int i70 = i66 - i48;
                int[] iArr20 = iArr9[((i62 - i2) + i46) % i46];
                int i71 = i50 - iArr20[0];
                int i72 = i49 - iArr20[1];
                int i73 = i48 - iArr20[2];
                if (i44 == 0) {
                    iArr16[i67] = Math.min(i67 + i11, i61) * i60;
                }
                int i74 = iArr16[i67] + i44;
                iArr20[0] = iArr3[i74];
                iArr20[1] = iArr4[i74];
                iArr20[2] = iArr5[i74];
                int i75 = i51 + iArr20[0];
                int i76 = i52 + iArr20[1];
                int i77 = i53 + iArr20[2];
                i47 = i68 + i75;
                i64 = i69 + i76;
                i66 = i70 + i77;
                i62 = (i62 + 1) % i46;
                int[] iArr21 = iArr9[i62];
                i50 = i71 + iArr21[0];
                i49 = i72 + iArr21[1];
                i48 = i73 + iArr21[2];
                i51 = i75 - iArr21[0];
                i52 = i76 - iArr21[1];
                i53 = i77 - iArr21[2];
                i63 += i60;
                i67++;
                i2 = i;
            }
            i44++;
            i2 = i;
            i42 = i61;
            i43 = i65;
            i6 = i46;
            iArr2 = iArr18;
            width = i60;
        }
        int i78 = width;
        bitmap4.setPixels(iArr2, 0, i78, 0, 0, i78, i43);
        return bitmap4;
    }
}

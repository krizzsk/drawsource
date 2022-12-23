package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class MBRoundRectImageViewC extends MBImageView {

    /* renamed from: a */
    private Paint f18130a = new Paint();

    public MBRoundRectImageViewC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            int width = getWidth();
            int height = getHeight();
            Matrix matrix = new Matrix();
            matrix.postScale(((float) width) / ((float) bitmap.getWidth()), ((float) height) / ((float) bitmap.getHeight()));
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            BitmapShader bitmapShader = new BitmapShader(createBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap.getWidth(), createBitmap.getHeight(), Bitmap.Config.ARGB_4444);
            Canvas canvas2 = new Canvas(createBitmap2);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShader(bitmapShader);
            RectF rectF = new RectF(0.0f, 0.0f, (float) createBitmap.getWidth(), (float) createBitmap.getHeight());
            float f = (float) 30;
            canvas2.drawRoundRect(rectF, f, f, paint);
            Rect rect = new Rect(0, 0, createBitmap2.getWidth(), createBitmap2.getHeight());
            this.f18130a.reset();
            canvas.drawBitmap(createBitmap2, rect, rect, this.f18130a);
            return;
        }
        super.onDraw(canvas);
    }
}

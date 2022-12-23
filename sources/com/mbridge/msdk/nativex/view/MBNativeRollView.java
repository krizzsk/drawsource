package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;

public class MBNativeRollView extends LinearLayout {

    /* renamed from: a */
    private RollingBCView f22022a;

    /* renamed from: b */
    private Context f22023b;

    /* renamed from: c */
    private NativeListener.FilpListener f22024c;

    /* renamed from: com.mbridge.msdk.nativex.view.MBNativeRollView$a */
    public interface C8926a {
        /* renamed from: a */
        View mo58780a(Frame frame, int i);
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        if (filpListener != null) {
            this.f22024c = filpListener;
            this.f22022a.setFilpListening(filpListener);
        }
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22023b = context;
        RollingBCView rollingBCView = new RollingBCView(context);
        this.f22022a = rollingBCView;
        addView(rollingBCView);
        this.f22022a.setLayoutParams(new LinearLayout.LayoutParams((int) (((double) C8677z.m24942f(context)) * 0.9d), -2));
        setClipChildren(false);
    }

    public MBNativeRollView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setData(List<Frame> list, Context context, String str, C8926a aVar) {
        this.f22022a.setData(list, context, str, aVar);
    }

    public void setFrameWidth(int i) {
        this.f22022a.setLayoutParams(new LinearLayout.LayoutParams(i, -2));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f22022a.dispatchTouchEvent(motionEvent);
    }
}

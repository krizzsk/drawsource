package com.mbridge.msdk.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.InputDeviceCompat;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;

public class MBFeedBackDialog extends Dialog {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C9682a f24121a;

    /* renamed from: b */
    private TextView f24122b;

    /* renamed from: c */
    private LinearLayout f24123c;

    /* renamed from: d */
    private Button f24124d;

    /* renamed from: e */
    private Button f24125e;

    /* renamed from: f */
    private int f24126f;

    /* renamed from: g */
    private int f24127g;

    public MBFeedBackDialog(Context context, C9682a aVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View inflate = LayoutInflater.from(context).inflate(C8658p.m24799a(context, "mbridge_cm_feedbackview", "layout"), (ViewGroup) null);
        setDialogWidthAndHeight(0.5f, 0.8f);
        this.f24121a = aVar;
        if (inflate != null) {
            setContentView(inflate);
            try {
                this.f24122b = (TextView) inflate.findViewById(C8658p.m24799a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e) {
                C8672v.m24874a("MBAlertDialog", e.getMessage());
            }
            try {
                this.f24123c = (LinearLayout) inflate.findViewById(C8658p.m24799a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.f24124d = (Button) inflate.findViewById(C8658p.m24799a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.f24125e = (Button) inflate.findViewById(C8658p.m24799a(context, "mbridge_video_common_alertview_cancel_button", "id"));
            } catch (Exception e2) {
                C8672v.m24874a("MBAlertDialog", e2.getMessage());
            }
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        Button button = this.f24125e;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBFeedBackDialog.this.f24121a != null) {
                        MBFeedBackDialog.this.f24121a.mo16409a();
                    }
                    MBFeedBackDialog.this.dismiss();
                }
            });
        }
        Button button2 = this.f24124d;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBFeedBackDialog.this.f24121a != null) {
                        MBFeedBackDialog.this.f24121a.mo16410b();
                    }
                    MBFeedBackDialog.this.dismiss();
                }
            });
        }
        setOnCancelListener(new DialogInterface.OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                if (MBFeedBackDialog.this.f24121a != null) {
                    MBFeedBackDialog.this.f24121a.mo16410b();
                }
            }
        });
    }

    public void setCancelButtonClickable(boolean z) {
        Button button = this.f24125e;
        if (button != null) {
            button.setClickable(z);
        }
    }

    public void clear() {
        if (this.f24121a != null) {
            this.f24121a = null;
        }
    }

    public C9682a getListener() {
        return this.f24121a;
    }

    public void setListener(C9682a aVar) {
        this.f24121a = aVar;
    }

    public void setTitle(String str) {
        TextView textView = this.f24122b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setContent(ViewGroup viewGroup) {
        LinearLayout linearLayout = this.f24123c;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewGroup);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.leftMargin = C8677z.m24924b(C8388a.m23845e().mo56913g(), 38.0f);
            layoutParams.rightMargin = C8677z.m24924b(C8388a.m23845e().mo56913g(), 38.0f);
            layoutParams.topMargin = C8677z.m24924b(C8388a.m23845e().mo56913g(), 20.0f);
            layoutParams.bottomMargin = C8677z.m24924b(C8388a.m23845e().mo56913g(), 24.0f);
            this.f24123c.addView(viewGroup, layoutParams);
        }
    }

    public void setConfirmText(String str) {
        Button button = this.f24124d;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setCancelText(String str) {
        Button button = this.f24125e;
        if (button != null) {
            button.setText(str);
        }
    }

    public void show() {
        super.show();
        try {
            getWindow().setFlags(8, 8);
            super.show();
            hideNavigationBar(getWindow());
            getWindow().clearFlags(8);
        } catch (Exception e) {
            C8672v.m24878d("MBAlertDialog", e.getMessage());
            super.show();
        }
    }

    public void hideNavigationBar(Window window) {
        if (window != null) {
            window.setFlags(1024, 1024);
            if (Build.VERSION.SDK_INT >= 19) {
                window.addFlags(67108864);
                window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            } else {
                window.getDecorView().setSystemUiVisibility(2);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }

    public void setDialogWidthAndHeight(float f, float f2) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        if (isScreenOrientationPortrait(getContext())) {
            this.f24127g = displayMetrics.widthPixels;
            this.f24126f = displayMetrics.heightPixels;
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = (int) (((float) this.f24126f) * f2);
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            return;
        }
        this.f24127g = displayMetrics.heightPixels;
        this.f24126f = displayMetrics.widthPixels;
        WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
        attributes2.width = (int) (((float) this.f24126f) * f);
        attributes2.height = -1;
        attributes2.gravity = 17;
        getWindow().setAttributes(attributes2);
    }

    public static boolean isScreenOrientationPortrait(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }
}

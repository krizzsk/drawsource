package com.mbridge.msdk.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.InputDeviceCompat;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.tools.C8614ab;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import java.util.Locale;

public class MBAlertDialog extends Dialog {

    /* renamed from: a */
    private C9682a f24112a;

    /* renamed from: b */
    private TextView f24113b;

    /* renamed from: c */
    private TextView f24114c;

    /* renamed from: d */
    private Button f24115d;

    /* renamed from: e */
    private Button f24116e;

    public MBAlertDialog(Context context, final C9682a aVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View inflate = LayoutInflater.from(context).inflate(C8658p.m24799a(context, "mbridge_cm_alertview", "layout"), (ViewGroup) null);
        this.f24112a = aVar;
        if (inflate != null) {
            setContentView(inflate);
            try {
                this.f24113b = (TextView) inflate.findViewById(C8658p.m24799a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e) {
                C8672v.m24874a("MBAlertDialog", e.getMessage());
            }
            try {
                this.f24114c = (TextView) inflate.findViewById(C8658p.m24799a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.f24115d = (Button) inflate.findViewById(C8658p.m24799a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.f24116e = (Button) inflate.findViewById(C8658p.m24799a(context, "mbridge_video_common_alertview_cancel_button", "id"));
            } catch (Exception e2) {
                C8672v.m24874a("MBAlertDialog", e2.getMessage());
            }
        }
        Button button = this.f24116e;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C9682a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo16409a();
                    }
                    MBAlertDialog.this.cancel();
                    MBAlertDialog.this.clear();
                }
            });
        }
        Button button2 = this.f24115d;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C9682a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo16410b();
                    }
                    MBAlertDialog.this.cancel();
                    MBAlertDialog.this.clear();
                }
            });
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    public void clear() {
        if (this.f24112a != null) {
            this.f24112a = null;
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f24113b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setContent(String str) {
        TextView textView = this.f24114c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setConfirmText(String str) {
        Button button = this.f24115d;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setCancelText(String str) {
        Button button = this.f24116e;
        if (button != null) {
            button.setText(str);
        }
    }

    /* renamed from: a */
    private void m27618a(String str, String str2, String str3, String str4) {
        setTitle(str);
        setContent(str2);
        setConfirmText(str3);
        setCancelText(str4);
    }

    public void makeRVAlertView(String str) {
        String str2 = str;
        try {
            Context context = getContext();
            String obj = C8614ab.m24713b(context, "MBridge_ConfirmTitle" + str2, "").toString();
            Context context2 = getContext();
            String obj2 = C8614ab.m24713b(context2, "MBridge_ConfirmContent" + str2, "").toString();
            Context context3 = getContext();
            String obj3 = C8614ab.m24713b(context3, "MBridge_CancelText" + str2, "").toString();
            Context context4 = getContext();
            String obj4 = C8614ab.m24713b(context4, "MBridge_ConfirmText" + str2, "").toString();
            C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
            if (TextUtils.isEmpty(obj)) {
                if (TextUtils.isEmpty(obj2) && TextUtils.isEmpty(obj3) && TextUtils.isEmpty(obj4)) {
                    if (b != null) {
                        m27618a(b.mo16169X(), b.mo16170Y(), b.mo16171Z(), b.mo16183aa());
                        return;
                    }
                    String language = Locale.getDefault().getLanguage();
                    if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                        setTitle("Confirm to close? ");
                        setContent("You will not be rewarded after closing the window");
                        setConfirmText("Close it");
                        setCancelText("Continue");
                        return;
                    }
                    setTitle("确认关闭？");
                    setContent("关闭后您将不会获得任何奖励噢~ ");
                    setConfirmText("确认关闭");
                    setCancelText("继续观看");
                    return;
                }
            }
            String language2 = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(obj)) {
                if (b != null) {
                    obj = b.mo16169X();
                } else if (TextUtils.isEmpty(language2) || !language2.equals("zh")) {
                    setTitle("Confirm to close? ");
                } else {
                    setTitle("确认关闭？");
                }
            }
            if (TextUtils.isEmpty(obj2)) {
                if (b != null) {
                    obj2 = b.mo16170Y();
                } else if (TextUtils.isEmpty(language2) || !language2.equals("zh")) {
                    setContent("You will not be rewarded after closing the window");
                } else {
                    setContent("关闭后您将不会获得任何奖励噢~ ");
                }
            }
            if (TextUtils.isEmpty(obj4)) {
                if (b != null) {
                    obj4 = b.mo16171Z();
                } else if (TextUtils.isEmpty(language2) || !language2.equals("zh")) {
                    setConfirmText("Close it");
                } else {
                    setConfirmText("确认关闭");
                }
            }
            if (TextUtils.isEmpty(obj3)) {
                if (b != null) {
                    obj3 = b.mo16183aa();
                } else if (TextUtils.isEmpty(language2) || !language2.equals("zh")) {
                    setCancelText("Continue");
                } else {
                    setCancelText("继续观看");
                }
            }
            m27618a(obj, obj2, obj4, obj3);
        } catch (Exception e) {
            C8672v.m24874a("MBAlertDialog", e.getMessage());
        }
    }

    public void makePlayableAlertView() {
        C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
        if (b != null) {
            m27618a(b.mo16169X(), b.mo16170Y(), b.mo16171Z(), b.mo16184ab());
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            setTitle("Confirm to close? ");
            setContent("You will not be rewarded after closing the window");
            setConfirmText("Close it");
            setCancelText("Continue");
            return;
        }
        setTitle("确认关闭？");
        setContent("关闭后您将不会获得任何奖励噢~ ");
        setConfirmText("确认关闭");
        setCancelText("继续试玩");
    }

    public void makeIVAlertView(int i, String str) {
        try {
            Context context = getContext();
            String obj = C8614ab.m24713b(context, "MBridge_ConfirmTitle" + str, "").toString();
            Context context2 = getContext();
            String obj2 = C8614ab.m24713b(context2, "MBridge_ConfirmContent" + str, "").toString();
            Context context3 = getContext();
            String obj3 = C8614ab.m24713b(context3, "MBridge_CancelText" + str, "").toString();
            Context context4 = getContext();
            String obj4 = C8614ab.m24713b(context4, "MBridge_ConfirmText" + str, "").toString();
            if (!TextUtils.isEmpty(obj) || !TextUtils.isEmpty(obj2) || !TextUtils.isEmpty(obj3) || !TextUtils.isEmpty(obj4)) {
                m27618a(obj, obj2, obj3, obj4);
                return;
            }
            String language = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                setTitle(i == C8469a.f20753n ? "Confirm" : "Tips");
                setContent(i == C8469a.f20753n ? "If you choose to continue, you will receive a reward after the end. Confirm closed?" : "If you choose to continue, you will receive a reward after the end. Whether to continue?");
                setConfirmText(i == C8469a.f20753n ? "Close" : "Cancel");
                setCancelText("Continue");
                return;
            }
            setTitle(i == C8469a.f20753n ? "确认关闭？" : "提示");
            setContent(i == C8469a.f20753n ? "如果你选择继续，结束后将会获得奖励。确认关闭吗？" : "如果你选择继续，结束后将会获得奖励。是否继续？");
            setConfirmText(i == C8469a.f20753n ? "确认关闭" : "取消");
            setCancelText("继续");
        } catch (Exception e) {
            C8672v.m24874a("MBAlertDialog", e.getMessage());
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
}

package p010by.saygames.p011ui;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p010by.saygames.p011ui.SayKitUi;

/* renamed from: by.saygames.ui.SayKitUi */
public class SayKitUi {
    private static WeakReference<Dialog> weakReference;

    /* renamed from: by.saygames.ui.SayKitUi$AcceptCallback */
    public interface AcceptCallback {
        void onAccept();
    }

    private SayKitUi() {
    }

    public static void showGdprConsentNew(Context context, boolean z, String str, String str2, String str3, String str4, AcceptCallback acceptCallback) {
        View view;
        dismiss();
        if (context != null) {
            if (z) {
                view = createView(context, "sk_consent_new_dark", "sk_consent_new_dark", "sk_consent_new_width_max");
            } else {
                view = createView(context, "sk_consent_new_light", "sk_consent_new_light", "sk_consent_new_width_max");
            }
            TextView textView = (TextView) findView(view, "sk_consent_button");
            setNullableText(textView, str4);
            textView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    SayKitUi.lambda$showGdprConsentNew$0(SayKitUi.AcceptCallback.this, view);
                }
            });
            MovementMethod instance = LinkMovementMethod.getInstance();
            TextView textView2 = (TextView) findView(view, "sk_consent_description_bottom");
            textView2.setMovementMethod(instance);
            setNullableHtml(textView2, str3);
            setLinkTextColor(textView2);
            TextView textView3 = (TextView) findView(view, "sk_consent_description_top");
            textView3.setMovementMethod(instance);
            setNullableHtml(textView3, str2);
            setLinkTextColor(textView3);
            setNullableText((TextView) findView(view, "sk_consent_title"), str);
        }
    }

    static /* synthetic */ void lambda$showGdprConsentNew$0(AcceptCallback acceptCallback, View view) {
        dismiss();
        if (acceptCallback != null) {
            acceptCallback.onAccept();
        }
    }

    public static void showGdprConsentOld(Context context, String str, String str2, String str3, AcceptCallback acceptCallback) {
        dismiss();
        if (context != null) {
            View createView = createView(context, "sk_consent_old", "sk_consent_old", "sk_consent_old_width_max");
            TextView textView = (TextView) findView(createView, "sk_consent_button");
            setNullableText(textView, str3);
            textView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    SayKitUi.lambda$showGdprConsentOld$1(SayKitUi.AcceptCallback.this, view);
                }
            });
            TextView textView2 = (TextView) findView(createView, "sk_consent_description");
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            setNullableHtml(textView2, str2);
            setLinkTextColor(textView2);
            setNullableText((TextView) findView(createView, "sk_consent_title"), str);
        }
    }

    static /* synthetic */ void lambda$showGdprConsentOld$1(AcceptCallback acceptCallback, View view) {
        dismiss();
        if (acceptCallback != null) {
            acceptCallback.onAccept();
        }
    }

    private static View createView(Context context, String str, String str2, String str3) {
        View inflate = LayoutInflater.from(context).inflate(getIdentifier(context, str, "layout"), (ViewGroup) null);
        Dialog dialog = new Dialog(context, getIdentifier(context, str2, "style"));
        weakReference = new WeakReference<>(dialog);
        View decorView = dialog.getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 512);
        dialog.setCancelable(false);
        dialog.setContentView(inflate);
        dialog.show();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) inflate.getLayoutParams();
        layoutParams.gravity = 17;
        layoutParams.height = -2;
        layoutParams.width = getWidth(context, str3);
        return inflate;
    }

    private static void dismiss() {
        WeakReference<Dialog> weakReference2 = weakReference;
        if (weakReference2 != null) {
            weakReference = null;
            Dialog dialog = (Dialog) weakReference2.get();
            if (dialog != null) {
                try {
                    dialog.dismiss();
                } catch (Throwable unused) {
                }
            }
        }
    }

    private static <T> T findView(View view, String str) {
        return view.findViewById(getIdentifier(view.getContext(), str, "id"));
    }

    private static int getIdentifier(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, context.getPackageName());
    }

    private static int getWidth(Context context, String str) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return Math.min(displayMetrics.widthPixels, resources.getDimensionPixelSize(getIdentifier(context, str, "dimen")));
    }

    private static void setLinkTextColor(TextView textView) {
        textView.setLinkTextColor(textView.getResources().getColor(getIdentifier(textView.getContext(), "sk_11BB52", "color")));
    }

    private static void setNullableHtml(TextView textView, String str) {
        if (str == null) {
            textView.setText("");
            return;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            textView.setText("");
        } else {
            textView.setText(Html.fromHtml(trim));
        }
    }

    private static void setNullableText(TextView textView, String str) {
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }
}

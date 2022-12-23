package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.C8658p;

public class BaseView extends RelativeLayout {

    /* renamed from: a */
    protected RelativeLayout f22075a;

    /* renamed from: b */
    protected RelativeLayout f22076b;

    /* renamed from: c */
    protected RelativeLayout f22077c;

    /* renamed from: d */
    protected ImageView f22078d;

    /* renamed from: e */
    protected TextView f22079e;

    /* renamed from: f */
    protected ProgressBar f22080f;

    /* renamed from: g */
    protected FrameLayout f22081g;

    /* renamed from: h */
    protected LinearLayout f22082h;

    /* renamed from: i */
    protected RelativeLayout f22083i;
    public C8936a style;

    /* renamed from: com.mbridge.msdk.nativex.view.mbfullview.BaseView$a */
    public enum C8936a {
        FULL_TOP_VIEW,
        FULL_MIDDLE_VIEW
    }

    public FrameLayout getmAnimationContent() {
        return this.f22081g;
    }

    public LinearLayout getmAnimationPlayer() {
        return this.f22082h;
    }

    public BaseView(Context context) {
        super(context);
        View inflate = LayoutInflater.from(getContext()).inflate(C8658p.m24799a(getContext(), "mbridge_nativex_fullbasescreen", "layout"), this);
        this.f22083i = (RelativeLayout) inflate;
        if (inflate != null) {
            this.f22075a = (RelativeLayout) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            this.f22076b = (RelativeLayout) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_full_player_parent", "id"));
            this.f22077c = (RelativeLayout) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_full_rl_close", "id"));
            this.f22078d = (ImageView) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_full_iv_close", "id"));
            this.f22079e = (TextView) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_full_tv_install", "id"));
            this.f22080f = (ProgressBar) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_full_pb_loading", "id"));
            this.f22081g = (FrameLayout) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_full_animation_content", "id"));
            this.f22082h = (LinearLayout) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_full_animation_player", "id"));
            inflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    public RelativeLayout getMBridgeFullPlayContainer() {
        return this.f22075a;
    }

    public RelativeLayout getMBridgeFullPlayerParent() {
        return this.f22076b;
    }

    public RelativeLayout getMBridgeFullClose() {
        return this.f22077c;
    }

    public ImageView getMBridgeFullIvClose() {
        return this.f22078d;
    }

    public TextView getMBridgeFullTvInstall() {
        return this.f22079e;
    }

    public ProgressBar getMBridgeFullPb() {
        return this.f22080f;
    }

    public C8936a getStytle() {
        return this.style;
    }

    public void setStytle(C8936a aVar) {
        this.style = aVar;
    }
}

package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.C8658p;

public class MBridgeTopFullView extends BaseView {
    public static final String INTERFACE_RESULT = (MBridgeTopFullView.class.getName() + "WithResault");

    /* renamed from: j */
    protected ImageView f22087j;

    /* renamed from: k */
    protected TextView f22088k;

    /* renamed from: l */
    protected TextView f22089l;

    /* renamed from: m */
    protected StarLevelLayoutView f22090m;

    public ImageView getMBridgeFullViewDisplayIcon() {
        return this.f22087j;
    }

    public TextView getMBridgeFullViewDisplayTitle() {
        return this.f22088k;
    }

    public TextView getMBridgeFullViewDisplayDscription() {
        return this.f22089l;
    }

    public StarLevelLayoutView getStarLevelLayoutView() {
        return this.f22090m;
    }

    public MBridgeTopFullView(Context context) {
        super(context);
        View inflate = LayoutInflater.from(getContext()).inflate(C8658p.m24799a(getContext(), "mbridge_nativex_fullscreen_top", "layout"), this.f22083i);
        if (inflate != null) {
            this.f22087j = (ImageView) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_full_tv_display_icon", "id"));
            this.f22088k = (TextView) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_full_tv_display_title", "id"));
            this.f22089l = (TextView) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_full_tv_display_description", "id"));
            this.f22090m = (StarLevelLayoutView) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_full_tv_feeds_star", "id"));
            this.f22089l.setTextColor(-7829368);
            inflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            updateLayoutParams();
        }
    }

    public void updateLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        this.f22075a.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(10);
        this.f22076b.setLayoutParams(layoutParams2);
    }
}

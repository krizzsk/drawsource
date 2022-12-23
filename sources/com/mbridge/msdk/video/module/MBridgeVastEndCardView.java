package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.signal.factory.C9618b;
import com.mbridge.msdk.widget.C9676a;

public class MBridgeVastEndCardView extends MBridgeBaseView {

    /* renamed from: n */
    private ViewGroup f23368n;

    /* renamed from: o */
    private View f23369o;

    /* renamed from: p */
    private View f23370p;

    public void preLoadData(C9618b bVar) {
    }

    public MBridgeVastEndCardView(Context context) {
        super(context);
    }

    public MBridgeVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_endcard_vast");
        if (findLayout >= 0) {
            this.f23197c.inflate(findLayout, this);
            this.f23368n = (ViewGroup) findViewById(findID("mbridge_rl_content"));
            this.f23369o = findViewById(findID("mbridge_iv_vastclose"));
            View findViewById = findViewById(findID("mbridge_iv_vastok"));
            this.f23370p = findViewById;
            this.f23200f = isNotNULL(this.f23368n, this.f23369o, findViewById);
            mo62973c();
            if (this.f23200f) {
                setMatchParent();
                setBackgroundResource(findColor("mbridge_reward_endcard_vast_bg"));
                setClickable(true);
                ((RelativeLayout.LayoutParams) this.f23368n.getLayoutParams()).addRule(13, -1);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62973c() {
        super.mo62973c();
        if (this.f23200f) {
            this.f23369o.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    MBridgeVastEndCardView.this.f23199e.mo62631a(104, "");
                }
            });
            this.f23370p.setOnClickListener(new C9676a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo58499a(View view) {
                    MBridgeVastEndCardView.this.f23199e.mo62631a(108, MBridgeVastEndCardView.this.mo62974d());
                }
            });
        }
    }

    public void notifyShowListener() {
        this.f23199e.mo62631a(111, "");
    }
}

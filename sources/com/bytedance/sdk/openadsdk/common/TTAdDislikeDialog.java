package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.dislike.C3718c;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import java.util.ArrayList;

public class TTAdDislikeDialog extends FrameLayout {

    /* renamed from: a */
    private View f7391a;

    /* renamed from: b */
    private TTDislikeListView f7392b;

    /* renamed from: c */
    private TTDislikeListView f7393c;

    /* renamed from: d */
    private RelativeLayout f7394d;

    /* renamed from: e */
    private View f7395e;

    /* renamed from: f */
    private C3718c.C3725b f7396f;

    /* renamed from: g */
    private C3718c.C3725b f7397g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3431n f7398h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C3155a f7399i;

    /* renamed from: j */
    private boolean f7400j;

    /* renamed from: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a */
    public interface C3155a {
        /* renamed from: a */
        void mo18315a(int i, FilterWord filterWord);

        /* renamed from: a */
        void mo18316a(View view);

        /* renamed from: b */
        void mo18317b(View view);

        /* renamed from: c */
        void mo18318c(View view);
    }

    public TTAdDislikeDialog(Context context, C3431n nVar) {
        this(context.getApplicationContext());
        this.f7398h = nVar;
        m9120c();
    }

    public TTAdDislikeDialog(Context context) {
        this(context, (AttributeSet) null);
    }

    public TTAdDislikeDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7400j = false;
        m9114a(context, attributeSet);
    }

    /* renamed from: a */
    private void m9114a(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTAdDislikeDialog.this.mo18779b();
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.f7391a = LayoutInflater.from(context).inflate(C2914t.m8159f(context, "tt_dislike_dialog_layout"), this, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = C3904y.m12886e(getContext(), 20.0f);
        layoutParams.rightMargin = C3904y.m12886e(getContext(), 20.0f);
        this.f7391a.setLayoutParams(layoutParams);
        this.f7391a.setClickable(true);
        m9121d();
        m9120c();
    }

    /* renamed from: c */
    private void m9120c() {
        if (this.f7398h != null) {
            LayoutInflater from = LayoutInflater.from(getContext());
            C3718c.C3725b bVar = new C3718c.C3725b(from, this.f7398h.mo19571ae());
            this.f7396f = bVar;
            this.f7392b.setAdapter(bVar);
            C3718c.C3725b bVar2 = new C3718c.C3725b(from, new ArrayList());
            this.f7397g = bVar2;
            bVar2.mo20510a(false);
            this.f7393c.setAdapter(this.f7397g);
            this.f7392b.setMaterialMeta(this.f7398h);
            this.f7393c.setMaterialMeta(this.f7398h);
        }
    }

    /* renamed from: d */
    private void m9121d() {
        this.f7394d = (RelativeLayout) this.f7391a.findViewById(C2914t.m8158e(getContext(), "tt_dislike_title_content"));
        this.f7395e = this.f7391a.findViewById(C2914t.m8158e(getContext(), "tt_dislike_line1"));
        TextView textView = (TextView) this.f7391a.findViewById(C2914t.m8158e(getContext(), "tt_dislike_header_back"));
        textView.setText(C2914t.m8151a(getContext(), "tt_dislike_header_tv_back"));
        ((TextView) this.f7391a.findViewById(C2914t.m8158e(getContext(), "tt_dislike_header_tv"))).setText(C2914t.m8151a(getContext(), "tt_dislike_header_tv_title"));
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTAdDislikeDialog.this.m9122e();
                if (TTAdDislikeDialog.this.f7399i != null) {
                    TTAdDislikeDialog.this.f7399i.mo18318c(view);
                }
            }
        });
        TTDislikeListView tTDislikeListView = (TTDislikeListView) this.f7391a.findViewById(C2914t.m8158e(getContext(), "tt_filer_words_lv"));
        this.f7392b = tTDislikeListView;
        tTDislikeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                /*
                    r0 = this;
                    android.widget.Adapter r1 = r1.getAdapter()     // Catch:{ all -> 0x0027 }
                    java.lang.Object r1 = r1.getItem(r3)     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.FilterWord r1 = (com.bytedance.sdk.openadsdk.FilterWord) r1     // Catch:{ all -> 0x0027 }
                    boolean r2 = r1.hasSecondOptions()     // Catch:{ all -> 0x0027 }
                    if (r2 == 0) goto L_0x0027
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0027 }
                    r2.m9115a((com.bytedance.sdk.openadsdk.FilterWord) r1)     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r2 = r2.f7399i     // Catch:{ all -> 0x0027 }
                    if (r2 == 0) goto L_0x0026
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r2 = r2.f7399i     // Catch:{ all -> 0x0027 }
                    r2.mo18315a(r3, r1)     // Catch:{ all -> 0x0027 }
                L_0x0026:
                    return
                L_0x0027:
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r1 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r1 = r1.f7399i
                    if (r1 == 0) goto L_0x0048
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r1 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0048 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r1 = r1.f7399i     // Catch:{ all -> 0x0048 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0048 }
                    com.bytedance.sdk.openadsdk.core.e.n r2 = r2.f7398h     // Catch:{ all -> 0x0048 }
                    java.util.List r2 = r2.mo19571ae()     // Catch:{ all -> 0x0048 }
                    java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0048 }
                    com.bytedance.sdk.openadsdk.FilterWord r2 = (com.bytedance.sdk.openadsdk.FilterWord) r2     // Catch:{ all -> 0x0048 }
                    r1.mo18315a(r3, r2)     // Catch:{ all -> 0x0048 }
                L_0x0048:
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r1 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this
                    r1.mo18779b()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.C31533.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
        TTDislikeListView tTDislikeListView2 = (TTDislikeListView) this.f7391a.findViewById(C2914t.m8158e(getContext(), "tt_filer_words_lv_second"));
        this.f7393c = tTDislikeListView2;
        tTDislikeListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                /*
                    r0 = this;
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r2 = r2.f7399i
                    if (r2 == 0) goto L_0x001b
                    android.widget.Adapter r1 = r1.getAdapter()     // Catch:{ all -> 0x001b }
                    java.lang.Object r1 = r1.getItem(r3)     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.FilterWord r1 = (com.bytedance.sdk.openadsdk.FilterWord) r1     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r2 = r2.f7399i     // Catch:{ all -> 0x001b }
                    r2.mo18315a(r3, r1)     // Catch:{ all -> 0x001b }
                L_0x001b:
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r1 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this
                    r1.mo18779b()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.C31544.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
    }

    /* renamed from: a */
    public void mo18778a() {
        if (this.f7391a.getParent() == null) {
            addView(this.f7391a);
        }
        m9122e();
        setVisibility(0);
        this.f7400j = true;
        C3155a aVar = this.f7399i;
        if (aVar != null) {
            aVar.mo18316a(this);
        }
    }

    /* renamed from: b */
    public void mo18779b() {
        setVisibility(8);
        this.f7400j = false;
        C3155a aVar = this.f7399i;
        if (aVar != null) {
            aVar.mo18317b(this);
        }
    }

    public void setCallback(C3155a aVar) {
        this.f7399i = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m9122e() {
        RelativeLayout relativeLayout = this.f7394d;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.f7395e;
        if (view != null) {
            view.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView = this.f7392b;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(0);
        }
        C3718c.C3725b bVar = this.f7397g;
        if (bVar != null) {
            bVar.mo20508a();
        }
        TTDislikeListView tTDislikeListView2 = this.f7393c;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9115a(FilterWord filterWord) {
        if (filterWord != null) {
            C3718c.C3725b bVar = this.f7397g;
            if (bVar != null) {
                bVar.mo20509a(filterWord.getOptions());
            }
            RelativeLayout relativeLayout = this.f7394d;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            View view = this.f7395e;
            if (view != null) {
                view.setVisibility(0);
            }
            TTDislikeListView tTDislikeListView = this.f7392b;
            if (tTDislikeListView != null) {
                tTDislikeListView.setVisibility(8);
            }
            TTDislikeListView tTDislikeListView2 = this.f7393c;
            if (tTDislikeListView2 != null) {
                tTDislikeListView2.setVisibility(0);
            }
        }
    }
}

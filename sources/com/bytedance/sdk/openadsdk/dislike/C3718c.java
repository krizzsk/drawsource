package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.dislike.c */
/* compiled from: TTDislikeDialogDefault */
public class C3718c extends TTDislikeDialogAbstract {

    /* renamed from: a */
    private TTDislikeListView f9640a;

    /* renamed from: b */
    private TTDislikeListView f9641b;

    /* renamed from: c */
    private RelativeLayout f9642c;

    /* renamed from: d */
    private View f9643d;

    /* renamed from: e */
    private C3725b f9644e;

    /* renamed from: f */
    private C3725b f9645f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C3431n f9646g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3724a f9647h;

    /* renamed from: i */
    private String f9648i;

    /* renamed from: com.bytedance.sdk.openadsdk.dislike.c$a */
    /* compiled from: TTDislikeDialogDefault */
    public interface C3724a {
        /* renamed from: a */
        void mo20495a();

        /* renamed from: a */
        void mo20496a(int i, FilterWord filterWord);

        /* renamed from: b */
        void mo20497b();

        /* renamed from: c */
        void mo20498c();
    }

    public C3718c(Context context, C3431n nVar) {
        super(context, C2914t.m8160g(context, "tt_dislikeDialog"));
        this.f9646g = nVar;
    }

    /* renamed from: a */
    public void mo20499a(C3431n nVar) {
        C3725b bVar = this.f9644e;
        if (bVar != null && nVar != null) {
            this.f9646g = nVar;
            bVar.mo20509a(nVar.mo19571ae());
            setMaterialMeta(this.f9646g);
        }
    }

    /* renamed from: a */
    public void mo20500a(C3724a aVar) {
        this.f9647h = aVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        m12165a();
        m12166a(getContext());
        m12169b();
        setMaterialMeta(this.f9646g);
    }

    /* renamed from: a */
    public void mo20501a(String str) {
        this.f9648i = str;
    }

    public int getLayoutId() {
        return C2914t.m8159f(getContext(), "tt_dislike_dialog_layout");
    }

    public int[] getTTDislikeListViewIds() {
        return new int[]{C2914t.m8158e(getContext(), "tt_filer_words_lv"), C2914t.m8158e(getContext(), "tt_filer_words_lv_second")};
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(C3904y.m12877c(getContext()) - 120, -2);
    }

    public void show() {
        super.show();
        m12172c();
    }

    /* renamed from: a */
    private void m12165a() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.y = 50;
            window.setAttributes(attributes);
        }
    }

    /* renamed from: b */
    private void m12169b() {
        setOnShowListener(new DialogInterface.OnShowListener() {
            public void onShow(DialogInterface dialogInterface) {
                if (C3718c.this.f9647h != null) {
                    C3718c.this.f9647h.mo20495a();
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() {
            public void onDismiss(DialogInterface dialogInterface) {
                if (C3718c.this.f9647h != null) {
                    C3718c.this.f9647h.mo20497b();
                }
            }
        });
        C3725b bVar = new C3725b(getLayoutInflater(), this.f9646g.mo19571ae());
        this.f9644e = bVar;
        this.f9640a.setAdapter(bVar);
        C3725b bVar2 = new C3725b(getLayoutInflater(), new ArrayList());
        this.f9645f = bVar2;
        bVar2.mo20510a(false);
        this.f9641b.setAdapter(this.f9645f);
    }

    /* renamed from: a */
    private void m12166a(Context context) {
        this.f9642c = (RelativeLayout) findViewById(C2914t.m8158e(getContext(), "tt_dislike_title_content"));
        this.f9643d = findViewById(C2914t.m8158e(getContext(), "tt_dislike_line1"));
        TextView textView = (TextView) findViewById(C2914t.m8158e(getContext(), "tt_dislike_header_back"));
        textView.setText(C2914t.m8151a(getContext(), "tt_dislike_header_tv_back"));
        ((TextView) findViewById(C2914t.m8158e(getContext(), "tt_dislike_header_tv"))).setText(C2914t.m8151a(getContext(), "tt_dislike_header_tv_title"));
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C3718c.this.m12172c();
                if (C3718c.this.f9647h != null) {
                    C3718c.this.f9647h.mo20498c();
                }
            }
        });
        TTDislikeListView tTDislikeListView = (TTDislikeListView) findViewById(C2914t.m8158e(getContext(), "tt_filer_words_lv"));
        this.f9640a = tTDislikeListView;
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
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.C3718c.this     // Catch:{ all -> 0x0027 }
                    r2.m12167a((com.bytedance.sdk.openadsdk.FilterWord) r1)     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.C3718c.this     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.dislike.c$a r2 = r2.f9647h     // Catch:{ all -> 0x0027 }
                    if (r2 == 0) goto L_0x0026
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.C3718c.this     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.dislike.c$a r2 = r2.f9647h     // Catch:{ all -> 0x0027 }
                    r2.mo20496a(r3, r1)     // Catch:{ all -> 0x0027 }
                L_0x0026:
                    return
                L_0x0027:
                    com.bytedance.sdk.openadsdk.dislike.c r1 = com.bytedance.sdk.openadsdk.dislike.C3718c.this
                    com.bytedance.sdk.openadsdk.dislike.c$a r1 = r1.f9647h
                    if (r1 == 0) goto L_0x0048
                    com.bytedance.sdk.openadsdk.dislike.c r1 = com.bytedance.sdk.openadsdk.dislike.C3718c.this     // Catch:{ all -> 0x0048 }
                    com.bytedance.sdk.openadsdk.dislike.c$a r1 = r1.f9647h     // Catch:{ all -> 0x0048 }
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.C3718c.this     // Catch:{ all -> 0x0048 }
                    com.bytedance.sdk.openadsdk.core.e.n r2 = r2.f9646g     // Catch:{ all -> 0x0048 }
                    java.util.List r2 = r2.mo19571ae()     // Catch:{ all -> 0x0048 }
                    java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0048 }
                    com.bytedance.sdk.openadsdk.FilterWord r2 = (com.bytedance.sdk.openadsdk.FilterWord) r2     // Catch:{ all -> 0x0048 }
                    r1.mo20496a(r3, r2)     // Catch:{ all -> 0x0048 }
                L_0x0048:
                    com.bytedance.sdk.openadsdk.dislike.c r1 = com.bytedance.sdk.openadsdk.dislike.C3718c.this
                    r1.dismiss()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.dislike.C3718c.C37224.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
        this.f9640a.setClosedListenerKey(this.f9648i);
        TTDislikeListView tTDislikeListView2 = (TTDislikeListView) findViewById(C2914t.m8158e(getContext(), "tt_filer_words_lv_second"));
        this.f9641b = tTDislikeListView2;
        tTDislikeListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                /*
                    r0 = this;
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.C3718c.this
                    com.bytedance.sdk.openadsdk.dislike.c$a r2 = r2.f9647h
                    if (r2 == 0) goto L_0x001b
                    android.widget.Adapter r1 = r1.getAdapter()     // Catch:{ all -> 0x001b }
                    java.lang.Object r1 = r1.getItem(r3)     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.FilterWord r1 = (com.bytedance.sdk.openadsdk.FilterWord) r1     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.C3718c.this     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.dislike.c$a r2 = r2.f9647h     // Catch:{ all -> 0x001b }
                    r2.mo20496a(r3, r1)     // Catch:{ all -> 0x001b }
                L_0x001b:
                    com.bytedance.sdk.openadsdk.dislike.c r1 = com.bytedance.sdk.openadsdk.dislike.C3718c.this
                    r1.dismiss()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.dislike.C3718c.C37235.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
        this.f9641b.setClosedListenerKey(this.f9648i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m12172c() {
        RelativeLayout relativeLayout = this.f9642c;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.f9643d;
        if (view != null) {
            view.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView = this.f9640a;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(0);
        }
        C3725b bVar = this.f9645f;
        if (bVar != null) {
            bVar.mo20508a();
        }
        TTDislikeListView tTDislikeListView2 = this.f9641b;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12167a(FilterWord filterWord) {
        if (filterWord != null) {
            C3725b bVar = this.f9645f;
            if (bVar != null) {
                bVar.mo20509a(filterWord.getOptions());
            }
            RelativeLayout relativeLayout = this.f9642c;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            View view = this.f9643d;
            if (view != null) {
                view.setVisibility(0);
            }
            TTDislikeListView tTDislikeListView = this.f9640a;
            if (tTDislikeListView != null) {
                tTDislikeListView.setVisibility(8);
            }
            TTDislikeListView tTDislikeListView2 = this.f9641b;
            if (tTDislikeListView2 != null) {
                tTDislikeListView2.setVisibility(0);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.dislike.c$b */
    /* compiled from: TTDislikeDialogDefault */
    public static class C3725b extends BaseAdapter {

        /* renamed from: a */
        private boolean f9654a = true;

        /* renamed from: b */
        private final List<FilterWord> f9655b;

        /* renamed from: c */
        private final LayoutInflater f9656c;

        public long getItemId(int i) {
            return (long) i;
        }

        public C3725b(LayoutInflater layoutInflater, List<FilterWord> list) {
            this.f9655b = list;
            this.f9656c = layoutInflater;
        }

        /* renamed from: a */
        public void mo20510a(boolean z) {
            this.f9654a = z;
        }

        public int getCount() {
            List<FilterWord> list = this.f9655b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Object getItem(int i) {
            return this.f9655b.get(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C3726a aVar;
            if (view == null) {
                aVar = new C3726a();
                LayoutInflater layoutInflater = this.f9656c;
                view2 = layoutInflater.inflate(C2914t.m8159f(layoutInflater.getContext(), "tt_dialog_listview_item"), viewGroup, false);
                aVar.f9657a = (TextView) view2.findViewById(C2914t.m8158e(this.f9656c.getContext(), "tt_item_tv"));
                aVar.f9658b = (ImageView) view2.findViewById(C2914t.m8158e(this.f9656c.getContext(), "tt_item_arrow"));
                view2.setTag(aVar);
            } else {
                view2 = view;
                aVar = (C3726a) view.getTag();
            }
            FilterWord filterWord = this.f9655b.get(i);
            aVar.f9657a.setText(filterWord.getName());
            if (i != this.f9655b.size() - 1) {
                aVar.f9657a.setBackgroundResource(C2914t.m8157d(this.f9656c.getContext(), "tt_dislike_middle_seletor"));
            } else {
                aVar.f9657a.setBackgroundResource(C2914t.m8157d(this.f9656c.getContext(), "tt_dislike_bottom_seletor"));
            }
            if (this.f9654a && i == 0) {
                aVar.f9657a.setBackgroundResource(C2914t.m8157d(this.f9656c.getContext(), "tt_dislike_top_seletor"));
            }
            if (filterWord.hasSecondOptions()) {
                aVar.f9658b.setVisibility(0);
            } else {
                aVar.f9658b.setVisibility(8);
            }
            return view2;
        }

        /* renamed from: a */
        public void mo20509a(List<FilterWord> list) {
            if (list != null && !list.isEmpty()) {
                this.f9655b.clear();
                this.f9655b.addAll(list);
                notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void mo20508a() {
            this.f9655b.clear();
            notifyDataSetChanged();
        }

        /* renamed from: com.bytedance.sdk.openadsdk.dislike.c$b$a */
        /* compiled from: TTDislikeDialogDefault */
        private static class C3726a {

            /* renamed from: a */
            TextView f9657a;

            /* renamed from: b */
            ImageView f9658b;

            private C3726a() {
            }
        }
    }
}

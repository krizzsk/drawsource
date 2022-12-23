package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2400b;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2403b;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C3631a;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.e */
/* compiled from: VideoTrafficTipLayout */
public class C3699e {

    /* renamed from: a */
    private View f9586a;

    /* renamed from: b */
    private TextView f9587b;

    /* renamed from: c */
    private Context f9588c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C3631a f9589d;

    /* renamed from: e */
    private C3702b f9590e;

    /* renamed from: f */
    private boolean f9591f = false;

    /* renamed from: g */
    private C2400b f9592g;

    /* renamed from: h */
    private ViewStub f9593h;

    /* renamed from: i */
    private View f9594i;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.e$a */
    /* compiled from: VideoTrafficTipLayout */
    public enum C3701a {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.e$b */
    /* compiled from: VideoTrafficTipLayout */
    public interface C3702b {
        /* renamed from: j */
        boolean mo20289j();

        /* renamed from: l */
        void mo20291l();
    }

    /* renamed from: a */
    public void mo20477a(Context context, View view) {
        if (context != null && (view instanceof ViewGroup)) {
            this.f9594i = view;
            this.f9588c = C3513m.m10963a().getApplicationContext();
            this.f9593h = (ViewStub) LayoutInflater.from(context).inflate(C2914t.m8159f(context, "tt_video_traffic_tip"), (ViewGroup) view, true).findViewById(C2914t.m8158e(context, "tt_video_traffic_tip_layout_viewStub"));
        }
    }

    /* renamed from: a */
    private void m12088a(Context context, View view, boolean z) {
        ViewStub viewStub;
        if (context != null && view != null && (viewStub = this.f9593h) != null && viewStub.getParent() != null && this.f9586a == null) {
            this.f9593h.inflate();
            this.f9586a = view.findViewById(C2914t.m8158e(context, "tt_video_traffic_tip_layout"));
            this.f9587b = (TextView) view.findViewById(C2914t.m8158e(context, "tt_video_traffic_tip_tv"));
            View findViewById = view.findViewById(C2914t.m8158e(context, "tt_video_traffic_continue_play_btn"));
            if (z) {
                findViewById.setClickable(true);
                findViewById.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        C3699e.this.m12094c();
                        if (C3699e.this.f9589d != null) {
                            C3699e.this.f9589d.mo20188a(C3701a.START_VIDEO, (String) null);
                        }
                    }
                });
                return;
            }
            findViewById.setOnClickListener((View.OnClickListener) null);
            findViewById.setClickable(false);
        }
    }

    /* renamed from: a */
    public void mo20478a(C3631a aVar, C3702b bVar) {
        this.f9590e = bVar;
        this.f9589d = aVar;
    }

    /* renamed from: b */
    private void m12093b() {
        this.f9592g = null;
    }

    /* renamed from: a */
    public boolean mo20481a(int i, C2400b bVar, boolean z) {
        Context context = this.f9588c;
        if (context == null || bVar == null) {
            return true;
        }
        m12088a(context, this.f9594i, z);
        this.f9592g = bVar;
        if (i == 1 || i == 2) {
            return m12091a(i);
        }
        return true;
    }

    /* renamed from: a */
    private boolean m12091a(int i) {
        C3702b bVar;
        if (mo20480a() || this.f9591f) {
            return true;
        }
        if (!(this.f9589d == null || (bVar = this.f9590e) == null)) {
            if (bVar.mo20289j()) {
                this.f9589d.mo16014e((C2403b) null, (View) null);
            }
            this.f9589d.mo20188a(C3701a.PAUSE_VIDEO, (String) null);
        }
        m12089a(this.f9592g, true);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m12094c() {
        if (this.f9588c != null) {
            m12095d();
        }
    }

    /* renamed from: a */
    public void mo20479a(boolean z) {
        if (z) {
            m12093b();
        }
        m12095d();
    }

    /* renamed from: a */
    public boolean mo20480a() {
        View view = this.f9586a;
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: d */
    private void m12095d() {
        View view = this.f9586a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m12089a(C2400b bVar, boolean z) {
        View view;
        String str;
        View view2;
        if (bVar != null && (view = this.f9586a) != null && this.f9588c != null && view.getVisibility() != 0) {
            C3702b bVar2 = this.f9590e;
            if (bVar2 != null) {
                bVar2.mo20291l();
            }
            double ceil = Math.ceil((((double) bVar.mo15943e()) * 1.0d) / 1048576.0d);
            if (z) {
                str = String.format(C2914t.m8151a(this.f9588c, "tt_video_without_wifi_tips"), new Object[]{Float.valueOf(Double.valueOf(ceil).floatValue())});
            } else {
                str = C2914t.m8151a(this.f9588c, "tt_video_without_wifi_tips") + C2914t.m8151a(this.f9588c, "tt_video_bytesize");
            }
            C3904y.m12853a(this.f9586a, 0);
            C3904y.m12862a(this.f9587b, (CharSequence) str);
            Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
            if (C3904y.m12884d(this.f9586a) && (view2 = this.f9586a) != null) {
                view2.bringToFront();
                Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
            }
        }
    }
}

package com.mbridge.msdk.video.p347bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p085b.C2470b;
import com.mbridge.msdk.foundation.tools.C8616ad;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.p075a.C2427b;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.video.p347bt.p348a.C9261c;
import com.mbridge.msdk.videocommon.download.C9641a;
import com.mbridge.msdk.videocommon.download.C9645c;
import com.mbridge.msdk.videocommon.p375d.C9637a;
import com.mbridge.msdk.videocommon.p375d.C9638b;
import com.mbridge.msdk.widget.FeedBackButton;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView */
public class MBridgeBTVideoView extends BTBaseView {
    /* access modifiers changed from: private */

    /* renamed from: J */
    public static boolean f22778J = false;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public MediaEvents f22779A;

    /* renamed from: B */
    private AdEvents f22780B;

    /* renamed from: C */
    private C9296a f22781C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f22782D = 2;

    /* renamed from: E */
    private int f22783E;

    /* renamed from: F */
    private boolean f22784F = false;

    /* renamed from: G */
    private int f22785G = 2;

    /* renamed from: H */
    private int f22786H = 1;

    /* renamed from: I */
    private String f22787I;

    /* renamed from: K */
    private boolean f22788K = false;

    /* renamed from: L */
    private boolean f22789L = false;

    /* renamed from: M */
    private boolean f22790M = false;

    /* renamed from: N */
    private RelativeLayout f22791N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public ProgressBar f22792O;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public PlayerView f22793p;

    /* renamed from: q */
    private SoundImageView f22794q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public TextView f22795r;

    /* renamed from: s */
    private View f22796s;

    /* renamed from: t */
    private FeedBackButton f22797t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public WebView f22798u;

    /* renamed from: v */
    private C9641a f22799v;

    /* renamed from: w */
    private int f22800w = 0;

    /* renamed from: x */
    private int f22801x = 0;

    /* renamed from: y */
    private int f22802y = 0;

    /* renamed from: z */
    private AdSession f22803z;

    public void setCreateWebView(WebView webView) {
        this.f22798u = webView;
    }

    public void setOrientation(int i) {
        this.f22786H = i;
    }

    public MBridgeBTVideoView(Context context) {
        super(context);
    }

    public MBridgeBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void setCampaign(CampaignEx campaignEx) {
        super.setCampaign(campaignEx);
        if (campaignEx == null || campaignEx.getVideoCompleteTime() <= 0) {
            this.f22795r.setBackgroundResource(C8658p.m24799a(C8388a.m23845e().mo56913g(), "mbridge_reward_shape_progress", "drawable"));
            this.f22795r.setWidth(C8677z.m24924b(C8388a.m23845e().mo56913g(), 30.0f));
            return;
        }
        this.f22795r.setBackgroundResource(C8658p.m24799a(C8388a.m23845e().mo56913g(), "mbridge_reward_video_time_count_num_bg", "drawable"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C8677z.m24924b(C8388a.m23845e().mo56913g(), 30.0f));
        int b = C8677z.m24924b(C8388a.m23845e().mo56913g(), 5.0f);
        layoutParams.setMargins(b, 0, 0, 0);
        this.f22795r.setPadding(b, 0, b, 0);
        this.f22795r.setLayoutParams(layoutParams);
    }

    public void soundOperate(int i, int i2, String str) {
        if (this.f22646h) {
            this.f22782D = i;
            if (i == 1) {
                this.f22794q.setSoundStatus(false);
                this.f22793p.closeSound();
            } else if (i == 2) {
                this.f22794q.setSoundStatus(true);
                this.f22793p.openSound();
            }
            if (i2 == 1) {
                this.f22794q.setVisibility(8);
            } else if (i2 == 2) {
                this.f22794q.setVisibility(0);
            }
        }
    }

    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_videoview_item");
        if (findLayout > 0) {
            this.f22644f.inflate(findLayout, this);
            this.f22646h = m26420b();
            if (!this.f22646h) {
                C8672v.m24878d(BTBaseView.TAG, "MBridgeVideoView init fail");
            }
            mo62549a();
        }
        f22778J = false;
    }

    public void onResume() {
        PlayerView playerView = this.f22793p;
        if (playerView != null) {
            playerView.setIsCovered(false);
            this.f22793p.setDesk(true);
            if (this.f22789L) {
                this.f22793p.start(true);
            }
        }
    }

    public void onPause() {
        PlayerView playerView = this.f22793p;
        if (playerView != null) {
            boolean isPlayIng = playerView.isPlayIng();
            this.f22789L = isPlayIng;
            this.f22793p.setIsBTVideoPlaying(isPlayIng);
            this.f22793p.onPause();
        }
    }

    public void onStop() {
        PlayerView playerView = this.f22793p;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        View rootView;
        super.onAttachedToWindow();
        if (!this.f22790M) {
            this.f22785G = C9261c.m26212a().mo62520e(this.f22641c);
        }
        View view = this.f22796s;
        int i = 8;
        if (view != null) {
            view.setVisibility(this.f22801x == 0 ? 8 : 0);
        }
        SoundImageView soundImageView = this.f22794q;
        if (soundImageView != null) {
            soundImageView.setVisibility(this.f22802y == 0 ? 8 : 0);
        }
        TextView textView = this.f22795r;
        if (textView != null) {
            if (this.f22800w != 0) {
                i = 0;
            }
            textView.setVisibility(i);
            if (this.f22795r.getVisibility() == 0 && C2470b.m6168a().mo16428b()) {
                this.f22640b.setCampaignUnitId(this.f22641c);
                C2470b.m6168a().mo16423a(this.f22641c + "_" + 1, this.f22640b);
                C2470b.m6168a().mo16424a(this.f22641c + "_" + 1, this.f22797t);
            }
        }
        if (this.f22803z != null && (rootView = getRootView()) != null) {
            this.f22803z.removeFriendlyObstruction(rootView);
        }
    }

    public boolean playMute() {
        try {
            if (!(this.f22793p == null || this.f22798u == null)) {
                this.f22793p.closeSound();
                this.f22794q.setSoundStatus(false);
                this.f22782D = 1;
                try {
                    if (this.f22779A != null) {
                        this.f22779A.volumeChange(0.0f);
                    }
                } catch (IllegalArgumentException e) {
                    C8672v.m24874a("OMSDK", e.getMessage());
                }
                m26279a(this.f22798u, "onPlayerMute", this.f22642d);
                return true;
            }
        } catch (Exception e2) {
            C8672v.m24878d(BTBaseView.TAG, e2.getMessage());
        }
        return false;
    }

    public int getMute() {
        return this.f22782D;
    }

    public boolean playUnMute() {
        try {
            if (this.f22793p == null || this.f22798u == null) {
                return false;
            }
            this.f22793p.openSound();
            this.f22794q.setSoundStatus(true);
            this.f22782D = 2;
            try {
                if (this.f22779A != null) {
                    this.f22779A.volumeChange(1.0f);
                }
            } catch (IllegalArgumentException e) {
                C8672v.m24874a("OMSDK", e.getMessage());
            }
            m26279a(this.f22798u, "onUnmute", this.f22642d);
            return true;
        } catch (Exception e2) {
            C8672v.m24878d(BTBaseView.TAG, e2.getMessage());
            return false;
        }
    }

    public void play() {
        try {
            if (!this.f22790M) {
                String c = m26422c();
                this.f22787I = c;
                this.f22793p.initVFPData(c, this.f22640b.getVideoUrlEncode(), this.f22781C);
                if (this.f22785G == 1) {
                    playMute();
                } else {
                    playUnMute();
                }
                try {
                    if (this.f22780B != null) {
                        this.f22780B.impressionOccurred();
                    }
                    if (this.f22779A != null) {
                        float duration = (float) this.f22793p.getDuration();
                        float f = 0.0f;
                        if (duration == 0.0f && this.f22640b != null) {
                            duration = (float) this.f22640b.getVideoLength();
                        }
                        MediaEvents mediaEvents = this.f22779A;
                        if (getMute() == 2) {
                            f = 1.0f;
                        }
                        mediaEvents.start(duration, f);
                        C8672v.m24874a("omsdk", "play: videoEvents.start()");
                    }
                } catch (IllegalArgumentException e) {
                    C8672v.m24874a(BTBaseView.TAG, e.getMessage());
                }
                if (!this.f22793p.playVideo() && this.f22781C != null) {
                    this.f22781C.onPlayError("play video failed");
                }
                this.f22790M = true;
                return;
            }
            if (this.f22784F) {
                this.f22793p.playVideo(0);
                this.f22784F = false;
            } else {
                this.f22793p.start(false);
            }
            try {
                if (this.f22779A != null) {
                    this.f22779A.resume();
                    C8672v.m24874a("omsdk", "play:  videoEvents.resume()");
                }
            } catch (IllegalArgumentException e2) {
                C8672v.m24874a(BTBaseView.TAG, e2.getMessage());
            }
            if (this.f22798u != null) {
                m26279a(this.f22798u, "onPlayerPlay", this.f22642d);
            }
        } catch (Exception e3) {
            C8672v.m24875a(BTBaseView.TAG, e3.getMessage(), e3);
        }
    }

    public void resume() {
        try {
            if (this.f22793p != null) {
                if (this.f22784F) {
                    this.f22793p.playVideo(0);
                    this.f22784F = false;
                } else {
                    this.f22793p.onResume();
                }
                try {
                    if (this.f22779A != null) {
                        this.f22779A.resume();
                        C8672v.m24874a("omsdk", "play:  videoEvents.resume()");
                    }
                } catch (IllegalArgumentException e) {
                    C8672v.m24874a(BTBaseView.TAG, e.getMessage());
                }
                if (this.f22798u != null) {
                    m26279a(this.f22798u, "onPlayerResume", this.f22642d);
                }
            }
        } catch (Exception e2) {
            C8672v.m24878d(BTBaseView.TAG, e2.getMessage());
        }
    }

    public void pause() {
        try {
            if (this.f22793p != null) {
                this.f22793p.pause();
                if (this.f22779A != null) {
                    this.f22779A.pause();
                    C8672v.m24874a("omsdk", "play:  videoEvents.pause()");
                }
                if (this.f22798u != null) {
                    m26279a(this.f22798u, "onPlayerPause", this.f22642d);
                }
            }
        } catch (Exception e) {
            C8672v.m24875a(BTBaseView.TAG, e.getMessage(), e);
        }
    }

    public void stop() {
        try {
            if (this.f22793p != null) {
                this.f22793p.pause();
                this.f22793p.stop();
                this.f22784F = true;
                if (this.f22798u != null) {
                    m26279a(this.f22798u, "onPlayerStop", this.f22642d);
                }
            }
        } catch (Exception e) {
            C8672v.m24875a(BTBaseView.TAG, e.getMessage(), e);
        }
    }

    public void onDestory() {
        try {
            if (this.f22793p != null) {
                this.f22793p.setOnClickListener((View.OnClickListener) null);
                this.f22793p.release();
                this.f22793p = null;
            }
            if (this.f22794q != null) {
                this.f22794q.setOnClickListener((View.OnClickListener) null);
            }
            if (this.f22796s != null) {
                this.f22796s.setOnClickListener((View.OnClickListener) null);
            }
            if (this.f22798u != null) {
                this.f22798u = null;
            }
            if (this.f22803z != null) {
                this.f22803z = null;
            }
            if (this.f22779A != null) {
                this.f22779A = null;
            }
            setOnClickListener((View.OnClickListener) null);
        } catch (Throwable th) {
            C8672v.m24874a(BTBaseView.TAG, th.getMessage());
        }
    }

    /* renamed from: b */
    private boolean m26420b() {
        try {
            this.f22793p = (PlayerView) findViewById(findID("mbridge_vfpv"));
            this.f22794q = (SoundImageView) findViewById(findID("mbridge_sound_switch"));
            this.f22795r = (TextView) findViewById(findID("mbridge_tv_count"));
            this.f22796s = findViewById(findID("mbridge_rl_playing_close"));
            this.f22791N = (RelativeLayout) findViewById(findID("mbridge_top_control"));
            this.f22792O = (ProgressBar) findViewById(findID("mbridge_video_progress_bar"));
            this.f22797t = (FeedBackButton) findViewById(findID("mbridge_native_endcard_feed_btn"));
            this.f22793p.setIsBTVideo(true);
            return isNotNULL(this.f22793p, this.f22794q, this.f22795r, this.f22796s);
        } catch (Throwable th) {
            C8672v.m24875a(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    /* renamed from: c */
    private String m26422c() {
        try {
            String videoUrlEncode = this.f22640b.getVideoUrlEncode();
            if (this.f22799v == null) {
                return videoUrlEncode;
            }
            String d = this.f22799v.mo63635d();
            if (C8616ad.m24717a(d) || !new File(d).exists()) {
                return videoUrlEncode;
            }
            return d;
        } catch (Throwable th) {
            C8672v.m24875a(BTBaseView.TAG, th.getMessage(), th);
            return "";
        }
    }

    /* renamed from: d */
    private int m26423d() {
        int i = 5;
        try {
            C9637a b = C9638b.m27377a().mo63556b();
            if (b == null) {
                C9638b.m27377a().mo63558c();
            }
            if (b != null) {
                i = (int) b.mo63545f();
            }
            C8672v.m24876b(BTBaseView.TAG, "MBridgeBaseView buffetTimeout:" + i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62549a() {
        super.mo62549a();
        if (this.f22646h) {
            this.f22794q.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    boolean isSilent = MBridgeBTVideoView.this.f22793p.isSilent();
                    if (MBridgeBTVideoView.this.f22798u != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f22637n);
                            jSONObject.put("id", MBridgeBTVideoView.this.f22642d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("mute", MBridgeBTVideoView.this.f22782D);
                            jSONObject.put("data", jSONObject2);
                            C8887g.m25669a().mo58687a(MBridgeBTVideoView.this.f22798u, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                            C8672v.m24874a("OperateViews", "onPlayerMuteBtnClicked isMute = " + isSilent + " mute = " + MBridgeBTVideoView.this.f22782D);
                        } catch (Exception e) {
                            C9261c.m26212a().mo62502a(MBridgeBTVideoView.this.f22798u, e.getMessage());
                        }
                    }
                }
            });
            this.f22796s.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBridgeBTVideoView.this.f22798u != null) {
                        BTBaseView.m26279a(MBridgeBTVideoView.this.f22798u, "onPlayerCloseBtnClicked", MBridgeBTVideoView.this.f22642d);
                    }
                }
            });
            setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBridgeBTVideoView.this.f22779A != null) {
                        MBridgeBTVideoView.this.f22779A.adUserInteraction(InteractionType.CLICK);
                    }
                    if (MBridgeBTVideoView.this.f22798u != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f22637n);
                            jSONObject.put("id", MBridgeBTVideoView.this.f22642d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("x", String.valueOf(view.getX()));
                            jSONObject2.put("y", String.valueOf(view.getY()));
                            jSONObject.put("data", jSONObject2);
                            C8887g.m25669a().mo58687a(MBridgeBTVideoView.this.f22798u, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception unused) {
                            C9261c.m26212a().mo62503a(MBridgeBTVideoView.this.f22798u, "onClicked", MBridgeBTVideoView.this.f22642d);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView$a */
    private static final class C9296a extends DefaultVideoPlayerStatusListener {

        /* renamed from: a */
        private MBridgeBTVideoView f22807a;

        /* renamed from: b */
        private WebView f22808b;

        /* renamed from: c */
        private MediaEvents f22809c;

        /* renamed from: d */
        private String f22810d;

        /* renamed from: e */
        private String f22811e;

        /* renamed from: f */
        private int f22812f;

        /* renamed from: g */
        private int f22813g;

        /* renamed from: h */
        private boolean f22814h;

        /* renamed from: i */
        private boolean f22815i = false;

        /* renamed from: j */
        private boolean f22816j = false;

        /* renamed from: k */
        private boolean f22817k = false;

        /* renamed from: l */
        private int f22818l;

        /* renamed from: m */
        private int f22819m;

        /* renamed from: n */
        private boolean f22820n = false;

        public C9296a(MBridgeBTVideoView mBridgeBTVideoView, WebView webView, MediaEvents mediaEvents) {
            this.f22807a = mBridgeBTVideoView;
            this.f22808b = webView;
            this.f22809c = mediaEvents;
            if (mBridgeBTVideoView != null) {
                this.f22810d = mBridgeBTVideoView.f22642d;
                this.f22811e = mBridgeBTVideoView.f22641c;
            }
        }

        /* renamed from: a */
        public final void mo62712a(int i, int i2) {
            this.f22818l = i;
            this.f22819m = i2;
        }

        public final void onPlayStarted(int i) {
            super.onPlayStarted(i);
            if (!this.f22814h) {
                this.f22807a.f22792O.setMax(i);
                WebView webView = this.f22808b;
                if (webView != null) {
                    BTBaseView.m26279a(webView, "onPlayerPlay", this.f22810d);
                }
                this.f22814h = true;
            }
            boolean unused = MBridgeBTVideoView.f22778J = false;
        }

        public final void onPlayCompleted() {
            super.onPlayCompleted();
            if (this.f22807a.f22640b == null) {
                this.f22807a.f22795r.setText("0");
            } else if (this.f22807a.f22640b.getVideoCompleteTime() > 0) {
                this.f22807a.f22795r.setText(C8658p.m24799a(C8388a.m23845e().mo56913g(), "mbridge_reward_video_view_reward_time_complete", "string"));
            } else {
                this.f22807a.f22795r.setText("0");
            }
            this.f22807a.f22793p.setClickable(false);
            WebView webView = this.f22808b;
            if (webView != null) {
                BTBaseView.m26279a(webView, "onPlayerFinish", this.f22810d);
            }
            MediaEvents mediaEvents = this.f22809c;
            if (mediaEvents != null) {
                mediaEvents.complete();
                C8672v.m24874a("omsdk", "play:  videoEvents.complete()");
            }
            this.f22812f = this.f22813g;
            boolean unused = MBridgeBTVideoView.f22778J = true;
            this.f22807a.stop();
        }

        public final void onPlayError(String str) {
            super.onPlayError(str);
            if (this.f22808b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f22638o);
                    jSONObject.put("id", this.f22810d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.f22810d);
                    jSONObject.put("data", jSONObject2);
                    C8887g.m25669a().mo58687a(this.f22808b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C9261c.m26212a().mo62502a(this.f22808b, e.getMessage());
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:67:0x0217 A[Catch:{ Exception -> 0x0236 }] */
        /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onPlayProgress(int r9, int r10) {
            /*
                r8 = this;
                java.lang.String r0 = "id"
                java.lang.String r1 = "DefaultVideoPlayerStatusListener"
                super.onPlayProgress(r9, r10)
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r2 = r8.f22807a
                boolean r2 = r2.f22646h
                r3 = 1
                if (r2 == 0) goto L_0x00b5
                r2 = 0
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r8.f22807a
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f22640b
                if (r4 == 0) goto L_0x0040
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r2 = r8.f22807a
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2.f22640b
                int r2 = r2.getVideoCompleteTime()
                com.mbridge.msdk.foundation.b.b r4 = com.mbridge.msdk.foundation.p085b.C2470b.m6168a()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r6 = r8.f22807a
                com.mbridge.msdk.foundation.entity.CampaignEx r6 = r6.f22640b
                java.lang.String r6 = r6.getCampaignUnitId()
                r5.append(r6)
                java.lang.String r6 = "_"
                r5.append(r6)
                r5.append(r3)
                java.lang.String r5 = r5.toString()
                r4.mo16427b(r5, r9)
            L_0x0040:
                if (r2 <= r10) goto L_0x0043
                r2 = r10
            L_0x0043:
                if (r2 > 0) goto L_0x0048
                int r4 = r10 - r9
                goto L_0x004a
            L_0x0048:
                int r4 = r2 - r9
            L_0x004a:
                java.lang.String r5 = "string"
                if (r4 > 0) goto L_0x0072
                if (r2 > 0) goto L_0x0053
                java.lang.String r2 = "0"
                goto L_0x00ac
            L_0x0053:
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r2 = r8.f22807a
                android.content.Context r2 = r2.getContext()
                android.content.res.Resources r2 = r2.getResources()
                com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
                android.content.Context r4 = r4.mo56913g()
                java.lang.String r6 = "mbridge_reward_video_view_reward_time_complete"
                int r4 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r4, r6, r5)
                java.lang.CharSequence r2 = r2.getText(r4)
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x00ac
            L_0x0072:
                if (r2 > 0) goto L_0x007f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r4)
                java.lang.String r4 = ""
                goto L_0x00a5
            L_0x007f:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r4)
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r8.f22807a
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
                android.content.Context r6 = r6.mo56913g()
                java.lang.String r7 = "mbridge_reward_video_view_reward_time_left"
                int r5 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r6, r7, r5)
                java.lang.CharSequence r4 = r4.getText(r5)
                java.lang.String r4 = (java.lang.String) r4
            L_0x00a5:
                r2.append(r4)
                java.lang.String r2 = r2.toString()
            L_0x00ac:
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r8.f22807a
                android.widget.TextView r4 = r4.f22795r
                r4.setText(r2)
            L_0x00b5:
                r8.f22813g = r10
                r8.f22812f = r9
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r2 = r8.f22807a
                android.widget.ProgressBar r2 = r2.f22792O
                int r4 = r8.f22813g
                r2.setMax(r4)
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r2 = r8.f22807a
                android.widget.ProgressBar r2 = r2.f22792O
                int r4 = r8.f22812f
                r2.setProgress(r4)
                android.webkit.WebView r2 = r8.f22808b
                if (r2 == 0) goto L_0x0135
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0127 }
                r2.<init>()     // Catch:{ Exception -> 0x0127 }
                java.lang.String r4 = "code"
                int r5 = com.mbridge.msdk.video.p347bt.module.BTBaseView.f22637n     // Catch:{ Exception -> 0x0127 }
                r2.put(r4, r5)     // Catch:{ Exception -> 0x0127 }
                java.lang.String r4 = r8.f22810d     // Catch:{ Exception -> 0x0127 }
                r2.put(r0, r4)     // Catch:{ Exception -> 0x0127 }
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0127 }
                r4.<init>()     // Catch:{ Exception -> 0x0127 }
                java.lang.String r5 = r8.f22810d     // Catch:{ Exception -> 0x0127 }
                r4.put(r0, r5)     // Catch:{ Exception -> 0x0127 }
                java.lang.String r0 = "progress"
                java.lang.String r5 = com.mbridge.msdk.video.p347bt.module.MBridgeBTVideoView.m26419b(r9, r10)     // Catch:{ Exception -> 0x0127 }
                r4.put(r0, r5)     // Catch:{ Exception -> 0x0127 }
                java.lang.String r0 = "time"
                java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0127 }
                r4.put(r0, r5)     // Catch:{ Exception -> 0x0127 }
                java.lang.String r0 = "duration"
                java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x0127 }
                r4.put(r0, r5)     // Catch:{ Exception -> 0x0127 }
                java.lang.String r0 = "data"
                r2.put(r0, r4)     // Catch:{ Exception -> 0x0127 }
                com.mbridge.msdk.mbsignalcommon.windvane.g r0 = com.mbridge.msdk.mbsignalcommon.windvane.C8887g.m25669a()     // Catch:{ Exception -> 0x0127 }
                android.webkit.WebView r4 = r8.f22808b     // Catch:{ Exception -> 0x0127 }
                java.lang.String r5 = "onPlayerProgressChanged"
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0127 }
                byte[] r2 = r2.getBytes()     // Catch:{ Exception -> 0x0127 }
                r6 = 2
                java.lang.String r2 = android.util.Base64.encodeToString(r2, r6)     // Catch:{ Exception -> 0x0127 }
                r0.mo58687a((android.webkit.WebView) r4, (java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0127 }
                goto L_0x0135
            L_0x0127:
                r0 = move-exception
                com.mbridge.msdk.video.bt.a.c r2 = com.mbridge.msdk.video.p347bt.p348a.C9261c.m26212a()
                android.webkit.WebView r4 = r8.f22808b
                java.lang.String r0 = r0.getMessage()
                r2.mo62502a((android.webkit.WebView) r4, (java.lang.String) r0)
            L_0x0135:
                com.iab.omid.library.mmadbridge.adsession.media.MediaEvents r0 = r8.f22809c
                r2 = 100
                if (r0 == 0) goto L_0x0186
                int r4 = r9 * 100
                int r4 = r4 / r10
                int r5 = r9 + 1
                int r5 = r5 * r2
                int r5 = r5 / r10
                r6 = 25
                java.lang.String r7 = "omsdk"
                if (r4 > r6) goto L_0x0159
                if (r6 >= r5) goto L_0x0159
                boolean r6 = r8.f22815i
                if (r6 != 0) goto L_0x0159
                r8.f22815i = r3
                r0.firstQuartile()
                java.lang.String r0 = "play:  videoEvents.firstQuartile()"
                com.mbridge.msdk.foundation.tools.C8672v.m24874a(r7, r0)
                goto L_0x0186
            L_0x0159:
                r0 = 50
                if (r4 > r0) goto L_0x0170
                if (r0 >= r5) goto L_0x0170
                boolean r0 = r8.f22816j
                if (r0 != 0) goto L_0x0170
                r8.f22816j = r3
                com.iab.omid.library.mmadbridge.adsession.media.MediaEvents r0 = r8.f22809c
                r0.midpoint()
                java.lang.String r0 = "play:  videoEvents.midpoint()"
                com.mbridge.msdk.foundation.tools.C8672v.m24874a(r7, r0)
                goto L_0x0186
            L_0x0170:
                r0 = 75
                if (r4 > r0) goto L_0x0186
                if (r0 >= r5) goto L_0x0186
                boolean r0 = r8.f22817k
                if (r0 != 0) goto L_0x0186
                r8.f22817k = r3
                com.iab.omid.library.mmadbridge.adsession.media.MediaEvents r0 = r8.f22809c
                r0.thirdQuartile()
                java.lang.String r0 = "play:  videoEvents.thirdQuartile()"
                com.mbridge.msdk.foundation.tools.C8672v.m24874a(r7, r0)
            L_0x0186:
                int r0 = r8.f22818l     // Catch:{ Exception -> 0x0236 }
                if (r0 == r2) goto L_0x023e
                boolean r0 = r8.f22820n     // Catch:{ Exception -> 0x0236 }
                if (r0 != 0) goto L_0x023e
                int r0 = r8.f22818l     // Catch:{ Exception -> 0x0236 }
                if (r0 != 0) goto L_0x0193
                return
            L_0x0193:
                int r0 = r8.f22819m     // Catch:{ Exception -> 0x0236 }
                if (r0 < 0) goto L_0x023e
                int r0 = r8.f22819m     // Catch:{ Exception -> 0x0236 }
                int r10 = r10 * r0
                int r10 = r10 / r2
                if (r9 < r10) goto L_0x023e
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r9 = r8.f22807a     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.foundation.entity.CampaignEx r9 = r9.f22640b     // Catch:{ Exception -> 0x0236 }
                int r9 = r9.getAdType()     // Catch:{ Exception -> 0x0236 }
                r0 = 94
                if (r9 == r0) goto L_0x01e1
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r9 = r8.f22807a     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.foundation.entity.CampaignEx r9 = r9.f22640b     // Catch:{ Exception -> 0x0236 }
                int r9 = r9.getAdType()     // Catch:{ Exception -> 0x0236 }
                r0 = 287(0x11f, float:4.02E-43)
                if (r9 != r0) goto L_0x01b6
                goto L_0x01e1
            L_0x01b6:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0236 }
                r9.<init>()     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r0 = r8.f22807a     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f22640b     // Catch:{ Exception -> 0x0236 }
                java.lang.String r0 = r0.getId()     // Catch:{ Exception -> 0x0236 }
                r9.append(r0)     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r0 = r8.f22807a     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f22640b     // Catch:{ Exception -> 0x0236 }
                java.lang.String r0 = r0.getVideoUrlEncode()     // Catch:{ Exception -> 0x0236 }
                r9.append(r0)     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r0 = r8.f22807a     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f22640b     // Catch:{ Exception -> 0x0236 }
                java.lang.String r0 = r0.getBidToken()     // Catch:{ Exception -> 0x0236 }
                r9.append(r0)     // Catch:{ Exception -> 0x0236 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0236 }
                goto L_0x020b
            L_0x01e1:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0236 }
                r9.<init>()     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r0 = r8.f22807a     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f22640b     // Catch:{ Exception -> 0x0236 }
                java.lang.String r0 = r0.getRequestId()     // Catch:{ Exception -> 0x0236 }
                r9.append(r0)     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r0 = r8.f22807a     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f22640b     // Catch:{ Exception -> 0x0236 }
                java.lang.String r0 = r0.getId()     // Catch:{ Exception -> 0x0236 }
                r9.append(r0)     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r0 = r8.f22807a     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f22640b     // Catch:{ Exception -> 0x0236 }
                java.lang.String r0 = r0.getVideoUrlEncode()     // Catch:{ Exception -> 0x0236 }
                r9.append(r0)     // Catch:{ Exception -> 0x0236 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0236 }
            L_0x020b:
                com.mbridge.msdk.videocommon.download.c r0 = com.mbridge.msdk.videocommon.download.C9645c.getInstance()     // Catch:{ Exception -> 0x0236 }
                java.lang.String r2 = r8.f22811e     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.videocommon.download.a r9 = r0.mo63652a(r2, r9)     // Catch:{ Exception -> 0x0236 }
                if (r9 == 0) goto L_0x023e
                r9.mo63643j()     // Catch:{ Exception -> 0x0236 }
                r8.f22820n = r3     // Catch:{ Exception -> 0x0236 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0236 }
                r9.<init>()     // Catch:{ Exception -> 0x0236 }
                java.lang.String r0 = "CDRate is : "
                r9.append(r0)     // Catch:{ Exception -> 0x0236 }
                r9.append(r10)     // Catch:{ Exception -> 0x0236 }
                java.lang.String r10 = " and start download !"
                r9.append(r10)     // Catch:{ Exception -> 0x0236 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r9)     // Catch:{ Exception -> 0x0236 }
                goto L_0x023e
            L_0x0236:
                r9 = move-exception
                java.lang.String r9 = r9.getMessage()
                com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r9)
            L_0x023e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p347bt.module.MBridgeBTVideoView.C9296a.onPlayProgress(int, int):void");
        }

        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                if (this.f22809c != null) {
                    this.f22809c.bufferStart();
                }
                if ((str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) || str.equals(PlayerErrorConstant.PLAYERING_TIMEOUT)) && this.f22808b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f22637n);
                        jSONObject.put("id", this.f22810d);
                        jSONObject.put("data", new JSONObject());
                        C8887g.m25669a().mo58687a(this.f22808b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        C9261c.m26212a().mo62502a(this.f22808b, e.getMessage());
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                if (this.f22809c != null) {
                    this.f22809c.bufferFinish();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }
    }

    public void setSoundImageViewVisble(int i) {
        this.f22794q.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCountDownTextViewVisable(int i) {
        this.f22795r.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCloseViewVisable(int i) {
        this.f22796s.setVisibility(i == 0 ? 4 : 0);
    }

    public void setShowClose(int i) {
        this.f22801x = i;
    }

    public void setProgressBarState(int i) {
        ProgressBar progressBar = this.f22792O;
        if (progressBar != null) {
            progressBar.setVisibility(i == 0 ? 8 : 0);
        }
    }

    public void setShowMute(int i) {
        this.f22802y = i;
    }

    public void setShowTime(int i) {
        this.f22800w = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m26419b(int i, int i2) {
        if (i2 != 0) {
            double d = (double) (((float) i) / ((float) i2));
            try {
                return C8677z.m24904a(Double.valueOf(d)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i2 + "";
    }

    public void setVolume(float f, float f2) {
        PlayerView playerView = this.f22793p;
        if (playerView != null) {
            playerView.setVolume(f, f2);
        }
    }

    public void setPlaybackParams(float f) {
        PlayerView playerView = this.f22793p;
        if (playerView != null) {
            playerView.setPlaybackParams(f);
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = this.f22791N.getPaddingLeft();
        }
        if (i2 <= 0) {
            i2 = this.f22791N.getPaddingRight();
        }
        if (i3 <= 0) {
            i3 = this.f22791N.getPaddingTop();
        }
        if (i4 <= 0) {
            i4 = this.f22791N.getPaddingBottom();
        }
        C8672v.m24878d(BTBaseView.TAG, "NOTCH BTVideoView " + String.format("%1s-%2s-%3s-%4s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
        this.f22791N.setPadding(i, i3, i2, i4);
    }

    public void preLoadData() {
        String str;
        int i;
        if (this.f22640b.getAdType() == 94 || this.f22640b.getAdType() == 287) {
            str = this.f22640b.getRequestId() + this.f22640b.getId() + this.f22640b.getVideoUrlEncode();
        } else {
            str = this.f22640b.getId() + this.f22640b.getVideoUrlEncode() + this.f22640b.getBidToken();
        }
        C9641a a = C9645c.getInstance().mo63652a(this.f22641c, str);
        if (a != null) {
            this.f22799v = a;
        }
        this.f22783E = m26423d();
        try {
            if (this.f22640b != null && this.f22640b.isActiveOm()) {
                this.f22803z = C2427b.m5855a(getContext(), false, this.f22640b.getOmid(), this.f22640b.getRequestId(), this.f22640b.getId(), this.f22641c, "", this.f22640b.getRequestIdNotice());
            }
            if (this.f22803z != null) {
                if (this.f22793p != null) {
                    this.f22803z.registerAdView(this.f22793p);
                }
                if (this.f22794q != null) {
                    this.f22803z.addFriendlyObstruction(this.f22794q, FriendlyObstructionPurpose.OTHER, (String) null);
                }
                if (this.f22795r != null) {
                    this.f22803z.addFriendlyObstruction(this.f22795r, FriendlyObstructionPurpose.OTHER, (String) null);
                }
                if (this.f22796s != null) {
                    this.f22803z.addFriendlyObstruction(this.f22796s, FriendlyObstructionPurpose.VIDEO_CONTROLS, (String) null);
                }
                this.f22780B = AdEvents.createAdEvents(this.f22803z);
                this.f22779A = MediaEvents.createMediaEvents(this.f22803z);
                this.f22803z.start();
                this.f22780B.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
            }
        } catch (Throwable th) {
            C8672v.m24874a(BTBaseView.TAG, th.getMessage());
        }
        this.f22787I = m26422c();
        if (this.f22646h && !TextUtils.isEmpty(this.f22787I) && this.f22640b != null) {
            AdSession adSession = this.f22803z;
            if (adSession != null) {
                adSession.registerAdView(this.f22793p);
                this.f22803z.addFriendlyObstruction(this.f22794q, FriendlyObstructionPurpose.OTHER, (String) null);
                this.f22803z.addFriendlyObstruction(this.f22795r, FriendlyObstructionPurpose.OTHER, (String) null);
                this.f22803z.addFriendlyObstruction(this.f22796s, FriendlyObstructionPurpose.VIDEO_CONTROLS, (String) null);
            }
            C9296a aVar = new C9296a(this, this.f22798u, this.f22779A);
            this.f22781C = aVar;
            CampaignEx campaignEx = this.f22640b;
            if (campaignEx == null) {
                i = C9638b.m27377a().mo63551a(C8388a.m23845e().mo56914h(), this.f22641c, false).mo63598p();
            } else if (campaignEx.getReady_rate() != -1) {
                i = campaignEx.getReady_rate();
            } else {
                i = C9638b.m27377a().mo63551a(C8388a.m23845e().mo56914h(), this.f22641c, false).mo63598p();
            }
            aVar.mo62712a(i, C9638b.m27377a().mo63551a(C8388a.m23845e().mo56914h(), this.f22641c, false).mo63600q());
            this.f22793p.setDesk(false);
            this.f22793p.initBufferIngParam(this.f22783E);
            soundOperate(this.f22782D, -1, (String) null);
        }
        f22778J = false;
    }
}

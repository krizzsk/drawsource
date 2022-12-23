package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.VideoView;
import com.fyber.inneractive.sdk.C4109R;
import com.fyber.inneractive.sdk.util.IAlog;

public class InneractiveRichMediaVideoPlayerActivityCore extends Activity {
    public static final String VIDEO_CURRENT_POSITION = "video_current_position";
    public static final String VIDEO_URL = "video_url";

    /* renamed from: a */
    public VideoView f10137a;

    /* renamed from: b */
    public int f10138b = 0;

    /* renamed from: c */
    public final MediaPlayer.OnPreparedListener f10139c = new C4115a();

    /* renamed from: com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore$a */
    public class C4115a implements MediaPlayer.OnPreparedListener {
        public C4115a() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            IAlog.m16446a("onPrepared", new Object[0]);
            InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore = InneractiveRichMediaVideoPlayerActivityCore.this;
            inneractiveRichMediaVideoPlayerActivityCore.f10137a.seekTo(inneractiveRichMediaVideoPlayerActivityCore.f10138b);
            InneractiveRichMediaVideoPlayerActivityCore.this.f10137a.start();
        }
    }

    public static boolean startRichMediaIntent(Context context, String str) {
        Intent intent = new Intent(context, InneractiveRichMediaVideoPlayerActivityCore.class);
        intent.setFlags(268435456);
        intent.putExtra("video_url", str);
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            IAlog.m16446a("Activity InneractiveRichMediaVideoPlayerActivityCore was not found. Did you declare it in your AndroidManifest.xml?", new Object[0]);
            return false;
        }
    }

    public void initWindowFeatures() {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
    }

    public void onCreate(Bundle bundle) {
        initWindowFeatures();
        super.onCreate(bundle);
        if (bundle != null) {
            this.f10138b = bundle.getInt(VIDEO_CURRENT_POSITION, 0);
        }
        setContentView(C4109R.layout.ia_rich_media_video);
        this.f10137a = (VideoView) findViewById(C4109R.C4111id.mraid_video_view);
        Intent intent = getIntent();
        String stringExtra = (intent == null || !intent.hasExtra("video_url")) ? null : intent.getStringExtra("video_url");
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.m16446a("Error: video can not be played.", new Object[0]);
            finish();
        } else {
            this.f10137a.setVideoPath(stringExtra);
            this.f10137a.setOnCompletionListener(new C4123h(this));
            this.f10137a.setOnErrorListener(new C4124i(this));
            this.f10137a.setOnPreparedListener(this.f10139c);
        }
        findViewById(C4109R.C4111id.ia_iv_close_button).setOnClickListener(new C4122g(this));
    }

    public void onPause() {
        super.onPause();
        this.f10138b = this.f10137a.getCurrentPosition();
        this.f10137a.pause();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        VideoView videoView = this.f10137a;
        bundle.putInt(VIDEO_CURRENT_POSITION, videoView == null ? 0 : videoView.getCurrentPosition());
    }
}

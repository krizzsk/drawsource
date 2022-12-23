package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a */
public final class C4817a {

    /* renamed from: a */
    public final String f12781a;

    /* renamed from: b */
    public final boolean f12782b;

    /* renamed from: c */
    public final boolean f12783c;

    /* renamed from: d */
    public final String f12784d;

    /* renamed from: e */
    public final MediaCodecInfo.CodecCapabilities f12785e;

    public C4817a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z) {
        this.f12781a = (String) C4965a.m15047a(str);
        this.f12784d = str2;
        this.f12785e = codecCapabilities;
        boolean z2 = true;
        this.f12782b = !z && codecCapabilities != null && m14732a(codecCapabilities);
        this.f12783c = (codecCapabilities == null || !m14734b(codecCapabilities)) ? false : z2;
    }

    /* renamed from: b */
    public static boolean m14734b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C4991u.f13270a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: a */
    public boolean mo25311a(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12785e;
        if (codecCapabilities == null) {
            mo25310a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            mo25310a("sizeAndRate.vCaps");
            return false;
        } else if (m14733a(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || !m14733a(videoCapabilities, i2, i, d)) {
                mo25310a("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
                return false;
            }
            Log.d("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d) + "] [" + this.f12781a + ", " + this.f12784d + "] [" + C4991u.f13274e + "]");
            return true;
        }
    }

    /* renamed from: a */
    public final void mo25310a(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f12781a + ", " + this.f12784d + "] [" + C4991u.f13274e + "]");
    }

    /* renamed from: a */
    public static boolean m14732a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C4991u.f13270a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: a */
    public static boolean m14733a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }
}

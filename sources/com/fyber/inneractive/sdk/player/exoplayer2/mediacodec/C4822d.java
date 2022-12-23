package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d */
public final class C4822d {

    /* renamed from: a */
    public static final C4817a f12826a = new C4817a("OMX.google.raw.decoder", (String) null, (MediaCodecInfo.CodecCapabilities) null, false);

    /* renamed from: b */
    public static final Pattern f12827b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c */
    public static final HashMap<C4823a, List<C4817a>> f12828c = new HashMap<>();

    /* renamed from: d */
    public static final SparseIntArray f12829d;

    /* renamed from: e */
    public static final SparseIntArray f12830e;

    /* renamed from: f */
    public static final Map<String, Integer> f12831f;

    /* renamed from: g */
    public static int f12832g = -1;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d$a */
    public static final class C4823a {

        /* renamed from: a */
        public final String f12833a;

        /* renamed from: b */
        public final boolean f12834b;

        public C4823a(String str, boolean z) {
            this.f12833a = str;
            this.f12834b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C4823a.class) {
                return false;
            }
            C4823a aVar = (C4823a) obj;
            if (!TextUtils.equals(this.f12833a, aVar.f12833a) || this.f12834b != aVar.f12834b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f12833a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f12834b ? 1231 : 1237);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d$b */
    public static class C4824b extends Exception {
        public C4824b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d$c */
    public interface C4825c {
        /* renamed from: a */
        int mo25323a();

        /* renamed from: a */
        MediaCodecInfo mo25324a(int i);

        /* renamed from: a */
        boolean mo25325a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: b */
        boolean mo25326b();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d$d */
    public static final class C4826d implements C4825c {
        /* renamed from: a */
        public int mo25323a() {
            return MediaCodecList.getCodecCount();
        }

        /* renamed from: b */
        public boolean mo25326b() {
            return false;
        }

        /* renamed from: a */
        public MediaCodecInfo mo25324a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        /* renamed from: a */
        public boolean mo25325a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d$e */
    public static final class C4827e implements C4825c {

        /* renamed from: a */
        public final int f12835a;

        /* renamed from: b */
        public MediaCodecInfo[] f12836b;

        public C4827e(boolean z) {
            this.f12835a = z ? 1 : 0;
        }

        /* renamed from: a */
        public boolean mo25325a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        /* renamed from: b */
        public boolean mo25326b() {
            return true;
        }

        /* renamed from: a */
        public int mo25323a() {
            if (this.f12836b == null) {
                this.f12836b = new MediaCodecList(this.f12835a).getCodecInfos();
            }
            return this.f12836b.length;
        }

        /* renamed from: a */
        public MediaCodecInfo mo25324a(int i) {
            if (this.f12836b == null) {
                this.f12836b = new MediaCodecList(this.f12835a).getCodecInfos();
            }
            return this.f12836b[i];
        }
    }

    /* renamed from: a */
    public static C4817a m14761a(String str, boolean z) throws C4824b {
        List<T> list;
        C4825c cVar;
        synchronized (C4822d.class) {
            C4823a aVar = new C4823a(str, z);
            list = f12828c.get(aVar);
            if (list == null) {
                int i = C4991u.f13270a;
                if (i >= 21) {
                    cVar = new C4827e(z);
                } else {
                    cVar = new C4826d();
                }
                List<C4817a> a = m14762a(aVar, cVar);
                if (z && ((ArrayList) a).isEmpty() && 21 <= i && i <= 23) {
                    a = m14762a(aVar, (C4825c) new C4826d());
                    ArrayList arrayList = (ArrayList) a;
                    if (!arrayList.isEmpty()) {
                        Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C4817a) arrayList.get(0)).f12781a);
                    }
                }
                if (i < 26) {
                    int i2 = 1;
                    if (a.size() > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(a.get(0).f12781a)) {
                        while (true) {
                            if (i2 >= a.size()) {
                                break;
                            }
                            C4817a aVar2 = a.get(i2);
                            if ("OMX.google.raw.decoder".equals(aVar2.f12781a)) {
                                a.remove(i2);
                                a.add(0, aVar2);
                                break;
                            }
                            i2++;
                        }
                    }
                }
                list = Collections.unmodifiableList(a);
                f12828c.put(aVar, list);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return (C4817a) list.get(0);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12829d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f12830e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        f12831f = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    /* renamed from: a */
    public static int m14760a() throws C4824b {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        if (f12832g == -1) {
            int i2 = 0;
            C4817a a = m14761a("video/avc", false);
            if (a != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = a.f12785e;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = codecProfileLevelArr[i2].level;
                    if (i4 != 1 && i4 != 2) {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, C4991u.f13270a >= 21 ? 345600 : 172800);
            }
            f12832g = i2;
        }
        return f12832g;
    }

    /* renamed from: a */
    public static List<C4817a> m14762a(C4823a aVar, C4825c cVar) throws C4824b {
        ArrayList arrayList;
        String name;
        String str;
        boolean z;
        C4823a aVar2 = aVar;
        C4825c cVar2 = cVar;
        try {
            arrayList = new ArrayList();
            String str2 = aVar2.f12833a;
            int a = cVar.mo25323a();
            boolean b = cVar.mo25326b();
            int i = 0;
            while (i < a) {
                MediaCodecInfo a2 = cVar2.mo25324a(i);
                name = a2.getName();
                if (m14763a(a2, name, b)) {
                    String[] supportedTypes = a2.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i2 = 0;
                    while (i2 < length) {
                        str = supportedTypes[i2];
                        if (str.equalsIgnoreCase(str2)) {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = a2.getCapabilitiesForType(str);
                            boolean a3 = cVar2.mo25325a(str2, capabilitiesForType);
                            if (C4991u.f13270a <= 22) {
                                String str3 = C4991u.f13273d;
                                if ((str3.equals("ODROID-XU3") || str3.equals("Nexus 10")) && ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                                    z = true;
                                    if ((b && aVar2.f12834b == a3) || (!b && !aVar2.f12834b)) {
                                        arrayList.add(new C4817a(name, str2, capabilitiesForType, z));
                                    } else if (!b && a3) {
                                        arrayList.add(new C4817a(name + ".secure", str2, capabilitiesForType, z));
                                        return arrayList;
                                    }
                                }
                            }
                            z = false;
                            if (b || aVar2.f12834b == a3) {
                                arrayList.add(new C4817a(name + ".secure", str2, capabilitiesForType, z));
                                return arrayList;
                            }
                            arrayList.add(new C4817a(name, str2, capabilitiesForType, z));
                        }
                        i2++;
                        cVar2 = cVar;
                    }
                    continue;
                }
                i++;
                cVar2 = cVar;
            }
            return arrayList;
        } catch (Exception e) {
            if (C4991u.f13270a <= 23) {
                if (!arrayList.isEmpty()) {
                    Log.e("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                }
            }
            Log.e("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
            throw e;
        } catch (Exception e2) {
            throw new C4824b(e2);
        }
    }

    /* renamed from: a */
    public static boolean m14763a(MediaCodecInfo mediaCodecInfo, String str, boolean z) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = C4991u.f13270a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && "a70".equals(C4991u.f13271b)) {
            return false;
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str2 = C4991u.f13271b;
            if ("dlxu".equals(str2) || "protou".equals(str2) || "ville".equals(str2) || "villeplus".equals(str2) || "villec2".equals(str2) || str2.startsWith("gee") || "C6602".equals(str2) || "C6603".equals(str2) || "C6606".equals(str2) || "C6616".equals(str2) || "L36h".equals(str2) || "SO-02E".equals(str2)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str3 = C4991u.f13271b;
            if ("C1504".equals(str3) || "C1505".equals(str3) || "C1604".equals(str3) || "C1605".equals(str3)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(C4991u.f13272c)) {
            String str4 = C4991u.f13271b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i > 19 || !C4991u.f13271b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str)) {
            return true;
        }
        return false;
    }
}

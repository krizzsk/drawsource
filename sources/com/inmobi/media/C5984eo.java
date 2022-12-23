package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.adsession.media.PlayerState;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import java.util.Map;

/* renamed from: com.inmobi.media.eo */
/* compiled from: OmidAdSessionManagerImpl */
public final class C5984eo implements C5983en {

    /* renamed from: a */
    private AdSessionContext f15166a;

    /* renamed from: b */
    private final boolean f15167b;

    /* renamed from: c */
    private String f15168c;

    /* renamed from: d */
    private ImpressionType f15169d;

    /* renamed from: e */
    private byte f15170e;

    /* renamed from: f */
    private AdSession f15171f;

    /* renamed from: g */
    private C5982em f15172g;

    public C5984eo(String str, ImpressionType impressionType, AdSessionContext adSessionContext) {
        this(str, impressionType, adSessionContext, false);
    }

    public C5984eo(String str, ImpressionType impressionType, AdSessionContext adSessionContext, boolean z) {
        this.f15170e = 0;
        this.f15168c = str;
        this.f15169d = impressionType;
        this.f15166a = adSessionContext;
        this.f15167b = z;
    }

    /* renamed from: a */
    private static boolean m17809a(byte b, byte b2) {
        if (b == b2) {
            return true;
        }
        C6130gj a = C6130gj.m18161a();
        a.mo35310a(new C6167hk(new Exception("Omid AdSession State Error currentState :: " + b + ", expectedState :: " + b2)));
        return false;
    }

    /* renamed from: a */
    public final void mo35116a(int i, int i2, float f, VastProperties vastProperties) {
        if (m17809a(this.f15170e, (byte) 2)) {
            if (i == 0) {
                this.f15172g.mo35113a();
            } else if (i == 17) {
                ErrorType errorType = ErrorType.VIDEO;
                if (m17809a(this.f15170e, (byte) 2)) {
                    this.f15171f.error(errorType, "Unknown Player error");
                }
            }
            C5982em emVar = this.f15172g;
            if (emVar.f15165b != null) {
                switch (i) {
                    case 1:
                        emVar.f15165b.playerStateChange(PlayerState.FULLSCREEN);
                        return;
                    case 2:
                        emVar.f15165b.playerStateChange(PlayerState.NORMAL);
                        return;
                    case 4:
                        emVar.f15165b.adUserInteraction(InteractionType.CLICK);
                        return;
                    case 5:
                        emVar.f15164a.loaded(vastProperties);
                        return;
                    case 6:
                        emVar.f15165b.start((float) i2, f);
                        return;
                    case 7:
                        emVar.f15165b.pause();
                        return;
                    case 8:
                    case 16:
                        emVar.f15165b.resume();
                        return;
                    case 9:
                        emVar.f15165b.firstQuartile();
                        return;
                    case 10:
                        emVar.f15165b.midpoint();
                        return;
                    case 11:
                        emVar.f15165b.thirdQuartile();
                        return;
                    case 12:
                        emVar.f15165b.complete();
                        return;
                    case 13:
                    case 14:
                        MediaEvents mediaEvents = emVar.f15165b;
                        if (13 == i) {
                            f = 0.0f;
                        }
                        mediaEvents.volumeChange(f);
                        return;
                    case 15:
                        emVar.f15165b.skipped();
                        return;
                    case 18:
                        emVar.f15165b.adUserInteraction(InteractionType.INVITATION_ACCEPTED);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo35115a(int i) {
        if (!m17809a(this.f15170e, (byte) 2)) {
            return;
        }
        if (i == 0) {
            this.f15172g.mo35113a();
        } else if (i == 19) {
            C5982em emVar = this.f15172g;
            if (emVar.f15164a != null) {
                emVar.f15164a.loaded();
            }
        }
    }

    /* renamed from: a */
    private void m17807a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (m17809a(this.f15170e, (byte) 1)) {
            this.f15171f.addFriendlyObstruction(view, friendlyObstructionPurpose, (String) null);
        }
    }

    /* renamed from: a */
    public final void mo35114a() {
        this.f15171f.getAdSessionId();
        if (m17809a(this.f15170e, (byte) 2)) {
            this.f15171f.finish();
            this.f15171f = null;
            this.f15170e = 3;
        }
    }

    /* renamed from: a */
    public final void mo35118a(AdSessionContext adSessionContext) {
        if (adSessionContext != null) {
            this.f15166a = adSessionContext;
        }
    }

    /* renamed from: a */
    private void m17808a(View view, Map<View, FriendlyObstructionPurpose> map, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!childAt.equals(view)) {
                if (map == null || !map.containsKey(childAt)) {
                    m17807a(childAt, FriendlyObstructionPurpose.OTHER);
                }
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                    if (viewGroup2.getChildCount() > 0) {
                        m17808a(view, map, viewGroup2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo35117a(View view, Map<View, FriendlyObstructionPurpose> map, View view2) {
        if (this.f15171f == null) {
            boolean z = this.f15167b;
            Owner owner = Owner.JAVASCRIPT;
            Owner owner2 = null;
            CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
            String str = this.f15168c;
            char c = 65535;
            switch (str.hashCode()) {
                case -2139264536:
                    if (str.equals("native_display_ad")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1329992236:
                    if (str.equals("html_display_ad")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1191784049:
                    if (str.equals("native_video_ad")) {
                        c = 0;
                        break;
                    }
                    break;
                case 538665083:
                    if (str.equals("html_video_ad")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                owner = Owner.NATIVE;
                owner2 = Owner.NATIVE;
                creativeType = CreativeType.VIDEO;
            } else if (c == 1) {
                owner = Owner.NATIVE;
                owner2 = Owner.NONE;
                creativeType = CreativeType.NATIVE_DISPLAY;
            } else if (c == 2) {
                owner = Owner.JAVASCRIPT;
                owner2 = Owner.JAVASCRIPT;
                creativeType = CreativeType.VIDEO;
            } else if (c == 3) {
                owner = Owner.JAVASCRIPT;
                owner2 = Owner.NONE;
                creativeType = CreativeType.HTML_DISPLAY;
            }
            this.f15171f = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, this.f15169d, owner, owner2, z), this.f15166a);
            this.f15172g = new C5982em(this.f15171f, this.f15168c);
            this.f15170e = 1;
        }
        if (m17809a(this.f15170e, (byte) 1)) {
            this.f15171f.registerAdView(view);
        }
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                m17807a((View) next.getKey(), (FriendlyObstructionPurpose) next.getValue());
            }
        }
        if (!(view2 == null || view == null || !(view2 instanceof ViewGroup))) {
            m17808a(view, map, (ViewGroup) view2);
        }
        if (m17809a(this.f15170e, (byte) 1)) {
            this.f15171f.start();
            this.f15170e = 2;
        }
        this.f15171f.getAdSessionId();
    }
}

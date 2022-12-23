package com.fyber.inneractive.sdk.player;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.fyber.inneractive.sdk.config.C4204a0;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.config.global.features.C4234j;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.C4354g;
import com.fyber.inneractive.sdk.flow.C4360i;
import com.fyber.inneractive.sdk.flow.C4392y;
import com.fyber.inneractive.sdk.measurement.C4401a;
import com.fyber.inneractive.sdk.measurement.C4408g;
import com.fyber.inneractive.sdk.measurement.C4409h;
import com.fyber.inneractive.sdk.model.vast.C4420b;
import com.fyber.inneractive.sdk.model.vast.C4421c;
import com.fyber.inneractive.sdk.model.vast.C4431m;
import com.fyber.inneractive.sdk.model.vast.C4435q;
import com.fyber.inneractive.sdk.network.C4509p;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.player.C4530a;
import com.fyber.inneractive.sdk.player.C5015i;
import com.fyber.inneractive.sdk.player.controller.C4575c;
import com.fyber.inneractive.sdk.player.controller.C4582g;
import com.fyber.inneractive.sdk.player.enums.C4609a;
import com.fyber.inneractive.sdk.player.enums.C4610b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.response.C5235g;
import com.fyber.inneractive.sdk.response.C5237i;
import com.fyber.inneractive.sdk.util.C5290k;
import com.fyber.inneractive.sdk.util.C5307q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.media.Position;
import com.iab.omid.library.fyber.adsession.media.VastProperties;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.player.f */
public class C5008f extends C4533c implements C4530a.C4531a {

    /* renamed from: D */
    public static final HashMap<String, C5012b> f13358D = new C5009a();

    /* renamed from: A */
    public C4288z f13359A;

    /* renamed from: B */
    public C4354g f13360B;

    /* renamed from: C */
    public boolean f13361C;

    /* renamed from: x */
    public C4420b f13362x;

    /* renamed from: y */
    public C4609a f13363y;

    /* renamed from: z */
    public boolean f13364z;

    /* renamed from: com.fyber.inneractive.sdk.player.f$a */
    public class C5009a extends HashMap<String, C5012b> {

        /* renamed from: com.fyber.inneractive.sdk.player.f$a$a */
        public class C5010a implements C5012b {
            public C5010a(C5009a aVar) {
            }

            /* renamed from: a */
            public String mo25600a(C4582g gVar, VideoClickOrigin videoClickOrigin) {
                return videoClickOrigin.name().toLowerCase();
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.f$a$b */
        public class C5011b implements C5012b {
            public C5011b(C5009a aVar) {
            }

            /* renamed from: a */
            public String mo25600a(C4582g gVar, VideoClickOrigin videoClickOrigin) {
                int c;
                if (gVar == null || (c = gVar.mo24789c()) <= 0) {
                    return "00:00:00.000";
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j = (long) c;
                long hours = timeUnit.toHours(j);
                TimeUnit timeUnit2 = TimeUnit.HOURS;
                long minutes = timeUnit.toMinutes(j - timeUnit2.toMillis(hours));
                TimeUnit timeUnit3 = TimeUnit.MINUTES;
                long seconds = timeUnit.toSeconds((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes));
                return String.format("%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(timeUnit.toMillis(((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)))});
            }
        }

        public C5009a() {
            put("[CLICKAREA]", new C5010a(this));
            put("[ADPLAYHEAD]", new C5011b(this));
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.f$b */
    public interface C5012b {
        /* renamed from: a */
        String mo25600a(C4582g gVar, VideoClickOrigin videoClickOrigin);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5008f(Context context, C5235g gVar, C4288z zVar, InneractiveAdRequest inneractiveAdRequest, C4392y yVar, C4401a aVar) {
        super(context, zVar == null ? null : ((C4287y) zVar).mo24288b().mo24204c(), yVar != null ? yVar.mo24518b() : null);
        this.f13363y = C4609a.Uninitialized;
        this.f13361C = false;
        if (gVar == null || gVar.mo26318f() == null) {
            throw new IllegalArgumentException("IAVastMediaPlayerFlowManager ctor - vastData can't be null");
        }
        this.f11211h = aVar;
        this.f11209f = yVar;
        this.f13362x = gVar.mo26318f();
        this.f13360B = new C4354g(context, gVar, inneractiveAdRequest, this.f11209f.mo24518b());
        this.f11210g = inneractiveAdRequest;
        if (IAlog.f13936a <= 3) {
            IAlog.m16449d("IAVastMediaPlayerFlowManager:ctor - got media files: ", new Object[0]);
            for (int i = 0; i < this.f13362x.mo24608a(); i++) {
                C4431m mVar = (C4431m) ((ArrayList) this.f13362x.mo24610b()).get(i);
                if (mVar != null) {
                    IAlog.m16446a("IAVastMediaPlayerFlowManager(%d): %s", Integer.valueOf(i), mVar.mo24619a());
                }
            }
        }
        if (zVar != null) {
            mo25598a(zVar);
            C4287y yVar2 = (C4287y) zVar;
            if (yVar2.mo24287a() != null) {
                mo24720b(((C4204a0) yVar2.mo24287a()).mo24190b().booleanValue());
            }
        }
        mo25597a(gVar.mo26314b(), inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen(), gVar.mo26315c(), gVar.mo26313a(), zVar);
        if (yVar.mo24518b() != null) {
            this.f11224u = ((C4234j) yVar.mo24518b().mo24264a(C4234j.class)).mo24245a(gVar.mo26314b());
        } else {
            this.f11224u = IAConfigManager.m13176b().mo24276a().mo24271a(gVar.mo26314b() == UnitDisplayType.INTERSTITIAL ? "prebuffer_interstitial" : "prebuffer_rewarded", 10, 0);
        }
    }

    /* renamed from: a */
    public void mo24840a(C4610b bVar) {
        boolean z;
        JSONArray jSONArray;
        String str;
        int i;
        String str2;
        T t;
        VastProperties vastProperties;
        C4610b bVar2 = bVar;
        int i2 = 0;
        IAlog.m16446a("IAMediaPlayerFlowManager: onPlayerStateChanged with - %s", bVar2);
        C5013g gVar = this.f11213j;
        if (gVar != null && bVar2 != C4610b.Prepared) {
            gVar.mo24840a(bVar2);
        } else if (bVar2 == C4610b.Prepared && gVar != null) {
            gVar.f13368d = true;
        }
        int ordinal = bVar.ordinal();
        if (ordinal == 2) {
            IAlog.m16446a("IAMediaPlayerFlowManager: onPlayerPrepared called", new Object[0]);
            if (this.f11219p) {
                IAlog.m16446a("IMediaPlayerFlowManager: onPlayerPrepared is called, but object is already destroyed?? ignore", new Object[0]);
            } else {
                if (this.f11205b.mo24786a() && this.f11205b.mo24792e() != null) {
                    mo24714a(this.f11205b.mo24792e());
                }
                this.f11218o = true;
                mo24712a();
                if (!(this.f11212i == null || this.f11209f == null)) {
                    int intValue = ((C4287y) this.f13359A).f10549f.f10376h.value().intValue();
                    boolean a = C4533c.m13817a(this.f11205b.mo24790d(), this.f13359A, ((C5235g) this.f11209f.f10713b).f13887w);
                    boolean booleanValue = ((C4287y) this.f13359A).f10549f.f10369a.booleanValue();
                    C4408g gVar2 = this.f11212i;
                    if (!a) {
                        intValue = 0;
                    }
                    if (gVar2.f10813b != null) {
                        if (a) {
                            try {
                                vastProperties = VastProperties.createVastPropertiesForSkippableMedia((float) intValue, booleanValue, Position.STANDALONE);
                            } catch (Throwable th) {
                                gVar2.mo24588a(th);
                            }
                        } else {
                            vastProperties = VastProperties.createVastPropertiesForNonSkippableMedia(booleanValue, Position.STANDALONE);
                        }
                        gVar2.f10813b.loaded(vastProperties);
                    }
                }
                if (this.f11223t != null) {
                    C4392y yVar = this.f11209f;
                    if (yVar == null || yVar.f10713b == null || this.f11210g == null) {
                        z = false;
                    } else {
                        z = C4533c.m13817a(this.f11205b.mo24790d(), this.f13359A, ((C5235g) this.f11209f.f10713b).f13887w) && this.f11210g.getAllowFullscreen();
                        ((C5235g) this.f11209f.f10713b).f13882r.setVideo(new ImpressionData.Video(z, (long) ((int) TimeUnit.MILLISECONDS.toSeconds((long) this.f11205b.mo24790d()))));
                    }
                    try {
                        C4392y yVar2 = this.f11209f;
                        C5235g gVar3 = yVar2 != null ? (C5235g) yVar2.f10713b : null;
                        C4509p pVar = C4509p.EVENT_READY_ON_CLIENT;
                        InneractiveAdRequest inneractiveAdRequest = this.f11210g;
                        C4392y yVar3 = this.f11209f;
                        if (yVar3 == null) {
                            jSONArray = null;
                        } else {
                            jSONArray = yVar3.f10714c.mo24268c();
                        }
                        C4511q.C4512a aVar = new C4511q.C4512a(gVar3);
                        aVar.f11164c = pVar;
                        aVar.f11162a = inneractiveAdRequest;
                        aVar.f11165d = jSONArray;
                        if (!(this.f11225v == null || gVar3 == null)) {
                            IAlog.m16446a("Video content loader: Vast load took: " + (System.currentTimeMillis() - gVar3.f13892B) + " msec", new Object[0]);
                            C4392y yVar4 = this.f11209f;
                            if (yVar4 == null || (t = yVar4.f10713b) == null || ((C5235g) t).f13893C == null) {
                                str = "";
                                i = 0;
                            } else {
                                i2 = ((C5235g) t).f13893C.f10866h;
                                i = ((C5235g) t).f13893C.f10867i;
                                str = ((C5235g) t).f13893C.f10859a;
                            }
                            C4511q.C4514b a2 = new C4511q.C4514b().mo24695a("duration", Integer.valueOf(this.f11205b.mo24790d() / 1000)).mo24695a("url", this.f11225v.f10916g).mo24695a(MediaFile.BITRATE, this.f11225v.f10914e);
                            if (TextUtils.isEmpty(this.f11225v.f10913d)) {
                                str2 = "na";
                            } else {
                                str2 = this.f11225v.f10913d;
                            }
                            aVar.f11167f.put(a2.mo24695a("mime", str2).mo24695a(MediaFile.DELIVERY, this.f11225v.f10910a).mo24695a("load_time", Long.valueOf(System.currentTimeMillis() - gVar3.f13892B)).mo24695a("media_file_index", Integer.valueOf(this.f11222s)).mo24695a("player", this.f11205b.mo24793f()).mo24695a("is_video_skippable", Boolean.valueOf(z)).mo24695a("supported_media_files", Integer.valueOf(i2)).mo24695a("total_media_files", Integer.valueOf(i)).mo24695a("vast_version", str).f11177a);
                        }
                        aVar.mo24693a((String) null);
                    } catch (Exception unused) {
                    }
                    C5015i iVar = (C5015i) this.f11223t;
                    if (!iVar.f13375g) {
                        iVar.f13375g = true;
                        C5015i.C5017b bVar3 = iVar.f13372d;
                        if (bVar3 != null) {
                            ((C4360i) bVar3).mo24496d();
                        }
                    }
                }
            }
            mo24712a();
        } else if (ordinal != 3) {
            if (ordinal == 6) {
                this.f11205b.mo24789c();
                mo24712a();
            } else if (ordinal == 7) {
                mo24712a();
            } else if (ordinal == 8) {
                mo24712a();
            }
        } else if (this.f11208e == null) {
            C5290k.m16495m();
            mo24713a((long) (IAConfigManager.f10324J.f10343i.f10480a * 1000));
        }
        int ordinal2 = bVar.ordinal();
        if (ordinal2 != 6) {
            if (ordinal2 == 8) {
                mo25599a(C4609a.f11452g);
            }
        } else if (this.f13363y.equals(C4609a.f11452g)) {
            mo25599a(C4609a.Restarted);
        }
    }

    /* renamed from: c */
    public View mo24721c() {
        C4354g gVar = this.f13360B;
        if (gVar == null || !gVar.f10691f) {
            return null;
        }
        return gVar.f10692g;
    }

    /* renamed from: d */
    public C4575c mo24722d() {
        C4354g gVar = this.f13360B;
        if (gVar != null) {
            return gVar.f10694i;
        }
        return null;
    }

    /* renamed from: e */
    public void mo24841e() {
    }

    /* renamed from: f */
    public C4421c mo24724f() {
        C4420b bVar = this.f13362x;
        if (bVar != null) {
            return bVar.f10865g;
        }
        return null;
    }

    /* renamed from: a */
    public void mo24718a(boolean z) {
        C4251s sVar;
        if (z) {
            if (!this.f13361C) {
                C4509p pVar = C4509p.VAST_DEFAULT_COMPANION_DISPLAYED;
                InneractiveAdRequest inneractiveAdRequest = this.f11210g;
                C4392y yVar = this.f11209f;
                C5235g gVar = yVar != null ? (C5235g) yVar.f10713b : null;
                JSONArray c = (yVar == null || (sVar = yVar.f10714c) == null) ? null : sVar.mo24268c();
                C4511q.C4512a aVar = new C4511q.C4512a(gVar);
                aVar.f11164c = pVar;
                aVar.f11162a = inneractiveAdRequest;
                aVar.f11165d = c;
                aVar.mo24693a((String) null);
                this.f13361C = true;
            }
        } else if (mo24721c() != null && !this.f13360B.f10695j) {
            mo24716a(this.f13362x.f10865g, VideoClickOrigin.COMPANION, C4435q.EVENT_CREATIVE_VIEW);
            C4354g gVar2 = this.f13360B;
            if (!gVar2.f10695j) {
                C4509p pVar2 = C4509p.VAST_COMPANION_DISPLAYED;
                InneractiveAdRequest inneractiveAdRequest2 = gVar2.f10687b;
                C5235g gVar3 = gVar2.f10688c;
                C4251s sVar2 = gVar2.f10689d;
                JSONArray c2 = sVar2 == null ? null : sVar2.mo24268c();
                C4511q.C4512a aVar2 = new C4511q.C4512a(gVar3);
                aVar2.f11164c = pVar2;
                aVar2.f11162a = inneractiveAdRequest2;
                aVar2.f11165d = c2;
                aVar2.mo24692a("companion_data", gVar2.f10690e.f10865g.mo24612a());
                aVar2.mo24693a((String) null);
            }
            gVar2.f10695j = true;
        }
    }

    /* renamed from: a */
    public final void mo25597a(UnitDisplayType unitDisplayType, boolean z, int i, int i2, C4288z zVar) {
        C4354g gVar = this.f13360B;
        gVar.f10697l = unitDisplayType;
        gVar.f10698m = z;
        gVar.f10699n = i;
        gVar.f10700o = i2;
        gVar.f10701p = zVar;
    }

    /* renamed from: a */
    public void mo24839a(int i) {
        int d = this.f11205b.mo24790d();
        int ordinal = this.f13363y.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 3) {
                    if (ordinal == 4 && i > (d / 4) * 3) {
                        mo25599a(C4609a.ThirdPQuarter);
                        C4408g gVar = this.f11212i;
                        if (gVar != null && gVar.f10814c != null) {
                            IAlog.m16446a("%s thirdQuartile", "OMVideo");
                            try {
                                gVar.f10814c.thirdQuartile();
                            } catch (Throwable th) {
                                gVar.mo24588a(th);
                            }
                        }
                    }
                } else if (i > d / 2) {
                    mo25599a(C4609a.MidPoint);
                    C4408g gVar2 = this.f11212i;
                    if (gVar2 != null && gVar2.f10814c != null) {
                        IAlog.m16446a("%s midpoint", "OMVideo");
                        try {
                            gVar2.f10814c.midpoint();
                        } catch (Throwable th2) {
                            gVar2.mo24588a(th2);
                        }
                    }
                }
            } else if (i > d / 4) {
                mo25599a(C4609a.FirstQuarter);
                C4408g gVar3 = this.f11212i;
                if (gVar3 != null && gVar3.f10814c != null) {
                    IAlog.m16446a("%s firstQuartile", "OMVideo");
                    try {
                        gVar3.f10814c.firstQuartile();
                    } catch (Throwable th3) {
                        gVar3.mo24588a(th3);
                    }
                }
            }
        } else if (this.f11205b.f11382e != C4610b.Buffering) {
            mo25599a(C4609a.Started);
            C4408g gVar4 = this.f11212i;
            if (gVar4 != null) {
                if (gVar4.f10813b != null && !gVar4.f10816e) {
                    IAlog.m16446a("%s impression", "OMVideo");
                    gVar4.f10816e = true;
                    try {
                        gVar4.f10813b.impressionOccurred();
                    } catch (Throwable th4) {
                        gVar4.mo24588a(th4);
                    }
                }
                C4408g gVar5 = this.f11212i;
                long d2 = (long) this.f11205b.mo24790d();
                float f = this.f11205b.mo24796i() ? 0.0f : 1.0f;
                if (gVar5.f10814c != null && !gVar5.f10815d) {
                    gVar5.f10815d = true;
                    IAlog.m16446a("%s start", "OMVideo");
                    try {
                        gVar5.f10814c.start((float) d2, f);
                    } catch (Throwable th5) {
                        gVar5.mo24588a(th5);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo24715a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject) {
        mo24716a(this.f13362x, VideoClickOrigin.InvalidOrigin, C4435q.EVENT_ERROR);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!(this.f11225v == null || inneractiveVideoError.getPlayerError() == InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES)) {
                jSONObject.put("url", this.f11225v.f10916g);
                jSONObject.put(MediaFile.BITRATE, this.f11225v.f10914e);
                jSONObject.put("mime", this.f11225v.f10913d);
                jSONObject.put(MediaFile.DELIVERY, this.f11225v.f10910a);
            }
            C4582g gVar = this.f11205b;
            jSONObject.put("player", gVar != null ? gVar.mo24793f() : "");
            if (inneractiveVideoError.getCause() != null) {
                jSONObject.put("exception", inneractiveVideoError.getCause().getClass().getName());
                jSONObject.put("message", inneractiveVideoError.getCause().getMessage() == null ? "empty" : inneractiveVideoError.getCause().getMessage());
            }
        } catch (Exception unused) {
            IAlog.m16446a("onReportError: Failed creating Json object from media file!", new Object[0]);
        }
        IAlog.m16450e("IAMediaPlayerFlowManager: reporting error to listeners: %s", inneractiveVideoError.getPlayerError().toString());
        C5014h hVar = this.f11223t;
        if (hVar != null) {
            try {
                ((C5015i) hVar).mo25603a(inneractiveVideoError, (InneractiveErrorCode) null, jSONObject, this.f11221r);
            } catch (Exception e) {
                if (IAlog.f13936a <= 3) {
                    e.printStackTrace();
                }
            }
        }
        C5307q qVar = this.f11216m;
        if (qVar != null) {
            qVar.cancel(true);
            qVar.f14033b = null;
            this.f11217n = null;
        }
        mo24712a();
    }

    /* renamed from: a */
    public void mo24716a(C5237i iVar, VideoClickOrigin videoClickOrigin, C4435q... qVarArr) {
        if (qVarArr.length == 0) {
            IAlog.m16450e("IAVastMediaPlayerFlowManager: eventTypes array is empty", new Object[0]);
        } else if (iVar == null) {
            IAlog.m16450e("IAVastMediaPlayerFlowManager: parser is null", new Object[0]);
        } else {
            ArrayList arrayList = new ArrayList();
            for (C4435q qVar : qVarArr) {
                String str = qVar.f10949a;
                IAlog.m16446a("IAVastMediaPlayerFlowManager: Firing events for type: %s", str);
                List<String> a = iVar.mo24589a(qVar);
                if (a == null || a.size() == 0) {
                    IAlog.m16446a("IAVastMediaPlayerFlowManager: no events for type: %s", str);
                } else {
                    arrayList.addAll(a);
                    IAlog.m16446a("found %d events for type: %s", Integer.valueOf(a.size()), str);
                    m15181a(a, qVar);
                }
                if (qVar == C4435q.EVENT_CLICK) {
                    for (Map.Entry next : f13358D.entrySet()) {
                        String str2 = (String) next.getKey();
                        String a2 = ((C5012b) next.getValue()).mo25600a(this.f11205b, videoClickOrigin);
                        for (int i = 0; i < arrayList.size(); i++) {
                            String str3 = (String) arrayList.get(i);
                            if (str3.contains(str2)) {
                                arrayList.set(i, str3.replace(str2, a2));
                            }
                        }
                    }
                }
            }
            C4533c.m13816a((List<String>) arrayList);
        }
    }

    /* renamed from: a */
    public static void m15180a(C5237i iVar, C4435q... qVarArr) {
        ArrayList arrayList = new ArrayList();
        for (C4435q qVar : qVarArr) {
            String str = qVar.f10949a;
            IAlog.m16446a("IAVastMediaPlayerFlowManager: Firing events for type: %s", str);
            List<String> a = ((C4409h) iVar).mo24589a(qVar);
            if (a == null || a.size() == 0) {
                IAlog.m16446a("IAVastMediaPlayerFlowManager: no events for type: %s", str);
            } else {
                arrayList.addAll(a);
                IAlog.m16446a("found %d events for type: %s", Integer.valueOf(a.size()), str);
                m15181a(a, qVar);
            }
        }
        C4533c.m13816a((List<String>) arrayList);
    }

    /* renamed from: a */
    public static void m15181a(List<String> list, C4435q qVar) {
        for (String next : list) {
            IAlog.m16446a("   event url: %s", next);
            if (!TextUtils.isEmpty(next)) {
                int i = IAlog.f13936a;
                IAlog.m16444a(1, (Exception) null, "%s %s %s", "VAST_EVENT", qVar.f10949a, next);
                IAlog.m16444a(1, (Exception) null, "Tracking URLs array: %s", "VPAID", next);
            }
        }
    }

    /* renamed from: a */
    public final void mo25599a(C4609a aVar) {
        if (this.f13363y != aVar) {
            if (aVar == C4609a.Started) {
                this.f13364z = false;
                mo24716a(this.f13362x, VideoClickOrigin.InvalidOrigin, C4435q.EVENT_IMPRESSION, C4435q.EVENT_START);
            } else if (aVar == C4609a.FirstQuarter) {
                mo24716a(this.f13362x, VideoClickOrigin.InvalidOrigin, C4435q.EVENT_FIRSTQ);
            } else if (aVar == C4609a.MidPoint) {
                mo24716a(this.f13362x, VideoClickOrigin.InvalidOrigin, C4435q.EVENT_MID);
            } else if (aVar == C4609a.ThirdPQuarter) {
                mo24716a(this.f13362x, VideoClickOrigin.InvalidOrigin, C4435q.EVENT_THIRDQ);
            } else if (aVar == C4609a.f11452g && !this.f13364z) {
                this.f13364z = true;
                mo24716a(this.f13362x, VideoClickOrigin.InvalidOrigin, C4435q.EVENT_COMPLETE);
            } else if (aVar == C4609a.Restarted) {
                mo24716a(this.f13362x, VideoClickOrigin.InvalidOrigin, C4435q.EVENT_REWIND);
            }
            this.f13363y = aVar;
        }
    }

    /* renamed from: a */
    public void mo25598a(C4288z zVar) {
        this.f13359A = zVar;
    }
}

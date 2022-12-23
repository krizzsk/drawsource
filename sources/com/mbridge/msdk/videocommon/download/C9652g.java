package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.same.p301b.C8476c;
import com.mbridge.msdk.foundation.same.p301b.C8478e;
import com.mbridge.msdk.foundation.same.p304e.C8490a;
import com.mbridge.msdk.foundation.tools.C8617ae;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.videocommon.download.C9649f;
import com.mbridge.msdk.videocommon.download.C9661h;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mbridge.msdk.videocommon.download.g */
/* compiled from: H5DownLoadManager */
public class C9652g {

    /* renamed from: c */
    private static C9652g f24047c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public CopyOnWriteArrayList<String> f24048a;

    /* renamed from: b */
    private ConcurrentMap<String, C9644b> f24049b;

    /* renamed from: d */
    private C9667j f24050d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C9661h f24051e;

    /* renamed from: f */
    private boolean f24052f = false;

    /* renamed from: com.mbridge.msdk.videocommon.download.g$a */
    /* compiled from: H5DownLoadManager */
    public interface C9657a {
        /* renamed from: a */
        void mo58372a(String str);

        /* renamed from: a */
        void mo58373a(String str, String str2);
    }

    /* renamed from: com.mbridge.msdk.videocommon.download.g$b */
    /* compiled from: H5DownLoadManager */
    public interface C9658b extends C9657a {
    }

    /* renamed from: com.mbridge.msdk.videocommon.download.g$c */
    /* compiled from: H5DownLoadManager */
    public interface C9659c {
        /* renamed from: a */
        void mo63648a();

        /* renamed from: a */
        void mo63650a(String str);

        /* renamed from: a */
        void mo63651a(String str, byte[] bArr, String str2);
    }

    /* renamed from: com.mbridge.msdk.videocommon.download.g$d */
    /* compiled from: H5DownLoadManager */
    public interface C9660d extends C9657a {
    }

    private C9652g() {
        try {
            this.f24050d = C9667j.m27573a();
            this.f24051e = C9661h.C9663a.f24065a;
            this.f24048a = new CopyOnWriteArrayList<>();
            this.f24049b = new ConcurrentHashMap();
            C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
            if (b != null) {
                this.f24052f = b.mo16236i(1);
            }
        } catch (Throwable th) {
            C8672v.m24875a("H5DownLoadManager", th.getMessage(), th);
        }
    }

    /* renamed from: a */
    public static synchronized C9652g m27539a() {
        C9652g gVar;
        synchronized (C9652g.class) {
            if (f24047c == null) {
                f24047c = new C9652g();
            }
            gVar = f24047c;
        }
        return gVar;
    }

    /* renamed from: a */
    public final String mo63668a(String str) {
        C9667j jVar = this.f24050d;
        if (jVar != null) {
            return jVar.mo63684a(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo63669a(final String str, final C9657a aVar) {
        if (!this.f24052f) {
            try {
                C8672v.m24878d("H5DownLoadManager", "download url:" + str);
                if (!this.f24048a.contains(str)) {
                    this.f24048a.add(str);
                    C9649f.C9651a.f24046a.mo63667a(new C8490a() {
                        /* renamed from: b */
                        public final void mo37111b() {
                        }

                        /* renamed from: a */
                        public final void mo37110a() {
                            if (!TextUtils.isEmpty(C9652g.this.f24051e.mo63674b(str))) {
                                C9652g.this.f24048a.remove(str);
                                C9657a aVar = aVar;
                                if (aVar != null) {
                                    aVar.mo58372a(str);
                                    return;
                                }
                                return;
                            }
                            C9647e.m27535a(str, new C9659c() {
                                /* renamed from: a */
                                public final void mo63648a() {
                                }

                                /* renamed from: a */
                                public final void mo63651a(String str, byte[] bArr, String str2) {
                                    try {
                                        C9652g.this.f24048a.remove(str2);
                                        if (bArr != null && bArr.length > 0) {
                                            if (C9652g.this.f24051e.mo63673a(str2, bArr)) {
                                                if (aVar != null) {
                                                    aVar.mo58372a(str2);
                                                }
                                            } else if (aVar != null) {
                                                aVar.mo58373a(str2, "save file failed");
                                            }
                                        }
                                    } catch (Exception e) {
                                        if (MBridgeConstans.DEBUG) {
                                            e.printStackTrace();
                                        }
                                        if (aVar != null) {
                                            aVar.mo58373a(str2, e.getMessage());
                                        }
                                    }
                                }

                                /* renamed from: a */
                                public final void mo63650a(String str) {
                                    try {
                                        C9652g.this.f24048a.remove(str);
                                        if (aVar != null) {
                                            aVar.mo58373a(str, str);
                                        }
                                    } catch (Exception e) {
                                        if (MBridgeConstans.DEBUG) {
                                            e.printStackTrace();
                                        }
                                        if (aVar != null) {
                                            aVar.mo58373a(str, str);
                                        }
                                    }
                                }
                            }, true);
                        }
                    });
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        } else if (!TextUtils.isEmpty(str)) {
            try {
                new URL(str);
                String md5 = SameMD5.getMD5(C8617ae.m24719a(str));
                MBDownloadManager.getInstance().download(new DownloadMessage(new Object(), str, md5 + ".html", 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_HTML)).withReadTimeout(30000).withConnectTimeout((long) SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(C8478e.m24306b(C8476c.MBRIDGE_700_HTML) + "/").withDownloadStateListener(new OnDownloadStateListener() {
                    public final void onDownloadStart(DownloadMessage downloadMessage) {
                    }

                    public final void onDownloadComplete(DownloadMessage downloadMessage) {
                        C9657a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo58372a(str);
                        }
                    }

                    public final void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
                        C9657a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo58373a(str, downloadError.getException().getMessage());
                        }
                    }
                }).build().start();
            } catch (Exception unused) {
                if (aVar != null) {
                    aVar.mo58373a("zip url is unlawful", str);
                }
            }
        } else if (aVar != null) {
            aVar.mo58373a("zip url is null", str);
        }
    }

    /* renamed from: b */
    public final void mo63671b(String str, C9657a aVar) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                String path = Uri.parse(str).getPath();
                if (!TextUtils.isEmpty(path)) {
                    if (path.toLowerCase().endsWith(".zip")) {
                        final C9660d dVar = (C9660d) aVar;
                        if (!this.f24052f) {
                            try {
                                if (TextUtils.isEmpty(this.f24050d.mo63684a(str))) {
                                    if (this.f24049b.containsKey(str)) {
                                        C9644b bVar = (C9644b) this.f24049b.get(str);
                                        if (bVar != null) {
                                            bVar.mo63649a(dVar);
                                            return;
                                        }
                                        return;
                                    }
                                    C9644b bVar2 = new C9644b(this.f24049b, this.f24050d, dVar, str);
                                    this.f24049b.put(str, bVar2);
                                    C9647e.m27535a(str, bVar2, true);
                                    return;
                                } else if (dVar != null) {
                                    dVar.mo58372a(str);
                                    return;
                                } else {
                                    return;
                                }
                            } catch (Exception e) {
                                if (dVar != null) {
                                    dVar.mo58373a(str, "downloadzip failed");
                                }
                                if (MBridgeConstans.DEBUG) {
                                    e.printStackTrace();
                                    return;
                                }
                                return;
                            }
                        } else if (!TextUtils.isEmpty(str)) {
                            try {
                                new URL(str);
                                String b = C8478e.m24306b(C8476c.MBRIDGE_700_RES);
                                String md5 = SameMD5.getMD5(C8617ae.m24719a(str));
                                final String str2 = b + "/" + md5;
                                MBDownloadManager.getInstance().download(new DownloadMessage(new Object(), str, md5 + ".zip", 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP)).withReadTimeout(30000).withConnectTimeout((long) SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(b + "/").withDownloadStateListener(new OnDownloadStateListener() {
                                    public final void onDownloadStart(DownloadMessage downloadMessage) {
                                    }

                                    public final void onDownloadComplete(DownloadMessage downloadMessage) {
                                        try {
                                            if (TextUtils.isEmpty(C9667j.m27573a().mo63684a(downloadMessage.getDownloadUrl()))) {
                                                MBResourceManager.getInstance().unZip(downloadMessage.getSaveFilePath(), str2);
                                            }
                                            if (dVar != null) {
                                                dVar.mo58372a(downloadMessage.getDownloadUrl());
                                            }
                                        } catch (IOException e) {
                                            C9660d dVar = dVar;
                                            if (dVar != null) {
                                                dVar.mo58373a(downloadMessage.getDownloadUrl(), e.getMessage());
                                            }
                                        }
                                    }

                                    public final void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
                                        if (!TextUtils.isEmpty(C9667j.m27573a().mo63684a(downloadMessage.getDownloadUrl()))) {
                                            C9660d dVar = dVar;
                                            if (dVar != null) {
                                                dVar.mo58372a(downloadMessage.getDownloadUrl());
                                                return;
                                            }
                                            return;
                                        }
                                        C9660d dVar2 = dVar;
                                        if (dVar2 != null) {
                                            dVar2.mo58373a(downloadMessage.getDownloadUrl(), downloadError.getException().getMessage());
                                        }
                                    }
                                }).build().start();
                                return;
                            } catch (Exception unused) {
                                if (dVar != null) {
                                    dVar.mo58373a(str, "zip url is unlawful");
                                    return;
                                }
                                return;
                            }
                        } else if (dVar != null) {
                            dVar.mo58373a(str, "zip url is null");
                            return;
                        } else {
                            return;
                        }
                    } else {
                        mo63669a(str, aVar);
                        return;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (aVar != null) {
            aVar.mo58373a(str, "The URL does not contain a path ");
        }
    }

    /* renamed from: b */
    public final String mo63670b(String str) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                Uri parse = Uri.parse(str);
                String path = parse.getPath();
                if (TextUtils.isEmpty(path) || !TextUtils.isEmpty(parse.getQueryParameter("urlDebug"))) {
                    return str;
                }
                if (path.toLowerCase().endsWith(".zip")) {
                    return mo63668a(str);
                }
                return this.f24051e != null ? this.f24051e.mo63672a(str) : str;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
}

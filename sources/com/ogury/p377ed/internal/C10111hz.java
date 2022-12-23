package com.ogury.p377ed.internal;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.webkit.DownloadListener;
import android.widget.Toast;
import com.vungle.warren.p395ui.JavascriptBridge;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ogury.ed.internal.hz */
public final class C10111hz implements DownloadListener {

    /* renamed from: a */
    private final Context f25393a;

    public C10111hz(Context context) {
        C10263mq.m29882b(context, "context");
        this.f25393a = context;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        String str5;
        C10263mq.m29882b(str, "url");
        C10263mq.m29882b(str2, "userAgent");
        C10263mq.m29882b(str3, "contentDisposition");
        C10263mq.m29882b(str4, "mimetype");
        if (C10053gh.m29193a(this.f25393a, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            Uri parse = Uri.parse(str);
            String path = parse.getPath();
            List<String> b = path == null ? null : new C10308ob("/").mo65165b(path);
            if (b != null && (b.isEmpty() ^ true)) {
                str5 = (String) C10190km.m29767c(b);
            } else {
                str5 = UUID.randomUUID().toString();
                C10263mq.m29879a((Object) str5, "randomUUID().toString()");
            }
            DownloadManager.Request request = new DownloadManager.Request(parse);
            request.setTitle(str5);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, JavascriptBridge.MraidHandler.DOWNLOAD_ACTION);
            Object systemService = this.f25393a.getSystemService(JavascriptBridge.MraidHandler.DOWNLOAD_ACTION);
            if (systemService != null) {
                ((DownloadManager) systemService).enqueue(request);
                Context context = this.f25393a;
                C10268mv mvVar = C10268mv.f25610a;
                String format = String.format("Start downloading %s", Arrays.copyOf(new Object[]{str5}, 1));
                C10263mq.m29879a((Object) format, "java.lang.String.format(format, *args)");
                Toast.makeText(context, format, 0).show();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.DownloadManager");
        }
    }
}

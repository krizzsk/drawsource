package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.click.p217a.C6772a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p304e.C8493b;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;

public final class CommonJumpLoader extends C6783c {

    /* renamed from: a */
    JumpLoaderResult f17815a = null;

    /* renamed from: b */
    private int f17816b = 0;

    /* renamed from: c */
    private String f17817c = null;

    /* renamed from: d */
    private int f17818d;

    /* renamed from: e */
    private C6784d f17819e = null;

    /* renamed from: f */
    private boolean f17820f = true;

    /* renamed from: g */
    private C8493b f17821g;

    /* renamed from: h */
    private C6794g f17822h;

    /* renamed from: i */
    private Handler f17823i = new Handler(Looper.getMainLooper());

    public CommonJumpLoader(Context context) {
        this.f17821g = new C8493b(context);
        this.f17822h = new C6794g(context);
    }

    /* renamed from: a */
    public final void mo37015a(String str, CampaignEx campaignEx, C6784d dVar, String str2, boolean z, boolean z2, int i) {
        String str3;
        this.f17817c = str2;
        this.f17819e = dVar;
        this.f17815a = null;
        this.f17818d = i;
        boolean z3 = false;
        if (campaignEx != null) {
            if ("5".equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode())) {
                z3 = true;
            }
            str3 = campaignEx.getId();
        } else {
            str3 = "";
        }
        String str4 = str3;
        this.f17822h.mo37108a(str2, dVar, z3, str4, str, campaignEx, z, z2, i);
    }

    /* renamed from: a */
    public final void mo37014a(String str, CampaignEx campaignEx, C6784d dVar) {
        this.f17817c = new String(campaignEx.getClickURL());
        this.f17819e = dVar;
        this.f17815a = null;
        this.f17822h.mo37108a(campaignEx.getClickURL(), dVar, "5".equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode()), campaignEx.getId(), str, campaignEx, true, false, C6772a.f17859j);
    }

    /* renamed from: a */
    public final void mo37013a() {
        this.f17820f = false;
    }

    public static class JumpLoaderResult implements NoProGuard, Serializable {
        public static final int CODE_DOWNLOAD = 3;
        public static final int CODE_LINK = 2;
        public static final int CODE_MARKET = 1;
        public static final int CODE_NULL = 4;
        private static final long serialVersionUID = 1;
        private int code;
        private String content;
        private String exceptionMsg;
        private String header;
        private boolean is302Jump;
        private boolean jumpDone;
        private String msg;
        private String noticeurl;
        private int statusCode;
        private boolean success;
        private int type;
        private String url;

        public int getStatusCode() {
            return this.statusCode;
        }

        public void setStatusCode(int i) {
            this.statusCode = i;
        }

        public boolean isIs302Jump() {
            return this.is302Jump;
        }

        public void setIs302Jump(boolean z) {
            this.is302Jump = z;
        }

        public int getType() {
            return this.type;
        }

        public void setType(int i) {
            this.type = i;
        }

        public String getHeader() {
            return this.header;
        }

        public void setHeader(String str) {
            this.header = str;
        }

        public String getExceptionMsg() {
            return this.exceptionMsg;
        }

        public void setExceptionMsg(String str) {
            this.exceptionMsg = str;
        }

        public String getContent() {
            return this.content;
        }

        public void setContent(String str) {
            this.content = str;
        }

        public String getNoticeurl() {
            return this.noticeurl;
        }

        public void setNoticeurl(String str) {
            this.noticeurl = str;
        }

        public boolean isSuccess() {
            return this.success;
        }

        public void setSuccess(boolean z) {
            this.success = z;
        }

        public String getMsg() {
            return this.msg;
        }

        public void setMsg(String str) {
            this.msg = str;
        }

        public int getCode() {
            return this.code;
        }

        public void setCode(int i) {
            this.code = i;
        }

        public String getUrl() {
            return this.url;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public boolean isjumpDone() {
            return this.jumpDone;
        }

        public void setjumpDone(boolean z) {
            this.jumpDone = z;
        }
    }
}

package p401io.presage.common.token;

import android.content.Context;
import android.util.Base64;
import com.ogury.p377ed.internal.C10008ez;
import com.ogury.p377ed.internal.C10012fa;
import com.ogury.p377ed.internal.C10034fs;
import com.ogury.p377ed.internal.C10040fx;
import com.ogury.p377ed.internal.C10263mq;
import com.ogury.p377ed.internal.C10302nz;
import com.ogury.p377ed.internal.C9928dc;
import com.ogury.p377ed.internal.C9961dq;

/* renamed from: io.presage.common.token.OguryTokenProvider */
public final class OguryTokenProvider {

    /* renamed from: a */
    public static final OguryTokenProvider f29808a = new OguryTokenProvider();

    private OguryTokenProvider() {
    }

    public static final String getBidderToken(Context context) {
        C10263mq.m29882b(context, "context");
        String jSONObject = new C10034fs(new C10012fa(context), new C10008ez(context), new C10040fx(context), C9928dc.f24979a, new C9961dq(context).mo64477a()).mo64730a().mo64726a().toString();
        C10263mq.m29879a((Object) jSONObject, "tokenBuilder.build().serializedJson.toString()");
        byte[] bytes = jSONObject.getBytes(C10302nz.f25622a);
        C10263mq.m29879a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 2);
        C10263mq.m29879a((Object) encodeToString, "encodeToString(token.toB…eArray(), Base64.NO_WRAP)");
        return encodeToString;
    }
}

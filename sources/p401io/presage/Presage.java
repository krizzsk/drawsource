package p401io.presage;

import android.content.Context;
import com.ogury.sdk.Ogury;
import com.ogury.sdk.OguryConfiguration;

@Deprecated
/* renamed from: io.presage.Presage */
public class Presage {

    /* renamed from: a */
    private static Presage f29802a;

    @Deprecated
    public static Presage getInstance() {
        if (f29802a == null) {
            f29802a = new Presage();
        }
        return f29802a;
    }

    private Presage() {
    }

    @Deprecated
    public void start(String str, Context context) {
        Ogury.start(new OguryConfiguration.Builder(context, str).build());
    }
}

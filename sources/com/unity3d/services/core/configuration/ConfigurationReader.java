package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.properties.C12088d;
import com.unity3d.services.core.webview.C12136a;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigurationReader {

    /* renamed from: a */
    private Configuration f29209a;

    /* renamed from: a */
    private Configuration m32625a() {
        Configuration configuration = this.f29209a;
        if (configuration != null) {
            return configuration;
        }
        File file = new File(C12088d.m32938k());
        if (file.exists()) {
            try {
                this.f29209a = new Configuration(new JSONObject(new String(C12080j.m32882a(file))));
            } catch (IOException | JSONException unused) {
                C12065a.m32845b("Unable to read configuration from storage");
                this.f29209a = null;
            }
        }
        return this.f29209a;
    }

    /* renamed from: b */
    private Configuration m32626b() {
        if (C12136a.m33103c() == null) {
            return null;
        }
        return C12136a.m33103c().mo71312b();
    }

    public Configuration getCurrentConfiguration() {
        if (m32626b() != null) {
            return m32626b();
        }
        return m32625a();
    }
}

package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.log.C12065a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.device.reader.b */
/* compiled from: DeviceInfoReaderCompressor */
public class C12034b implements C12047n {

    /* renamed from: a */
    private final C12049p f29381a;

    public C12034b(C12049p pVar) {
        this.f29381a = pVar;
    }

    /* renamed from: a */
    public Map<String, Object> mo71174a() {
        return this.f29381a.mo71178a();
    }

    /* renamed from: b */
    public byte[] mo71176b() {
        return mo71175a(mo71174a());
    }

    /* renamed from: a */
    public byte[] mo71175a(Map<String, Object> map) {
        if (map != null) {
            String jSONObject = new JSONObject(map).toString();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(jSONObject.length());
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(jSONObject.getBytes());
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                C12065a.m32848c("Error occurred while trying to compress device data.");
            }
        } else {
            C12065a.m32848c("Invalid DeviceInfoData: Expected non null map provided by reader");
            return null;
        }
    }
}

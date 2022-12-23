package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* renamed from: com.google.firebase.crashlytics.internal.model.serialization.-$$Lambda$CrashlyticsReportJsonTransform$dIOx2087eNrDPBVbiDN535D2ZNE */
/* compiled from: lambda */
public final /* synthetic */ class C7444x5393f15e implements CrashlyticsReportJsonTransform.ObjectParser {
    public static final /* synthetic */ C7444x5393f15e INSTANCE = new C7444x5393f15e();

    private /* synthetic */ C7444x5393f15e() {
    }

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEventFrame(jsonReader);
    }
}

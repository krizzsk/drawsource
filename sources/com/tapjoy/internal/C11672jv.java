package com.tapjoy.internal;

import android.app.RemoteInput;
import android.os.Bundle;
import java.util.Set;

/* renamed from: com.tapjoy.internal.jv */
public final class C11672jv {

    /* renamed from: a */
    final String f28175a;

    /* renamed from: b */
    final CharSequence f28176b;

    /* renamed from: c */
    final CharSequence[] f28177c;

    /* renamed from: d */
    final boolean f28178d;

    /* renamed from: e */
    final Bundle f28179e;

    /* renamed from: f */
    final Set<String> f28180f;

    /* renamed from: a */
    static RemoteInput[] m32031a(C11672jv[] jvVarArr) {
        if (jvVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[jvVarArr.length];
        for (int i = 0; i < jvVarArr.length; i++) {
            C11672jv jvVar = jvVarArr[i];
            remoteInputArr[i] = new RemoteInput.Builder(jvVar.f28175a).setLabel(jvVar.f28176b).setChoices(jvVar.f28177c).setAllowFreeFormInput(jvVar.f28178d).addExtras(jvVar.f28179e).build();
        }
        return remoteInputArr;
    }
}

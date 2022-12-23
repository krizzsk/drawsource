package com.tapjoy.internal;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.NotificationCompatExtras;
import com.google.firebase.messaging.Constants;
import com.tapjoy.internal.C11665js;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.tapjoy.internal.ju */
final class C11671ju {

    /* renamed from: a */
    private static final Object f28171a = new Object();

    /* renamed from: b */
    private static Field f28172b;

    /* renamed from: c */
    private static boolean f28173c;

    /* renamed from: d */
    private static final Object f28174d = new Object();

    /* renamed from: a */
    public static SparseArray<Bundle> m32029a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static Bundle m32028a(Notification notification) {
        synchronized (f28171a) {
            if (f28173c) {
                return null;
            }
            try {
                if (f28172b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(NotificationCompatJellybean.TAG, "Notification.extras field is not of type Bundle");
                        f28173c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f28172b = declaredField;
                }
                Bundle bundle = (Bundle) f28172b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f28172b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e(NotificationCompatJellybean.TAG, "Unable to access notification extras", e);
                f28173c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e(NotificationCompatJellybean.TAG, "Unable to access notification extras", e2);
                f28173c = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    private static Bundle[] m32030a(C11672jv[] jvVarArr) {
        if (jvVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[jvVarArr.length];
        for (int i = 0; i < jvVarArr.length; i++) {
            C11672jv jvVar = jvVarArr[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", jvVar.f28175a);
            bundle.putCharSequence(Constants.ScionAnalytics.PARAM_LABEL, jvVar.f28176b);
            bundle.putCharSequenceArray("choices", jvVar.f28177c);
            bundle.putBoolean("allowFreeFormInput", jvVar.f28178d);
            bundle.putBundle("extras", jvVar.f28179e);
            Set<String> set = jvVar.f28180f;
            if (set != null && !set.isEmpty()) {
                ArrayList arrayList = new ArrayList(set.size());
                for (String add : set) {
                    arrayList.add(add);
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    /* renamed from: a */
    public static Bundle m32027a(Notification.Builder builder, C11665js.C11666a aVar) {
        builder.addAction(aVar.f28115e, aVar.f28116f, aVar.f28117g);
        Bundle bundle = new Bundle(aVar.f28111a);
        if (aVar.f28112b != null) {
            bundle.putParcelableArray(NotificationCompatExtras.EXTRA_REMOTE_INPUTS, m32030a(aVar.f28112b));
        }
        if (aVar.f28113c != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m32030a(aVar.f28113c));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.f28114d);
        return bundle;
    }
}

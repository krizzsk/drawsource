package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.config.o */
public class C4265o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ IAConfigManager f10477a;

    /* renamed from: com.fyber.inneractive.sdk.config.o$a */
    public class C4266a implements Runnable {
        public C4266a() {
        }

        public void run() {
            IAConfigManager iAConfigManager = C4265o.this.f10477a;
            iAConfigManager.f10354t.mo24706c(iAConfigManager.f10327B);
        }
    }

    public C4265o(IAConfigManager iAConfigManager) {
        this.f10477a = iAConfigManager;
    }

    public void run() {
        IAConfigManager iAConfigManager = this.f10477a;
        if (iAConfigManager.f10351q == null) {
            Context context = iAConfigManager.f10340f;
            HashSet hashSet = new HashSet();
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            List<InputMethodInfo> list = null;
            try {
                list = inputMethodManager.getEnabledInputMethodList();
            } catch (Throwable unused) {
            }
            if (list != null) {
                int i = 0;
                for (InputMethodInfo enabledInputMethodSubtypeList : list) {
                    for (InputMethodSubtype next : inputMethodManager.getEnabledInputMethodSubtypeList(enabledInputMethodSubtypeList, true)) {
                        if (next.getMode().equals("keyboard") && i < 10) {
                            String locale = next.getLocale();
                            if (!TextUtils.isEmpty(locale)) {
                                try {
                                    String replace = locale.replace("_", "-");
                                    hashSet.add(replace);
                                    IAlog.m16446a("Available input language: %s", replace);
                                    i++;
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                }
            }
            if (hashSet.isEmpty()) {
                if (Build.VERSION.SDK_INT >= 24) {
                    hashSet.addAll(Arrays.asList(LocaleList.getDefault().toLanguageTags().split(",")));
                } else {
                    Locale locale2 = Locale.getDefault();
                    if (locale2 != null) {
                        hashSet.add(locale2.toString().replace("_", "-"));
                    }
                }
            }
            iAConfigManager.f10351q = new ArrayList(hashSet);
        }
        C5299n.f14024b.post(new C4266a());
    }
}

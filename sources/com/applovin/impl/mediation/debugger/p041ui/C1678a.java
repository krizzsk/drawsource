package com.applovin.impl.mediation.debugger.p041ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.C1798a;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.utils.C2042a;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.C2271R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.a */
public abstract class C1678a extends Activity implements AppLovinCommunicatorSubscriber {
    protected List<String> communicatorTopics = new ArrayList();

    /* renamed from: com.applovin.impl.mediation.debugger.ui.a$a */
    public interface C1680a<T extends Activity> {
        /* renamed from: a */
        void mo13696a(T t);
    }

    public String getCommunicatorId() {
        return getClass().getSimpleName();
    }

    /* access modifiers changed from: protected */
    public abstract C1969m getSdk();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getSdk() != null && !Utils.isPubInDebugMode(this, getSdk())) {
            setTheme(C2271R.style.com_applovin_mediation_MaxDebuggerActivity_Theme_Live);
        }
        List<String> list = this.communicatorTopics;
        if (list != null && list.size() > 0) {
            AppLovinCommunicator.getInstance(this).subscribe((AppLovinCommunicatorSubscriber) this, this.communicatorTopics);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        List<String> list = this.communicatorTopics;
        if (list != null && list.size() > 0) {
            AppLovinCommunicator.getInstance(this).unsubscribe((AppLovinCommunicatorSubscriber) this, this.communicatorTopics);
        }
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
    }

    /* access modifiers changed from: protected */
    public void startActivity(final Class cls, final C1798a aVar, final C1680a aVar2) {
        aVar.mo14046a(new C2042a() {
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (cls.isInstance(activity)) {
                    aVar2.mo13696a(activity);
                    aVar.mo14048b(this);
                }
            }
        });
        startActivity(new Intent(this, cls));
    }
}

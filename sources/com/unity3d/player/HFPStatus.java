package com.unity3d.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;

public class HFPStatus {

    /* renamed from: a */
    private Context f28244a;

    /* renamed from: b */
    private BroadcastReceiver f28245b = null;

    /* renamed from: c */
    private Intent f28246c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f28247d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AudioManager f28248e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f28249f = C11702a.f28251a;

    /* renamed from: com.unity3d.player.HFPStatus$a */
    enum C11702a {
        ;

        static {
            f28254d = new int[]{1, 2, 3};
        }
    }

    public HFPStatus(Context context) {
        this.f28244a = context;
        this.f28248e = (AudioManager) context.getSystemService("audio");
        initHFPStatusJni();
    }

    private final native void deinitHFPStatusJni();

    private final native void initHFPStatusJni();

    /* renamed from: a */
    public final void mo70386a() {
        deinitHFPStatusJni();
    }

    /* access modifiers changed from: protected */
    public boolean getHFPStat() {
        return this.f28249f == C11702a.f28252b;
    }

    /* access modifiers changed from: protected */
    public void requestHFPStat() {
        C117011 r0 = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                if (intExtra == 0) {
                    if (HFPStatus.this.f28247d) {
                        HFPStatus.this.f28248e.setMode(0);
                    }
                    boolean unused = HFPStatus.this.f28247d = false;
                } else if (intExtra == 1) {
                    int unused2 = HFPStatus.this.f28249f = C11702a.f28252b;
                    if (!HFPStatus.this.f28247d) {
                        HFPStatus.this.f28248e.stopBluetoothSco();
                    } else {
                        HFPStatus.this.f28248e.setMode(3);
                    }
                } else if (intExtra == 2) {
                    if (HFPStatus.this.f28249f == C11702a.f28252b) {
                        boolean unused3 = HFPStatus.this.f28247d = true;
                    } else {
                        int unused4 = HFPStatus.this.f28249f = C11702a.f28253c;
                    }
                }
            }
        };
        this.f28245b = r0;
        this.f28246c = this.f28244a.registerReceiver(r0, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        try {
            this.f28248e.startBluetoothSco();
        } catch (NullPointerException unused) {
            C11756d.Log(5, "startBluetoothSco() failed. no bluetooth device connected.");
        }
    }
}

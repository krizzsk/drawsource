package com.unity3d.scar.adapter.common;

public class DispatchGroup {

    /* renamed from: a */
    private int f28516a;

    /* renamed from: b */
    private Runnable f28517b;

    public DispatchGroup() {
        this.f28516a = 0;
        this.f28516a = 0;
    }

    /* renamed from: a */
    private void m32216a() {
        Runnable runnable;
        if (this.f28516a <= 0 && (runnable = this.f28517b) != null) {
            runnable.run();
        }
    }

    public synchronized void enter() {
        this.f28516a++;
    }

    public synchronized void leave() {
        this.f28516a--;
        m32216a();
    }

    public void notify(Runnable runnable) {
        this.f28517b = runnable;
        m32216a();
    }
}

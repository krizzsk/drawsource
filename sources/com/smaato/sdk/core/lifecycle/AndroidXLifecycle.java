package com.smaato.sdk.core.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.smaato.sdk.core.lifecycle.Lifecycle;
import com.smaato.sdk.core.util.p384fi.Consumer;

public class AndroidXLifecycle extends Lifecycle implements LifecycleEventObserver {
    public AndroidXLifecycle(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    /* renamed from: com.smaato.sdk.core.lifecycle.AndroidXLifecycle$1 */
    static /* synthetic */ class C108641 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$Event;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$lifecycle$Lifecycle$Event = r0
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.lifecycle.AndroidXLifecycle.C108641.<clinit>():void");
        }
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (C108641.$SwitchMap$androidx$lifecycle$Lifecycle$Event[event.ordinal()]) {
            case 1:
                notifyObservers(new Consumer() {
                    public final void accept(Object obj) {
                        AndroidXLifecycle.this.lambda$onStateChanged$0$AndroidXLifecycle((Lifecycle.Observer) obj);
                    }
                });
                return;
            case 2:
                notifyObservers(new Consumer() {
                    public final void accept(Object obj) {
                        AndroidXLifecycle.this.lambda$onStateChanged$1$AndroidXLifecycle((Lifecycle.Observer) obj);
                    }
                });
                return;
            case 3:
                notifyObservers(new Consumer() {
                    public final void accept(Object obj) {
                        AndroidXLifecycle.this.lambda$onStateChanged$2$AndroidXLifecycle((Lifecycle.Observer) obj);
                    }
                });
                return;
            case 4:
                notifyObservers(new Consumer() {
                    public final void accept(Object obj) {
                        AndroidXLifecycle.this.lambda$onStateChanged$3$AndroidXLifecycle((Lifecycle.Observer) obj);
                    }
                });
                return;
            case 5:
                notifyObservers(new Consumer() {
                    public final void accept(Object obj) {
                        AndroidXLifecycle.this.lambda$onStateChanged$4$AndroidXLifecycle((Lifecycle.Observer) obj);
                    }
                });
                return;
            case 6:
                notifyObservers(new Consumer() {
                    public final void accept(Object obj) {
                        AndroidXLifecycle.this.lambda$onStateChanged$5$AndroidXLifecycle((Lifecycle.Observer) obj);
                    }
                });
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void lambda$onStateChanged$0$AndroidXLifecycle(Lifecycle.Observer observer) {
        observer.onCreate(this);
    }

    public /* synthetic */ void lambda$onStateChanged$1$AndroidXLifecycle(Lifecycle.Observer observer) {
        observer.onStart(this);
    }

    public /* synthetic */ void lambda$onStateChanged$2$AndroidXLifecycle(Lifecycle.Observer observer) {
        observer.onResume(this);
    }

    public /* synthetic */ void lambda$onStateChanged$3$AndroidXLifecycle(Lifecycle.Observer observer) {
        observer.onPause(this);
    }

    public /* synthetic */ void lambda$onStateChanged$4$AndroidXLifecycle(Lifecycle.Observer observer) {
        observer.onStop(this);
    }

    public /* synthetic */ void lambda$onStateChanged$5$AndroidXLifecycle(Lifecycle.Observer observer) {
        observer.onDestroy(this);
    }
}

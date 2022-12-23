package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.WithinAppServiceBinder;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public abstract class EnhancedIntentService extends Service {
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    final ExecutorService executor = FcmExecutors.newIntentHandleExecutor();
    private int lastStartId;
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* access modifiers changed from: protected */
    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "Service received bind request");
        }
        if (this.binder == null) {
            this.binder = new WithinAppServiceBinder(new WithinAppServiceBinder.IntentHandler() {
                public Task<Void> handle(Intent intent) {
                    return EnhancedIntentService.this.processIntent(intent);
                }
            });
        }
        return this.binder;
    }

    /* access modifiers changed from: private */
    public Task<Void> processIntent(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new Runnable(intent, taskCompletionSource) {
            public final /* synthetic */ Intent f$1;
            public final /* synthetic */ TaskCompletionSource f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                EnhancedIntentService.this.lambda$processIntent$0$EnhancedIntentService(this.f$1, this.f$2);
            }
        });
        return taskCompletionSource.getTask();
    }

    public /* synthetic */ void lambda$processIntent$0$EnhancedIntentService(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            handleIntent(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        Task<Void> processIntent = processIntent(startCommandIntent);
        if (processIntent.isComplete()) {
            finishTask(intent);
            return 2;
        }
        processIntent.addOnCompleteListener((Executor) $$Lambda$_14QHG018Z6p13d3hzJuGTWnNeo.INSTANCE, (OnCompleteListener<Void>) new OnCompleteListener(intent) {
            public final /* synthetic */ Intent f$1;

            {
                this.f$1 = r2;
            }

            public final void onComplete(Task task) {
                EnhancedIntentService.this.lambda$onStartCommand$1$EnhancedIntentService(this.f$1, task);
            }
        });
        return 3;
    }

    public /* synthetic */ void lambda$onStartCommand$1$EnhancedIntentService(Intent intent, Task task) {
        finishTask(intent);
    }

    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            WakeLockHolder.completeWakefulIntent(intent);
        }
        synchronized (this.lock) {
            int i = this.runningTasks - 1;
            this.runningTasks = i;
            if (i == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }
}

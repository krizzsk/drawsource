package com.mbridge.msdk.foundation.download.core;

import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class DefaultExecutorSupplier implements ExecutorSupplier {
    private int DEFAULT_MAX_NUM_THREADS = 10;
    private final ExecutorService backgroundExecutor;
    private final ExecutorService downloadResultExecutor;
    private final DownloadExecutor networkExecutor;

    DefaultExecutorSupplier() {
        C2440a f = C2445b.m6020a().mo16294f(C8388a.m23845e().mo56914h());
        if (f != null) {
            int a = f.mo16172a();
            this.DEFAULT_MAX_NUM_THREADS = a;
            if (a <= 0) {
                this.DEFAULT_MAX_NUM_THREADS = 10;
            }
        }
        this.networkExecutor = new DownloadExecutor(this.DEFAULT_MAX_NUM_THREADS, new PriorityThreadFactory(10), new ThreadPoolExecutor.DiscardPolicy());
        this.backgroundExecutor = Executors.newSingleThreadExecutor();
        this.downloadResultExecutor = Executors.newSingleThreadExecutor();
    }

    public DownloadExecutor getDownloadTasks() {
        return this.networkExecutor;
    }

    public ExecutorService getDownloadResultTasks() {
        return this.downloadResultExecutor;
    }

    public ExecutorService getBackgroundTasks() {
        return this.backgroundExecutor;
    }

    public ExecutorService getLruCacheThreadTasks() {
        return this.backgroundExecutor;
    }
}

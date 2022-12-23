package com.unity3d.services.core.api;

public enum DownloadLatestWebViewStatus {
    INIT_QUEUE_NULL(0),
    INIT_QUEUE_NOT_EMPTY(1),
    MISSING_LATEST_CONFIG(2),
    BACKGROUND_DOWNLOAD_STARTED(3);
    

    /* renamed from: b */
    private final int f29110b;

    private DownloadLatestWebViewStatus(int i) {
        this.f29110b = i;
    }

    public int getValue() {
        return this.f29110b;
    }
}

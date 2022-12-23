package com.smaato.sdk.core.network;

import java.io.IOException;

public class HttpNoResponseBodyException extends IOException {
    private final Headers headers;
    private final int responseCode;

    HttpNoResponseBodyException(Throwable th, int i, Headers headers2) {
        super(th);
        this.responseCode = i;
        this.headers = headers2;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public Headers getHeaders() {
        return this.headers;
    }
}

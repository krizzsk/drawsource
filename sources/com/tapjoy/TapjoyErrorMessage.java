package com.tapjoy;

public class TapjoyErrorMessage {

    /* renamed from: a */
    private ErrorType f26888a;

    /* renamed from: b */
    private String f26889b;

    public enum ErrorType {
        INTERNAL_ERROR,
        SDK_ERROR,
        SERVER_ERROR,
        INTEGRATION_ERROR,
        NETWORK_ERROR
    }

    public TapjoyErrorMessage(ErrorType errorType, String str) {
        this.f26888a = errorType;
        this.f26889b = str;
    }

    public ErrorType getType() {
        return this.f26888a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type=" + this.f26888a.toString());
        sb.append(";Message=" + this.f26889b);
        return sb.toString();
    }
}

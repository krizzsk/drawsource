package com.fyber.inneractive.sdk.external;

public class InneractiveInfrastructureError extends InneractiveError {

    /* renamed from: a */
    public final InneractiveErrorCode f10636a;

    /* renamed from: b */
    public Throwable f10637b;

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode) {
        this.f10636a = inneractiveErrorCode;
    }

    public String description() {
        StringBuilder sb = new StringBuilder();
        InneractiveErrorCode inneractiveErrorCode = this.f10636a;
        if (inneractiveErrorCode != null) {
            sb.append(inneractiveErrorCode);
        }
        if (this.f10637b != null) {
            sb.append(": ");
            sb.append(this.f10637b);
        }
        return sb.toString();
    }

    public Throwable getCause() {
        return this.f10637b;
    }

    public InneractiveErrorCode getErrorCode() {
        return this.f10636a;
    }

    public void setCause(Throwable th) {
        this.f10637b = th;
    }

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, Throwable th) {
        this(inneractiveErrorCode);
        this.f10637b = th;
    }
}

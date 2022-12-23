package com.mbridge.msdk.dycreator.bus;

public class EventBusException extends RuntimeException {
    public EventBusException(String str) {
        super(str);
    }

    public EventBusException(Throwable th) {
        super(th);
    }

    public EventBusException(String str, Throwable th) {
        super(str, th);
    }
}

package com.google.common.eventbus;

import com.google.common.eventbus.EventBus;
import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import java.util.concurrent.Executor;

public class AsyncEventBus extends EventBus {
    public AsyncEventBus(String str, Executor executor) {
        super(str, executor, Dispatcher.legacyAsync(), EventBus.LoggingHandler.INSTANCE);
    }

    public AsyncEventBus(Executor executor, SubscriberExceptionHandler subscriberExceptionHandler) {
        super(CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER, executor, Dispatcher.legacyAsync(), subscriberExceptionHandler);
    }

    public AsyncEventBus(Executor executor) {
        super(CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER, executor, Dispatcher.legacyAsync(), EventBus.LoggingHandler.INSTANCE);
    }
}

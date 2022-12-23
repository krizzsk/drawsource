package com.smaato.sdk.video.p391ad;

import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p380ad.AdInteractor;
import com.smaato.sdk.core.p380ad.AdStateMachine;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.StateMachine;

/* renamed from: com.smaato.sdk.video.ad.VideoAdInteractor */
class VideoAdInteractor extends AdInteractor<VideoAdObject> {
    private final Logger logger;

    public VideoAdInteractor(Logger logger2, VideoAdObject videoAdObject, StateMachine<AdStateMachine.Event, AdStateMachine.State> stateMachine, OneTimeActionFactory oneTimeActionFactory) {
        super(videoAdObject, stateMachine, oneTimeActionFactory);
        this.logger = (Logger) Objects.requireNonNull(logger2);
        stateMachine.onEvent(AdStateMachine.Event.INITIALISE);
    }
}

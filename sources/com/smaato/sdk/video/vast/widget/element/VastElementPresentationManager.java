package com.smaato.sdk.video.vast.widget.element;

import com.smaato.sdk.core.util.p384fi.Consumer;

public interface VastElementPresentationManager {
    void prepare(VastElementView vastElementView, Consumer<VastElementException> consumer);
}

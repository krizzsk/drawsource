package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.video.vast.model.C11130Ad;
import com.smaato.sdk.video.vast.model.Wrapper;
import java.util.List;

public class WrapperAdContainerPicker {
    /* access modifiers changed from: package-private */
    public AdContainer<Wrapper> pickWrapperContainer(List<C11130Ad> list) {
        if (list.size() == 1) {
            C11130Ad ad = list.get(0);
            Wrapper wrapper = ad.wrapper;
            if (wrapper != null) {
                return new AdContainer<>(ad, wrapper);
            }
            return null;
        }
        for (C11130Ad next : list) {
            Wrapper wrapper2 = next.wrapper;
            if (wrapper2 != null && next.sequence == null) {
                return new AdContainer<>(next, wrapper2);
            }
        }
        return null;
    }
}

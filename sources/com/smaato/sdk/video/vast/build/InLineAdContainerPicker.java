package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.video.vast.model.C11130Ad;
import com.smaato.sdk.video.vast.model.InLine;
import java.util.List;

public class InLineAdContainerPicker {
    /* access modifiers changed from: package-private */
    public AdContainer<InLine> pickInLineContainer(List<C11130Ad> list) {
        if (list.size() == 1) {
            C11130Ad ad = list.get(0);
            InLine inLine = ad.inLine;
            if (inLine != null) {
                return new AdContainer<>(ad, inLine);
            }
            return null;
        }
        for (C11130Ad next : list) {
            InLine inLine2 = next.inLine;
            if (inLine2 != null && next.sequence == null) {
                return new AdContainer<>(next, inLine2);
            }
        }
        return null;
    }
}

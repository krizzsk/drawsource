package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.video.vast.model.C11130Ad;
import java.util.List;

public class InLineChecker {
    /* access modifiers changed from: package-private */
    public boolean hasInLine(List<C11130Ad> list) {
        if (list.size() != 1) {
            for (C11130Ad next : list) {
                if (next.inLine != null && next.sequence == null) {
                    return true;
                }
            }
            return false;
        } else if (list.get(0).inLine != null) {
            return true;
        } else {
            return false;
        }
    }
}

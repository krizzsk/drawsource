package com.iab.omid.library.amazon.adsession;

import android.view.View;
import java.util.List;

public interface PossibleObstructionListener {
    void onPossibleObstructionsDetected(String str, List<View> list);
}

package com.iab.omid.library.oguryco.adsession.video;

import com.vungle.warren.model.Advertisement;

public enum Position {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL(Advertisement.KEY_POSTROLL),
    STANDALONE("standalone");
    
    private final String position;

    private Position(String str) {
        this.position = str;
    }

    public final String toString() {
        return this.position;
    }
}

package com.mbridge.msdk.foundation.download.utils;

public final class Utils {
    public static int getDownloadRate(long j, long j2) {
        if (j == 0 || j2 == 0) {
            return 0;
        }
        if (j == j2) {
            return 100;
        }
        return (int) (((((double) j2) * 1.0d) / (((double) j) * 1.0d)) * 100.0d);
    }

    private Utils() {
    }
}

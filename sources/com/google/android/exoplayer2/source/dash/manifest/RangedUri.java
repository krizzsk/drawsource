package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.util.UriUtil;
import com.ironsource.mediationsdk.logger.IronSourceError;

public final class RangedUri {
    private int hashCode;
    public final long length;
    private final String referenceUri;
    public final long start;

    public RangedUri(String str, long j, long j2) {
        this.referenceUri = str == null ? "" : str;
        this.start = j;
        this.length = j2;
    }

    public Uri resolveUri(String str) {
        return UriUtil.resolveToUri(str, this.referenceUri);
    }

    public String resolveUriString(String str) {
        return UriUtil.resolve(str, this.referenceUri);
    }

    public RangedUri attemptMerge(RangedUri rangedUri, String str) {
        String resolveUriString = resolveUriString(str);
        if (rangedUri != null && resolveUriString.equals(rangedUri.resolveUriString(str))) {
            long j = this.length;
            long j2 = -1;
            if (j == -1 || this.start + j != rangedUri.start) {
                long j3 = rangedUri.length;
                if (j3 != -1 && rangedUri.start + j3 == this.start) {
                    long j4 = rangedUri.start;
                    long j5 = this.length;
                    if (j5 != -1) {
                        j2 = rangedUri.length + j5;
                    }
                    return new RangedUri(resolveUriString, j4, j2);
                }
            } else {
                long j6 = this.start;
                long j7 = rangedUri.length;
                if (j7 != -1) {
                    j2 = this.length + j7;
                }
                return new RangedUri(resolveUriString, j6, j2);
            }
        }
        return null;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) this.start)) * 31) + ((int) this.length)) * 31) + this.referenceUri.hashCode();
        }
        return this.hashCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RangedUri rangedUri = (RangedUri) obj;
        if (this.start == rangedUri.start && this.length == rangedUri.length && this.referenceUri.equals(rangedUri.referenceUri)) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = this.referenceUri;
        long j = this.start;
        long j2 = this.length;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 81);
        sb.append("RangedUri(referenceUri=");
        sb.append(str);
        sb.append(", start=");
        sb.append(j);
        sb.append(", length=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}

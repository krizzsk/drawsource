package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzglc extends IOException {
    private zzgma zza = null;
    private boolean zzb;

    public zzglc(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    static zzglb zza() {
        return new zzglb("Protocol message tag had invalid wire type.");
    }

    static zzglc zzb() {
        return new zzglc("Protocol message end-group tag did not match expected tag.");
    }

    static zzglc zzc() {
        return new zzglc("Protocol message contained an invalid tag (zero).");
    }

    static zzglc zzd() {
        return new zzglc("Protocol message had invalid UTF-8.");
    }

    static zzglc zze() {
        return new zzglc("CodedInputStream encountered a malformed varint.");
    }

    static zzglc zzf() {
        return new zzglc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzglc zzg() {
        return new zzglc("Failed to parse the message.");
    }

    static zzglc zzi() {
        return new zzglc("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static zzglc zzj() {
        return new zzglc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzglc zzh(zzgma zzgma) {
        this.zza = zzgma;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void zzk() {
        this.zzb = true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzl() {
        return this.zzb;
    }

    public zzglc(String str) {
        super(str);
    }
}

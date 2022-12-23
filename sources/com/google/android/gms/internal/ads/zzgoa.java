package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public enum zzgoa {
    DOUBLE(zzgob.DOUBLE, 1),
    FLOAT(zzgob.FLOAT, 5),
    INT64(zzgob.LONG, 0),
    UINT64(zzgob.LONG, 0),
    INT32(zzgob.INT, 0),
    FIXED64(zzgob.LONG, 1),
    FIXED32(zzgob.INT, 5),
    BOOL(zzgob.BOOLEAN, 0),
    STRING(zzgob.STRING, 2),
    GROUP(zzgob.MESSAGE, 3),
    MESSAGE(zzgob.MESSAGE, 2),
    BYTES(zzgob.BYTE_STRING, 2),
    UINT32(zzgob.INT, 0),
    ENUM(zzgob.ENUM, 0),
    SFIXED32(zzgob.INT, 5),
    SFIXED64(zzgob.LONG, 1),
    SINT32(zzgob.INT, 0),
    SINT64(zzgob.LONG, 0);
    
    private final zzgob zzt;

    private zzgoa(zzgob zzgob, int i) {
        this.zzt = zzgob;
    }

    public final zzgob zza() {
        return this.zzt;
    }
}

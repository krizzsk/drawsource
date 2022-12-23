package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public enum zzgki {
    DOUBLE(0, 1, zzgle.DOUBLE),
    FLOAT(1, 1, zzgle.FLOAT),
    INT64(2, 1, zzgle.LONG),
    UINT64(3, 1, zzgle.LONG),
    INT32(4, 1, zzgle.INT),
    FIXED64(5, 1, zzgle.LONG),
    FIXED32(6, 1, zzgle.INT),
    BOOL(7, 1, zzgle.BOOLEAN),
    STRING(8, 1, zzgle.STRING),
    MESSAGE(9, 1, zzgle.MESSAGE),
    BYTES(10, 1, zzgle.BYTE_STRING),
    UINT32(11, 1, zzgle.INT),
    ENUM(12, 1, zzgle.ENUM),
    SFIXED32(13, 1, zzgle.INT),
    SFIXED64(14, 1, zzgle.LONG),
    SINT32(15, 1, zzgle.INT),
    SINT64(16, 1, zzgle.LONG),
    GROUP(17, 1, zzgle.MESSAGE),
    DOUBLE_LIST(18, 2, zzgle.DOUBLE),
    FLOAT_LIST(19, 2, zzgle.FLOAT),
    INT64_LIST(20, 2, zzgle.LONG),
    UINT64_LIST(21, 2, zzgle.LONG),
    INT32_LIST(22, 2, zzgle.INT),
    FIXED64_LIST(23, 2, zzgle.LONG),
    FIXED32_LIST(24, 2, zzgle.INT),
    BOOL_LIST(25, 2, zzgle.BOOLEAN),
    STRING_LIST(26, 2, zzgle.STRING),
    MESSAGE_LIST(27, 2, zzgle.MESSAGE),
    BYTES_LIST(28, 2, zzgle.BYTE_STRING),
    UINT32_LIST(29, 2, zzgle.INT),
    ENUM_LIST(30, 2, zzgle.ENUM),
    SFIXED32_LIST(31, 2, zzgle.INT),
    SFIXED64_LIST(32, 2, zzgle.LONG),
    SINT32_LIST(33, 2, zzgle.INT),
    SINT64_LIST(34, 2, zzgle.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzgle.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzgle.FLOAT),
    INT64_LIST_PACKED(37, 3, zzgle.LONG),
    UINT64_LIST_PACKED(38, 3, zzgle.LONG),
    INT32_LIST_PACKED(39, 3, zzgle.INT),
    FIXED64_LIST_PACKED(40, 3, zzgle.LONG),
    FIXED32_LIST_PACKED(41, 3, zzgle.INT),
    BOOL_LIST_PACKED(42, 3, zzgle.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzgle.INT),
    ENUM_LIST_PACKED(44, 3, zzgle.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzgle.INT),
    SFIXED64_LIST_PACKED(46, 3, zzgle.LONG),
    SINT32_LIST_PACKED(47, 3, zzgle.INT),
    SINT64_LIST_PACKED(48, 3, zzgle.LONG),
    GROUP_LIST(49, 2, zzgle.MESSAGE),
    MAP(50, 4, zzgle.VOID);
    
    private static final zzgki[] zzZ = null;
    private final zzgle zzab;
    private final int zzac;
    private final Class zzad;

    static {
        int i;
        zzZ = new zzgki[r1];
        for (zzgki zzgki : values()) {
            zzZ[zzgki.zzac] = zzgki;
        }
    }

    private zzgki(int i, int i2, zzgle zzgle) {
        this.zzac = i;
        this.zzab = zzgle;
        zzgle zzgle2 = zzgle.VOID;
        int i3 = i2 - 1;
        if (i3 == 1) {
            this.zzad = zzgle.zza();
        } else if (i3 != 3) {
            this.zzad = null;
        } else {
            this.zzad = zzgle.zza();
        }
        if (i2 == 1) {
            zzgle.ordinal();
        }
    }

    public final int zza() {
        return this.zzac;
    }
}

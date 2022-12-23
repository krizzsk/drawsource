package com.ogury.p376cm.internal;

import java.util.List;

/* renamed from: com.ogury.cm.internal.aaccc */
public final class aaccc implements Comparable<aaccc> {

    /* renamed from: a */
    public static final aaaaa f24284a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final int f24285b;

    /* renamed from: c */
    private final int f24286c;

    /* renamed from: d */
    private final int f24287d;

    /* renamed from: e */
    private final String f24288e;

    /* renamed from: f */
    private final String f24289f;

    /* renamed from: com.ogury.cm.internal.aaccc$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    public aaccc() {
        this(0, 0, 0, (String) null, (String) null, 31, (bbabb) null);
    }

    public aaccc(int i, int i2, int i3, String str, String str2) {
        this.f24285b = i;
        this.f24286c = i2;
        this.f24287d = i3;
        this.f24288e = str;
        this.f24289f = str2;
        boolean z = true;
        if (i >= 0) {
            if (this.f24286c >= 0) {
                if (this.f24287d < 0 ? false : z) {
                    String str3 = this.f24288e;
                    if (str3 != null) {
                        if (!new bbcbb("[\\dA-z\\-]+(?:\\.[\\dA-z\\-]+)*").mo64026a(str3)) {
                            throw new IllegalArgumentException("Pre-release version is not valid".toString());
                        }
                    }
                    String str4 = this.f24289f;
                    if (str4 != null) {
                        if (!new bbcbb("[\\dA-z\\-]+(?:\\.[\\dA-z\\-]+)*").mo64026a(str4)) {
                            throw new IllegalArgumentException("Build metadata is not valid".toString());
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Patch version must be a positive number".toString());
            }
            throw new IllegalArgumentException("Minor version must be a positive number".toString());
        }
        throw new IllegalArgumentException("Major version must be a positive number".toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aaccc(int i, int i2, int i3, String str, String str2, int i4, bbabb bbabb) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (String) null, (String) null);
    }

    /* renamed from: a */
    private static boolean m27789a(String str) {
        return new bbcbb("\\d+").mo64026a(str);
    }

    /* renamed from: a */
    public final int mo63823a() {
        return this.f24285b;
    }

    /* renamed from: a */
    public final int compareTo(aaccc aaccc) {
        bbabc.m28052b(aaccc, "other");
        int i = this.f24285b;
        int i2 = aaccc.f24285b;
        if (i > i2) {
            return 1;
        }
        if (i < i2) {
            return -1;
        }
        int i3 = this.f24286c;
        int i4 = aaccc.f24286c;
        if (i3 > i4) {
            return 1;
        }
        if (i3 < i4) {
            return -1;
        }
        int i5 = this.f24287d;
        int i6 = aaccc.f24287d;
        if (i5 > i6) {
            return 1;
        }
        if (i5 < i6) {
            return -1;
        }
        if (this.f24288e == null && aaccc.f24288e == null) {
            return 0;
        }
        if (this.f24288e != null && aaccc.f24288e == null) {
            return -1;
        }
        if (this.f24288e == null && aaccc.f24288e != null) {
            return 1;
        }
        String str = this.f24288e;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        List a = bbcbc.m28097a((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
        String str3 = aaccc.f24288e;
        if (str3 != null) {
            str2 = str3;
        }
        List a2 = bbcbc.m28097a((CharSequence) str2, new String[]{"."}, false, 0, 6, (Object) null);
        int min = Math.min(a.size(), a2.size()) - 1;
        if (min >= 0) {
            int i7 = 0;
            while (true) {
                String str4 = (String) a.get(i7);
                String str5 = (String) a2.get(i7);
                if (!bbabc.m28051a((Object) str4, (Object) str5)) {
                    boolean a3 = m27789a(str4);
                    boolean a4 = m27789a(str5);
                    if (a3 && !a4) {
                        return -1;
                    }
                    if (!a3 && a4) {
                        return 1;
                    }
                    if (a3 || a4) {
                        try {
                            int parseInt = Integer.parseInt(str4);
                            int parseInt2 = Integer.parseInt(str5);
                            if (parseInt > parseInt2) {
                                return 1;
                            }
                            if (parseInt < parseInt2) {
                                return -1;
                            }
                        } catch (NumberFormatException unused) {
                            return str4.compareTo(str5);
                        }
                    } else if (str4.compareTo(str5) > 0) {
                        return 1;
                    } else {
                        if (str4.compareTo(str5) < 0) {
                            return -1;
                        }
                    }
                }
                if (i7 == min) {
                    break;
                }
                i7++;
            }
        }
        int i8 = min + 1;
        if (a.size() != i8 || a2.size() <= i8) {
            return (a.size() <= i8 || a2.size() != i8) ? 0 : 1;
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo63825b() {
        return this.f24286c;
    }

    /* renamed from: c */
    public final int mo63826c() {
        return this.f24287d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aaccc) {
                aaccc aaccc = (aaccc) obj;
                if (this.f24285b == aaccc.f24285b) {
                    if (this.f24286c == aaccc.f24286c) {
                        if (!(this.f24287d == aaccc.f24287d) || !bbabc.m28051a((Object) this.f24288e, (Object) aaccc.f24288e) || !bbabc.m28051a((Object) this.f24289f, (Object) aaccc.f24289f)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((this.f24285b * 31) + this.f24286c) * 31) + this.f24287d) * 31;
        String str = this.f24288e;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f24289f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24285b);
        sb2.append('.');
        sb2.append(this.f24286c);
        sb2.append('.');
        sb2.append(this.f24287d);
        sb.append(sb2.toString());
        if (this.f24288e != null) {
            sb.append('-');
            sb.append(this.f24288e);
        }
        if (this.f24289f != null) {
            sb.append('+');
            sb.append(this.f24289f);
        }
        String sb3 = sb.toString();
        bbabc.m28049a((Object) sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}

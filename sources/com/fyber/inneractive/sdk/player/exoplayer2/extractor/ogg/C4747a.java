package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4709m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.a */
public final class C4747a implements C4754f {

    /* renamed from: a */
    public final C4753e f12334a = new C4753e();

    /* renamed from: b */
    public final long f12335b;

    /* renamed from: c */
    public final long f12336c;

    /* renamed from: d */
    public final C4756h f12337d;

    /* renamed from: e */
    public int f12338e;

    /* renamed from: f */
    public long f12339f;

    /* renamed from: g */
    public long f12340g;

    /* renamed from: h */
    public long f12341h;

    /* renamed from: i */
    public long f12342i;

    /* renamed from: j */
    public long f12343j;

    /* renamed from: k */
    public long f12344k;

    /* renamed from: l */
    public long f12345l;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.a$a */
    public class C4748a implements C4709m {
        public C4748a() {
        }

        /* renamed from: a */
        public long mo25054a(long j) {
            if (j == 0) {
                return C4747a.this.f12335b;
            }
            C4747a aVar = C4747a.this;
            long j2 = aVar.f12335b;
            long j3 = aVar.f12336c;
            long j4 = (((((((long) aVar.f12337d.f12379i) * j) / 1000000) * (j3 - j2)) / aVar.f12339f) - 30000) + j2;
            if (j4 >= j2) {
                j2 = j4;
            }
            return j2 >= j3 ? j3 - 1 : j2;
        }

        /* renamed from: a */
        public boolean mo25055a() {
            return true;
        }

        /* renamed from: c */
        public long mo25056c() {
            C4747a aVar = C4747a.this;
            return (aVar.f12339f * 1000000) / ((long) aVar.f12337d.f12379i);
        }
    }

    public C4747a(long j, long j2, C4756h hVar, int i, long j3) {
        C4965a.m15049a(j >= 0 && j2 > j);
        this.f12337d = hVar;
        this.f12335b = j;
        this.f12336c = j2;
        if (((long) i) == j2 - j) {
            this.f12339f = j3;
            this.f12338e = 3;
            return;
        }
        this.f12338e = 0;
    }

    /* renamed from: a */
    public long mo25201a(C4672g gVar) throws IOException, InterruptedException {
        C4753e eVar;
        int i;
        long j;
        long j2;
        C4672g gVar2 = gVar;
        int i2 = this.f12338e;
        if (i2 == 0) {
            long j3 = ((C4657b) gVar2).f11670c;
            this.f12340g = j3;
            this.f12338e = 1;
            long j4 = this.f12336c - 65307;
            if (j4 > j3) {
                return j4;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                long j5 = this.f12341h;
                long j6 = 0;
                if (j5 == 0) {
                    i = 3;
                } else {
                    long j7 = this.f12342i;
                    long j8 = this.f12343j;
                    if (j7 == j8) {
                        j = -(this.f12344k + 2);
                    } else {
                        C4657b bVar = (C4657b) gVar2;
                        long j9 = bVar.f11670c;
                        if (!mo25202a(gVar2, j8)) {
                            j = this.f12342i;
                            if (j == j9) {
                                throw new IOException("No ogg page can be found.");
                            }
                        } else {
                            this.f12334a.mo25211a(gVar2, false);
                            bVar.f11672e = 0;
                            C4753e eVar2 = this.f12334a;
                            long j10 = eVar2.f12362b;
                            long j11 = j5 - j10;
                            int i3 = eVar2.f12364d + eVar2.f12365e;
                            int i4 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
                            if (i4 < 0 || j11 > 72000) {
                                if (i4 < 0) {
                                    this.f12343j = j9;
                                    this.f12345l = j10;
                                } else {
                                    long j12 = (long) i3;
                                    long j13 = bVar.f11670c + j12;
                                    this.f12342i = j13;
                                    this.f12344k = j10;
                                    if ((this.f12343j - j13) + j12 < 100000) {
                                        bVar.mo25064c(i3);
                                        j2 = this.f12344k;
                                    }
                                }
                                long j14 = this.f12343j;
                                long j15 = this.f12342i;
                                long j16 = j14 - j15;
                                if (j16 < 100000) {
                                    this.f12343j = j15;
                                    j = j15;
                                } else {
                                    j = Math.min(Math.max((bVar.f11670c - ((long) (i3 * (i4 <= 0 ? 2 : 1)))) + ((j11 * j16) / (this.f12345l - this.f12344k)), j15), this.f12343j - 1);
                                }
                            } else {
                                bVar.mo25064c(i3);
                                j2 = this.f12334a.f12362b;
                            }
                            j = -(j2 + 2);
                        }
                    }
                    if (j >= 0) {
                        return j;
                    }
                    long j17 = this.f12341h;
                    this.f12334a.mo25211a(gVar2, false);
                    j6 = -(j + 2);
                    while (true) {
                        C4753e eVar3 = this.f12334a;
                        if (eVar3.f12362b >= j17) {
                            break;
                        }
                        ((C4657b) gVar2).mo25064c(eVar3.f12364d + eVar3.f12365e);
                        C4753e eVar4 = this.f12334a;
                        j6 = eVar4.f12362b;
                        eVar4.mo25211a(gVar2, false);
                    }
                    ((C4657b) gVar2).f11672e = 0;
                    i = 3;
                }
                this.f12338e = i;
                return -(j6 + 2);
            } else if (i2 == 3) {
                return -1;
            } else {
                throw new IllegalStateException();
            }
        }
        if (mo25202a(gVar2, this.f12336c)) {
            this.f12334a.mo25210a();
            while (true) {
                eVar = this.f12334a;
                if ((eVar.f12361a & 4) == 4) {
                    break;
                }
                C4657b bVar2 = (C4657b) gVar2;
                if (bVar2.f11670c >= this.f12336c) {
                    break;
                }
                eVar.mo25211a(gVar2, false);
                C4753e eVar5 = this.f12334a;
                bVar2.mo25064c(eVar5.f12364d + eVar5.f12365e);
            }
            this.f12339f = eVar.f12362b;
            this.f12338e = 3;
            return this.f12340g;
        }
        throw new EOFException();
    }

    /* renamed from: b */
    public C4709m mo25203b() {
        if (this.f12339f != 0) {
            return new C4748a();
        }
        return null;
    }

    /* renamed from: c */
    public long mo25204c(long j) {
        long j2;
        int i = this.f12338e;
        C4965a.m15049a(i == 3 || i == 2);
        if (j == 0) {
            j2 = 0;
        } else {
            j2 = (((long) this.f12337d.f12379i) * j) / 1000000;
        }
        this.f12341h = j2;
        this.f12338e = 2;
        this.f12342i = this.f12335b;
        this.f12343j = this.f12336c;
        this.f12344k = 0;
        this.f12345l = this.f12339f;
        return j2;
    }

    /* renamed from: a */
    public boolean mo25202a(C4672g gVar, long j) throws IOException, InterruptedException {
        int i;
        long min = Math.min(j + 3, this.f12336c);
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            C4657b bVar = (C4657b) gVar;
            int i3 = 0;
            if (bVar.f11670c + ((long) i2) <= min || (i2 = (int) (min - bVar.f11670c)) >= 4) {
                bVar.mo25061a(bArr, 0, i2, false);
                while (true) {
                    i = i2 - 3;
                    if (i3 >= i) {
                        break;
                    } else if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        bVar.mo25064c(i3);
                        return true;
                    } else {
                        i3++;
                    }
                }
            } else {
                return false;
            }
            bVar.mo25064c(i);
        }
    }
}

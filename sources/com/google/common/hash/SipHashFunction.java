package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
final class SipHashFunction extends AbstractHashFunction implements Serializable {
    static final HashFunction SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    private final int f18348c;

    /* renamed from: d */
    private final int f18349d;

    /* renamed from: k0 */
    private final long f18350k0;

    /* renamed from: k1 */
    private final long f18351k1;

    public int bits() {
        return 64;
    }

    SipHashFunction(int i, int i2, long j, long j2) {
        boolean z = true;
        Preconditions.checkArgument(i > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", i);
        Preconditions.checkArgument(i2 <= 0 ? false : z, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i2);
        this.f18348c = i;
        this.f18349d = i2;
        this.f18350k0 = j;
        this.f18351k1 = j2;
    }

    public Hasher newHasher() {
        return new SipHasher(this.f18348c, this.f18349d, this.f18350k0, this.f18351k1);
    }

    public String toString() {
        return "Hashing.sipHash" + this.f18348c + "" + this.f18349d + "(" + this.f18350k0 + ", " + this.f18351k1 + ")";
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof SipHashFunction)) {
            return false;
        }
        SipHashFunction sipHashFunction = (SipHashFunction) obj;
        if (this.f18348c == sipHashFunction.f18348c && this.f18349d == sipHashFunction.f18349d && this.f18350k0 == sipHashFunction.f18350k0 && this.f18351k1 == sipHashFunction.f18351k1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (int) ((((long) ((getClass().hashCode() ^ this.f18348c) ^ this.f18349d)) ^ this.f18350k0) ^ this.f18351k1);
    }

    private static final class SipHasher extends AbstractStreamingHasher {
        private static final int CHUNK_SIZE = 8;

        /* renamed from: b */
        private long f18352b = 0;

        /* renamed from: c */
        private final int f18353c;

        /* renamed from: d */
        private final int f18354d;
        private long finalM = 0;

        /* renamed from: v0 */
        private long f18355v0 = 8317987319222330741L;

        /* renamed from: v1 */
        private long f18356v1 = 7237128888997146477L;

        /* renamed from: v2 */
        private long f18357v2 = 7816392313619706465L;

        /* renamed from: v3 */
        private long f18358v3 = 8387220255154660723L;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        SipHasher(int i, int i2, long j, long j2) {
            super(8);
            this.f18353c = i;
            this.f18354d = i2;
            this.f18355v0 = 8317987319222330741L ^ j;
            this.f18356v1 = 7237128888997146477L ^ j2;
            this.f18357v2 = 7816392313619706465L ^ j;
            this.f18358v3 = 8387220255154660723L ^ j2;
        }

        /* access modifiers changed from: protected */
        public void process(ByteBuffer byteBuffer) {
            this.f18352b += 8;
            processM(byteBuffer.getLong());
        }

        /* access modifiers changed from: protected */
        public void processRemaining(ByteBuffer byteBuffer) {
            this.f18352b += (long) byteBuffer.remaining();
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                this.finalM ^= (((long) byteBuffer.get()) & 255) << i;
                i += 8;
            }
        }

        public HashCode makeHash() {
            long j = this.finalM ^ (this.f18352b << 56);
            this.finalM = j;
            processM(j);
            this.f18357v2 ^= 255;
            sipRound(this.f18354d);
            return HashCode.fromLong(((this.f18355v0 ^ this.f18356v1) ^ this.f18357v2) ^ this.f18358v3);
        }

        private void processM(long j) {
            this.f18358v3 ^= j;
            sipRound(this.f18353c);
            this.f18355v0 = j ^ this.f18355v0;
        }

        private void sipRound(int i) {
            for (int i2 = 0; i2 < i; i2++) {
                long j = this.f18355v0;
                long j2 = this.f18356v1;
                this.f18355v0 = j + j2;
                this.f18357v2 += this.f18358v3;
                this.f18356v1 = Long.rotateLeft(j2, 13);
                long rotateLeft = Long.rotateLeft(this.f18358v3, 16);
                this.f18358v3 = rotateLeft;
                long j3 = this.f18356v1;
                long j4 = this.f18355v0;
                this.f18356v1 = j3 ^ j4;
                this.f18358v3 = rotateLeft ^ this.f18357v2;
                long rotateLeft2 = Long.rotateLeft(j4, 32);
                this.f18355v0 = rotateLeft2;
                long j5 = this.f18357v2;
                long j6 = this.f18356v1;
                this.f18357v2 = j5 + j6;
                this.f18355v0 = rotateLeft2 + this.f18358v3;
                this.f18356v1 = Long.rotateLeft(j6, 17);
                long rotateLeft3 = Long.rotateLeft(this.f18358v3, 21);
                this.f18358v3 = rotateLeft3;
                long j7 = this.f18356v1;
                long j8 = this.f18357v2;
                this.f18356v1 = j7 ^ j8;
                this.f18358v3 = rotateLeft3 ^ this.f18355v0;
                this.f18357v2 = Long.rotateLeft(j8, 32);
            }
        }
    }
}

package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4941i;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4942j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.a */
public final class C4674a implements C4938g {

    /* renamed from: a */
    public final C4938g f11736a;

    /* renamed from: b */
    public final byte[] f11737b;

    /* renamed from: c */
    public final byte[] f11738c;

    /* renamed from: d */
    public CipherInputStream f11739d;

    public C4674a(C4938g gVar, byte[] bArr, byte[] bArr2) {
        this.f11736a = gVar;
        this.f11737b = bArr;
        this.f11738c = bArr2;
    }

    /* renamed from: a */
    public long mo24756a(C4942j jVar) throws IOException {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                instance.init(2, new SecretKeySpec(this.f11737b, "AES"), new IvParameterSpec(this.f11738c));
                this.f11739d = new CipherInputStream(new C4941i(this.f11736a, jVar), instance);
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void close() throws IOException {
        this.f11739d = null;
        this.f11736a.close();
    }

    /* renamed from: a */
    public int mo24755a(byte[] bArr, int i, int i2) throws IOException {
        C4965a.m15051b(this.f11739d != null);
        int read = this.f11739d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    /* renamed from: a */
    public Uri mo24757a() {
        return this.f11736a.mo24757a();
    }
}

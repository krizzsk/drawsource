package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4916a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4966b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4982o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i */
public final class C4928i {

    /* renamed from: a */
    public final HashMap<String, C4927h> f13091a;

    /* renamed from: b */
    public final SparseArray<String> f13092b;

    /* renamed from: c */
    public final C4966b f13093c;

    /* renamed from: d */
    public final Cipher f13094d;

    /* renamed from: e */
    public final SecretKeySpec f13095e;

    /* renamed from: f */
    public boolean f13096f;

    /* renamed from: g */
    public C4982o f13097g;

    public C4928i(File file, byte[] bArr) {
        if (bArr != null) {
            C4965a.m15049a(bArr.length == 16);
            try {
                this.f13094d = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                this.f13095e = new SecretKeySpec(bArr, "AES");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            this.f13094d = null;
            this.f13095e = null;
        }
        this.f13091a = new HashMap<>();
        this.f13092b = new SparseArray<>();
        this.f13093c = new C4966b(new File(file, CachedContentIndex.FILE_NAME));
    }

    /* renamed from: a */
    public C4927h mo25460a(String str) {
        return this.f13091a.get(str);
    }

    /* renamed from: b */
    public void mo25465b(String str) {
        C4927h remove = this.f13091a.remove(str);
        if (remove != null) {
            C4965a.m15051b(remove.f13089c.isEmpty());
            this.f13092b.remove(remove.f13087a);
            this.f13096f = true;
        }
    }

    /* renamed from: c */
    public void mo25466c() throws C4916a.C4917a {
        DataOutputStream dataOutputStream;
        Throwable th;
        Throwable th2;
        IOException e;
        if (this.f13096f) {
            DataOutputStream dataOutputStream2 = null;
            try {
                OutputStream b = this.f13093c.mo25500b();
                C4982o oVar = this.f13097g;
                if (oVar == null) {
                    this.f13097g = new C4982o(b);
                } else {
                    oVar.mo25552a(b);
                }
                dataOutputStream = new DataOutputStream(this.f13097g);
                try {
                    dataOutputStream.writeInt(1);
                    dataOutputStream.writeInt(this.f13094d != null ? 1 : 0);
                    if (this.f13094d != null) {
                        byte[] bArr = new byte[16];
                        new Random().nextBytes(bArr);
                        dataOutputStream.write(bArr);
                        try {
                            this.f13094d.init(1, this.f13095e, new IvParameterSpec(bArr));
                            dataOutputStream.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f13097g, this.f13094d));
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        } catch (InvalidAlgorithmParameterException e3) {
                            e = e3;
                            throw new IllegalStateException(e);
                        }
                    } else {
                        dataOutputStream2 = dataOutputStream;
                    }
                    dataOutputStream2.writeInt(this.f13091a.size());
                    int i = 0;
                    for (C4927h next : this.f13091a.values()) {
                        dataOutputStream2.writeInt(next.f13087a);
                        dataOutputStream2.writeUTF(next.f13088b);
                        dataOutputStream2.writeLong(next.f13090d);
                        i += next.mo25459a();
                    }
                    dataOutputStream2.writeInt(i);
                    C4966b bVar = this.f13093c;
                    bVar.getClass();
                    dataOutputStream2.close();
                    bVar.f13209b.delete();
                    int i2 = C4991u.f13270a;
                    this.f13096f = false;
                } catch (IOException e4) {
                    e = e4;
                    try {
                        throw new C4916a.C4917a(e);
                    } catch (Throwable th3) {
                        DataOutputStream dataOutputStream3 = dataOutputStream;
                        th2 = th3;
                        dataOutputStream2 = dataOutputStream3;
                        Throwable th4 = th2;
                        dataOutputStream = dataOutputStream2;
                        th = th4;
                        C4991u.m15138a((Closeable) dataOutputStream);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    C4991u.m15138a((Closeable) dataOutputStream);
                    throw th;
                }
            } catch (IOException e5) {
                IOException iOException = e5;
                dataOutputStream = dataOutputStream2;
                e = iOException;
                throw new C4916a.C4917a(e);
            } catch (Throwable th6) {
                th2 = th6;
                Throwable th42 = th2;
                dataOutputStream = dataOutputStream2;
                th = th42;
                C4991u.m15138a((Closeable) dataOutputStream);
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00af  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25463a() {
        /*
            r11 = this;
            r0 = 0
            r1 = 0
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            com.fyber.inneractive.sdk.player.exoplayer2.util.b r3 = r11.f13093c     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            java.io.InputStream r3 = r3.mo25499a()     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            r3.<init>(r2)     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            int r1 = r3.readInt()     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            r4 = 1
            if (r1 == r4) goto L_0x001d
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15138a((java.io.Closeable) r3)
            return r0
        L_0x001d:
            int r1 = r3.readInt()     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            r1 = r1 & r4
            if (r1 == 0) goto L_0x0056
            javax.crypto.Cipher r1 = r11.f13094d     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            if (r1 != 0) goto L_0x002c
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15138a((java.io.Closeable) r3)
            return r0
        L_0x002c:
            r1 = 16
            byte[] r1 = new byte[r1]     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            r3.readFully(r1)     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            javax.crypto.spec.IvParameterSpec r5 = new javax.crypto.spec.IvParameterSpec     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            r5.<init>(r1)     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            javax.crypto.Cipher r1 = r11.f13094d     // Catch:{ InvalidKeyException -> 0x004f, InvalidAlgorithmParameterException -> 0x004d }
            r6 = 2
            javax.crypto.spec.SecretKeySpec r7 = r11.f13095e     // Catch:{ InvalidKeyException -> 0x004f, InvalidAlgorithmParameterException -> 0x004d }
            r1.init(r6, r7, r5)     // Catch:{ InvalidKeyException -> 0x004f, InvalidAlgorithmParameterException -> 0x004d }
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            javax.crypto.CipherInputStream r5 = new javax.crypto.CipherInputStream     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            javax.crypto.Cipher r6 = r11.f13094d     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            r5.<init>(r2, r6)     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            goto L_0x005d
        L_0x004d:
            r1 = move-exception
            goto L_0x0050
        L_0x004f:
            r1 = move-exception
        L_0x0050:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            r2.<init>(r1)     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            throw r2     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
        L_0x0056:
            javax.crypto.Cipher r1 = r11.f13094d     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
            if (r1 == 0) goto L_0x005c
            r11.f13096f = r4     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x0091, all -> 0x008f }
        L_0x005c:
            r1 = r3
        L_0x005d:
            int r2 = r1.readInt()     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            r3 = r0
            r5 = r3
        L_0x0063:
            if (r3 >= r2) goto L_0x0081
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h r6 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            int r7 = r1.readInt()     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            java.lang.String r8 = r1.readUTF()     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            long r9 = r1.readLong()     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            r6.<init>(r7, r8, r9)     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            r11.mo25462a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4927h) r6)     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            int r6 = r6.mo25459a()     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            int r5 = r5 + r6
            int r3 = r3 + 1
            goto L_0x0063
        L_0x0081:
            int r2 = r1.readInt()     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0097 }
            if (r2 == r5) goto L_0x008b
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15138a((java.io.Closeable) r1)
            return r0
        L_0x008b:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15138a((java.io.Closeable) r1)
            return r4
        L_0x008f:
            r0 = move-exception
            goto L_0x00a6
        L_0x0091:
            r1 = move-exception
            r2 = r1
            r1 = r3
            goto L_0x0098
        L_0x0095:
            r0 = move-exception
            goto L_0x00a5
        L_0x0097:
            r2 = move-exception
        L_0x0098:
            java.lang.String r3 = "CachedContentIndex"
            java.lang.String r4 = "Error reading cache content index file."
            android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x00a4
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15138a((java.io.Closeable) r1)
        L_0x00a4:
            return r0
        L_0x00a5:
            r3 = r1
        L_0x00a6:
            if (r3 == 0) goto L_0x00ab
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15138a((java.io.Closeable) r3)
        L_0x00ab:
            throw r0
        L_0x00ac:
            r3 = r1
        L_0x00ad:
            if (r3 == 0) goto L_0x00b2
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15138a((java.io.Closeable) r3)
        L_0x00b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4928i.mo25463a():boolean");
    }

    /* renamed from: b */
    public void mo25464b() {
        LinkedList linkedList = new LinkedList();
        for (C4927h next : this.f13091a.values()) {
            if (next.f13089c.isEmpty()) {
                linkedList.add(next.f13088b);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            mo25465b((String) it.next());
        }
    }

    /* renamed from: a */
    public final void mo25462a(C4927h hVar) {
        this.f13091a.put(hVar.f13088b, hVar);
        this.f13092b.put(hVar.f13087a, hVar.f13088b);
    }

    /* renamed from: a */
    public final C4927h mo25461a(String str, long j) {
        int i;
        SparseArray<String> sparseArray = this.f13092b;
        int size = sparseArray.size();
        int i2 = 0;
        if (size == 0) {
            i = 0;
        } else {
            i = sparseArray.keyAt(size - 1) + 1;
        }
        if (i < 0) {
            while (i2 < size && i2 == sparseArray.keyAt(i2)) {
                i2++;
            }
            i = i2;
        }
        C4927h hVar = new C4927h(i, str, j);
        this.f13091a.put(str, hVar);
        this.f13092b.put(i, str);
        this.f13096f = true;
        return hVar;
    }
}

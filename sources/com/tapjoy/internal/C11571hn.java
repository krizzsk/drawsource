package com.tapjoy.internal;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.UUID;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.hn */
public final class C11571hn {

    /* renamed from: a */
    private final File f27788a;

    public C11571hn(File file) {
        this.f27788a = file;
    }

    /* renamed from: a */
    public final synchronized boolean mo70157a() {
        FileOutputStream fileOutputStream;
        if (mo70158b() != null) {
            return false;
        }
        try {
            File file = this.f27788a;
            String uuid = UUID.randomUUID().toString();
            fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, C11262af.f26924c);
            outputStreamWriter.write(uuid);
            outputStreamWriter.flush();
            C11531gp.m31567a(fileOutputStream);
            if (mo70158b() != null) {
                return true;
            }
            return false;
        } catch (IOException e) {
            try {
                this.f27788a.delete();
                throw e;
            } catch (IOException unused) {
                return false;
            }
        } catch (Throwable th) {
            C11531gp.m31567a(fileOutputStream);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public final String mo70158b() {
        if (!this.f27788a.exists()) {
            return null;
        }
        try {
            String a = C11286ba.m30887a(this.f27788a, C11262af.f26924c);
            if (a.length() > 0) {
                return a;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }
}

package com.saygames.saypromo.p378a;

import java.io.File;

/* renamed from: com.saygames.saypromo.a.I3 */
public abstract class C10434I3 {
    /* renamed from: a */
    public static final File m30173a(File file) {
        if (file.exists()) {
            return file;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        file.createNewFile();
        return file;
    }
}

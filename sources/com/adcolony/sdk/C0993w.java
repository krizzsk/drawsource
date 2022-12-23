package com.adcolony.sdk;

import com.adcolony.sdk.C0826e0;
import com.google.android.exoplayer2.C5429C;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.zip.GZIPInputStream;

/* renamed from: com.adcolony.sdk.w */
class C0993w {

    /* renamed from: a */
    private LinkedList<Runnable> f855a = new LinkedList<>();

    /* renamed from: b */
    private boolean f856b;

    /* renamed from: com.adcolony.sdk.w$a */
    class C0994a implements C0865j0 {

        /* renamed from: com.adcolony.sdk.w$a$a */
        class C0995a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f858a;

            C0995a(C0850h0 h0Var) {
                this.f858a = h0Var;
            }

            public void run() {
                boolean unused = C0993w.this.m1135g(this.f858a);
                C0993w.this.m1116a();
            }
        }

        C0994a() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0993w.this.m1119a((Runnable) new C0995a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$b */
    class C0996b implements C0865j0 {

        /* renamed from: com.adcolony.sdk.w$b$a */
        class C0997a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f861a;

            C0997a(C0850h0 h0Var) {
                this.f861a = h0Var;
            }

            public void run() {
                boolean unused = C0993w.this.m1121a(this.f861a, new File(C0773c0.m393h(this.f861a.mo10834a(), "filepath")));
                C0993w.this.m1116a();
            }
        }

        C0996b() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0993w.this.m1119a((Runnable) new C0997a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$c */
    class C0998c implements C0865j0 {

        /* renamed from: com.adcolony.sdk.w$c$a */
        class C0999a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f864a;

            C0999a(C0850h0 h0Var) {
                this.f864a = h0Var;
            }

            public void run() {
                boolean unused = C0993w.this.m1130d(this.f864a);
                C0993w.this.m1116a();
            }
        }

        C0998c() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0993w.this.m1119a((Runnable) new C0999a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$d */
    class C1000d implements C0865j0 {

        /* renamed from: com.adcolony.sdk.w$d$a */
        class C1001a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f867a;

            C1001a(C0850h0 h0Var) {
                this.f867a = h0Var;
            }

            public void run() {
                String unused = C0993w.this.m1131e(this.f867a);
                C0993w.this.m1116a();
            }
        }

        C1000d() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0993w.this.m1119a((Runnable) new C1001a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$e */
    class C1002e implements C0865j0 {

        /* renamed from: com.adcolony.sdk.w$e$a */
        class C1003a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f870a;

            C1003a(C0850h0 h0Var) {
                this.f870a = h0Var;
            }

            public void run() {
                boolean unused = C0993w.this.m1133f(this.f870a);
                C0993w.this.m1116a();
            }
        }

        C1002e() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0993w.this.m1119a((Runnable) new C1003a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$f */
    class C1004f implements C0865j0 {

        /* renamed from: com.adcolony.sdk.w$f$a */
        class C1005a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f873a;

            C1005a(C0850h0 h0Var) {
                this.f873a = h0Var;
            }

            public void run() {
                boolean unused = C0993w.this.m1125b(this.f873a);
                C0993w.this.m1116a();
            }
        }

        C1004f() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0993w.this.m1119a((Runnable) new C1005a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$g */
    class C1006g implements C0865j0 {

        /* renamed from: com.adcolony.sdk.w$g$a */
        class C1007a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f876a;

            C1007a(C0850h0 h0Var) {
                this.f876a = h0Var;
            }

            public void run() {
                boolean unused = C0993w.this.m1127c(this.f876a);
                C0993w.this.m1116a();
            }
        }

        C1006g() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0993w.this.m1119a((Runnable) new C1007a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$h */
    class C1008h implements C0865j0 {

        /* renamed from: com.adcolony.sdk.w$h$a */
        class C1009a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f879a;

            C1009a(C0850h0 h0Var) {
                this.f879a = h0Var;
            }

            public void run() {
                boolean unused = C0993w.this.m1137h(this.f879a);
                C0993w.this.m1116a();
            }
        }

        C1008h() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0993w.this.m1119a((Runnable) new C1009a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.w$i */
    class C1010i implements C0865j0 {

        /* renamed from: com.adcolony.sdk.w$i$a */
        class C1011a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f882a;

            C1011a(C0850h0 h0Var) {
                this.f882a = h0Var;
            }

            public void run() {
                boolean unused = C0993w.this.m1120a(this.f882a);
                C0993w.this.m1116a();
            }
        }

        C1010i() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0993w.this.m1119a((Runnable) new C1011a(h0Var));
        }
    }

    C0993w() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m1127c(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        String h = C0773c0.m393h(a, "filepath");
        C0723a.m193b().mo10917z().mo11161h();
        C0832f1 b = C0773c0.m379b();
        try {
            int d = C0773c0.m389d(a, "offset");
            int d2 = C0773c0.m389d(a, "size");
            boolean b2 = C0773c0.m382b(a, "gunzip");
            String h2 = C0773c0.m393h(a, "output_filepath");
            InputStream w0Var = new C1012w0(new FileInputStream(h), d, d2);
            if (b2) {
                w0Var = new GZIPInputStream(w0Var, 1024);
            }
            if (h2.equals("")) {
                StringBuilder sb = new StringBuilder(w0Var.available());
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = w0Var.read(bArr, 0, 1024);
                    if (read < 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read, C5429C.ISO88591_NAME));
                }
                C0773c0.m383b(b, "size", sb.length());
                C0773c0.m376a(b, "data", sb.toString());
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(h2);
                byte[] bArr2 = new byte[1024];
                int i = 0;
                while (true) {
                    int read2 = w0Var.read(bArr2, 0, 1024);
                    if (read2 < 0) {
                        break;
                    }
                    fileOutputStream.write(bArr2, 0, read2);
                    i += read2;
                }
                fileOutputStream.close();
                C0773c0.m383b(b, "size", i);
            }
            w0Var.close();
            C0773c0.m385b(b, "success", true);
            h0Var.mo10835a(b).mo10838c();
            return true;
        } catch (IOException unused) {
            C0773c0.m385b(b, "success", false);
            h0Var.mo10835a(b).mo10838c();
            return false;
        } catch (OutOfMemoryError unused2) {
            new C0826e0.C0827a().mo10746a("Out of memory error - disabling AdColony.").mo10747a(C0826e0.f461h);
            C0723a.m193b().mo10888b(true);
            C0773c0.m385b(b, "success", false);
            h0Var.mo10835a(b).mo10838c();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m1130d(C0850h0 h0Var) {
        String h = C0773c0.m393h(h0Var.mo10834a(), "filepath");
        C0723a.m193b().mo10917z().mo11161h();
        C0832f1 b = C0773c0.m379b();
        String[] list = new File(h).list();
        if (list != null) {
            C0828e1 a = C0773c0.m365a();
            for (String str : list) {
                C0832f1 b2 = C0773c0.m379b();
                C0773c0.m376a(b2, "filename", str);
                if (new File(h + str).isDirectory()) {
                    C0773c0.m385b(b2, "is_folder", true);
                } else {
                    C0773c0.m385b(b2, "is_folder", false);
                }
                C0773c0.m371a(a, b2);
            }
            C0773c0.m385b(b, "success", true);
            C0773c0.m374a(b, "entries", a);
            h0Var.mo10835a(b).mo10838c();
            return true;
        }
        C0773c0.m385b(b, "success", false);
        h0Var.mo10835a(b).mo10838c();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public String m1131e(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        String h = C0773c0.m393h(a, "filepath");
        String h2 = C0773c0.m393h(a, "encoding");
        boolean z = h2 != null && h2.equals("utf8");
        C0723a.m193b().mo10917z().mo11161h();
        C0832f1 b = C0773c0.m379b();
        try {
            StringBuilder a2 = mo11162a(h, z);
            C0773c0.m385b(b, "success", true);
            C0773c0.m376a(b, "data", a2.toString());
            h0Var.mo10835a(b).mo10838c();
            return a2.toString();
        } catch (IOException unused) {
            C0773c0.m385b(b, "success", false);
            h0Var.mo10835a(b).mo10838c();
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m1133f(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        String h = C0773c0.m393h(a, "filepath");
        String h2 = C0773c0.m393h(a, "new_filepath");
        C0723a.m193b().mo10917z().mo11161h();
        C0832f1 b = C0773c0.m379b();
        try {
            if (new File(h).renameTo(new File(h2))) {
                C0773c0.m385b(b, "success", true);
                h0Var.mo10835a(b).mo10838c();
                return true;
            }
            C0773c0.m385b(b, "success", false);
            h0Var.mo10835a(b).mo10838c();
            return false;
        } catch (Exception unused) {
            C0773c0.m385b(b, "success", false);
            h0Var.mo10835a(b).mo10838c();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m1135g(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        String h = C0773c0.m393h(a, "filepath");
        String h2 = C0773c0.m393h(a, "data");
        boolean equals = C0773c0.m393h(a, "encoding").equals("utf8");
        C0723a.m193b().mo10917z().mo11161h();
        C0832f1 b = C0773c0.m379b();
        try {
            mo11163a(h, h2, equals);
            C0773c0.m385b(b, "success", true);
            h0Var.mo10835a(b).mo10838c();
            return true;
        } catch (IOException unused) {
            C0773c0.m385b(b, "success", false);
            h0Var.mo10835a(b).mo10838c();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fb, code lost:
        new com.adcolony.sdk.C0826e0.C0827a().mo10746a("Out of memory error - disabling AdColony.").mo10747a(com.adcolony.sdk.C0826e0.f461h);
        com.adcolony.sdk.C0723a.m193b().mo10888b(true);
        com.adcolony.sdk.C0773c0.m385b(r5, "success", false);
        r0.mo10835a(r5).mo10838c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011f, code lost:
        r2 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[ExcHandler: OutOfMemoryError (unused java.lang.OutOfMemoryError), SYNTHETIC, Splitter:B:1:0x0029] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m1137h(com.adcolony.sdk.C0850h0 r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "success"
            com.adcolony.sdk.f1 r2 = r21.mo10834a()
            java.lang.String r3 = "filepath"
            java.lang.String r3 = com.adcolony.sdk.C0773c0.m393h(r2, r3)
            java.lang.String r4 = "bundle_path"
            java.lang.String r4 = com.adcolony.sdk.C0773c0.m393h(r2, r4)
            java.lang.String r5 = "bundle_filenames"
            com.adcolony.sdk.e1 r2 = com.adcolony.sdk.C0773c0.m366a((com.adcolony.sdk.C0832f1) r2, (java.lang.String) r5)
            com.adcolony.sdk.k r5 = com.adcolony.sdk.C0723a.m193b()
            com.adcolony.sdk.v0 r5 = r5.mo10917z()
            r5.mo11161h()
            com.adcolony.sdk.f1 r5 = com.adcolony.sdk.C0773c0.m379b()
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r8.<init>(r4)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            java.lang.String r10 = "r"
            r9.<init>(r8, r10)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r10 = 32
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r9.readInt()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            int r11 = r9.readInt()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            com.adcolony.sdk.e1 r12 = new com.adcolony.sdk.e1     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r12.<init>()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r13 = 1024(0x400, float:1.435E-42)
            byte[] r14 = new byte[r13]     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r15 = 0
        L_0x004a:
            if (r15 >= r11) goto L_0x00e1
            int r16 = r15 * 44
            int r6 = r16 + 8
            r17 = r8
            long r7 = (long) r6     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r9.seek(r7)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r9.read(r10)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r9.readInt()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            int r6 = r9.readInt()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            int r7 = r9.readInt()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r12.mo10760f(r7)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00b7 }
            r8.<init>()     // Catch:{ JSONException -> 0x00b7 }
            r8.append(r3)     // Catch:{ JSONException -> 0x00b7 }
            java.lang.Object r13 = r2.mo10749a((int) r15)     // Catch:{ JSONException -> 0x00b7 }
            r8.append(r13)     // Catch:{ JSONException -> 0x00b7 }
            java.lang.String r8 = r8.toString()     // Catch:{ JSONException -> 0x00b7 }
            r18 = r2
            r13 = r3
            long r2 = (long) r6
            r9.seek(r2)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r2.<init>(r8)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            int r3 = r7 / 1024
            int r7 = r7 % 1024
            r6 = 0
        L_0x008b:
            if (r6 >= r3) goto L_0x009d
            r16 = r3
            r3 = 1024(0x400, float:1.435E-42)
            r8 = 0
            r9.read(r14, r8, r3)     // Catch:{ IOException -> 0x00b5, OutOfMemoryError -> 0x00fb }
            r2.write(r14, r8, r3)     // Catch:{ IOException -> 0x00b5, OutOfMemoryError -> 0x00fb }
            int r6 = r6 + 1
            r3 = r16
            goto L_0x008b
        L_0x009d:
            r3 = 1024(0x400, float:1.435E-42)
            r8 = 0
            r9.read(r14, r8, r7)     // Catch:{ IOException -> 0x00b5, OutOfMemoryError -> 0x00fb }
            r2.write(r14, r8, r7)     // Catch:{ IOException -> 0x00b5, OutOfMemoryError -> 0x00fb }
            r2.close()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            int r15 = r15 + 1
            r8 = r17
            r2 = r18
            r19 = r13
            r13 = r3
            r3 = r19
            goto L_0x004a
        L_0x00b5:
            r2 = r8
            goto L_0x0120
        L_0x00b7:
            com.adcolony.sdk.e0$a r2 = new com.adcolony.sdk.e0$a     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r2.<init>()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            java.lang.String r3 = "Couldn't extract file name at index "
            com.adcolony.sdk.e0$a r2 = r2.mo10746a((java.lang.String) r3)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            com.adcolony.sdk.e0$a r2 = r2.mo10744a((int) r15)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            java.lang.String r3 = " unpacking ad unit bundle at "
            com.adcolony.sdk.e0$a r2 = r2.mo10746a((java.lang.String) r3)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            com.adcolony.sdk.e0$a r2 = r2.mo10746a((java.lang.String) r4)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            com.adcolony.sdk.e0 r3 = com.adcolony.sdk.C0826e0.f461h     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r2.mo10747a((com.adcolony.sdk.C0826e0) r3)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r2 = 0
            com.adcolony.sdk.C0773c0.m385b((com.adcolony.sdk.C0832f1) r5, (java.lang.String) r1, (boolean) r2)     // Catch:{ IOException -> 0x0120, OutOfMemoryError -> 0x00fb }
            com.adcolony.sdk.h0 r3 = r0.mo10835a(r5)     // Catch:{ IOException -> 0x0120, OutOfMemoryError -> 0x00fb }
            r3.mo10838c()     // Catch:{ IOException -> 0x0120, OutOfMemoryError -> 0x00fb }
            return r2
        L_0x00e1:
            r17 = r8
            r9.close()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r17.delete()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r2 = 1
            com.adcolony.sdk.C0773c0.m385b((com.adcolony.sdk.C0832f1) r5, (java.lang.String) r1, (boolean) r2)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            java.lang.String r2 = "file_sizes"
            com.adcolony.sdk.C0773c0.m374a((com.adcolony.sdk.C0832f1) r5, (java.lang.String) r2, (com.adcolony.sdk.C0828e1) r12)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            com.adcolony.sdk.h0 r2 = r0.mo10835a(r5)     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r2.mo10838c()     // Catch:{ IOException -> 0x011f, OutOfMemoryError -> 0x00fb }
            r0 = 1
            return r0
        L_0x00fb:
            com.adcolony.sdk.e0$a r2 = new com.adcolony.sdk.e0$a
            r2.<init>()
            java.lang.String r3 = "Out of memory error - disabling AdColony."
            com.adcolony.sdk.e0$a r2 = r2.mo10746a((java.lang.String) r3)
            com.adcolony.sdk.e0 r3 = com.adcolony.sdk.C0826e0.f461h
            r2.mo10747a((com.adcolony.sdk.C0826e0) r3)
            com.adcolony.sdk.k r2 = com.adcolony.sdk.C0723a.m193b()
            r3 = 1
            r2.mo10888b((boolean) r3)
            r2 = 0
            com.adcolony.sdk.C0773c0.m385b((com.adcolony.sdk.C0832f1) r5, (java.lang.String) r1, (boolean) r2)
            com.adcolony.sdk.h0 r0 = r0.mo10835a(r5)
            r0.mo10838c()
            return r2
        L_0x011f:
            r2 = 0
        L_0x0120:
            com.adcolony.sdk.e0$a r3 = new com.adcolony.sdk.e0$a
            r3.<init>()
            java.lang.String r6 = "Failed to find or open ad unit bundle at path: "
            com.adcolony.sdk.e0$a r3 = r3.mo10746a((java.lang.String) r6)
            com.adcolony.sdk.e0$a r3 = r3.mo10746a((java.lang.String) r4)
            com.adcolony.sdk.e0 r4 = com.adcolony.sdk.C0826e0.f462i
            r3.mo10747a((com.adcolony.sdk.C0826e0) r4)
            com.adcolony.sdk.C0773c0.m385b((com.adcolony.sdk.C0832f1) r5, (java.lang.String) r1, (boolean) r2)
            com.adcolony.sdk.h0 r0 = r0.mo10835a(r5)
            r0.mo10838c()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0993w.m1137h(com.adcolony.sdk.h0):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11165b() {
        C0723a.m192a("FileSystem.save", (C0865j0) new C0994a());
        C0723a.m192a("FileSystem.delete", (C0865j0) new C0996b());
        C0723a.m192a("FileSystem.listing", (C0865j0) new C0998c());
        C0723a.m192a("FileSystem.load", (C0865j0) new C1000d());
        C0723a.m192a("FileSystem.rename", (C0865j0) new C1002e());
        C0723a.m192a("FileSystem.exists", (C0865j0) new C1004f());
        C0723a.m192a("FileSystem.extract", (C0865j0) new C1006g());
        C0723a.m192a("FileSystem.unpack_bundle", (C0865j0) new C1008h());
        C0723a.m192a("FileSystem.create_directory", (C0865j0) new C1010i());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11163a(String str, String str2, boolean z) throws IOException {
        BufferedWriter bufferedWriter;
        if (z) {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), C0849h.f506a));
        } else {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str)));
        }
        bufferedWriter.write(str2);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m1121a(C0850h0 h0Var, File file) {
        C0723a.m193b().mo10917z().mo11161h();
        C0832f1 b = C0773c0.m379b();
        if (mo11164a(file)) {
            C0773c0.m385b(b, "success", true);
            h0Var.mo10835a(b).mo10838c();
            return true;
        }
        C0773c0.m385b(b, "success", false);
        h0Var.mo10835a(b).mo10838c();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo11164a(File file) {
        try {
            if (!file.isDirectory()) {
                return file.delete();
            }
            if (file.list().length == 0) {
                return file.delete();
            }
            String[] list = file.list();
            if (list.length > 0) {
                return mo11164a(new File(file, list[0]));
            }
            if (file.list().length == 0) {
                return file.delete();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public StringBuilder mo11162a(String str, boolean z) throws IOException {
        BufferedReader bufferedReader;
        File file = new File(str);
        StringBuilder sb = new StringBuilder((int) file.length());
        if (z) {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), C0849h.f506a));
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath())));
        }
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append("\n");
            } else {
                bufferedReader.close();
                return sb;
            }
        }
    }

    /* renamed from: a */
    private boolean m1124a(String str) {
        return new File(str).exists();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m1120a(C0850h0 h0Var) {
        String h = C0773c0.m393h(h0Var.mo10834a(), "filepath");
        C0723a.m193b().mo10917z().mo11161h();
        C0832f1 b = C0773c0.m379b();
        try {
            if (new File(h).mkdir()) {
                C0773c0.m385b(b, "success", true);
                h0Var.mo10835a(b).mo10838c();
                return true;
            }
            C0773c0.m385b(b, "success", false);
            return false;
        } catch (Exception unused) {
            C0773c0.m385b(b, "success", false);
            h0Var.mo10835a(b).mo10838c();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1119a(Runnable runnable) {
        if (!this.f855a.isEmpty() || this.f856b) {
            this.f855a.push(runnable);
            return;
        }
        this.f856b = true;
        runnable.run();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1116a() {
        this.f856b = false;
        if (!this.f855a.isEmpty()) {
            this.f856b = true;
            this.f855a.removeLast().run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m1125b(C0850h0 h0Var) {
        String h = C0773c0.m393h(h0Var.mo10834a(), "filepath");
        C0723a.m193b().mo10917z().mo11161h();
        C0832f1 b = C0773c0.m379b();
        try {
            boolean a = m1124a(h);
            C0773c0.m385b(b, IronSourceConstants.EVENTS_RESULT, a);
            C0773c0.m385b(b, "success", true);
            h0Var.mo10835a(b).mo10838c();
            return a;
        } catch (Exception e) {
            C0773c0.m385b(b, IronSourceConstants.EVENTS_RESULT, false);
            C0773c0.m385b(b, "success", false);
            h0Var.mo10835a(b).mo10838c();
            e.printStackTrace();
            return false;
        }
    }
}

package com.saygames.saypromo.p378a;

import java.io.Closeable;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.Buffer;
import okio.Sink;
import okio.Source;

/* renamed from: com.saygames.saypromo.a.P3 */
final class C10483P3 extends ContinuationImpl {

    /* renamed from: a */
    C10496R3 f25930a;

    /* renamed from: b */
    File f25931b;

    /* renamed from: c */
    Source f25932c;

    /* renamed from: d */
    Closeable f25933d;

    /* renamed from: e */
    Closeable f25934e;

    /* renamed from: f */
    Sink f25935f;

    /* renamed from: g */
    Buffer f25936g;

    /* renamed from: h */
    long f25937h;

    /* renamed from: i */
    /* synthetic */ Object f25938i;

    /* renamed from: j */
    final /* synthetic */ C10496R3 f25939j;

    /* renamed from: k */
    int f25940k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10483P3(C10496R3 r3, Continuation continuation) {
        super(continuation);
        this.f25939j = r3;
    }

    public final Object invokeSuspend(Object obj) {
        this.f25938i = obj;
        this.f25940k |= Integer.MIN_VALUE;
        return this.f25939j.mo65371a((File) null, (Source) null, (Continuation) this);
    }
}

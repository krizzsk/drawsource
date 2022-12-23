package com.tapjoy.internal;

import java.io.Writer;

/* renamed from: com.tapjoy.internal.bg */
public final class C11295bg implements C11294bf {

    /* renamed from: a */
    public final String f26954a;

    public C11295bg(String str) {
        this.f26954a = str;
    }

    /* renamed from: a */
    public final void mo69695a(Writer writer) {
        writer.write(this.f26954a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11295bg) {
            return this.f26954a.equals(((C11295bg) obj).f26954a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26954a.hashCode();
    }

    public final String toString() {
        return this.f26954a;
    }
}

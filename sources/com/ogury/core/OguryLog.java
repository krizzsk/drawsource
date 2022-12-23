package com.ogury.core;

import androidx.room.RoomDatabase;
import com.ogury.core.internal.C9716ah;
import com.ogury.core.internal.C9717ai;
import com.ogury.core.internal.OguryIntegrationLogger;

/* compiled from: OguryLog.kt */
public final class OguryLog {
    public static final OguryLog INSTANCE = new OguryLog();

    private OguryLog() {
    }

    /* compiled from: OguryLog.kt */
    public enum Level {
        ;

        public abstract int getLogPriority();

        /* renamed from: com.ogury.core.OguryLog$Level$d */
        /* compiled from: OguryLog.kt */
        static final class C9697d extends Level {
            public final int getLogPriority() {
                return RoomDatabase.MAX_BIND_PARAMETER_CNT;
            }

            C9697d(String str, int i) {
                super(str, 0, (C9716ah) null);
            }
        }

        /* renamed from: com.ogury.core.OguryLog$Level$a */
        /* compiled from: OguryLog.kt */
        static final class C9694a extends Level {
            public final int getLogPriority() {
                return 3;
            }

            C9694a(String str, int i) {
                super(str, 1, (C9716ah) null);
            }
        }

        /* renamed from: com.ogury.core.OguryLog$Level$c */
        /* compiled from: OguryLog.kt */
        static final class C9696c extends Level {
            public final int getLogPriority() {
                return 4;
            }

            C9696c(String str, int i) {
                super(str, 2, (C9716ah) null);
            }
        }

        /* renamed from: com.ogury.core.OguryLog$Level$b */
        /* compiled from: OguryLog.kt */
        static final class C9695b extends Level {
            public final int getLogPriority() {
                return 6;
            }

            C9695b(String str, int i) {
                super(str, 3, (C9716ah) null);
            }
        }
    }

    public static final void enable(Level level) {
        C9717ai.m28145b(level, "level");
        OguryIntegrationLogger.setLevel(level.getLogPriority());
    }
}

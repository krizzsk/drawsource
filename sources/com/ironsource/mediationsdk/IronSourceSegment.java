package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Pair;
import com.adcolony.sdk.AdColonyUserMetadata;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.Locale;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

public class IronSourceSegment {
    public static final String AGE = "age";
    public static final String GENDER = "gen";
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String USER_CREATION_DATE = "ucd";

    /* renamed from: a */
    private String f16348a;

    /* renamed from: b */
    private int f16349b = 999999;

    /* renamed from: c */
    private double f16350c = 999999.99d;

    /* renamed from: d */
    private final String f16351d = "custom";

    /* renamed from: e */
    private final int f16352e = 5;

    /* renamed from: f */
    private int f16353f = -1;

    /* renamed from: g */
    private String f16354g;

    /* renamed from: h */
    private int f16355h = -1;

    /* renamed from: i */
    private AtomicBoolean f16356i = null;

    /* renamed from: j */
    private double f16357j = -1.0d;

    /* renamed from: k */
    private long f16358k = 0;

    /* renamed from: l */
    private Vector<Pair<String, String>> f16359l = new Vector<>();

    /* renamed from: a */
    private static boolean m19284a(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    /* renamed from: a */
    private static boolean m19285a(String str, int i, int i2) {
        return str != null && str.length() > 0 && str.length() <= 32;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Vector<Pair<String, String>> mo36082a() {
        Vector<Pair<String, String>> vector = new Vector<>();
        if (this.f16353f != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f16353f);
            vector.add(new Pair("age", sb.toString()));
        }
        if (!TextUtils.isEmpty(this.f16354g)) {
            vector.add(new Pair(GENDER, this.f16354g));
        }
        if (this.f16355h != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f16355h);
            vector.add(new Pair(LEVEL, sb2.toString()));
        }
        if (this.f16356i != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f16356i);
            vector.add(new Pair(PAYING, sb3.toString()));
        }
        if (this.f16357j != -1.0d) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f16357j);
            vector.add(new Pair(IAPT, sb4.toString()));
        }
        if (this.f16358k != 0) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f16358k);
            vector.add(new Pair(USER_CREATION_DATE, sb5.toString()));
        }
        if (!TextUtils.isEmpty(this.f16348a)) {
            vector.add(new Pair("segName", this.f16348a));
        }
        vector.addAll(this.f16359l);
        return vector;
    }

    public int getAge() {
        return this.f16353f;
    }

    public String getGender() {
        return this.f16354g;
    }

    public double getIapt() {
        return this.f16357j;
    }

    public AtomicBoolean getIsPaying() {
        return this.f16356i;
    }

    public int getLevel() {
        return this.f16355h;
    }

    public String getSegmentName() {
        return this.f16348a;
    }

    public long getUcd() {
        return this.f16358k;
    }

    public void setAge(int i) {
        if (i <= 0 || i > 199) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setAge( " + i + " ) age must be between 1-199", 2);
            return;
        }
        this.f16353f = i;
    }

    public void setCustom(String str, String str2) {
        try {
            if (!m19284a(str) || !m19284a(str2) || !m19285a(str, 1, 32) || !m19285a(str2, 1, 32)) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
                return;
            }
            String str3 = ContentMetadata.KEY_CUSTOM_PREFIX + str;
            if (this.f16359l.size() >= 5) {
                this.f16359l.remove(0);
            }
            this.f16359l.add(new Pair(str3, str2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setGender(String str) {
        if (TextUtils.isEmpty(str) || (!str.toLowerCase(Locale.ENGLISH).equals(AdColonyUserMetadata.USER_MALE) && !str.toLowerCase(Locale.ENGLISH).equals(AdColonyUserMetadata.USER_FEMALE))) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setGender( " + str + " ) is invalid", 2);
            return;
        }
        this.f16354g = str;
    }

    public void setIAPTotal(double d) {
        if (d <= 0.0d || d >= this.f16350c) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setIAPTotal( " + d + " ) iapt must be between 0-" + this.f16350c, 2);
            return;
        }
        this.f16357j = Math.floor(d * 100.0d) / 100.0d;
    }

    public void setIsPaying(boolean z) {
        if (this.f16356i == null) {
            this.f16356i = new AtomicBoolean();
        }
        this.f16356i.set(z);
    }

    public void setLevel(int i) {
        if (i <= 0 || i >= this.f16349b) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setLevel( " + i + " ) level must be between 1-" + this.f16349b, 2);
            return;
        }
        this.f16355h = i;
    }

    public void setSegmentName(String str) {
        if (!m19284a(str) || !m19285a(str, 1, 32)) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
            return;
        }
        this.f16348a = str;
    }

    public void setUserCreationDate(long j) {
        if (j > 0) {
            this.f16358k = j;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setUserCreationDate( " + j + " ) is an invalid timestamp", 2);
    }
}

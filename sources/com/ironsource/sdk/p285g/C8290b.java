package com.ironsource.sdk.p285g;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.ironsource.sdk.g.b */
public final class C8290b implements Parcelable {
    public static final Parcelable.Creator<C8290b> CREATOR = new Parcelable.Creator<C8290b>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C8290b(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C8290b[i];
        }
    };

    /* renamed from: a */
    public String f20202a;

    /* renamed from: b */
    public String f20203b;

    /* renamed from: c */
    public String f20204c;

    /* renamed from: d */
    public boolean f20205d;

    /* renamed from: e */
    public int f20206e;

    /* renamed from: f */
    public String f20207f;

    /* renamed from: g */
    public String f20208g;

    /* renamed from: h */
    public boolean f20209h;

    /* renamed from: i */
    public boolean f20210i;

    /* renamed from: j */
    public Map<String, String> f20211j;

    /* renamed from: k */
    private ArrayList<String> f20212k;

    /* renamed from: l */
    private ArrayList<String> f20213l;

    /* renamed from: m */
    private ArrayList<String> f20214m;

    /* renamed from: n */
    private ArrayList<String> f20215n;

    /* renamed from: o */
    private Map<String, String> f20216o;

    public C8290b() {
        m23626a();
    }

    private C8290b(Parcel parcel) {
        m23626a();
        try {
            boolean z = true;
            this.f20205d = parcel.readByte() != 0;
            this.f20206e = parcel.readInt();
            this.f20202a = parcel.readString();
            this.f20203b = parcel.readString();
            this.f20204c = parcel.readString();
            this.f20207f = parcel.readString();
            this.f20208g = parcel.readString();
            this.f20216o = m23625a(parcel.readString());
            this.f20210i = parcel.readByte() != 0;
            if (parcel.readByte() == 0) {
                z = false;
            }
            this.f20209h = z;
            this.f20211j = m23625a(parcel.readString());
        } catch (Throwable unused) {
            m23626a();
        }
    }

    /* synthetic */ C8290b(Parcel parcel, byte b) {
        this(parcel);
    }

    /* renamed from: a */
    private static Map<String, String> m23625a(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m23626a() {
        this.f20205d = false;
        this.f20206e = -1;
        this.f20212k = new ArrayList<>();
        this.f20213l = new ArrayList<>();
        this.f20214m = new ArrayList<>();
        this.f20215n = new ArrayList<>();
        this.f20209h = true;
        this.f20210i = false;
        this.f20208g = "";
        this.f20207f = "";
        this.f20216o = new HashMap();
        this.f20211j = new HashMap();
    }

    /* renamed from: a */
    public final void mo56717a(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && this.f20214m.indexOf(str) == -1) {
            this.f20214m.add(str);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.f20205d);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.f20206e);
            sb.append(", ");
            sb.append("ISReportInit:");
            sb.append(this.f20212k);
            sb.append(", ");
            sb.append("ISInitSuccess:");
            sb.append(this.f20213l);
            sb.append(", ");
            sb.append("ISAppKey");
            sb.append(this.f20207f);
            sb.append(", ");
            sb.append("ISUserId");
            sb.append(this.f20208g);
            sb.append(", ");
            sb.append("ISExtraParams");
            sb.append(this.f20216o);
            sb.append(", ");
            sb.append("OWReportInit");
            sb.append(this.f20209h);
            sb.append(", ");
            sb.append("OWInitSuccess");
            sb.append(this.f20210i);
            sb.append(", ");
            sb.append("OWExtraParams");
            sb.append(this.f20211j);
            sb.append(", ");
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        try {
            int i2 = 1;
            parcel.writeByte((byte) (this.f20205d ? 1 : 0));
            parcel.writeInt(this.f20206e);
            parcel.writeString(this.f20202a);
            parcel.writeString(this.f20203b);
            parcel.writeString(this.f20204c);
            parcel.writeString(this.f20207f);
            parcel.writeString(this.f20208g);
            parcel.writeString(new JSONObject(this.f20216o).toString());
            parcel.writeByte((byte) (this.f20210i ? 1 : 0));
            if (!this.f20209h) {
                i2 = 0;
            }
            parcel.writeByte((byte) i2);
            parcel.writeString(new JSONObject(this.f20211j).toString());
        } catch (Throwable unused) {
        }
    }
}

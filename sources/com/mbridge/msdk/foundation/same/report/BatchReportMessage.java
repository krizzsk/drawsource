package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new Parcelable.Creator<BatchReportMessage>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BatchReportMessage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }
    };

    /* renamed from: a */
    private String f21053a;

    /* renamed from: b */
    private String f21054b;

    /* renamed from: c */
    private long f21055c;

    public int describeContents() {
        return 0;
    }

    public BatchReportMessage(String str, String str2, long j) {
        this.f21053a = str;
        this.f21054b = str2;
        this.f21055c = j;
    }

    protected BatchReportMessage(Parcel parcel) {
        this.f21053a = parcel.readString();
        this.f21054b = parcel.readString();
        this.f21055c = parcel.readLong();
    }

    public String getUuid() {
        return this.f21053a;
    }

    public void setUuid(String str) {
        this.f21053a = str;
    }

    public String getReportMessage() {
        return this.f21054b;
    }

    public void setReportMessage(String str) {
        this.f21054b = str;
    }

    public long getTimestamp() {
        return this.f21055c;
    }

    public void setTimestamp(long j) {
        this.f21055c = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21053a);
        parcel.writeString(this.f21054b);
        parcel.writeLong(this.f21055c);
    }
}

package com.mbridge.msdk.playercommon.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new Parcelable.Creator<CommentFrame>() {
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        public CommentFrame[] newArray(int i) {
            return new CommentFrame[i];
        }
    };

    /* renamed from: ID */
    public static final String f22112ID = "COMM";
    public final String description;
    public final String language;
    public final String text;

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.language = str;
        this.description = str2;
        this.text = str3;
    }

    CommentFrame(Parcel parcel) {
        super("COMM");
        this.language = parcel.readString();
        this.description = parcel.readString();
        this.text = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        if (!Util.areEqual(this.description, commentFrame.description) || !Util.areEqual(this.language, commentFrame.language) || !Util.areEqual(this.text, commentFrame.text)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.language;
        int i = 0;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.text;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return this.f22114id + ": language=" + this.language + ", description=" + this.description;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f22114id);
        parcel.writeString(this.language);
        parcel.writeString(this.text);
    }
}

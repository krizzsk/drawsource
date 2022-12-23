package com.facebook.gamingservices;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72582d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo72583d2 = {"Lcom/facebook/gamingservices/GraphAPIException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "facebook-gamingservices_release"}, mo72584k = 1, mo72585mv = {1, 5, 1}, mo72587xi = 48)
/* compiled from: TournamentFetcher.kt */
public final class GraphAPIException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphAPIException(String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "message");
    }
}
package com.mbridge.msdk.out;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.net.C8503Aa;
import java.lang.reflect.Method;

public class ChannelManager {
    public static void setChannel(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                C8503Aa aa = new C8503Aa();
                Method declaredMethod = aa.getClass().getDeclaredMethod(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, new Class[]{String.class});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(aa, new Object[]{str});
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

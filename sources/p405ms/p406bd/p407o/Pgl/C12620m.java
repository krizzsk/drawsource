package p405ms.p406bd.p407o.Pgl;

import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import org.json.JSONArray;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.m */
final class C12620m extends pblb.pgla {
    C12620m() {
    }

    /* renamed from: a */
    public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
        JSONArray jSONArray = new JSONArray();
        try {
            DhcpInfo dhcpInfo = ((WifiManager) pgla.m33513a().mo74929b().getApplicationContext().getSystemService((String) pblk.m33455a(16777217, 0, 0, "7913e4", new byte[]{49, 50, 68, 78}))).getDhcpInfo();
            StringBuilder sb = new StringBuilder();
            sb.append(dhcpInfo.dns1 & 255);
            sb.append((String) pblk.m33455a(16777217, 0, 0, "59aff9", new byte[]{106}));
            sb.append((dhcpInfo.dns1 >> 8) & 255);
            sb.append((String) pblk.m33455a(16777217, 0, 0, "6718cf", new byte[]{105}));
            sb.append((dhcpInfo.dns1 >> 16) & 255);
            sb.append((String) pblk.m33455a(16777217, 0, 0, "0b3535", new byte[]{111}));
            sb.append((dhcpInfo.dns1 >> 24) & 255);
            jSONArray.put(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dhcpInfo.dns2 & 255);
            sb2.append((String) pblk.m33455a(16777217, 0, 0, "d1ed5a", new byte[]{59}));
            sb2.append((dhcpInfo.dns2 >> 8) & 255);
            sb2.append((String) pblk.m33455a(16777217, 0, 0, "06013b", new byte[]{111}));
            sb2.append((dhcpInfo.dns2 >> 16) & 255);
            sb2.append((String) pblk.m33455a(16777217, 0, 0, "915671", new byte[]{102}));
            sb2.append((dhcpInfo.dns2 >> 24) & 255);
            jSONArray.put(sb2.toString());
        } catch (Throwable unused) {
            String str2 = (String) pblk.m33455a(16777217, 0, 0, "2e0a34", new byte[]{46, 110, 75, 42, 8, 47});
        }
        return jSONArray.toString();
    }
}

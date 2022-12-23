package com.mbridge.msdk.dycreator.p220a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mbridge.msdk.dycreator.p294e.C8370a;
import com.mbridge.msdk.dycreator.p294e.C8373d;
import com.mbridge.msdk.dycreator.p294e.C8375f;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.smaato.sdk.core.dns.DnsName;
import com.tapjoy.TJAdUnitConstants;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.mbridge.msdk.dycreator.a.b */
/* compiled from: MBResource */
public class C6811b {

    /* renamed from: g */
    private static volatile C6811b f17987g;

    /* renamed from: a */
    private SoftReference<HashMap<String, C6812c>> f17988a;

    /* renamed from: b */
    private SoftReference<HashMap<String, String>> f17989b;

    /* renamed from: c */
    private SoftReference<HashMap<String, C6812c>> f17990c;

    /* renamed from: d */
    private String f17991d;

    /* renamed from: e */
    private String f17992e;

    /* renamed from: f */
    private Context f17993f;

    private C6811b() {
    }

    /* renamed from: a */
    public static C6811b m20739a() {
        if (f17987g == null) {
            synchronized (C6811b.class) {
                if (f17987g == null) {
                    f17987g = new C6811b();
                }
            }
        }
        return f17987g;
    }

    /* renamed from: a */
    public final void mo37129a(Context context, String str) {
        try {
            if (C8375f.f20438a) {
                this.f17991d = context.getFilesDir().toString();
            } else {
                this.f17991d = str;
            }
            if (C8373d.m23827a(context).heightPixels > 320) {
                if (!C8375f.f20438a) {
                    this.f17992e = "/drawable-hdpi/";
                    this.f17993f = context;
                    C8370a.f20435a = m20739a().m20740d();
                }
            }
            this.f17992e = "/drawable-mdpi/";
            this.f17993f = context;
            C8370a.f20435a = m20739a().m20740d();
        } catch (Exception e) {
            C8672v.m24878d("MBResource", e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo37128a(Context context) {
        try {
            if (C8373d.m23827a(context).heightPixels > 320) {
                if (!C8375f.f20438a) {
                    this.f17992e = "/drawable-hdpi/";
                    this.f17993f = context;
                    C8370a.f20435a = m20739a().m20740d();
                }
            }
            this.f17992e = "/drawable-mdpi/";
            this.f17993f = context;
            C8370a.f20435a = m20739a().m20740d();
        } catch (Exception e) {
            C8672v.m24878d("MBResource", e.getMessage());
        }
    }

    /* renamed from: b */
    public final HashMap mo37132b() {
        SoftReference<HashMap<String, C6812c>> softReference = this.f17988a;
        if (softReference == null || softReference.get() == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("layout_width", C6812c.layout_width);
            hashMap.put("layout_height", C6812c.layout_height);
            hashMap.put(TJAdUnitConstants.String.ORIENTATION, C6812c.orientation);
            hashMap.put("layout_centerHorizontal", C6812c.layout_centerHorizontal);
            hashMap.put("layout_centerVertical", C6812c.layout_centerVertical);
            hashMap.put("layout_marginLeft", C6812c.layout_marginLeft);
            hashMap.put("layout_marginRight", C6812c.layout_marginRight);
            hashMap.put("layout_margin", C6812c.layout_margin);
            hashMap.put("layout_gravity", C6812c.layout_gravity);
            hashMap.put("layout_alignParentRight", C6812c.layout_alignParentRight);
            hashMap.put("layout_weight", C6812c.layout_weight);
            hashMap.put("contentDescription", C6812c.contentDescription);
            hashMap.put("gravity", C6812c.gravity);
            hashMap.put("id", C6812c.id);
            hashMap.put("layout_below", C6812c.layout_below);
            hashMap.put("layout_above", C6812c.layout_above);
            hashMap.put("layout_toLeftOf", C6812c.layout_toLeftOf);
            hashMap.put("layout_toRightOf", C6812c.layout_toRightOf);
            hashMap.put("layout_toEndOf", C6812c.layout_toEndOf);
            hashMap.put("background", C6812c.background);
            hashMap.put("layout_marginTop", C6812c.layout_marginTop);
            hashMap.put("layout_marginBottom", C6812c.layout_marginBottom);
            hashMap.put("layout_marginLeft", C6812c.layout_marginLeft);
            hashMap.put("layout_marginRight", C6812c.layout_marginRight);
            hashMap.put("layout_alignParentBottom", C6812c.layout_alignParentBottom);
            hashMap.put("layout_alignParentTop", C6812c.layout_alignParentTop);
            hashMap.put("layout_alignParentLeft", C6812c.layout_alignParentLeft);
            hashMap.put("layout_alignWithParentIfMissing", C6812c.layout_alignWithParentIfMissing);
            hashMap.put("layout_alignTop", C6812c.layout_alignTop);
            hashMap.put("layout_alignBottom", C6812c.layout_alignBottom);
            hashMap.put("layout_alignLeft", C6812c.layout_alignLeft);
            hashMap.put("layout_alignRight", C6812c.layout_alignRight);
            hashMap.put("layout_centerInParent", C6812c.layout_centerInParent);
            hashMap.put("layout_alignParentEnd", C6812c.layout_alignParentEnd);
            this.f17988a = new SoftReference<>(hashMap);
        }
        return this.f17988a.get();
    }

    /* renamed from: c */
    public final HashMap<String, C6812c> mo37134c() {
        SoftReference<HashMap<String, C6812c>> softReference = this.f17990c;
        if (softReference == null || softReference.get() == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", C6812c.id);
            hashMap.put("text", C6812c.text);
            hashMap.put("ellipsize", C6812c.ellipsize);
            hashMap.put("singleLine", C6812c.singleLine);
            hashMap.put("lines", C6812c.lines);
            hashMap.put("maxLength", C6812c.maxLength);
            hashMap.put("drawableLeft", C6812c.drawableLeft);
            hashMap.put("drawablePadding", C6812c.drawablePadding);
            hashMap.put("fadingEdge", C6812c.fadingEdge);
            hashMap.put("scrollHorizontally", C6812c.scrollHorizontally);
            hashMap.put("textColor", C6812c.textColor);
            hashMap.put("textSize", C6812c.textSize);
            hashMap.put(ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, C6812c.f18009P);
            hashMap.put("background", C6812c.background);
            hashMap.put("textStyle", C6812c.textStyle);
            hashMap.put("style", C6812c.style);
            hashMap.put("layout_width", C6812c.layout_width);
            hashMap.put("layout_height", C6812c.layout_height);
            hashMap.put("layout_below", C6812c.layout_below);
            hashMap.put("layout_centerInParent", C6812c.layout_centerInParent);
            hashMap.put("contentDescription", C6812c.contentDescription);
            hashMap.put("src", C6812c.src);
            hashMap.put("gravity", C6812c.gravity);
            hashMap.put(TJAdUnitConstants.String.ORIENTATION, C6812c.orientation);
            hashMap.put("numColumns", C6812c.numColumns);
            hashMap.put("verticalSpacing", C6812c.verticalSpacing);
            hashMap.put("horizontalSpacing", C6812c.horizontalSpacing);
            hashMap.put("background", C6812c.background);
            hashMap.put("layout_marginBottom", C6812c.layout_marginBottom);
            hashMap.put("scaleType", C6812c.scaleType);
            hashMap.put("tag", C6812c.tag);
            hashMap.put("layout_gravity", C6812c.layout_gravity);
            hashMap.put("parent_view", C6812c.parent_view);
            hashMap.put("padding", C6812c.padding);
            hashMap.put("paddingTop", C6812c.paddingTop);
            hashMap.put("paddingBottom", C6812c.paddingBottom);
            hashMap.put("paddingLeft", C6812c.paddingLeft);
            hashMap.put("paddingRight", C6812c.paddingRight);
            hashMap.put("divider", C6812c.divider);
            hashMap.put("scrollbars", C6812c.scrollbars);
            hashMap.put("listSelector", C6812c.listSelector);
            this.f17990c = new SoftReference<>(hashMap);
        }
        return this.f17990c.get();
    }

    /* renamed from: a */
    public final int mo37126a(String str) {
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (str.startsWith("#")) {
            int length = str.length();
            if (length == 7) {
                return (int) Long.decode(str.replace("#", "#FF")).longValue();
            }
            if (length == 9) {
                return (int) Long.decode(str).longValue();
            }
            C8375f.m23831a("返回白色背景");
            return -1;
        } else if (!str.startsWith("@color/")) {
            return ViewCompat.MEASURED_STATE_MASK;
        } else {
            return Build.VERSION.SDK_INT >= 23 ? C8388a.m23845e().mo56913g().getColor(C8658p.m24799a(C8388a.m23845e().mo56913g(), str.substring(7), "color")) : ViewCompat.MEASURED_STATE_MASK;
        }
    }

    /* renamed from: b */
    public final int mo37131b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            int indexOf = str.indexOf(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);
            int indexOf2 = str.indexOf("s");
            if (indexOf == -1) {
                indexOf = indexOf2;
            }
            int parseInt = Integer.parseInt(str.substring(0, indexOf));
            if (str.contains(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
                return (int) TypedValue.applyDimension(1, (float) parseInt, this.f17993f.getResources().getDisplayMetrics());
            }
            str.contains("s");
            return parseInt;
        }
    }

    /* renamed from: c */
    public final int mo37133c(String str) {
        String[] split = str.toUpperCase().split("\\|");
        int i = 48;
        try {
            Class<?> cls = Class.forName("android.view.Gravity");
            for (String field : split) {
                i = cls.getField(field).getInt((Object) null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    /* renamed from: d */
    public final int mo37135d(String str) {
        Context context = this.f17993f;
        if (context != null) {
            String packageName = context.getPackageName();
            StringBuilder sb = new StringBuilder();
            sb.append(packageName);
            sb.append(".R$");
            String[] split = str.split(DnsName.ESCAPED_DOT);
            sb.append(split[1]);
            try {
                Class<?> cls = Class.forName(sb.toString());
                Object newInstance = cls.newInstance();
                Field declaredField = cls.getDeclaredField(split[2]);
                declaredField.setAccessible(true);
                return ((Integer) declaredField.get(newInstance)).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    /* renamed from: e */
    public final String mo37136e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("@")) {
            return str;
        }
        SoftReference<HashMap<String, String>> softReference = this.f17989b;
        if (softReference == null || softReference.get() == null) {
            this.f17989b = new SoftReference<>(m20740d());
        }
        String substring = str.substring(8);
        if (this.f17989b.get() == null || this.f17989b.get().size() <= 0) {
            return null;
        }
        String str2 = (String) this.f17989b.get().get(substring);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            return C8388a.m23845e().mo56913g().getString(C8658p.m24799a(C8388a.m23845e().mo56913g(), substring, "string"));
        } catch (Exception e) {
            C8672v.m24878d("MBResource", e.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    private HashMap<String, String> m20740d() {
        InputStream inputStream;
        try {
            inputStream = this.f17993f.getAssets().open("rv_binddatas.xml");
        } catch (IOException e) {
            e.printStackTrace();
            inputStream = null;
        }
        XmlPullParser newPullParser = Xml.newPullParser();
        try {
            newPullParser.setInput(inputStream, "utf-8");
            HashMap<String, String> hashMap = new HashMap<>();
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                if (eventType == 2 && "string".equals(newPullParser.getName())) {
                    hashMap.put(newPullParser.getAttributeValue(0), newPullParser.nextText());
                }
            }
            return hashMap;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo37130a(String str, ImageView imageView) {
        Context context;
        if (str != null && str.startsWith("@drawable/") && (context = this.f17993f) != null) {
            try {
                imageView.setImageResource(context.getResources().getIdentifier(str, "drawable", this.f17993f.getPackageName()));
            } catch (Exception e) {
                C8672v.m24878d("MBResource", e.getMessage());
            }
        }
    }

    /* renamed from: f */
    public final View mo37137f(String str) {
        if (this.f17993f != null) {
            try {
                C6808a aVar = new C6808a(this.f17993f);
                new String();
                C8375f.m23831a(str.toString());
                return aVar.mo37123a(str.toString(), (ViewGroup) null);
            } catch (Exception e) {
                C8672v.m24878d("MBResource", e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: a */
    public final View mo37127a(FileInputStream fileInputStream) {
        if (this.f17993f != null) {
            try {
                return new C6808a(this.f17993f).mo37122a(fileInputStream, (ViewGroup) null, false);
            } catch (Exception e) {
                C8672v.m24878d("MBResource", e.getMessage());
            }
        }
        return null;
    }
}

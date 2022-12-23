package com.applovin.impl.mediation.debugger.p041ui.p043b.p044a;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.mediation.debugger.p037b.p039b.C1671b;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1717c;
import com.applovin.impl.sdk.utils.C2048f;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.C2271R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.b.a.a */
public class C1704a extends C1717c {

    /* renamed from: a */
    private final C1671b f2502a;

    /* renamed from: o */
    private final Context f2503o;

    public C1704a(C1671b bVar, Context context) {
        super(C1717c.C1720b.DETAIL);
        this.f2502a = bVar;
        this.f2503o = context;
        this.f2570d = m3533q();
        this.f2571e = m3534r();
    }

    /* renamed from: q */
    private SpannedString m3533q() {
        return StringUtils.createSpannedString(this.f2502a.mo13660i(), mo13709b() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
    }

    /* renamed from: r */
    private SpannedString m3534r() {
        if (!mo13709b()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(m3535s());
        spannableStringBuilder.append(new SpannableString("\n"));
        spannableStringBuilder.append(m3536t());
        if (this.f2502a.mo13651a() == C1671b.C1672a.INVALID_INTEGRATION) {
            spannableStringBuilder.append(new SpannableString("\n"));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString("Invalid Integration", SupportMenu.CATEGORY_MASK));
        }
        return new SpannedString(spannableStringBuilder);
    }

    /* renamed from: s */
    private SpannedString m3535s() {
        if (!this.f2502a.mo13655d()) {
            return StringUtils.createListItemDetailSpannedString("SDK Missing", SupportMenu.CATEGORY_MASK);
        }
        if (!TextUtils.isEmpty(this.f2502a.mo13661j())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(this.f2502a.mo13661j(), ViewCompat.MEASURED_STATE_MASK));
            return new SpannedString(spannableStringBuilder);
        }
        return StringUtils.createListItemDetailSpannedString(this.f2502a.mo13656e() ? "Retrieving SDK Version..." : "SDK Found", ViewCompat.MEASURED_STATE_MASK);
    }

    /* renamed from: t */
    private SpannedString m3536t() {
        if (!this.f2502a.mo13656e()) {
            return StringUtils.createListItemDetailSpannedString("Adapter Missing", SupportMenu.CATEGORY_MASK);
        }
        if (TextUtils.isEmpty(this.f2502a.mo13662k())) {
            return StringUtils.createListItemDetailSpannedString("Adapter Found", ViewCompat.MEASURED_STATE_MASK);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
        spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(this.f2502a.mo13662k(), ViewCompat.MEASURED_STATE_MASK));
        if (this.f2502a.mo13657f()) {
            spannableStringBuilder.append(StringUtils.createListItemDetailSubSpannedString("  LATEST  ", Color.rgb(255, 127, 0)));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(this.f2502a.mo13663l(), ViewCompat.MEASURED_STATE_MASK));
        }
        return new SpannedString(spannableStringBuilder);
    }

    /* renamed from: b */
    public boolean mo13709b() {
        return this.f2502a.mo13651a() != C1671b.C1672a.MISSING;
    }

    /* renamed from: d */
    public C1671b mo13726d() {
        return this.f2502a;
    }

    /* renamed from: e */
    public int mo13727e() {
        int o = this.f2502a.mo13666o();
        return o > 0 ? o : C2271R.C2272drawable.applovin_ic_mediation_placeholder;
    }

    /* renamed from: f */
    public int mo13728f() {
        return mo13709b() ? C2271R.C2272drawable.applovin_ic_disclosure_arrow : super.mo13727e();
    }

    /* renamed from: g */
    public int mo13729g() {
        return C2048f.m4936a(C2271R.color.applovin_sdk_disclosureButtonColor, this.f2503o);
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + this.f2570d + ", detailText=" + this.f2571e + ", network=" + this.f2502a + "}";
    }
}

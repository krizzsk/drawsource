package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.C2271R;

public class AppLovinOptionsView extends FrameLayout implements View.OnClickListener {
    private final Uri privacyDestinationUri;
    private final C1969m sdk;

    public AppLovinOptionsView(AppLovinNativeAdImpl appLovinNativeAdImpl, C1969m mVar, Context context) {
        super(context);
        this.sdk = mVar;
        this.privacyDestinationUri = appLovinNativeAdImpl.getPrivacyDestinationUri();
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Uri privacyIconUri = appLovinNativeAdImpl.getPrivacyIconUri();
        if (privacyIconUri != null) {
            imageView.setImageURI(privacyIconUri);
        } else {
            imageView.setImageResource(C2271R.C2272drawable.privacy_icon_layered_list);
        }
        addView(imageView);
        setOnClickListener(this);
    }

    public void destroy() {
        setOnTouchListener((View.OnTouchListener) null);
        removeAllViews();
    }

    public void onClick(View view) {
        Utils.openUri(this.sdk.mo14520L(), this.privacyDestinationUri, this.sdk);
    }
}

package com.mbridge.msdk.out;

import java.util.List;

public class NativeListener {

    public interface FilpListener {
        void filpEvent(int i);
    }

    public interface NativeAdListener {
        void onAdClick(Campaign campaign);

        void onAdFramesLoaded(List<Frame> list);

        void onAdLoadError(String str);

        void onAdLoaded(List<Campaign> list, int i);

        void onLoggingImpression(int i);
    }

    public interface NativeTrackingListener {
        void onDismissLoading(Campaign campaign);

        void onDownloadFinish(Campaign campaign);

        void onDownloadProgress(int i);

        void onDownloadStart(Campaign campaign);

        void onFinishRedirection(Campaign campaign, String str);

        boolean onInterceptDefaultLoadingDialog();

        void onRedirectionFailed(Campaign campaign, String str);

        void onShowLoading(Campaign campaign);

        void onStartRedirection(Campaign campaign, String str);
    }

    public interface TrackingExListener extends NativeTrackingListener {
        void onLeaveApp();
    }

    public static class Template {
        private int adNum;

        /* renamed from: id */
        private int f22100id;

        public Template(int i, int i2) {
            this.f22100id = i;
            this.adNum = i2;
        }

        public int getId() {
            return this.f22100id;
        }

        public void setId(int i) {
            this.f22100id = i;
        }

        public int getAdNum() {
            return this.adNum;
        }

        public void setAdNum(int i) {
            this.adNum = i;
        }
    }
}

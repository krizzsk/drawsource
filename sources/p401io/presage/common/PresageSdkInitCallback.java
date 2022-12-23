package p401io.presage.common;

/* renamed from: io.presage.common.PresageSdkInitCallback */
public interface PresageSdkInitCallback {
    void onSdkInitFailed();

    void onSdkInitialized();

    void onSdkNotInitialized();
}

package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResponse;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.core.DownloaderReporter;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.thrid.okhttp.Response;
import com.mbridge.msdk.thrid.okhttp.ResponseBody;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

class OkHTTPFileDownloadTask implements IDownloadTask {
    private static final String CLOSE = "close";
    private static final String CONNECTION = "Connection";
    private static final String FORMAT_RANGE = "bytes=%d-";
    private static final String RESPONSE_BODY_IS_NULL = "response body is null";
    private static final String RESPONSE_CODE = "responseCode ";
    private static final String RESPONSE_INPUTSTREAM_IS_NULL = "response inputStream is null";
    private static final String RESPONSE_IS_NULL = "response is null";
    private final IDatabaseHelper _databaseHelper;
    private volatile DownloadMessage _downloadMessage;
    private DownloadModel _downloadModel;
    private final DownloadRequest _downloadRequest;
    private DownloadResponse _downloadResponse;
    private DownloaderReporter.Builder _downloaderReporter;
    private String _etag = "";
    private InputStream _inputStream;
    private DownloadFileOutputStream _outputStream;
    private ResponseBody _responseBody;

    private OkHTTPFileDownloadTask(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
        this._downloadRequest = downloadRequest;
        this._downloadModel = downloadModel;
        this._databaseHelper = iDatabaseHelper;
        this._downloadMessage = downloadMessage;
        this._downloaderReporter = builder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01c9, code lost:
        if (r2.isCanceled() == false) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0215, code lost:
        if (r2.isCanceled() != false) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0217, code lost:
        r2.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x021a, code lost:
        reportDownloadMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x021f, code lost:
        return r12._downloadResponse;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.mbridge.msdk.foundation.download.DownloadResponse run() {
        /*
            r12 = this;
            com.mbridge.msdk.foundation.download.DownloadResponse r0 = new com.mbridge.msdk.foundation.download.DownloadResponse
            r0.<init>()
            r12._downloadResponse = r0
            com.mbridge.msdk.foundation.download.core.DownloadRequest r0 = r12._downloadRequest
            com.mbridge.msdk.foundation.download.DownloadStatus r0 = r0.getStatus()
            com.mbridge.msdk.foundation.download.DownloadStatus r1 = com.mbridge.msdk.foundation.download.DownloadStatus.CANCELLED
            r2 = 1
            if (r0 != r1) goto L_0x001a
            com.mbridge.msdk.foundation.download.DownloadResponse r0 = r12._downloadResponse
            r0.setCancelled(r2)
            com.mbridge.msdk.foundation.download.DownloadResponse r0 = r12._downloadResponse
            return r0
        L_0x001a:
            com.mbridge.msdk.foundation.download.core.DownloadRequest r0 = r12._downloadRequest
            long r0 = r0.getTotalBytes()
            com.mbridge.msdk.foundation.download.core.DownloadRequest r3 = r12._downloadRequest
            long r3 = r3.getDownloadedBytes()
            int r5 = com.mbridge.msdk.foundation.download.utils.Utils.getDownloadRate(r0, r3)
            com.mbridge.msdk.foundation.download.core.DownloaderReporter$Builder r6 = r12._downloaderReporter
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r7 = "dcr"
            r6.add(r7, r5)
            com.mbridge.msdk.foundation.download.core.DownloaderReporter$Builder r5 = r12._downloaderReporter
            java.lang.String r6 = java.lang.String.valueOf(r3)
            java.lang.String r7 = "ddb"
            r5.add(r7, r6)
            com.mbridge.msdk.foundation.download.core.DownloaderReporter$Builder r5 = r12._downloaderReporter
            java.lang.String r6 = java.lang.String.valueOf(r0)
            java.lang.String r7 = "dtb"
            r5.add(r7, r6)
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0073
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0073
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            com.mbridge.msdk.foundation.download.core.DownloaderReporter$Builder r0 = r12._downloaderReporter
            java.lang.String r1 = "de"
            java.lang.String r3 = "t=c"
            r0.add(r1, r3)
            com.mbridge.msdk.foundation.download.core.DownloaderReporter$Builder r0 = r12._downloaderReporter
            com.mbridge.msdk.foundation.download.core.DownloaderReporter r0 = r0.build()
            r0.report()
            com.mbridge.msdk.foundation.download.DownloadResponse r0 = r12._downloadResponse
            r0.setSuccessful(r2)
            com.mbridge.msdk.foundation.download.DownloadResponse r0 = r12._downloadResponse
            return r0
        L_0x0073:
            com.mbridge.msdk.foundation.download.DownloadMessage r0 = r12._downloadMessage
            java.lang.String r0 = r0.getSaveFileName()
            com.mbridge.msdk.foundation.download.core.DownloadRequest r1 = r12._downloadRequest
            java.lang.String r1 = r1.getCacheDirectoryPath()
            com.mbridge.msdk.foundation.download.core.DownloadRequest r5 = r12._downloadRequest
            java.lang.String r11 = r5.getDownloadId()
            com.mbridge.msdk.foundation.download.DownloadMessage r5 = r12._downloadMessage
            java.lang.String r5 = r5.getDownloadUrl()
            com.mbridge.msdk.foundation.download.core.GlobalComponent r6 = com.mbridge.msdk.foundation.download.core.GlobalComponent.getInstance()
            com.mbridge.msdk.thrid.okhttp.OkHttpClient r6 = r6.getOkHttpClient()
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r6 = r6.newBuilder()
            com.mbridge.msdk.foundation.download.core.DownloadRequest r7 = r12._downloadRequest
            long r7 = r7.getConnectTimeout()
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r6 = r6.connectTimeout(r7, r9)
            com.mbridge.msdk.foundation.download.core.DownloadRequest r7 = r12._downloadRequest
            long r7 = r7.getReadTimeout()
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r6 = r6.readTimeout(r7, r9)
            com.mbridge.msdk.foundation.download.core.DownloadRequest r7 = r12._downloadRequest
            long r7 = r7.getWriteTimeout()
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r6 = r6.writeTimeout(r7, r9)
            com.mbridge.msdk.foundation.download.core.DownloadRequest r7 = r12._downloadRequest
            long r7 = r7.getTimeout()
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r6 = r6.callTimeout(r7, r9)
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r6 = r6.retryOnConnectionFailure(r2)
            com.mbridge.msdk.thrid.okhttp.OkHttpClient r6 = r6.build()
            com.mbridge.msdk.thrid.okhttp.CacheControl$Builder r7 = new com.mbridge.msdk.thrid.okhttp.CacheControl$Builder
            r7.<init>()
            com.mbridge.msdk.thrid.okhttp.CacheControl$Builder r7 = r7.noCache()
            com.mbridge.msdk.thrid.okhttp.CacheControl r7 = r7.build()
            java.util.Locale r8 = java.util.Locale.ENGLISH
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r9 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r9] = r3
            java.lang.String r3 = "bytes=%d-"
            java.lang.String r2 = java.lang.String.format(r8, r3, r2)
            com.mbridge.msdk.thrid.okhttp.Request$Builder r3 = new com.mbridge.msdk.thrid.okhttp.Request$Builder
            r3.<init>()
            com.mbridge.msdk.thrid.okhttp.Request$Builder r3 = r3.url((java.lang.String) r5)
            com.mbridge.msdk.thrid.okhttp.Request$Builder r3 = r3.cacheControl(r7)
            java.lang.String r4 = "Connection"
            java.lang.String r7 = "close"
            com.mbridge.msdk.thrid.okhttp.Request$Builder r3 = r3.addHeader(r4, r7)
            java.lang.String r4 = "Range"
            com.mbridge.msdk.thrid.okhttp.Request$Builder r2 = r3.addHeader(r4, r2)
            com.mbridge.msdk.thrid.okhttp.Request r2 = r2.build()
            com.mbridge.msdk.foundation.download.core.DownloaderReporter$Builder r3 = r12._downloaderReporter
            com.mbridge.msdk.thrid.okhttp.HttpUrl r4 = r2.url()
            java.lang.String r4 = r4.host()
            java.lang.String r7 = "ht"
            r3.add(r7, r4)
            com.mbridge.msdk.foundation.download.core.DownloaderReporter$Builder r3 = r12._downloaderReporter
            java.lang.String r4 = "url"
            r3.add(r4, r5)
            com.mbridge.msdk.thrid.okhttp.Call r2 = r6.newCall(r2)
            r3 = 0
            com.mbridge.msdk.thrid.okhttp.Response r3 = r2.execute()     // Catch:{ Exception -> 0x01fb }
            boolean r4 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r3)     // Catch:{ Exception -> 0x01fb }
            if (r4 != 0) goto L_0x01cc
            com.mbridge.msdk.thrid.okhttp.ResponseBody r4 = r3.body()     // Catch:{ Exception -> 0x01fb }
            boolean r4 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r4)     // Catch:{ Exception -> 0x01fb }
            if (r4 == 0) goto L_0x013d
            goto L_0x01cc
        L_0x013d:
            int r10 = r3.code()     // Catch:{ Exception -> 0x01fb }
            com.mbridge.msdk.foundation.download.core.DownloaderReporter$Builder r4 = r12._downloaderReporter     // Catch:{ Exception -> 0x01fb }
            java.lang.String r5 = "drc"
            java.lang.String r6 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x01fb }
            r4.add(r5, r6)     // Catch:{ Exception -> 0x01fb }
            boolean r4 = r3.isSuccessful()     // Catch:{ Exception -> 0x01fb }
            if (r4 != 0) goto L_0x019e
            com.mbridge.msdk.foundation.download.DownloadResponse r4 = r12._downloadResponse     // Catch:{ Exception -> 0x01fb }
            java.io.IOException r5 = new java.io.IOException     // Catch:{ Exception -> 0x01fb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01fb }
            r6.<init>()     // Catch:{ Exception -> 0x01fb }
            java.lang.String r7 = "responseCode "
            r6.append(r7)     // Catch:{ Exception -> 0x01fb }
            r6.append(r10)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r7 = "\n"
            r6.append(r7)     // Catch:{ Exception -> 0x01fb }
            com.mbridge.msdk.thrid.okhttp.ResponseBody r7 = r3.body()     // Catch:{ Exception -> 0x01fb }
            java.lang.String r7 = r7.string()     // Catch:{ Exception -> 0x01fb }
            r6.append(r7)     // Catch:{ Exception -> 0x01fb }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01fb }
            r5.<init>(r6)     // Catch:{ Exception -> 0x01fb }
            r4.setError((java.lang.Exception) r5)     // Catch:{ Exception -> 0x01fb }
            com.mbridge.msdk.foundation.download.DownloadResponse r0 = r12._downloadResponse     // Catch:{ Exception -> 0x01fb }
            java.io.InputStream r1 = r12._inputStream
            com.mbridge.msdk.foundation.download.utils.Objects.closeInputStream(r1)
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r1 = r12._outputStream
            com.mbridge.msdk.foundation.download.utils.Objects.closeOutputStream(r1)
            com.mbridge.msdk.foundation.download.utils.Objects.closeResponse(r3)
            com.mbridge.msdk.thrid.okhttp.ResponseBody r1 = r12._responseBody
            com.mbridge.msdk.foundation.download.utils.Objects.closeResponseBody(r1)
            boolean r1 = r2.isCanceled()
            if (r1 != 0) goto L_0x019a
            r2.cancel()
        L_0x019a:
            r12.reportDownloadMessage()
            return r0
        L_0x019e:
            java.lang.String r4 = "ETag"
            java.lang.String r5 = ""
            java.lang.String r4 = r3.header(r4, r5)     // Catch:{ Exception -> 0x01fb }
            r12._etag = r4     // Catch:{ Exception -> 0x01fb }
            r5 = r12
            r6 = r0
            r7 = r1
            r8 = r11
            r9 = r3
            com.mbridge.msdk.foundation.download.DownloadResponse r4 = r5.handlerRequestSuccessful(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x01fb }
            r12._downloadResponse = r4     // Catch:{ Exception -> 0x01fb }
            java.io.InputStream r0 = r12._inputStream
            com.mbridge.msdk.foundation.download.utils.Objects.closeInputStream(r0)
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r12._outputStream
            com.mbridge.msdk.foundation.download.utils.Objects.closeOutputStream(r0)
            com.mbridge.msdk.foundation.download.utils.Objects.closeResponse(r3)
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r12._responseBody
            com.mbridge.msdk.foundation.download.utils.Objects.closeResponseBody(r0)
            boolean r0 = r2.isCanceled()
            if (r0 != 0) goto L_0x021a
            goto L_0x0217
        L_0x01cc:
            com.mbridge.msdk.foundation.download.DownloadResponse r4 = r12._downloadResponse     // Catch:{ Exception -> 0x01fb }
            java.io.IOException r5 = new java.io.IOException     // Catch:{ Exception -> 0x01fb }
            java.lang.String r6 = "response is null"
            r5.<init>(r6)     // Catch:{ Exception -> 0x01fb }
            r4.setError((java.lang.Exception) r5)     // Catch:{ Exception -> 0x01fb }
            com.mbridge.msdk.foundation.download.DownloadResponse r0 = r12._downloadResponse     // Catch:{ Exception -> 0x01fb }
            java.io.InputStream r1 = r12._inputStream
            com.mbridge.msdk.foundation.download.utils.Objects.closeInputStream(r1)
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r1 = r12._outputStream
            com.mbridge.msdk.foundation.download.utils.Objects.closeOutputStream(r1)
            com.mbridge.msdk.foundation.download.utils.Objects.closeResponse(r3)
            com.mbridge.msdk.thrid.okhttp.ResponseBody r1 = r12._responseBody
            com.mbridge.msdk.foundation.download.utils.Objects.closeResponseBody(r1)
            boolean r1 = r2.isCanceled()
            if (r1 != 0) goto L_0x01f5
            r2.cancel()
        L_0x01f5:
            r12.reportDownloadMessage()
            return r0
        L_0x01f9:
            r0 = move-exception
            goto L_0x0220
        L_0x01fb:
            r4 = move-exception
            r12.handlerException(r0, r1, r11, r4)     // Catch:{ all -> 0x01f9 }
            java.io.InputStream r0 = r12._inputStream
            com.mbridge.msdk.foundation.download.utils.Objects.closeInputStream(r0)
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r12._outputStream
            com.mbridge.msdk.foundation.download.utils.Objects.closeOutputStream(r0)
            com.mbridge.msdk.foundation.download.utils.Objects.closeResponse(r3)
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r12._responseBody
            com.mbridge.msdk.foundation.download.utils.Objects.closeResponseBody(r0)
            boolean r0 = r2.isCanceled()
            if (r0 != 0) goto L_0x021a
        L_0x0217:
            r2.cancel()
        L_0x021a:
            r12.reportDownloadMessage()
            com.mbridge.msdk.foundation.download.DownloadResponse r0 = r12._downloadResponse
            return r0
        L_0x0220:
            java.io.InputStream r1 = r12._inputStream
            com.mbridge.msdk.foundation.download.utils.Objects.closeInputStream(r1)
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r1 = r12._outputStream
            com.mbridge.msdk.foundation.download.utils.Objects.closeOutputStream(r1)
            com.mbridge.msdk.foundation.download.utils.Objects.closeResponse(r3)
            com.mbridge.msdk.thrid.okhttp.ResponseBody r1 = r12._responseBody
            com.mbridge.msdk.foundation.download.utils.Objects.closeResponseBody(r1)
            boolean r1 = r2.isCanceled()
            if (r1 != 0) goto L_0x023b
            r2.cancel()
        L_0x023b:
            r12.reportDownloadMessage()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.core.OkHTTPFileDownloadTask.run():com.mbridge.msdk.foundation.download.DownloadResponse");
    }

    private void reportDownloadMessage() {
        boolean isSuccessful = this._downloadResponse.isSuccessful();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_SUCCESS, Boolean.toString(isSuccessful));
        boolean isCancelled = this._downloadResponse.isCancelled();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_CANCEL, Boolean.toString(isCancelled));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE, String.valueOf(Utils.getDownloadRate(this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes())));
        if (!isSuccessful && !isCancelled) {
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_REASON, this._downloadResponse.getErrorMessage());
        }
        this._downloaderReporter.build().report();
    }

    private DownloadResponse handlerRequestSuccessful(String str, String str2, String str3, Response response, int i) throws IOException, IllegalAccessException {
        String str4 = str2;
        String str5 = str3;
        int i2 = i;
        DownloadResponse downloadResponse = new DownloadResponse();
        boolean z = true;
        boolean z2 = !isSupportResume(i2, this._downloadModel);
        if (response == null || this._downloadRequest == null || i2 != 206 || response.body() == null || this._downloadRequest.getTotalBytes() <= 0 || response.body().contentLength() == this._downloadRequest.getTotalBytes() - this._downloadRequest.getDownloadedBytes()) {
            z = false;
        }
        if (z2 && z) {
            this._downloadRequest.setDownloadedBytes(0);
            this._downloadRequest.setTotalBytes(0);
            if (Objects.isNotNull(this._databaseHelper)) {
                this._databaseHelper.remove(str5, str4);
            }
            this._downloadModel = null;
            MBResourceManager.getInstance().deleteFile(new File(this._downloadRequest.getCacheDirectoryPath() + this._downloadMessage.getSaveFileName()));
        }
        ResponseBody body = response.body();
        this._responseBody = body;
        if (Objects.isNull(body)) {
            downloadResponse.setError((Exception) new IOException(RESPONSE_BODY_IS_NULL));
            this._downloadRequest.setTotalBytes(0);
            this._downloadRequest.setDownloadedBytes(0);
            return downloadResponse;
        }
        long contentLength = this._responseBody.contentLength();
        if (this._downloadRequest.getTotalBytes() == 0) {
            this._downloadRequest.setTotalBytes(contentLength);
        }
        InputStream byteStream = this._responseBody.byteStream();
        this._inputStream = byteStream;
        if (Objects.isNull(byteStream)) {
            downloadResponse.setError((Exception) new IOException(RESPONSE_INPUTSTREAM_IS_NULL));
            return downloadResponse;
        }
        return handleInputStream(str, str4, str5, this._etag);
    }

    private DownloadResponse handleInputStream(String str, String str2, String str3, String str4) throws IOException, IllegalAccessException {
        DownloadResponse downloadResponse;
        boolean z;
        String str5;
        String str6 = str2;
        DownloadResponse downloadResponse2 = new DownloadResponse();
        boolean z2 = true;
        if (Objects.isNull(this._downloadModel)) {
            DownloadModel create = DownloadModel.create(this._downloadRequest.getDownloadId(), this._downloadMessage.getDownloadUrl(), this._downloadMessage.getResourceUrl(), str4, str2, this._downloadMessage.getSaveFileName(), this._downloadRequest.getTotalBytes(), 0, this._downloadMessage.getDownloadRate(), 1, this._downloadMessage.getDownloadResourceType());
            this._downloadModel = create;
            this._databaseHelper.insert(create);
        } else {
            DownloadModel create2 = DownloadModel.create(this._downloadModel.getDownloadId(), this._downloadModel.getDownloadUrl(), this._downloadMessage.getResourceUrl(), this._downloadModel.getEtag(), this._downloadModel.getSaveDirectorPath(), this._downloadModel.getSaveFileName(), this._downloadRequest.getTotalBytes(), this._downloadModel.getDownloadedBytes(), this._downloadMessage.getDownloadRate(), this._downloadModel.getUsageCounter() + 1, this._downloadMessage.getDownloadResourceType());
            this._downloadModel = create2;
            this._databaseHelper.update(create2, str6);
        }
        DownloadFileOutputStream downloadFileOutputStream = MBResourceManager.getInstance().getDownloadFileOutputStream(new File(str6, str));
        this._outputStream = downloadFileOutputStream;
        downloadFileOutputStream.seek(this._downloadRequest.getDownloadedBytes());
        byte[] bArr = new byte[GlobalComponent.getInstance().getByteBufferSize()];
        while (true) {
            int read = this._inputStream.read(bArr);
            if (read == -1) {
                downloadResponse = downloadResponse2;
                z = z2;
                str5 = str6;
                break;
            }
            this._outputStream.write(bArr, 0, read);
            DownloadRequest downloadRequest = this._downloadRequest;
            downloadRequest.setDownloadedBytes(downloadRequest.getDownloadedBytes() + ((long) read));
            this._outputStream.flushAndSync();
            int downloadRate = Utils.getDownloadRate(this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes());
            downloadResponse = downloadResponse2;
            z = z2;
            str5 = str6;
            sendProgress(this._downloadRequest, this._downloadMessage, this._downloadRequest.getDownloadedBytes(), this._downloadRequest.getTotalBytes(), downloadRate);
            if (this._downloadMessage.getDownloadRate() != 100 && downloadRate >= this._downloadMessage.getDownloadRate()) {
                break;
            } else if (this._downloadRequest.getStatus() == DownloadStatus.CANCELLED) {
                downloadResponse.setCancelled(z);
                break;
            } else {
                str6 = str5;
                z2 = z;
                downloadResponse2 = downloadResponse;
            }
        }
        IDatabaseHelper databaseHelper = GlobalComponent.getInstance().getDatabaseHelper();
        String downloadUrl = this._downloadMessage.getDownloadUrl();
        String resourceUrl = this._downloadMessage.getResourceUrl();
        String saveFileName = this._downloadMessage.getSaveFileName();
        boolean z3 = z;
        String str7 = saveFileName;
        DownloadResponse downloadResponse3 = downloadResponse;
        String str8 = str3;
        databaseHelper.updateProgress(str8, str5, DownloadModel.create(str3, downloadUrl, resourceUrl, str4, str2, str7, this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes(), this._downloadMessage.getDownloadRate(), this._downloadModel.getUsageCounter(), this._downloadMessage.getDownloadResourceType()));
        if (!downloadResponse3.isCancelled()) {
            downloadResponse3.setSuccessful(z3);
        }
        return downloadResponse3;
    }

    private void handlerException(String str, String str2, String str3, Exception exc) {
        try {
            if (Objects.isNotNull(this._databaseHelper) && Objects.isNotNull(this._downloadRequest)) {
                this._databaseHelper.remove(str3, str2);
                MBResourceManager instance = MBResourceManager.getInstance();
                instance.deleteFile(new File(this._downloadRequest.getCacheDirectoryPath() + this._downloadMessage.getSaveFileName()));
                this._downloadRequest.setDownloadedBytes(0);
                this._downloadRequest.setTotalBytes(0);
            }
        } catch (Exception e) {
            GlobalComponent.getInstance().getLogger().log(IDownloadTask.TAG, e.getMessage());
        }
        this._downloadResponse.setError(exc);
    }

    public static IDownloadTask create(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
        if (Objects.isNull(builder)) {
            builder = new DownloaderReporter.Builder(DownloadCommon.DOWNLOAD_REPORT_KEY);
        }
        return new OkHTTPFileDownloadTask(downloadRequest, downloadModel, iDatabaseHelper, downloadMessage, builder);
    }

    private boolean isSupportResume(int i, DownloadModel downloadModel) {
        return i == 206 && !TextUtils.isEmpty(this._etag) && (downloadModel == null || TextUtils.equals(this._etag, downloadModel.getEtag()));
    }

    private void sendProgress(DownloadRequest downloadRequest, DownloadMessage downloadMessage, long j, long j2, int i) {
        if (downloadRequest.getStatus() != DownloadStatus.CANCELLED) {
            downloadRequest.handlerProcessEvent(downloadMessage, new DownloadProgress(j, j2, i));
        }
    }
}

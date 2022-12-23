package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.Surface;
import androidx.room.RoomDatabase;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.unity3d.player.b */
public final class C11748b {

    /* renamed from: b */
    private static CameraManager f28392b;

    /* renamed from: c */
    private static String[] f28393c;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static Semaphore f28394e = new Semaphore(1);

    /* renamed from: A */
    private CameraCaptureSession.CaptureCallback f28395A = new CameraCaptureSession.CaptureCallback() {
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            C11748b.this.m32131a(captureRequest.getTag());
        }

        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            C11756d.Log(5, "Camera2: Capture session failed " + captureRequest.getTag() + " reason " + captureFailure.getReason());
            C11748b.this.m32131a(captureRequest.getTag());
        }

        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        }

        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        }
    };

    /* renamed from: B */
    private final CameraDevice.StateCallback f28396B = new CameraDevice.StateCallback() {
        public final void onClosed(CameraDevice cameraDevice) {
            C11748b.f28394e.release();
        }

        public final void onDisconnected(CameraDevice cameraDevice) {
            C11756d.Log(5, "Camera2: CameraDevice disconnected.");
            C11748b.this.m32129a(cameraDevice);
            C11748b.f28394e.release();
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            C11756d.Log(6, "Camera2: Error opeining CameraDevice " + i);
            C11748b.this.m32129a(cameraDevice);
            C11748b.f28394e.release();
        }

        public final void onOpened(CameraDevice cameraDevice) {
            CameraDevice unused = C11748b.this.f28400d = cameraDevice;
            C11748b.f28394e.release();
        }
    };

    /* renamed from: C */
    private final ImageReader.OnImageAvailableListener f28397C = new ImageReader.OnImageAvailableListener() {
        public final void onImageAvailable(ImageReader imageReader) {
            if (C11748b.f28394e.tryAcquire()) {
                Image acquireNextImage = imageReader.acquireNextImage();
                if (acquireNextImage != null) {
                    Image.Plane[] planes = acquireNextImage.getPlanes();
                    if (acquireNextImage.getFormat() == 35 && planes != null && planes.length == 3) {
                        C11755c h = C11748b.this.f28399a;
                        ByteBuffer buffer = planes[0].getBuffer();
                        ByteBuffer buffer2 = planes[1].getBuffer();
                        ByteBuffer buffer3 = planes[2].getBuffer();
                        h.mo70368a(buffer, buffer2, buffer3, planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride());
                    } else {
                        C11756d.Log(6, "Camera2: Wrong image format.");
                    }
                    if (C11748b.this.f28414s != null) {
                        C11748b.this.f28414s.close();
                    }
                    Image unused = C11748b.this.f28414s = acquireNextImage;
                }
                C11748b.f28394e.release();
            }
        }
    };

    /* renamed from: D */
    private final SurfaceTexture.OnFrameAvailableListener f28398D = new SurfaceTexture.OnFrameAvailableListener() {
        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            C11748b.this.f28399a.mo70367a(surfaceTexture);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C11755c f28399a = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public CameraDevice f28400d;

    /* renamed from: f */
    private HandlerThread f28401f;

    /* renamed from: g */
    private Handler f28402g;

    /* renamed from: h */
    private Rect f28403h;

    /* renamed from: i */
    private Rect f28404i;

    /* renamed from: j */
    private int f28405j;

    /* renamed from: k */
    private int f28406k;

    /* renamed from: l */
    private float f28407l = -1.0f;

    /* renamed from: m */
    private float f28408m = -1.0f;

    /* renamed from: n */
    private int f28409n;

    /* renamed from: o */
    private int f28410o;

    /* renamed from: p */
    private boolean f28411p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Range f28412q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ImageReader f28413r = null;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Image f28414s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public CaptureRequest.Builder f28415t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public CameraCaptureSession f28416u = null;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public Object f28417v = new Object();

    /* renamed from: w */
    private int f28418w;

    /* renamed from: x */
    private SurfaceTexture f28419x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public Surface f28420y = null;

    /* renamed from: z */
    private int f28421z = C11754a.f28429c;

    /* renamed from: com.unity3d.player.b$a */
    private enum C11754a {
        ;

        static {
            f28430d = new int[]{1, 2, 3};
        }
    }

    protected C11748b(C11755c cVar) {
        this.f28399a = cVar;
        m32147g();
    }

    /* renamed from: a */
    public static int m32120a(Context context) {
        return m32140c(context).length;
    }

    /* renamed from: a */
    public static int m32121a(Context context, int i) {
        try {
            return ((Integer) m32133b(context).getCameraCharacteristics(m32140c(context)[i]).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        } catch (CameraAccessException e) {
            C11756d.Log(6, "Camera2: CameraAccessException " + e);
            return 0;
        }
    }

    /* renamed from: a */
    private static int m32122a(Range[] rangeArr, int i) {
        int i2 = -1;
        double d = Double.MAX_VALUE;
        for (int i3 = 0; i3 < rangeArr.length; i3++) {
            int intValue = ((Integer) rangeArr[i3].getLower()).intValue();
            int intValue2 = ((Integer) rangeArr[i3].getUpper()).intValue();
            float f = (float) i;
            if (f + 0.1f > ((float) intValue) && f - 0.1f < ((float) intValue2)) {
                return i;
            }
            double min = (double) ((float) Math.min(Math.abs(i - intValue), Math.abs(i - intValue2)));
            if (min < d) {
                i2 = i3;
                d = min;
            }
        }
        return ((Integer) (i > ((Integer) rangeArr[i2].getUpper()).intValue() ? rangeArr[i2].getUpper() : rangeArr[i2].getLower())).intValue();
    }

    /* renamed from: a */
    private static Rect m32123a(Size[] sizeArr, double d, double d2) {
        Size[] sizeArr2 = sizeArr;
        double d3 = Double.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < sizeArr2.length; i3++) {
            int width = sizeArr2[i3].getWidth();
            int height = sizeArr2[i3].getHeight();
            double abs = Math.abs(Math.log(d / ((double) width))) + Math.abs(Math.log(d2 / ((double) height)));
            if (abs < d3) {
                i = width;
                i2 = height;
                d3 = abs;
            }
        }
        return new Rect(0, 0, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32129a(CameraDevice cameraDevice) {
        synchronized (this.f28417v) {
            this.f28416u = null;
        }
        cameraDevice.close();
        this.f28400d = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32131a(Object obj) {
        if (obj == "Focus") {
            this.f28411p = false;
            synchronized (this.f28417v) {
                if (this.f28416u != null) {
                    try {
                        this.f28415t.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        this.f28415t.setTag("Regular");
                        this.f28416u.setRepeatingRequest(this.f28415t.build(), this.f28395A, this.f28402g);
                    } catch (CameraAccessException e) {
                        C11756d.Log(6, "Camera2: CameraAccessException " + e);
                    }
                }
            }
        } else if (obj == "Cancel focus") {
            synchronized (this.f28417v) {
                if (this.f28416u != null) {
                    m32153j();
                }
            }
        }
    }

    /* renamed from: a */
    private static Size[] m32132a(CameraCharacteristics cameraCharacteristics) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            C11756d.Log(6, "Camera2: configuration map is not available.");
            return null;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(35);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        return outputSizes;
    }

    /* renamed from: b */
    private static CameraManager m32133b(Context context) {
        if (f28392b == null) {
            f28392b = (CameraManager) context.getSystemService("camera");
        }
        return f28392b;
    }

    /* renamed from: b */
    private void m32135b(CameraCharacteristics cameraCharacteristics) {
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
        this.f28406k = intValue;
        if (intValue > 0) {
            Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            this.f28404i = rect;
            float width = ((float) rect.width()) / ((float) this.f28404i.height());
            float width2 = ((float) this.f28403h.width()) / ((float) this.f28403h.height());
            if (width2 > width) {
                this.f28409n = 0;
                this.f28410o = (int) ((((float) this.f28404i.height()) - (((float) this.f28404i.width()) / width2)) / 2.0f);
            } else {
                this.f28410o = 0;
                this.f28409n = (int) ((((float) this.f28404i.width()) - (((float) this.f28404i.height()) * width2)) / 2.0f);
            }
            this.f28405j = Math.min(this.f28404i.width(), this.f28404i.height()) / 20;
        }
    }

    /* renamed from: b */
    public static boolean m32137b(Context context, int i) {
        try {
            return ((Integer) m32133b(context).getCameraCharacteristics(m32140c(context)[i]).get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
        } catch (CameraAccessException e) {
            C11756d.Log(6, "Camera2: CameraAccessException " + e);
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m32139c(Context context, int i) {
        try {
            return ((Integer) m32133b(context).getCameraCharacteristics(m32140c(context)[i]).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0;
        } catch (CameraAccessException e) {
            C11756d.Log(6, "Camera2: CameraAccessException " + e);
            return false;
        }
    }

    /* renamed from: c */
    private static String[] m32140c(Context context) {
        if (f28393c == null) {
            try {
                f28393c = m32133b(context).getCameraIdList();
            } catch (CameraAccessException e) {
                C11756d.Log(6, "Camera2: CameraAccessException " + e);
                f28393c = new String[0];
            }
        }
        return f28393c;
    }

    /* renamed from: d */
    public static int m32141d(Context context, int i) {
        try {
            CameraCharacteristics cameraCharacteristics = m32133b(context).getCameraCharacteristics(m32140c(context)[i]);
            float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
            SizeF sizeF = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            if (fArr.length > 0) {
                return (int) ((fArr[0] * 36.0f) / sizeF.getWidth());
            }
        } catch (CameraAccessException e) {
            C11756d.Log(6, "Camera2: CameraAccessException " + e);
        }
        return 0;
    }

    /* renamed from: e */
    public static int[] m32144e(Context context, int i) {
        try {
            Size[] a = m32132a(m32133b(context).getCameraCharacteristics(m32140c(context)[i]));
            if (a == null) {
                return null;
            }
            int[] iArr = new int[(a.length * 2)];
            for (int i2 = 0; i2 < a.length; i2++) {
                int i3 = i2 * 2;
                iArr[i3] = a[i2].getWidth();
                iArr[i3 + 1] = a[i2].getHeight();
            }
            return iArr;
        } catch (CameraAccessException e) {
            C11756d.Log(6, "Camera2: CameraAccessException " + e);
            return null;
        }
    }

    /* renamed from: g */
    private void m32147g() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f28401f = handlerThread;
        handlerThread.start();
        this.f28402g = new Handler(this.f28401f.getLooper());
    }

    /* renamed from: h */
    private void m32150h() {
        this.f28401f.quit();
        try {
            this.f28401f.join(4000);
            this.f28401f = null;
            this.f28402g = null;
        } catch (InterruptedException e) {
            this.f28401f.interrupt();
            C11756d.Log(6, "Camera2: Interrupted while waiting for the background thread to finish " + e);
        }
    }

    /* renamed from: i */
    private void m32152i() {
        try {
            if (!f28394e.tryAcquire(4, TimeUnit.SECONDS)) {
                C11756d.Log(5, "Camera2: Timeout waiting to lock camera for closing.");
                return;
            }
            this.f28400d.close();
            try {
                if (!f28394e.tryAcquire(4, TimeUnit.SECONDS)) {
                    C11756d.Log(5, "Camera2: Timeout waiting to close camera.");
                }
            } catch (InterruptedException e) {
                C11756d.Log(6, "Camera2: Interrupted while waiting to close camera " + e);
            }
            this.f28400d = null;
            f28394e.release();
        } catch (InterruptedException e2) {
            C11756d.Log(6, "Camera2: Interrupted while trying to lock camera for closing " + e2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m32153j() {
        try {
            if (this.f28406k != 0 && this.f28407l >= 0.0f && this.f28407l <= 1.0f && this.f28408m >= 0.0f) {
                if (this.f28408m <= 1.0f) {
                    this.f28411p = true;
                    int max = Math.max(this.f28405j + 1, Math.min((int) ((((float) (this.f28404i.width() - (this.f28409n * 2))) * this.f28407l) + ((float) this.f28409n)), (this.f28404i.width() - this.f28405j) - 1));
                    int max2 = Math.max(this.f28405j + 1, Math.min((int) ((((double) (this.f28404i.height() - (this.f28410o * 2))) * (1.0d - ((double) this.f28408m))) + ((double) this.f28410o)), (this.f28404i.height() - this.f28405j) - 1));
                    this.f28415t.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(max - this.f28405j, max2 - this.f28405j, this.f28405j * 2, this.f28405j * 2, RoomDatabase.MAX_BIND_PARAMETER_CNT)});
                    this.f28415t.set(CaptureRequest.CONTROL_AF_MODE, 1);
                    this.f28415t.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    this.f28415t.setTag("Focus");
                    this.f28416u.capture(this.f28415t.build(), this.f28395A, this.f28402g);
                    return;
                }
            }
            this.f28415t.set(CaptureRequest.CONTROL_AF_MODE, 4);
            this.f28415t.setTag("Regular");
            if (this.f28416u != null) {
                this.f28416u.setRepeatingRequest(this.f28415t.build(), this.f28395A, this.f28402g);
            }
        } catch (CameraAccessException e) {
            C11756d.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    /* renamed from: k */
    private void m32154k() {
        try {
            if (this.f28416u != null) {
                this.f28416u.stopRepeating();
                this.f28415t.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                this.f28415t.set(CaptureRequest.CONTROL_AF_MODE, 0);
                this.f28415t.setTag("Cancel focus");
                this.f28416u.capture(this.f28415t.build(), this.f28395A, this.f28402g);
            }
        } catch (CameraAccessException e) {
            C11756d.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    /* renamed from: a */
    public final Rect mo70521a() {
        return this.f28403h;
    }

    /* renamed from: a */
    public final boolean mo70522a(float f, float f2) {
        if (this.f28406k <= 0) {
            return false;
        }
        if (!this.f28411p) {
            this.f28407l = f;
            this.f28408m = f2;
            synchronized (this.f28417v) {
                if (!(this.f28416u == null || this.f28421z == C11754a.f28428b)) {
                    m32154k();
                }
            }
            return true;
        }
        C11756d.Log(5, "Camera2: Setting manual focus point already started.");
        return false;
    }

    /* renamed from: a */
    public final boolean mo70523a(Context context, int i, int i2, int i3, int i4, int i5) {
        try {
            CameraCharacteristics cameraCharacteristics = f28392b.getCameraCharacteristics(m32140c(context)[i]);
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                C11756d.Log(5, "Camera2: only LEGACY hardware level is supported.");
                return false;
            }
            Size[] a = m32132a(cameraCharacteristics);
            if (!(a == null || a.length == 0)) {
                this.f28403h = m32123a(a, (double) i2, (double) i3);
                Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null || rangeArr.length == 0) {
                    C11756d.Log(6, "Camera2: target FPS ranges are not avialable.");
                } else {
                    int a2 = m32122a(rangeArr, i4);
                    this.f28412q = new Range(Integer.valueOf(a2), Integer.valueOf(a2));
                    try {
                        if (!f28394e.tryAcquire(4, TimeUnit.SECONDS)) {
                            C11756d.Log(5, "Camera2: Timeout waiting to lock camera for opening.");
                            return false;
                        }
                        try {
                            f28392b.openCamera(m32140c(context)[i], this.f28396B, this.f28402g);
                            try {
                                if (!f28394e.tryAcquire(4, TimeUnit.SECONDS)) {
                                    C11756d.Log(5, "Camera2: Timeout waiting to open camera.");
                                    return false;
                                }
                                f28394e.release();
                                this.f28418w = i5;
                                m32135b(cameraCharacteristics);
                                return this.f28400d != null;
                            } catch (InterruptedException e) {
                                C11756d.Log(6, "Camera2: Interrupted while waiting to open camera " + e);
                            }
                        } catch (CameraAccessException e2) {
                            C11756d.Log(6, "Camera2: CameraAccessException " + e2);
                            f28394e.release();
                            return false;
                        }
                    } catch (InterruptedException e3) {
                        C11756d.Log(6, "Camera2: Interrupted while trying to lock camera for opening " + e3);
                        return false;
                    }
                }
            }
            return false;
        } catch (CameraAccessException e4) {
            C11756d.Log(6, "Camera2: CameraAccessException " + e4);
            return false;
        }
    }

    /* renamed from: b */
    public final void mo70524b() {
        if (this.f28400d != null) {
            mo70527e();
            m32152i();
            this.f28395A = null;
            this.f28420y = null;
            this.f28419x = null;
            Image image = this.f28414s;
            if (image != null) {
                image.close();
                this.f28414s = null;
            }
            ImageReader imageReader = this.f28413r;
            if (imageReader != null) {
                imageReader.close();
                this.f28413r = null;
            }
        }
        m32150h();
    }

    /* renamed from: c */
    public final void mo70525c() {
        List list;
        if (this.f28413r == null) {
            ImageReader newInstance = ImageReader.newInstance(this.f28403h.width(), this.f28403h.height(), 35, 2);
            this.f28413r = newInstance;
            newInstance.setOnImageAvailableListener(this.f28397C, this.f28402g);
            this.f28414s = null;
            if (this.f28418w != 0) {
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f28418w);
                this.f28419x = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(this.f28403h.width(), this.f28403h.height());
                this.f28419x.setOnFrameAvailableListener(this.f28398D, this.f28402g);
                this.f28420y = new Surface(this.f28419x);
            }
        }
        try {
            if (this.f28416u == null) {
                CameraDevice cameraDevice = this.f28400d;
                if (this.f28420y != null) {
                    list = Arrays.asList(new Surface[]{this.f28420y, this.f28413r.getSurface()});
                } else {
                    list = Arrays.asList(new Surface[]{this.f28413r.getSurface()});
                }
                cameraDevice.createCaptureSession(list, new CameraCaptureSession.StateCallback() {
                    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                        C11756d.Log(6, "Camera2: CaptureSession configuration failed.");
                    }

                    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                        if (C11748b.this.f28400d != null) {
                            synchronized (C11748b.this.f28417v) {
                                CameraCaptureSession unused = C11748b.this.f28416u = cameraCaptureSession;
                                try {
                                    CaptureRequest.Builder unused2 = C11748b.this.f28415t = C11748b.this.f28400d.createCaptureRequest(1);
                                    if (C11748b.this.f28420y != null) {
                                        C11748b.this.f28415t.addTarget(C11748b.this.f28420y);
                                    }
                                    C11748b.this.f28415t.addTarget(C11748b.this.f28413r.getSurface());
                                    C11748b.this.f28415t.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, C11748b.this.f28412q);
                                    C11748b.this.m32153j();
                                } catch (CameraAccessException e) {
                                    C11756d.Log(6, "Camera2: CameraAccessException " + e);
                                }
                            }
                        }
                    }
                }, this.f28402g);
            } else if (this.f28421z == C11754a.f28428b) {
                this.f28416u.setRepeatingRequest(this.f28415t.build(), this.f28395A, this.f28402g);
            }
            this.f28421z = C11754a.f28427a;
        } catch (CameraAccessException e) {
            C11756d.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    /* renamed from: d */
    public final void mo70526d() {
        synchronized (this.f28417v) {
            if (this.f28416u != null) {
                try {
                    this.f28416u.stopRepeating();
                    this.f28421z = C11754a.f28428b;
                } catch (CameraAccessException e) {
                    C11756d.Log(6, "Camera2: CameraAccessException " + e);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo70527e() {
        synchronized (this.f28417v) {
            if (this.f28416u != null) {
                try {
                    this.f28416u.abortCaptures();
                } catch (CameraAccessException e) {
                    C11756d.Log(6, "Camera2: CameraAccessException " + e);
                }
                this.f28416u.close();
                this.f28416u = null;
                this.f28421z = C11754a.f28429c;
            }
        }
    }
}

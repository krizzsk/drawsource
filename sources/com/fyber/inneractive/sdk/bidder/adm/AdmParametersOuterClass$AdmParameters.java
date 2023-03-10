package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.protobuf.C5058a;
import com.fyber.inneractive.sdk.protobuf.C5061a0;
import com.fyber.inneractive.sdk.protobuf.C5093i;
import com.fyber.inneractive.sdk.protobuf.C5114j;
import com.fyber.inneractive.sdk.protobuf.C5147q;
import com.fyber.inneractive.sdk.protobuf.C5153r0;
import com.fyber.inneractive.sdk.protobuf.C5193y0;
import com.fyber.inneractive.sdk.protobuf.C5194z;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class AdmParametersOuterClass$AdmParameters extends GeneratedMessageLite<AdmParametersOuterClass$AdmParameters, C4159c> implements C5153r0 {
    public static final int ABEXPERIMENTS_FIELD_NUMBER = 33;
    public static final int ADCOMPLETIONURL_FIELD_NUMBER = 24;
    public static final int ADDOMAIN_FIELD_NUMBER = 29;
    public static final int ADDURATION_FIELD_NUMBER = 25;
    public static final int ADEXPIRATIONINTERVAL_FIELD_NUMBER = 13;
    public static final int ADHEIGHT_FIELD_NUMBER = 5;
    public static final int ADNETWORKID_FIELD_NUMBER = 12;
    public static final int ADNETWORKNAME_FIELD_NUMBER = 11;
    public static final int ADTYPE_FIELD_NUMBER = 14;
    public static final int ADUNITDISPLAYTYPE_FIELD_NUMBER = 8;
    public static final int ADUNITID_FIELD_NUMBER = 6;
    public static final int ADUNITTYPE_FIELD_NUMBER = 7;
    public static final int ADVERTISEDAPPID_FIELD_NUMBER = 18;
    public static final int ADWIDTH_FIELD_NUMBER = 4;
    public static final int APPBUNDLEID_FIELD_NUMBER = 23;
    public static final int CAMPAIGNID_FIELD_NUMBER = 31;
    public static final int CONTENTID_FIELD_NUMBER = 9;
    public static final int CREATIVEID_FIELD_NUMBER = 30;
    public static final int CREATIVETYPE_FIELD_NUMBER = 26;
    /* access modifiers changed from: private */
    public static final AdmParametersOuterClass$AdmParameters DEFAULT_INSTANCE;
    public static final int ERRORMESSAGE_FIELD_NUMBER = 3;
    public static final int MARKUPURL_FIELD_NUMBER = 1;
    public static final int MRCDATA_FIELD_NUMBER = 32;
    private static volatile C5193y0<AdmParametersOuterClass$AdmParameters> PARSER = null;
    public static final int PRICINGVALUE_FIELD_NUMBER = 28;
    public static final int PUBLISHERID_FIELD_NUMBER = 10;
    public static final int SDKCLICKURL_FIELD_NUMBER = 16;
    public static final int SDKIMPRESSIONURL_FIELD_NUMBER = 15;
    public static final int SESSIONID_FIELD_NUMBER = 2;
    public static final int SKADNETWORKDATA_FIELD_NUMBER = 27;
    public static final int SKIPMODE_FIELD_NUMBER = 22;
    public static final int SPOTID_FIELD_NUMBER = 34;
    public static final int STORECTATEXT_FIELD_NUMBER = 21;
    public static final int STOREEVENTURL_FIELD_NUMBER = 20;
    public static final int STOREURLTYPE_FIELD_NUMBER = 19;
    public static final int STOREURL_FIELD_NUMBER = 17;
    private C5194z.C5205j<Experiment> abExperiments_ = GeneratedMessageLite.emptyProtobufList();
    private String adCompletionUrl_ = "";
    private String adDomain_ = "";
    private int adDuration_;
    private int adExpirationInterval_;
    private int adHeight_;
    private long adNetworkId_;
    private String adNetworkName_ = "";
    private int adType_;
    private int adUnitDisplayType_;
    private String adUnitId_ = "";
    private int adUnitType_;
    private int adWidth_;
    private String advertisedAppId_ = "";
    private String appBundleId_ = "";
    private int bitField0_;
    private String campaignId_ = "";
    private long contentId_;
    private String creativeId_ = "";
    private String creativeType_ = "";
    private String errorMessage_ = "";
    private String markupUrl_ = "";
    private MRCData mrcData_;
    private double pricingValue_;
    private long publisherId_;
    private String sdkClickUrl_ = "";
    private String sdkImpressionUrl_ = "";
    private String sessionId_ = "";
    private SKAdNetworkData skAdNetworkData_;
    private boolean skipMode_;
    private long spotId_;
    private String storeCTAText_ = "";
    private String storeEventUrl_ = "";
    private int storeUrlType_;
    private String storeUrl_ = "";

    public static final class Experiment extends GeneratedMessageLite<Experiment, C4154a> implements C4161e {
        /* access modifiers changed from: private */
        public static final Experiment DEFAULT_INSTANCE;
        public static final int IDENTIFIER_FIELD_NUMBER = 1;
        private static volatile C5193y0<Experiment> PARSER = null;
        public static final int VARIANT_FIELD_NUMBER = 2;
        private int bitField0_;
        private String identifier_ = "";
        private String variant_ = "";

        /* renamed from: com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters$Experiment$a */
        public static final class C4154a extends GeneratedMessageLite.C5050a<Experiment, C4154a> implements C4161e {
            public C4154a() {
                super(Experiment.DEFAULT_INSTANCE);
            }
        }

        static {
            Experiment experiment = new Experiment();
            DEFAULT_INSTANCE = experiment;
            GeneratedMessageLite.registerDefaultInstance(Experiment.class, experiment);
        }

        private Experiment() {
        }

        /* access modifiers changed from: private */
        public void clearIdentifier() {
            this.bitField0_ &= -2;
            this.identifier_ = getDefaultInstance().getIdentifier();
        }

        /* access modifiers changed from: private */
        public void clearVariant() {
            this.bitField0_ &= -3;
            this.variant_ = getDefaultInstance().getVariant();
        }

        public static Experiment getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C4154a newBuilder() {
            return (C4154a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Experiment parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Experiment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Experiment parseFrom(ByteBuffer byteBuffer) throws C5061a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C5193y0<Experiment> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setIdentifier(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.identifier_ = str;
        }

        /* access modifiers changed from: private */
        public void setIdentifierBytes(C5093i iVar) {
            C5058a.checkByteStringIsUtf8(iVar);
            this.identifier_ = iVar.mo25918i();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setVariant(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.variant_ = str;
        }

        /* access modifiers changed from: private */
        public void setVariantBytes(C5093i iVar) {
            C5058a.checkByteStringIsUtf8(iVar);
            this.variant_ = iVar.mo25918i();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(GeneratedMessageLite.C5054e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001???\u0000\u0002???\u0001", new Object[]{"bitField0_", "identifier_", "variant_"});
                case 3:
                    return new Experiment();
                case 4:
                    return new C4154a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C5193y0<Experiment> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (Experiment.class) {
                            y0Var = PARSER;
                            if (y0Var == null) {
                                y0Var = new GeneratedMessageLite.C5051b<>(DEFAULT_INSTANCE);
                                PARSER = y0Var;
                            }
                        }
                    }
                    return y0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getIdentifier() {
            return this.identifier_;
        }

        public C5093i getIdentifierBytes() {
            return C5093i.m15514a(this.identifier_);
        }

        public String getVariant() {
            return this.variant_;
        }

        public C5093i getVariantBytes() {
            return C5093i.m15514a(this.variant_);
        }

        public boolean hasIdentifier() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasVariant() {
            return (this.bitField0_ & 2) != 0;
        }

        public static C4154a newBuilder(Experiment experiment) {
            return (C4154a) DEFAULT_INSTANCE.createBuilder(experiment);
        }

        public static Experiment parseDelimitedFrom(InputStream inputStream, C5147q qVar) throws IOException {
            return (Experiment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Experiment parseFrom(ByteBuffer byteBuffer, C5147q qVar) throws C5061a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static Experiment parseFrom(C5093i iVar) throws C5061a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static Experiment parseFrom(C5093i iVar, C5147q qVar) throws C5061a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static Experiment parseFrom(byte[] bArr) throws C5061a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Experiment parseFrom(byte[] bArr, C5147q qVar) throws C5061a0 {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static Experiment parseFrom(InputStream inputStream) throws IOException {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Experiment parseFrom(InputStream inputStream, C5147q qVar) throws IOException {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Experiment parseFrom(C5114j jVar) throws IOException {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static Experiment parseFrom(C5114j jVar, C5147q qVar) throws IOException {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    public static final class MRCData extends GeneratedMessageLite<MRCData, C4155a> implements C5153r0 {
        /* access modifiers changed from: private */
        public static final MRCData DEFAULT_INSTANCE;
        private static volatile C5193y0<MRCData> PARSER = null;
        public static final int PIXELDURATION_FIELD_NUMBER = 2;
        public static final int PIXELIMPRESSIONURL_FIELD_NUMBER = 3;
        public static final int PIXELPERCENT_FIELD_NUMBER = 1;
        private int bitField0_;
        private int pixelDuration_;
        private String pixelImpressionUrl_ = "";
        private int pixelPercent_;

        /* renamed from: com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters$MRCData$a */
        public static final class C4155a extends GeneratedMessageLite.C5050a<MRCData, C4155a> implements C5153r0 {
            public C4155a() {
                super(MRCData.DEFAULT_INSTANCE);
            }
        }

        static {
            MRCData mRCData = new MRCData();
            DEFAULT_INSTANCE = mRCData;
            GeneratedMessageLite.registerDefaultInstance(MRCData.class, mRCData);
        }

        private MRCData() {
        }

        /* access modifiers changed from: private */
        public void clearPixelDuration() {
            this.bitField0_ &= -3;
            this.pixelDuration_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPixelImpressionUrl() {
            this.bitField0_ &= -5;
            this.pixelImpressionUrl_ = getDefaultInstance().getPixelImpressionUrl();
        }

        /* access modifiers changed from: private */
        public void clearPixelPercent() {
            this.bitField0_ &= -2;
            this.pixelPercent_ = 0;
        }

        public static MRCData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C4155a newBuilder() {
            return (C4155a) DEFAULT_INSTANCE.createBuilder();
        }

        public static MRCData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MRCData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MRCData parseFrom(ByteBuffer byteBuffer) throws C5061a0 {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C5193y0<MRCData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setPixelDuration(int i) {
            this.bitField0_ |= 2;
            this.pixelDuration_ = i;
        }

        /* access modifiers changed from: private */
        public void setPixelImpressionUrl(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.pixelImpressionUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setPixelImpressionUrlBytes(C5093i iVar) {
            C5058a.checkByteStringIsUtf8(iVar);
            this.pixelImpressionUrl_ = iVar.mo25918i();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setPixelPercent(int i) {
            this.bitField0_ |= 1;
            this.pixelPercent_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.C5054e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001???\u0000\u0002???\u0001\u0003???\u0002", new Object[]{"bitField0_", "pixelPercent_", "pixelDuration_", "pixelImpressionUrl_"});
                case 3:
                    return new MRCData();
                case 4:
                    return new C4155a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C5193y0<MRCData> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (MRCData.class) {
                            y0Var = PARSER;
                            if (y0Var == null) {
                                y0Var = new GeneratedMessageLite.C5051b<>(DEFAULT_INSTANCE);
                                PARSER = y0Var;
                            }
                        }
                    }
                    return y0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getPixelDuration() {
            return this.pixelDuration_;
        }

        public String getPixelImpressionUrl() {
            return this.pixelImpressionUrl_;
        }

        public C5093i getPixelImpressionUrlBytes() {
            return C5093i.m15514a(this.pixelImpressionUrl_);
        }

        public int getPixelPercent() {
            return this.pixelPercent_;
        }

        public boolean hasPixelDuration() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPixelImpressionUrl() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPixelPercent() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C4155a newBuilder(MRCData mRCData) {
            return (C4155a) DEFAULT_INSTANCE.createBuilder(mRCData);
        }

        public static MRCData parseDelimitedFrom(InputStream inputStream, C5147q qVar) throws IOException {
            return (MRCData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static MRCData parseFrom(ByteBuffer byteBuffer, C5147q qVar) throws C5061a0 {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static MRCData parseFrom(C5093i iVar) throws C5061a0 {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static MRCData parseFrom(C5093i iVar, C5147q qVar) throws C5061a0 {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static MRCData parseFrom(byte[] bArr) throws C5061a0 {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MRCData parseFrom(byte[] bArr, C5147q qVar) throws C5061a0 {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static MRCData parseFrom(InputStream inputStream) throws IOException {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MRCData parseFrom(InputStream inputStream, C5147q qVar) throws IOException {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static MRCData parseFrom(C5114j jVar) throws IOException {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static MRCData parseFrom(C5114j jVar, C5147q qVar) throws IOException {
            return (MRCData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    public static final class SKAdNetworkData extends GeneratedMessageLite<SKAdNetworkData, C4156a> implements C5153r0 {
        /* access modifiers changed from: private */
        public static final SKAdNetworkData DEFAULT_INSTANCE;
        private static volatile C5193y0<SKAdNetworkData> PARSER = null;
        public static final int SKADNBUNDLE_FIELD_NUMBER = 4;
        public static final int SKADNCAMPIGN_FIELD_NUMBER = 3;
        public static final int SKADNETWORKID_FIELD_NUMBER = 2;
        public static final int SKADNID_FIELD_NUMBER = 5;
        public static final int SKADNIMPID_FIELD_NUMBER = 6;
        public static final int SKADNIMPSIGNATURE_FIELD_NUMBER = 10;
        public static final int SKADNIMPTIMESTAMP_FIELD_NUMBER = 9;
        public static final int SKADNSIGNATURE_FIELD_NUMBER = 11;
        public static final int SKADNSOURCEAPP_FIELD_NUMBER = 7;
        public static final int SKADNTIMESTAMP_FIELD_NUMBER = 8;
        public static final int SKADNVERSION_FIELD_NUMBER = 1;
        private int bitField0_;
        private String skAdNetworkId_ = "";
        private String skAdnBundle_ = "";
        private String skAdnCampign_ = "";
        private String skAdnId_ = "";
        private String skAdnImpId_ = "";
        private String skAdnImpSignature_ = "";
        private long skAdnImpTimestamp_;
        private String skAdnSignature_ = "";
        private long skAdnSourceApp_;
        private long skAdnTimestamp_;
        private String skAdnVersion_ = "";

        /* renamed from: com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters$SKAdNetworkData$a */
        public static final class C4156a extends GeneratedMessageLite.C5050a<SKAdNetworkData, C4156a> implements C5153r0 {
            public C4156a() {
                super(SKAdNetworkData.DEFAULT_INSTANCE);
            }
        }

        static {
            SKAdNetworkData sKAdNetworkData = new SKAdNetworkData();
            DEFAULT_INSTANCE = sKAdNetworkData;
            GeneratedMessageLite.registerDefaultInstance(SKAdNetworkData.class, sKAdNetworkData);
        }

        private SKAdNetworkData() {
        }

        /* access modifiers changed from: private */
        public void clearSkAdNetworkId() {
            this.bitField0_ &= -3;
            this.skAdNetworkId_ = getDefaultInstance().getSkAdNetworkId();
        }

        /* access modifiers changed from: private */
        public void clearSkAdnBundle() {
            this.bitField0_ &= -9;
            this.skAdnBundle_ = getDefaultInstance().getSkAdnBundle();
        }

        /* access modifiers changed from: private */
        public void clearSkAdnCampign() {
            this.bitField0_ &= -5;
            this.skAdnCampign_ = getDefaultInstance().getSkAdnCampign();
        }

        /* access modifiers changed from: private */
        public void clearSkAdnId() {
            this.bitField0_ &= -17;
            this.skAdnId_ = getDefaultInstance().getSkAdnId();
        }

        /* access modifiers changed from: private */
        public void clearSkAdnImpId() {
            this.bitField0_ &= -33;
            this.skAdnImpId_ = getDefaultInstance().getSkAdnImpId();
        }

        /* access modifiers changed from: private */
        public void clearSkAdnImpSignature() {
            this.bitField0_ &= -513;
            this.skAdnImpSignature_ = getDefaultInstance().getSkAdnImpSignature();
        }

        /* access modifiers changed from: private */
        public void clearSkAdnImpTimestamp() {
            this.bitField0_ &= -257;
            this.skAdnImpTimestamp_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSkAdnSignature() {
            this.bitField0_ &= -1025;
            this.skAdnSignature_ = getDefaultInstance().getSkAdnSignature();
        }

        /* access modifiers changed from: private */
        public void clearSkAdnSourceApp() {
            this.bitField0_ &= -65;
            this.skAdnSourceApp_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSkAdnTimestamp() {
            this.bitField0_ &= -129;
            this.skAdnTimestamp_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSkAdnVersion() {
            this.bitField0_ &= -2;
            this.skAdnVersion_ = getDefaultInstance().getSkAdnVersion();
        }

        public static SKAdNetworkData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C4156a newBuilder() {
            return (C4156a) DEFAULT_INSTANCE.createBuilder();
        }

        public static SKAdNetworkData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SKAdNetworkData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKAdNetworkData parseFrom(ByteBuffer byteBuffer) throws C5061a0 {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C5193y0<SKAdNetworkData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setSkAdNetworkId(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.skAdNetworkId_ = str;
        }

        /* access modifiers changed from: private */
        public void setSkAdNetworkIdBytes(C5093i iVar) {
            C5058a.checkByteStringIsUtf8(iVar);
            this.skAdNetworkId_ = iVar.mo25918i();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setSkAdnBundle(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.skAdnBundle_ = str;
        }

        /* access modifiers changed from: private */
        public void setSkAdnBundleBytes(C5093i iVar) {
            C5058a.checkByteStringIsUtf8(iVar);
            this.skAdnBundle_ = iVar.mo25918i();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setSkAdnCampign(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.skAdnCampign_ = str;
        }

        /* access modifiers changed from: private */
        public void setSkAdnCampignBytes(C5093i iVar) {
            C5058a.checkByteStringIsUtf8(iVar);
            this.skAdnCampign_ = iVar.mo25918i();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setSkAdnId(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.skAdnId_ = str;
        }

        /* access modifiers changed from: private */
        public void setSkAdnIdBytes(C5093i iVar) {
            C5058a.checkByteStringIsUtf8(iVar);
            this.skAdnId_ = iVar.mo25918i();
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setSkAdnImpId(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.skAdnImpId_ = str;
        }

        /* access modifiers changed from: private */
        public void setSkAdnImpIdBytes(C5093i iVar) {
            C5058a.checkByteStringIsUtf8(iVar);
            this.skAdnImpId_ = iVar.mo25918i();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setSkAdnImpSignature(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.skAdnImpSignature_ = str;
        }

        /* access modifiers changed from: private */
        public void setSkAdnImpSignatureBytes(C5093i iVar) {
            C5058a.checkByteStringIsUtf8(iVar);
            this.skAdnImpSignature_ = iVar.mo25918i();
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void setSkAdnImpTimestamp(long j) {
            this.bitField0_ |= 256;
            this.skAdnImpTimestamp_ = j;
        }

        /* access modifiers changed from: private */
        public void setSkAdnSignature(String str) {
            str.getClass();
            this.bitField0_ |= 1024;
            this.skAdnSignature_ = str;
        }

        /* access modifiers changed from: private */
        public void setSkAdnSignatureBytes(C5093i iVar) {
            C5058a.checkByteStringIsUtf8(iVar);
            this.skAdnSignature_ = iVar.mo25918i();
            this.bitField0_ |= 1024;
        }

        /* access modifiers changed from: private */
        public void setSkAdnSourceApp(long j) {
            this.bitField0_ |= 64;
            this.skAdnSourceApp_ = j;
        }

        /* access modifiers changed from: private */
        public void setSkAdnTimestamp(long j) {
            this.bitField0_ |= 128;
            this.skAdnTimestamp_ = j;
        }

        /* access modifiers changed from: private */
        public void setSkAdnVersion(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.skAdnVersion_ = str;
        }

        /* access modifiers changed from: private */
        public void setSkAdnVersionBytes(C5093i iVar) {
            C5058a.checkByteStringIsUtf8(iVar);
            this.skAdnVersion_ = iVar.mo25918i();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(GeneratedMessageLite.C5054e eVar, Object obj, Object obj2) {
            switch (eVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001???\u0000\u0002???\u0001\u0003???\u0002\u0004???\u0003\u0005???\u0004\u0006???\u0005\u0007???\u0006\b???\u0007\t???\b\n???\t\u000b???\n", new Object[]{"bitField0_", "skAdnVersion_", "skAdNetworkId_", "skAdnCampign_", "skAdnBundle_", "skAdnId_", "skAdnImpId_", "skAdnSourceApp_", "skAdnTimestamp_", "skAdnImpTimestamp_", "skAdnImpSignature_", "skAdnSignature_"});
                case 3:
                    return new SKAdNetworkData();
                case 4:
                    return new C4156a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C5193y0<SKAdNetworkData> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (SKAdNetworkData.class) {
                            y0Var = PARSER;
                            if (y0Var == null) {
                                y0Var = new GeneratedMessageLite.C5051b<>(DEFAULT_INSTANCE);
                                PARSER = y0Var;
                            }
                        }
                    }
                    return y0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getSkAdNetworkId() {
            return this.skAdNetworkId_;
        }

        public C5093i getSkAdNetworkIdBytes() {
            return C5093i.m15514a(this.skAdNetworkId_);
        }

        public String getSkAdnBundle() {
            return this.skAdnBundle_;
        }

        public C5093i getSkAdnBundleBytes() {
            return C5093i.m15514a(this.skAdnBundle_);
        }

        public String getSkAdnCampign() {
            return this.skAdnCampign_;
        }

        public C5093i getSkAdnCampignBytes() {
            return C5093i.m15514a(this.skAdnCampign_);
        }

        public String getSkAdnId() {
            return this.skAdnId_;
        }

        public C5093i getSkAdnIdBytes() {
            return C5093i.m15514a(this.skAdnId_);
        }

        public String getSkAdnImpId() {
            return this.skAdnImpId_;
        }

        public C5093i getSkAdnImpIdBytes() {
            return C5093i.m15514a(this.skAdnImpId_);
        }

        public String getSkAdnImpSignature() {
            return this.skAdnImpSignature_;
        }

        public C5093i getSkAdnImpSignatureBytes() {
            return C5093i.m15514a(this.skAdnImpSignature_);
        }

        public long getSkAdnImpTimestamp() {
            return this.skAdnImpTimestamp_;
        }

        public String getSkAdnSignature() {
            return this.skAdnSignature_;
        }

        public C5093i getSkAdnSignatureBytes() {
            return C5093i.m15514a(this.skAdnSignature_);
        }

        public long getSkAdnSourceApp() {
            return this.skAdnSourceApp_;
        }

        public long getSkAdnTimestamp() {
            return this.skAdnTimestamp_;
        }

        public String getSkAdnVersion() {
            return this.skAdnVersion_;
        }

        public C5093i getSkAdnVersionBytes() {
            return C5093i.m15514a(this.skAdnVersion_);
        }

        public boolean hasSkAdNetworkId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSkAdnBundle() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasSkAdnCampign() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasSkAdnId() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasSkAdnImpId() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasSkAdnImpSignature() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasSkAdnImpTimestamp() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasSkAdnSignature() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasSkAdnSourceApp() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasSkAdnTimestamp() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasSkAdnVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C4156a newBuilder(SKAdNetworkData sKAdNetworkData) {
            return (C4156a) DEFAULT_INSTANCE.createBuilder(sKAdNetworkData);
        }

        public static SKAdNetworkData parseDelimitedFrom(InputStream inputStream, C5147q qVar) throws IOException {
            return (SKAdNetworkData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static SKAdNetworkData parseFrom(ByteBuffer byteBuffer, C5147q qVar) throws C5061a0 {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static SKAdNetworkData parseFrom(C5093i iVar) throws C5061a0 {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static SKAdNetworkData parseFrom(C5093i iVar, C5147q qVar) throws C5061a0 {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static SKAdNetworkData parseFrom(byte[] bArr) throws C5061a0 {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SKAdNetworkData parseFrom(byte[] bArr, C5147q qVar) throws C5061a0 {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static SKAdNetworkData parseFrom(InputStream inputStream) throws IOException {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKAdNetworkData parseFrom(InputStream inputStream, C5147q qVar) throws IOException {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static SKAdNetworkData parseFrom(C5114j jVar) throws IOException {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static SKAdNetworkData parseFrom(C5114j jVar, C5147q qVar) throws IOException {
            return (SKAdNetworkData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters$c */
    public static final class C4159c extends GeneratedMessageLite.C5050a<AdmParametersOuterClass$AdmParameters, C4159c> implements C5153r0 {
        public C4159c() {
            super(AdmParametersOuterClass$AdmParameters.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters$d */
    public enum C4160d implements C5194z.C5197c {
        MANUAL(0),
        AUTOMATIC(1),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public final int f10215a;

        /* access modifiers changed from: public */
        C4160d(int i) {
            this.f10215a = i;
        }

        /* renamed from: a */
        public final int mo24014a() {
            if (this != UNRECOGNIZED) {
                return this.f10215a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters$e */
    public interface C4161e extends C5153r0 {
    }

    static {
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = new AdmParametersOuterClass$AdmParameters();
        DEFAULT_INSTANCE = admParametersOuterClass$AdmParameters;
        GeneratedMessageLite.registerDefaultInstance(AdmParametersOuterClass$AdmParameters.class, admParametersOuterClass$AdmParameters);
    }

    private AdmParametersOuterClass$AdmParameters() {
    }

    /* access modifiers changed from: private */
    public void addAbExperiments(Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.add(experiment);
    }

    /* access modifiers changed from: private */
    public void addAllAbExperiments(Iterable<? extends Experiment> iterable) {
        ensureAbExperimentsIsMutable();
        C5058a.addAll(iterable, this.abExperiments_);
    }

    /* access modifiers changed from: private */
    public void clearAbExperiments() {
        this.abExperiments_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearAdCompletionUrl() {
        this.bitField0_ &= -1048577;
        this.adCompletionUrl_ = getDefaultInstance().getAdCompletionUrl();
    }

    /* access modifiers changed from: private */
    public void clearAdDomain() {
        this.bitField0_ &= -33554433;
        this.adDomain_ = getDefaultInstance().getAdDomain();
    }

    /* access modifiers changed from: private */
    public void clearAdDuration() {
        this.bitField0_ &= -2097153;
        this.adDuration_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearAdExpirationInterval() {
        this.bitField0_ &= -1025;
        this.adExpirationInterval_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearAdHeight() {
        this.bitField0_ &= -17;
        this.adHeight_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearAdNetworkId() {
        this.bitField0_ &= -513;
        this.adNetworkId_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearAdNetworkName() {
        this.bitField0_ &= -257;
        this.adNetworkName_ = getDefaultInstance().getAdNetworkName();
    }

    /* access modifiers changed from: private */
    public void clearAdType() {
        this.adType_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearAdUnitDisplayType() {
        this.adUnitDisplayType_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearAdUnitId() {
        this.bitField0_ &= -33;
        this.adUnitId_ = getDefaultInstance().getAdUnitId();
    }

    /* access modifiers changed from: private */
    public void clearAdUnitType() {
        this.adUnitType_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearAdWidth() {
        this.bitField0_ &= -9;
        this.adWidth_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearAdvertisedAppId() {
        this.bitField0_ &= -16385;
        this.advertisedAppId_ = getDefaultInstance().getAdvertisedAppId();
    }

    /* access modifiers changed from: private */
    public void clearAppBundleId() {
        this.bitField0_ &= -524289;
        this.appBundleId_ = getDefaultInstance().getAppBundleId();
    }

    /* access modifiers changed from: private */
    public void clearCampaignId() {
        this.bitField0_ &= -134217729;
        this.campaignId_ = getDefaultInstance().getCampaignId();
    }

    /* access modifiers changed from: private */
    public void clearContentId() {
        this.bitField0_ &= -65;
        this.contentId_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearCreativeId() {
        this.bitField0_ &= -67108865;
        this.creativeId_ = getDefaultInstance().getCreativeId();
    }

    /* access modifiers changed from: private */
    public void clearCreativeType() {
        this.bitField0_ &= -4194305;
        this.creativeType_ = getDefaultInstance().getCreativeType();
    }

    /* access modifiers changed from: private */
    public void clearErrorMessage() {
        this.bitField0_ &= -5;
        this.errorMessage_ = getDefaultInstance().getErrorMessage();
    }

    /* access modifiers changed from: private */
    public void clearMarkupUrl() {
        this.bitField0_ &= -2;
        this.markupUrl_ = getDefaultInstance().getMarkupUrl();
    }

    /* access modifiers changed from: private */
    public void clearMrcData() {
        this.mrcData_ = null;
        this.bitField0_ &= -268435457;
    }

    /* access modifiers changed from: private */
    public void clearPricingValue() {
        this.bitField0_ &= -16777217;
        this.pricingValue_ = 0.0d;
    }

    /* access modifiers changed from: private */
    public void clearPublisherId() {
        this.bitField0_ &= -129;
        this.publisherId_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearSdkClickUrl() {
        this.bitField0_ &= -4097;
        this.sdkClickUrl_ = getDefaultInstance().getSdkClickUrl();
    }

    /* access modifiers changed from: private */
    public void clearSdkImpressionUrl() {
        this.bitField0_ &= -2049;
        this.sdkImpressionUrl_ = getDefaultInstance().getSdkImpressionUrl();
    }

    /* access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -3;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* access modifiers changed from: private */
    public void clearSkAdNetworkData() {
        this.skAdNetworkData_ = null;
        this.bitField0_ &= -8388609;
    }

    /* access modifiers changed from: private */
    public void clearSkipMode() {
        this.bitField0_ &= -262145;
        this.skipMode_ = false;
    }

    /* access modifiers changed from: private */
    public void clearSpotId() {
        this.bitField0_ &= -536870913;
        this.spotId_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearStoreCTAText() {
        this.bitField0_ &= -131073;
        this.storeCTAText_ = getDefaultInstance().getStoreCTAText();
    }

    /* access modifiers changed from: private */
    public void clearStoreEventUrl() {
        this.bitField0_ &= -65537;
        this.storeEventUrl_ = getDefaultInstance().getStoreEventUrl();
    }

    /* access modifiers changed from: private */
    public void clearStoreUrl() {
        this.bitField0_ &= -8193;
        this.storeUrl_ = getDefaultInstance().getStoreUrl();
    }

    /* access modifiers changed from: private */
    public void clearStoreUrlType() {
        this.bitField0_ &= -32769;
        this.storeUrlType_ = 0;
    }

    private void ensureAbExperimentsIsMutable() {
        C5194z.C5205j<Experiment> jVar = this.abExperiments_;
        if (!jVar.mo25768d()) {
            this.abExperiments_ = GeneratedMessageLite.mutableCopy(jVar);
        }
    }

    public static AdmParametersOuterClass$AdmParameters getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeMrcData(MRCData mRCData) {
        mRCData.getClass();
        MRCData mRCData2 = this.mrcData_;
        if (mRCData2 == null || mRCData2 == MRCData.getDefaultInstance()) {
            this.mrcData_ = mRCData;
        } else {
            MRCData.C4155a newBuilder = MRCData.newBuilder(this.mrcData_);
            newBuilder.mo25737c();
            newBuilder.mo25735a(newBuilder.f13487b, mRCData);
            this.mrcData_ = (MRCData) newBuilder.mo25736b();
        }
        this.bitField0_ |= 268435456;
    }

    /* access modifiers changed from: private */
    public void mergeSkAdNetworkData(SKAdNetworkData sKAdNetworkData) {
        sKAdNetworkData.getClass();
        SKAdNetworkData sKAdNetworkData2 = this.skAdNetworkData_;
        if (sKAdNetworkData2 == null || sKAdNetworkData2 == SKAdNetworkData.getDefaultInstance()) {
            this.skAdNetworkData_ = sKAdNetworkData;
        } else {
            SKAdNetworkData.C4156a newBuilder = SKAdNetworkData.newBuilder(this.skAdNetworkData_);
            newBuilder.mo25737c();
            newBuilder.mo25735a(newBuilder.f13487b, sKAdNetworkData);
            this.skAdNetworkData_ = (SKAdNetworkData) newBuilder.mo25736b();
        }
        this.bitField0_ |= 8388608;
    }

    public static C4159c newBuilder() {
        return (C4159c) DEFAULT_INSTANCE.createBuilder();
    }

    public static AdmParametersOuterClass$AdmParameters parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(ByteBuffer byteBuffer) throws C5061a0 {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C5193y0<AdmParametersOuterClass$AdmParameters> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeAbExperiments(int i) {
        ensureAbExperimentsIsMutable();
        this.abExperiments_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setAbExperiments(int i, Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.set(i, experiment);
    }

    /* access modifiers changed from: private */
    public void setAdCompletionUrl(String str) {
        str.getClass();
        this.bitField0_ |= 1048576;
        this.adCompletionUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void setAdCompletionUrlBytes(C5093i iVar) {
        C5058a.checkByteStringIsUtf8(iVar);
        this.adCompletionUrl_ = iVar.mo25918i();
        this.bitField0_ |= 1048576;
    }

    /* access modifiers changed from: private */
    public void setAdDomain(String str) {
        str.getClass();
        this.bitField0_ |= 33554432;
        this.adDomain_ = str;
    }

    /* access modifiers changed from: private */
    public void setAdDomainBytes(C5093i iVar) {
        C5058a.checkByteStringIsUtf8(iVar);
        this.adDomain_ = iVar.mo25918i();
        this.bitField0_ |= 33554432;
    }

    /* access modifiers changed from: private */
    public void setAdDuration(int i) {
        this.bitField0_ |= 2097152;
        this.adDuration_ = i;
    }

    /* access modifiers changed from: private */
    public void setAdExpirationInterval(int i) {
        this.bitField0_ |= 1024;
        this.adExpirationInterval_ = i;
    }

    /* access modifiers changed from: private */
    public void setAdHeight(int i) {
        this.bitField0_ |= 16;
        this.adHeight_ = i;
    }

    /* access modifiers changed from: private */
    public void setAdNetworkId(long j) {
        this.bitField0_ |= 512;
        this.adNetworkId_ = j;
    }

    /* access modifiers changed from: private */
    public void setAdNetworkName(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.adNetworkName_ = str;
    }

    /* access modifiers changed from: private */
    public void setAdNetworkNameBytes(C5093i iVar) {
        C5058a.checkByteStringIsUtf8(iVar);
        this.adNetworkName_ = iVar.mo25918i();
        this.bitField0_ |= 256;
    }

    /* access modifiers changed from: private */
    public void setAdType(C4157a aVar) {
        this.adType_ = aVar.mo24014a();
    }

    /* access modifiers changed from: private */
    public void setAdTypeValue(int i) {
        this.adType_ = i;
    }

    /* access modifiers changed from: private */
    public void setAdUnitDisplayType(C4162f fVar) {
        this.adUnitDisplayType_ = fVar.mo24014a();
    }

    /* access modifiers changed from: private */
    public void setAdUnitDisplayTypeValue(int i) {
        this.adUnitDisplayType_ = i;
    }

    /* access modifiers changed from: private */
    public void setAdUnitId(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.adUnitId_ = str;
    }

    /* access modifiers changed from: private */
    public void setAdUnitIdBytes(C5093i iVar) {
        C5058a.checkByteStringIsUtf8(iVar);
        this.adUnitId_ = iVar.mo25918i();
        this.bitField0_ |= 32;
    }

    /* access modifiers changed from: private */
    public void setAdUnitType(C4158b bVar) {
        this.adUnitType_ = bVar.mo24014a();
    }

    /* access modifiers changed from: private */
    public void setAdUnitTypeValue(int i) {
        this.adUnitType_ = i;
    }

    /* access modifiers changed from: private */
    public void setAdWidth(int i) {
        this.bitField0_ |= 8;
        this.adWidth_ = i;
    }

    /* access modifiers changed from: private */
    public void setAdvertisedAppId(String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.advertisedAppId_ = str;
    }

    /* access modifiers changed from: private */
    public void setAdvertisedAppIdBytes(C5093i iVar) {
        C5058a.checkByteStringIsUtf8(iVar);
        this.advertisedAppId_ = iVar.mo25918i();
        this.bitField0_ |= 16384;
    }

    /* access modifiers changed from: private */
    public void setAppBundleId(String str) {
        str.getClass();
        this.bitField0_ |= 524288;
        this.appBundleId_ = str;
    }

    /* access modifiers changed from: private */
    public void setAppBundleIdBytes(C5093i iVar) {
        C5058a.checkByteStringIsUtf8(iVar);
        this.appBundleId_ = iVar.mo25918i();
        this.bitField0_ |= 524288;
    }

    /* access modifiers changed from: private */
    public void setCampaignId(String str) {
        str.getClass();
        this.bitField0_ |= 134217728;
        this.campaignId_ = str;
    }

    /* access modifiers changed from: private */
    public void setCampaignIdBytes(C5093i iVar) {
        C5058a.checkByteStringIsUtf8(iVar);
        this.campaignId_ = iVar.mo25918i();
        this.bitField0_ |= 134217728;
    }

    /* access modifiers changed from: private */
    public void setContentId(long j) {
        this.bitField0_ |= 64;
        this.contentId_ = j;
    }

    /* access modifiers changed from: private */
    public void setCreativeId(String str) {
        str.getClass();
        this.bitField0_ |= 67108864;
        this.creativeId_ = str;
    }

    /* access modifiers changed from: private */
    public void setCreativeIdBytes(C5093i iVar) {
        C5058a.checkByteStringIsUtf8(iVar);
        this.creativeId_ = iVar.mo25918i();
        this.bitField0_ |= 67108864;
    }

    /* access modifiers changed from: private */
    public void setCreativeType(String str) {
        str.getClass();
        this.bitField0_ |= 4194304;
        this.creativeType_ = str;
    }

    /* access modifiers changed from: private */
    public void setCreativeTypeBytes(C5093i iVar) {
        C5058a.checkByteStringIsUtf8(iVar);
        this.creativeType_ = iVar.mo25918i();
        this.bitField0_ |= 4194304;
    }

    /* access modifiers changed from: private */
    public void setErrorMessage(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.errorMessage_ = str;
    }

    /* access modifiers changed from: private */
    public void setErrorMessageBytes(C5093i iVar) {
        C5058a.checkByteStringIsUtf8(iVar);
        this.errorMessage_ = iVar.mo25918i();
        this.bitField0_ |= 4;
    }

    /* access modifiers changed from: private */
    public void setMarkupUrl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.markupUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void setMarkupUrlBytes(C5093i iVar) {
        C5058a.checkByteStringIsUtf8(iVar);
        this.markupUrl_ = iVar.mo25918i();
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    public void setMrcData(MRCData mRCData) {
        mRCData.getClass();
        this.mrcData_ = mRCData;
        this.bitField0_ |= 268435456;
    }

    /* access modifiers changed from: private */
    public void setPricingValue(double d) {
        this.bitField0_ |= 16777216;
        this.pricingValue_ = d;
    }

    /* access modifiers changed from: private */
    public void setPublisherId(long j) {
        this.bitField0_ |= 128;
        this.publisherId_ = j;
    }

    /* access modifiers changed from: private */
    public void setSdkClickUrl(String str) {
        str.getClass();
        this.bitField0_ |= 4096;
        this.sdkClickUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void setSdkClickUrlBytes(C5093i iVar) {
        C5058a.checkByteStringIsUtf8(iVar);
        this.sdkClickUrl_ = iVar.mo25918i();
        this.bitField0_ |= 4096;
    }

    /* access modifiers changed from: private */
    public void setSdkImpressionUrl(String str) {
        str.getClass();
        this.bitField0_ |= 2048;
        this.sdkImpressionUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void setSdkImpressionUrlBytes(C5093i iVar) {
        C5058a.checkByteStringIsUtf8(iVar);
        this.sdkImpressionUrl_ = iVar.mo25918i();
        this.bitField0_ |= 2048;
    }

    /* access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sessionId_ = str;
    }

    /* access modifiers changed from: private */
    public void setSessionIdBytes(C5093i iVar) {
        C5058a.checkByteStringIsUtf8(iVar);
        this.sessionId_ = iVar.mo25918i();
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void setSkAdNetworkData(SKAdNetworkData sKAdNetworkData) {
        sKAdNetworkData.getClass();
        this.skAdNetworkData_ = sKAdNetworkData;
        this.bitField0_ |= 8388608;
    }

    /* access modifiers changed from: private */
    public void setSkipMode(boolean z) {
        this.bitField0_ |= 262144;
        this.skipMode_ = z;
    }

    /* access modifiers changed from: private */
    public void setSpotId(long j) {
        this.bitField0_ |= 536870912;
        this.spotId_ = j;
    }

    /* access modifiers changed from: private */
    public void setStoreCTAText(String str) {
        str.getClass();
        this.bitField0_ |= 131072;
        this.storeCTAText_ = str;
    }

    /* access modifiers changed from: private */
    public void setStoreCTATextBytes(C5093i iVar) {
        C5058a.checkByteStringIsUtf8(iVar);
        this.storeCTAText_ = iVar.mo25918i();
        this.bitField0_ |= 131072;
    }

    /* access modifiers changed from: private */
    public void setStoreEventUrl(String str) {
        str.getClass();
        this.bitField0_ |= 65536;
        this.storeEventUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void setStoreEventUrlBytes(C5093i iVar) {
        C5058a.checkByteStringIsUtf8(iVar);
        this.storeEventUrl_ = iVar.mo25918i();
        this.bitField0_ |= 65536;
    }

    /* access modifiers changed from: private */
    public void setStoreUrl(String str) {
        str.getClass();
        this.bitField0_ |= 8192;
        this.storeUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void setStoreUrlBytes(C5093i iVar) {
        C5058a.checkByteStringIsUtf8(iVar);
        this.storeUrl_ = iVar.mo25918i();
        this.bitField0_ |= 8192;
    }

    /* access modifiers changed from: private */
    public void setStoreUrlType(C4160d dVar) {
        this.storeUrlType_ = dVar.mo24014a();
        this.bitField0_ |= 32768;
    }

    /* access modifiers changed from: private */
    public void setStoreUrlTypeValue(int i) {
        this.bitField0_ |= 32768;
        this.storeUrlType_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.C5054e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\"\u0000\u0001\u0001\"\"\u0000\u0001\u0000\u0001???\u0000\u0002???\u0001\u0003???\u0002\u0004???\u0003\u0005???\u0004\u0006???\u0005\u0007\f\b\f\t???\u0006\n???\u0007\u000b???\b\f???\t\r???\n\u000e\f\u000f???\u000b\u0010???\f\u0011???\r\u0012???\u000e\u0013???\u000f\u0014???\u0010\u0015???\u0011\u0016???\u0012\u0017???\u0013\u0018???\u0014\u0019???\u0015\u001a???\u0016\u001b???\u0017\u001c???\u0018\u001d???\u0019\u001e???\u001a\u001f???\u001b ???\u001c!\u001b\"???\u001d", new Object[]{"bitField0_", "markupUrl_", "sessionId_", "errorMessage_", "adWidth_", "adHeight_", "adUnitId_", "adUnitType_", "adUnitDisplayType_", "contentId_", "publisherId_", "adNetworkName_", "adNetworkId_", "adExpirationInterval_", "adType_", "sdkImpressionUrl_", "sdkClickUrl_", "storeUrl_", "advertisedAppId_", "storeUrlType_", "storeEventUrl_", "storeCTAText_", "skipMode_", "appBundleId_", "adCompletionUrl_", "adDuration_", "creativeType_", "skAdNetworkData_", "pricingValue_", "adDomain_", "creativeId_", "campaignId_", "mrcData_", "abExperiments_", Experiment.class, "spotId_"});
            case 3:
                return new AdmParametersOuterClass$AdmParameters();
            case 4:
                return new C4159c();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C5193y0<AdmParametersOuterClass$AdmParameters> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (AdmParametersOuterClass$AdmParameters.class) {
                        y0Var = PARSER;
                        if (y0Var == null) {
                            y0Var = new GeneratedMessageLite.C5051b<>(DEFAULT_INSTANCE);
                            PARSER = y0Var;
                        }
                    }
                }
                return y0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Experiment getAbExperiments(int i) {
        return this.abExperiments_.get(i);
    }

    public int getAbExperimentsCount() {
        return this.abExperiments_.size();
    }

    public List<Experiment> getAbExperimentsList() {
        return this.abExperiments_;
    }

    public C4161e getAbExperimentsOrBuilder(int i) {
        return this.abExperiments_.get(i);
    }

    public List<? extends C4161e> getAbExperimentsOrBuilderList() {
        return this.abExperiments_;
    }

    public String getAdCompletionUrl() {
        return this.adCompletionUrl_;
    }

    public C5093i getAdCompletionUrlBytes() {
        return C5093i.m15514a(this.adCompletionUrl_);
    }

    public String getAdDomain() {
        return this.adDomain_;
    }

    public C5093i getAdDomainBytes() {
        return C5093i.m15514a(this.adDomain_);
    }

    public int getAdDuration() {
        return this.adDuration_;
    }

    public int getAdExpirationInterval() {
        return this.adExpirationInterval_;
    }

    public int getAdHeight() {
        return this.adHeight_;
    }

    public long getAdNetworkId() {
        return this.adNetworkId_;
    }

    public String getAdNetworkName() {
        return this.adNetworkName_;
    }

    public C5093i getAdNetworkNameBytes() {
        return C5093i.m15514a(this.adNetworkName_);
    }

    public C4157a getAdType() {
        C4157a a = C4157a.m13121a(this.adType_);
        return a == null ? C4157a.UNRECOGNIZED : a;
    }

    public int getAdTypeValue() {
        return this.adType_;
    }

    public C4162f getAdUnitDisplayType() {
        C4162f a = C4162f.m13126a(this.adUnitDisplayType_);
        return a == null ? C4162f.UNRECOGNIZED : a;
    }

    public int getAdUnitDisplayTypeValue() {
        return this.adUnitDisplayType_;
    }

    public String getAdUnitId() {
        return this.adUnitId_;
    }

    public C5093i getAdUnitIdBytes() {
        return C5093i.m15514a(this.adUnitId_);
    }

    public C4158b getAdUnitType() {
        C4158b a = C4158b.m13123a(this.adUnitType_);
        return a == null ? C4158b.UNRECOGNIZED : a;
    }

    public int getAdUnitTypeValue() {
        return this.adUnitType_;
    }

    public int getAdWidth() {
        return this.adWidth_;
    }

    public String getAdvertisedAppId() {
        return this.advertisedAppId_;
    }

    public C5093i getAdvertisedAppIdBytes() {
        return C5093i.m15514a(this.advertisedAppId_);
    }

    public String getAppBundleId() {
        return this.appBundleId_;
    }

    public C5093i getAppBundleIdBytes() {
        return C5093i.m15514a(this.appBundleId_);
    }

    public String getCampaignId() {
        return this.campaignId_;
    }

    public C5093i getCampaignIdBytes() {
        return C5093i.m15514a(this.campaignId_);
    }

    public long getContentId() {
        return this.contentId_;
    }

    public String getCreativeId() {
        return this.creativeId_;
    }

    public C5093i getCreativeIdBytes() {
        return C5093i.m15514a(this.creativeId_);
    }

    public String getCreativeType() {
        return this.creativeType_;
    }

    public C5093i getCreativeTypeBytes() {
        return C5093i.m15514a(this.creativeType_);
    }

    public String getErrorMessage() {
        return this.errorMessage_;
    }

    public C5093i getErrorMessageBytes() {
        return C5093i.m15514a(this.errorMessage_);
    }

    public String getMarkupUrl() {
        return this.markupUrl_;
    }

    public C5093i getMarkupUrlBytes() {
        return C5093i.m15514a(this.markupUrl_);
    }

    public MRCData getMrcData() {
        MRCData mRCData = this.mrcData_;
        return mRCData == null ? MRCData.getDefaultInstance() : mRCData;
    }

    public double getPricingValue() {
        return this.pricingValue_;
    }

    public long getPublisherId() {
        return this.publisherId_;
    }

    public String getSdkClickUrl() {
        return this.sdkClickUrl_;
    }

    public C5093i getSdkClickUrlBytes() {
        return C5093i.m15514a(this.sdkClickUrl_);
    }

    public String getSdkImpressionUrl() {
        return this.sdkImpressionUrl_;
    }

    public C5093i getSdkImpressionUrlBytes() {
        return C5093i.m15514a(this.sdkImpressionUrl_);
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public C5093i getSessionIdBytes() {
        return C5093i.m15514a(this.sessionId_);
    }

    public SKAdNetworkData getSkAdNetworkData() {
        SKAdNetworkData sKAdNetworkData = this.skAdNetworkData_;
        return sKAdNetworkData == null ? SKAdNetworkData.getDefaultInstance() : sKAdNetworkData;
    }

    public boolean getSkipMode() {
        return this.skipMode_;
    }

    public long getSpotId() {
        return this.spotId_;
    }

    public String getStoreCTAText() {
        return this.storeCTAText_;
    }

    public C5093i getStoreCTATextBytes() {
        return C5093i.m15514a(this.storeCTAText_);
    }

    public String getStoreEventUrl() {
        return this.storeEventUrl_;
    }

    public C5093i getStoreEventUrlBytes() {
        return C5093i.m15514a(this.storeEventUrl_);
    }

    public String getStoreUrl() {
        return this.storeUrl_;
    }

    public C5093i getStoreUrlBytes() {
        return C5093i.m15514a(this.storeUrl_);
    }

    public C4160d getStoreUrlType() {
        C4160d dVar;
        int i = this.storeUrlType_;
        if (i == 0) {
            dVar = C4160d.MANUAL;
        } else if (i != 1) {
            dVar = null;
        } else {
            dVar = C4160d.AUTOMATIC;
        }
        return dVar == null ? C4160d.UNRECOGNIZED : dVar;
    }

    public int getStoreUrlTypeValue() {
        return this.storeUrlType_;
    }

    public boolean hasAdCompletionUrl() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasAdDomain() {
        return (this.bitField0_ & 33554432) != 0;
    }

    public boolean hasAdDuration() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasAdExpirationInterval() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasAdHeight() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasAdNetworkId() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasAdNetworkName() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasAdUnitId() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasAdWidth() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasAdvertisedAppId() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasAppBundleId() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasCampaignId() {
        return (this.bitField0_ & 134217728) != 0;
    }

    public boolean hasContentId() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCreativeId() {
        return (this.bitField0_ & 67108864) != 0;
    }

    public boolean hasCreativeType() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasErrorMessage() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMarkupUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMrcData() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasPricingValue() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasPublisherId() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSdkClickUrl() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasSdkImpressionUrl() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSkAdNetworkData() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasSkipMode() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasSpotId() {
        return (this.bitField0_ & 536870912) != 0;
    }

    public boolean hasStoreCTAText() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasStoreEventUrl() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasStoreUrl() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasStoreUrlType() {
        return (this.bitField0_ & 32768) != 0;
    }

    public static C4159c newBuilder(AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters) {
        return (C4159c) DEFAULT_INSTANCE.createBuilder(admParametersOuterClass$AdmParameters);
    }

    public static AdmParametersOuterClass$AdmParameters parseDelimitedFrom(InputStream inputStream, C5147q qVar) throws IOException {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(ByteBuffer byteBuffer, C5147q qVar) throws C5061a0 {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(C5093i iVar) throws C5061a0 {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
    }

    /* access modifiers changed from: private */
    public void addAbExperiments(int i, Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.add(i, experiment);
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(C5093i iVar, C5147q qVar) throws C5061a0 {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(byte[] bArr) throws C5061a0 {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters$a */
    public enum C4157a implements C5194z.C5197c {
        OTHER(0),
        HTML(4),
        MRAID(6),
        VAST(8),
        DV360(15),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public final int f10204a;

        /* access modifiers changed from: public */
        C4157a(int i) {
            this.f10204a = i;
        }

        /* renamed from: a */
        public final int mo24014a() {
            if (this != UNRECOGNIZED) {
                return this.f10204a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        /* renamed from: a */
        public static C4157a m13121a(int i) {
            if (i == 0) {
                return OTHER;
            }
            if (i == 4) {
                return HTML;
            }
            if (i == 6) {
                return MRAID;
            }
            if (i == 8) {
                return VAST;
            }
            if (i != 15) {
                return null;
            }
            return DV360;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters$b */
    public enum C4158b implements C5194z.C5197c {
        DISPLAY(0),
        f10206c(1),
        VIDEOANDDISPLAY(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public final int f10210a;

        /* access modifiers changed from: public */
        C4158b(int i) {
            this.f10210a = i;
        }

        /* renamed from: a */
        public final int mo24014a() {
            if (this != UNRECOGNIZED) {
                return this.f10210a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        /* renamed from: a */
        public static C4158b m13123a(int i) {
            if (i == 0) {
                return DISPLAY;
            }
            if (i == 1) {
                return f10206c;
            }
            if (i != 2) {
                return null;
            }
            return VIDEOANDDISPLAY;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters$f */
    public enum C4162f implements C5194z.C5197c {
        UNITDISPLAYTYPEUNKNOWN(0),
        BANNER(1),
        INTERSTITIAL(2),
        REWARDED(3),
        MRECT(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public final int f10223a;

        /* access modifiers changed from: public */
        C4162f(int i) {
            this.f10223a = i;
        }

        /* renamed from: a */
        public final int mo24014a() {
            if (this != UNRECOGNIZED) {
                return this.f10223a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        /* renamed from: a */
        public static C4162f m13126a(int i) {
            if (i == 0) {
                return UNITDISPLAYTYPEUNKNOWN;
            }
            if (i == 1) {
                return BANNER;
            }
            if (i == 2) {
                return INTERSTITIAL;
            }
            if (i == 3) {
                return REWARDED;
            }
            if (i != 4) {
                return null;
            }
            return MRECT;
        }
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(byte[] bArr, C5147q qVar) throws C5061a0 {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(InputStream inputStream) throws IOException {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(InputStream inputStream, C5147q qVar) throws IOException {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(C5114j jVar) throws IOException {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static AdmParametersOuterClass$AdmParameters parseFrom(C5114j jVar, C5147q qVar) throws IOException {
        return (AdmParametersOuterClass$AdmParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
    }
}

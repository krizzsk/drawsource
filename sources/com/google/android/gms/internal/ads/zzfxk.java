package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfxk {
    private static final Logger zza = Logger.getLogger(zzfxk.class.getName());
    private static final ConcurrentMap zzb = new ConcurrentHashMap();
    private static final ConcurrentMap zzc = new ConcurrentHashMap();
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();
    private static final ConcurrentMap zzg = new ConcurrentHashMap();

    private zzfxk() {
    }

    @Deprecated
    public static zzfwi zza(String str) throws GeneralSecurityException {
        if (str != null) {
            zzfwi zzfwi = (zzfwi) zze.get(str.toLowerCase(Locale.US));
            if (zzfwi != null) {
                return zzfwi;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase(Locale.US).startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase(Locale.US).startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkhybriddecrypt") || str.toLowerCase(Locale.US).startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkpublickeysign") || str.toLowerCase(Locale.US).startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    public static zzfwo zzb(String str) throws GeneralSecurityException {
        return zzp(str).zzb();
    }

    public static synchronized zzgfj zzc(zzgfo zzgfo) throws GeneralSecurityException {
        zzgfj zza2;
        synchronized (zzfxk.class) {
            zzfwo zzb2 = zzb(zzgfo.zzf());
            if (((Boolean) zzd.get(zzgfo.zzf())).booleanValue()) {
                zza2 = zzb2.zza(zzgfo.zze());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgfo.zzf())));
            }
        }
        return zza2;
    }

    public static synchronized zzgma zzd(zzgfo zzgfo) throws GeneralSecurityException {
        zzgma zzb2;
        synchronized (zzfxk.class) {
            zzfwo zzb3 = zzb(zzgfo.zzf());
            if (((Boolean) zzd.get(zzgfo.zzf())).booleanValue()) {
                zzb2 = zzb3.zzb(zzgfo.zze());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgfo.zzf())));
            }
        }
        return zzb2;
    }

    public static Class zze(Class cls) {
        zzfxd zzfxd = (zzfxd) zzf.get(cls);
        if (zzfxd == null) {
            return null;
        }
        return zzfxd.zza();
    }

    public static Object zzf(zzgfj zzgfj, Class cls) throws GeneralSecurityException {
        return zzq(zzgfj.zzf(), zzgfj.zze(), cls);
    }

    public static Object zzg(String str, zzgma zzgma, Class cls) throws GeneralSecurityException {
        return zzo(str, cls).zze(zzgma);
    }

    public static Object zzh(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        return zzq(str, zzgji.zzv(bArr), cls);
    }

    public static Object zzi(zzfxc zzfxc, Class cls) throws GeneralSecurityException {
        zzfxd zzfxd = (zzfxd) zzf.get(cls);
        if (zzfxd == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(zzfxc.zzd().getName())));
        } else if (zzfxd.zza().equals(zzfxc.zzd())) {
            return zzfxd.zzc(zzfxc);
        } else {
            String obj = zzfxd.zza().toString();
            String obj2 = zzfxc.zzd().toString();
            throw new GeneralSecurityException("Wrong input primitive class, expected " + obj + ", got " + obj2);
        }
    }

    static synchronized Map zzj() {
        Map unmodifiableMap;
        synchronized (zzfxk.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzg);
        }
        return unmodifiableMap;
    }

    public static synchronized void zzk(zzgau zzgau, zzgas zzgas, boolean z) throws GeneralSecurityException {
        Class zzd2;
        synchronized (zzfxk.class) {
            String zzc2 = zzgau.zzc();
            String zzc3 = zzgas.zzc();
            zzr(zzc2, zzgau.getClass(), zzgau.zza().zzc(), true);
            zzr(zzc3, zzgas.getClass(), Collections.emptyMap(), false);
            if (!zzc2.equals(zzc3)) {
                int zze2 = zzgas.zze();
                if (!zzfze.zza(1)) {
                    String valueOf = String.valueOf(zzgau.getClass());
                    throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
                } else if (zzfze.zza(zze2)) {
                    if (zzb.containsKey(zzc2) && (zzd2 = ((zzfxj) zzb.get(zzc2)).zzd()) != null) {
                        if (!zzd2.getName().equals(zzgas.getClass().getName())) {
                            Logger logger = zza;
                            Level level = Level.WARNING;
                            logger.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + zzc2 + " with inconsistent public key type " + zzc3);
                            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{zzgau.getClass().getName(), zzd2.getName(), zzgas.getClass().getName()}));
                        }
                    }
                    if (!zzb.containsKey(zzc2) || ((zzfxj) zzb.get(zzc2)).zzd() == null) {
                        zzb.put(zzc2, new zzfxh(zzgau, zzgas));
                        zzc.put(zzc2, new zzfxi(zzgau));
                        zzs(zzgau.zzc(), zzgau.zza().zzc());
                    }
                    zzd.put(zzc2, true);
                    if (!zzb.containsKey(zzc3)) {
                        zzb.put(zzc3, new zzfxg(zzgas));
                    }
                    zzd.put(zzc3, false);
                } else {
                    String valueOf2 = String.valueOf(zzgas.getClass());
                    throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
                }
            } else {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
        }
    }

    public static synchronized void zzm(zzgas zzgas, boolean z) throws GeneralSecurityException {
        synchronized (zzfxk.class) {
            String zzc2 = zzgas.zzc();
            zzr(zzc2, zzgas.getClass(), zzgas.zza().zzc(), true);
            if (zzfze.zza(zzgas.zze())) {
                if (!zzb.containsKey(zzc2)) {
                    zzb.put(zzc2, new zzfxg(zzgas));
                    zzc.put(zzc2, new zzfxi(zzgas));
                    zzs(zzc2, zzgas.zza().zzc());
                }
                zzd.put(zzc2, true);
            } else {
                String valueOf = String.valueOf(zzgas.getClass());
                throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
            }
        }
    }

    public static synchronized void zzn(zzfxd zzfxd) throws GeneralSecurityException {
        synchronized (zzfxk.class) {
            if (zzfxd != null) {
                Class zzb2 = zzfxd.zzb();
                if (zzf.containsKey(zzb2)) {
                    zzfxd zzfxd2 = (zzfxd) zzf.get(zzb2);
                    if (!zzfxd.getClass().getName().equals(zzfxd2.getClass().getName())) {
                        zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb2.toString()));
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{zzb2.getName(), zzfxd2.getClass().getName(), zzfxd.getClass().getName()}));
                    }
                }
                zzf.put(zzb2, zzfxd);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    private static zzfwo zzo(String str, Class cls) throws GeneralSecurityException {
        zzfxj zzp = zzp(str);
        if (zzp.zze().contains(cls)) {
            return zzp.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzp.zzc());
        Set<Class> zze2 = zzp.zze();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : zze2) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb2);
    }

    private static synchronized zzfxj zzp(String str) throws GeneralSecurityException {
        zzfxj zzfxj;
        synchronized (zzfxk.class) {
            if (zzb.containsKey(str)) {
                zzfxj = (zzfxj) zzb.get(str);
            } else {
                throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
            }
        }
        return zzfxj;
    }

    private static Object zzq(String str, zzgji zzgji, Class cls) throws GeneralSecurityException {
        return zzo(str, cls).zzd(zzgji);
    }

    private static synchronized void zzr(String str, Class cls, Map map, boolean z) throws GeneralSecurityException {
        synchronized (zzfxk.class) {
            zzfxj zzfxj = (zzfxj) zzb.get(str);
            if (zzfxj != null) {
                if (!zzfxj.zzc().equals(cls)) {
                    zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", "Attempted overwrite of a registered key manager for key type ".concat(str));
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, zzfxj.zzc().getName(), cls.getName()}));
                }
            }
            if (z) {
                if (zzd.containsKey(str)) {
                    if (!((Boolean) zzd.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                    }
                }
                if (zzb.containsKey(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!zzg.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (zzg.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, com.google.android.gms.internal.ads.zzgma] */
    private static void zzs(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzg.put((String) entry.getKey(), zzfwr.zze(str, ((zzgaq) entry.getValue()).zza.zzaw(), ((zzgaq) entry.getValue()).zzb));
        }
    }

    public static synchronized void zzl(zzfwo zzfwo, boolean z) throws GeneralSecurityException {
        synchronized (zzfxk.class) {
            if (zzfwo != null) {
                try {
                    if (zzfze.zza(1)) {
                        String zzf2 = zzfwo.zzf();
                        zzr(zzf2, zzfwo.getClass(), Collections.emptyMap(), z);
                        zzb.putIfAbsent(zzf2, new zzfxf(zzfwo));
                        zzd.put(zzf2, Boolean.valueOf(z));
                    } else {
                        throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }
}

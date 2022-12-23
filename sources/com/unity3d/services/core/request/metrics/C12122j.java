package com.unity3d.services.core.request.metrics;

import java.util.Map;

/* renamed from: com.unity3d.services.core.request.metrics.j */
/* compiled from: TSIMetric */
public class C12122j {
    /* renamed from: a */
    public static C12113d m33056a(Long l, Map<String, String> map) {
        return new C12113d("native_initialization_time_failure", l, map);
    }

    /* renamed from: b */
    public static C12113d m33060b(Long l, Map<String, String> map) {
        return new C12113d("native_initialization_time_success", l, map);
    }

    /* renamed from: c */
    public static C12113d m33062c() {
        return new C12113d("native_missing_game_session_id", (Object) null, (Map<String, String>) null);
    }

    /* renamed from: d */
    public static C12113d m33066d() {
        return new C12113d("native_missing_state_id", (Object) null, (Map<String, String>) null);
    }

    /* renamed from: e */
    public static C12113d m33070e() {
        return new C12113d("native_missing_token", (Object) null, (Map<String, String>) null);
    }

    /* renamed from: a */
    public static C12113d m33054a() {
        return new C12113d("native_emergency_switch_off", (Object) null, (Map<String, String>) null);
    }

    /* renamed from: b */
    public static C12113d m33058b() {
        return new C12113d("native_initialization_started", (Object) null, (Map<String, String>) null);
    }

    /* renamed from: c */
    public static C12113d m33064c(Long l, Map<String, String> map) {
        return new C12113d("native_token_availability_latency_config", l, map);
    }

    /* renamed from: d */
    public static C12113d m33068d(Long l, Map<String, String> map) {
        return new C12113d("native_token_availability_latency_webview", l, map);
    }

    /* renamed from: e */
    public static C12113d m33071e(Long l, Map<String, String> map) {
        return new C12113d("native_token_resolution_request_latency", l, map);
    }

    /* renamed from: a */
    public static C12113d m33055a(Long l) {
        return new C12113d("native_device_info_collection_latency", l, (Map<String, String>) null);
    }

    /* renamed from: b */
    public static C12113d m33059b(Long l) {
        return new C12113d("native_device_info_compression_latency", l, (Map<String, String>) null);
    }

    /* renamed from: c */
    public static C12113d m33063c(Long l) {
        return new C12113d("native_privacy_resolution_request_latency_failure", l, (Map<String, String>) null);
    }

    /* renamed from: d */
    public static C12113d m33067d(Long l) {
        return new C12113d("native_privacy_resolution_request_latency_success", l, (Map<String, String>) null);
    }

    /* renamed from: a */
    public static C12113d m33057a(Map<String, String> map) {
        return new C12113d("native_async_token_available", (Object) null, map);
    }

    /* renamed from: b */
    public static C12113d m33061b(Map<String, String> map) {
        return new C12113d("native_async_token_null", (Object) null, map);
    }

    /* renamed from: c */
    public static C12113d m33065c(Map<String, String> map) {
        return new C12113d("native_generated_token_available", (Object) null, map);
    }

    /* renamed from: d */
    public static C12113d m33069d(Map<String, String> map) {
        return new C12113d("native_generated_token_null", (Object) null, map);
    }
}

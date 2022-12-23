package kotlin.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;

@Target({ElementType.METHOD})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION})
@Metadata(mo72582d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, mo72583d2 = {"Lkotlin/internal/PlatformDependent;", "", "kotlin-stdlib"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
@Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
/* compiled from: InternalAnnotations.kt */
public @interface PlatformDependent {
}

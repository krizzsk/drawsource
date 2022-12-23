package kotlin.jvm;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@MustBeDocumented
@Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(AnnotationRetention.SOURCE)
@Documented
@java.lang.annotation.Target({ElementType.TYPE})
@Metadata(mo72582d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, mo72583d2 = {"Lkotlin/jvm/JvmRecord;", "", "kotlin-stdlib"}, mo72584k = 1, mo72585mv = {1, 7, 1}, mo72587xi = 48)
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
/* compiled from: JvmPlatformAnnotations.kt */
public @interface JvmRecord {
}

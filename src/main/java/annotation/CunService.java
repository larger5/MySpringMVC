package annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE}) // 作用类型：类
@Documented
@Retention(RetentionPolicy.RUNTIME) // 生命周期：运行时
public @interface CunService {
    String value() default "";
}

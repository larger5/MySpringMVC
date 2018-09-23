package annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE}) // 作用类型：方法、类
@Documented
@Retention(RetentionPolicy.RUNTIME) // 生命周期：运行时
public @interface CunRequestMapping {
    String value() default "";
}

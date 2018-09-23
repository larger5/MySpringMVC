package annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD}) // 作用类型：属性
@Documented
@Retention(RetentionPolicy.RUNTIME) // 生命周期：运行时
public @interface CunAutowired {
    String value() default "";
}

package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/*
* 注解的成员名字叫value时
* */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassName {
    /*
    * 成员名字叫value的时候
    *
    * */
    String value();
}

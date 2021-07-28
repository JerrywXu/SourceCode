package annotation;

import java.lang.annotation.*;

/*
* 自定义注解
*
* */
//@Target(value = {ElementType.FIELD,ElementType.TYPE})    //元注解用来限定注解的作用域
//@Documented    //标注注解的一个元注解   配合@Deprecated[生成帮助文档]
@Retention(RetentionPolicy.RUNTIME)   //元注解，设定当前注解的保留位置

public @interface MyAnnotation {

}


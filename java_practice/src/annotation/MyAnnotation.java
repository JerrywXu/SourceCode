package annotation;

import java.awt.*;
import java.lang.annotation.*;

/*
* 自定义注解
*
* */
//@Target(value = {ElementType.FIELD,ElementType.TYPE})    //元注解用来限定注解的作用域
//@Documented    //标注注解的一个元注解   配合@Deprecated[生成帮助文档]
@Retention(RetentionPolicy.RUNTIME)   //元注解，设定当前注解的保留位置

public @interface MyAnnotation {
    //基本数据类型
    byte b();
    short s();
    int i();
    long l();
    float f();
    double d();
    boolean flag();
    char c();
    //字符串类型
    String value();
    //Class类型
    Class clazz();
    //枚举类型
    Color col();

    //以上各种类型对应数组类型...



    int[] nums();

    String[] strs();

    Color[] colors();

    Class[] clazzs();


}
//枚举类型
enum Color{
    RED,BLACK
}


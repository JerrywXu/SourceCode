package java_basic;

import example.Cat;

import java.io.File;
import java.lang.reflect.Field;

/**
 * @author jerry
 * @Package java_basic
 * @date 2021/5/16 10:22
 */
public class AccessiblePrivate {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //创建Cat对象，name属性默认值为null
        Cat cat = new Cat();
        //访问对象的私有属性
        //第一步，获取class对象
        Class catClass = Cat.class;
        //第二步，获取私有属性name
        Field nameFile = catClass.getDeclaredField("name");
        //第三步。 设置私有属性可访问
        nameFile.setAccessible(true);//java给一个接口，打破封装
        nameFile.set(cat,"tom");

        //第四步，访问
        System.out.println("name=" + nameFile.get(cat));
    }
}

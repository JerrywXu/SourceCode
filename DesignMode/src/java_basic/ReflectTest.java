package java_basic;

import java.util.ResourceBundle;

/**反射机制的作用？（降低耦合，提高扩展）
 * 不需要修改程序的情况下可以完成对象的动态创建
 *
 * @author jerry
 * @Package Java
 * @date 2021/5/15 10:37
 */
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //读取属性文件，获取全限类名
        String path = "resources/bean";
        ResourceBundle bundle = ResourceBundle
                .getBundle(path);
        String ClassName = bundle.getString("className");

        //通过反射机制创建对象
        Class clazz = Class.forName(ClassName);
        Object obj = clazz.newInstance();

        //输出
        System.out.println(obj);

    }
}

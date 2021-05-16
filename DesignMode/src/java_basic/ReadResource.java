package java_basic;

import java.util.ResourceBundle;

/**
 * @author jerry
 * @Package Java
 * @date 2021/5/15 10:25
 */
public class ReadResource {
    public static void main(String[] args) {
        //进行资源绑定,只能读取属性文件（.properties），别的不可以
        String path = "resources/datasource";
        ResourceBundle bundle = ResourceBundle
                .getBundle(path);
        //通过Key去获取value
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String username = bundle.getString("username");
        String password = bundle.getString("password");

        System.out.println(driver);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);


    }
}

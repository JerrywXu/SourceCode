package java8_Special;

import java.util.function.Supplier;

/**
 * Lambda表达式之实例方法的引用
 * @author jerry
 * @Package java8_Special
 * @date 2021/6/12 13:16
 */
public class java8Lambda5 {
    public static void main(String[] args) {
        User user = new User("admin");

        //匿名内部类
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return user.getName();
            }
        };

        //Lambda表达式
        Supplier<String> supplier1 = () -> user.getName();

        //实例化方法引用简化Lambda表达式
        Supplier<String> supplier2 = user::getName;
        System.out.println(supplier.get());

    }
}
class User{
    private String name;
    public User(){

    }
    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

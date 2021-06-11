package java8_Special;

import java.util.Date;
import java.util.function.Supplier;

/**
 * 方法引用之构造方法引用
 * @author jerry
 * @Package java8_Special
 * @date 2021/6/11 22:44
 */
public class java8Lamdda6 {
    public static void main(String[] args) {
        //匿名内部类
        Supplier<Date> supplier = new Supplier<Date>() {
            @Override
            public Date get() {
                return new Date();
            }
        };

        //Lambda表达式
        Supplier<Date> supplier1 = () -> new Date();

        //构造方法引用
        Supplier<Date> supplier2 = Date::new;

        System.out.println(supplier2.get());
    }
}

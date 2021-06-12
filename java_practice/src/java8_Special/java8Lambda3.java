package java8_Special;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Lambda表达式遍历集合
 * @author jerry
 * @Package java8_Special
 * @date 2021/6/11 23:00
 */
public class java8Lambda3 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<>();

        // 向集合中添加元素
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");

        //遍历集合、匿名内部类
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //使用Lambda表达式
        list.forEach((s) -> System.out.println(s));

    }
}

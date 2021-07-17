package java8_Special;

import java.util.ArrayList;
import java.util.List;

/**
 * java7新特性之自动类型推导
 * @author jerry
 * @Package java8_Special
 * @date 2021/7/17 19:41
 */
public class DiamondTest_java7 {
    public static void main(String[] args) {
        //java7之前
        List<String> list1 = new ArrayList<String>();

        //java7之后
        List<String> list2 = new ArrayList<>();  //可以省略后面这个数据类型

        list2.add("zhangsan");
        list2.add("lisi");
        list2.add("wangwu");

        list2.forEach((s) -> System.out.println(s.charAt(0)));

    }
}

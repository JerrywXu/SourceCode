package java8_Special;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 方法的引用之静态方法的引用、对象方法的引用
 * @author jerry
 * @Package java8_Special
 * @date 2021/6/12 9:12
 */
public class java8Lambda4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20,30,15,18,19);

        //之前，使用匿名内部类
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        });

        //Lambda表达式
        //list.sort((x,y) -> Integer.compare(x,y));//参数一定要对应上
        list.sort((x,y) -> x.compareTo(y));//对象方法的引用(需要满足调用要求)

        //静态方法引用代替以上Lambda表达式(一种更简介的做法，但是需要满足一定的格式)
        list.sort(Integer::compare);

        //对象方法的引用，代替以上的Lambda表达式
        list.sort(Integer::compareTo);

        System.out.println(list);

    }
}

package java8_Special;

/**
 * @author jerry
 * @Package java8_Special
 * @date 2021/6/10 14:49
 * java8新特性Lamdba表达式
 */
public class java8Lambda2 {
    public static void main(String[] args) {
        //Lambda表达式完整写法
        MathUtil mathUtil = (int a,int b) -> {
            return a+b;
        };

        //当方法体中只有一条java语句
        //大括号可以省略，return 语句也可以省略
        MathUtil mathUtil2 = (int a,int b) -> a + b;

        //Lambda表达式可以进行自动类型推断
        //故形参额数据类型也是可以省略的
        MathUtil mathUtil3 = (a,b) -> a + b;

        System.out.println(mathUtil3.sum(100,200));
    }
}
//@FunctionalInterface  标注检查是否符合函数式接口，可以在编译时做检查 一个接口中只有一个方法（这时才可以使用Lambda表达式）
interface MathUtil{
    int sum(int a,int b);
}

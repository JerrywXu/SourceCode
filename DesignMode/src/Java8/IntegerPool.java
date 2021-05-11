package Java8;

/**
 * @author jerry
 * @Package Java8
 * @date 2021/5/10 21:44
 */
public class IntegerPool {
    public static void main(String[] args) {
        Integer a=127;
        Integer b=127;//引用，没有超过整数型常量池范围
        System.out.println(a==b);

        Integer x=128;
        Integer y=128;//新建
        System.out.println(x==y);
    }

}

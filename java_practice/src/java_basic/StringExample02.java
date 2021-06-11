package java_basic;

/** String 中 intern方法主要是解决堆内存的开销，如果常量池中有该字符串则直接返回该字符串的引用
 * 如果没有将该字符串加入到该常量池中，然后返回引用
 * @author jerry
 * @Package Java8
 * @date 2021/5/11 20:59
 */
public class StringExample02 {
    public static void main(String[] args) {
        String a="abcdef";

        String x = "abc";
        String y = "def";
        //String b = x + y;
        String b = (x + y).intern();//主要还是解决堆内存的开销
        System.out.println(a == b);
    }
}

package java_basic;

/**
 * @author jerry
 * @Package Java8
 * @date 2021/5/11 20:51
 */
public class StringExample01 {
    public static void main(String[] args) {
        String x = "abc" + "def";//优化 会在编译阶段进行拼接 两个对象为同一对象
        String y = "abcdef";
        System.out.println(x == y);

        String a = "abc";
        String b = "def";
        String c = a + b;
        String e = "abcdef";//new了一个stringbuilder对象，故不是同一个对象。
        System.out.println(c == e);
        //substring 同理截取全部是当前对象，截取部分则会new一个stringbuilder导致不是同一个对象
    }
}

package java8_Special;

/**
 * 字符串连接 + 与 concat方法的区别
 * 1.性能方面
 * 2.+可以拼接任何类型，concat只能拼接字符串类型
 * 3.+拼接null不会出现异常，concat拼接的参数是null的时候会出现空指针异常
 * @author jerry
 * @Package java8_Special
 * @date 2021/7/20 20:50
 */
public class ConcatTest {
    public static void main(String[] args) {
        //+ 可以拼接任何类型
        //concat 只能拼接字符串
        System.out.println("abc"+"def");
        System.out.println("abc"+100);

        System.out.println("abc".concat("def"));
        //System.out.println("abc".concat(100)); concat参数只能是字符串不能是其他类型

        //concat拼接字符串的参数是null时会出现空指针异常
        //+ 拼接null时不会出现空指针异常
        System.out.println("abc"+null);

        String s1 = "a";
        String str1 = "";
        String str2 = "";
        /*
        * 计算concat所用时间
        * */
        long str1Start = System.currentTimeMillis();
        for (int i = 0; i<10000; i++){
            str1 = str1.concat(s1);
        }
        long str1End = System.currentTimeMillis();
        System.out.println("concat的计算时间为：" +(str1End-str1Start));

        /*
        * 计算+所用时间
        * */
        long str2Start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            str2 = str2 + s1;
        }
        long str2End = System.currentTimeMillis();
        System.out.println("+计算时间为"+(str2End-str2Start));




    }
}

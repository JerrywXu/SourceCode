package java8_Special;

import java.time.LocalTime;

/**
 * LocalTime类的使用
 * @author jerry
 * @Package java8_Special
 * @date 2021/7/18 19:43
 */
public class java8Date2 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        System.out.println("时："+ localTime.getHour());
        System.out.println("分："+ localTime.getMinute());
        System.out.println("秒："+ localTime.getSecond());
        System.out.println("纳秒："+ localTime.getNano());

        System.out.println("1纳秒前："+localTime.minusNanos(1));
        System.out.println("1纳秒后："+localTime.plusNanos(1));

        System.out.println("1小时前："+localTime.minusHours(1));
        System.out.println("1小时后："+localTime.plusHours(1));

        System.out.println("1分钟前：" +localTime.minusMinutes(1));
        System.out.println("1分钟后：" +localTime.plusMinutes(1));
    }
}

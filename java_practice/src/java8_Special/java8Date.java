package java8_Special;

import java.time.LocalDate;

/**
 * java中localDate类的使用
 * @author jerry
 * @Package java8_Special
 * @date 2021/7/18 19:15
 */
public class java8Date {
    public static void main(String[] args) {
        //获取日期
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);
        //获取年
        System.out.println("年，"+localDate.getYear());
        //获取月
        System.out.println("月，"+localDate.getMonth());
        //获取日
        System.out.println("日，"+localDate.getDayOfMonth());
        //获取星期几
        System.out.println("星期几，"+localDate.getDayOfWeek());
        //获取一年中的第几天
        System.out.println("一年中的第，"+localDate.getDayOfYear()+"天");


        System.out.println("一天之后的星期，"+localDate.plusDays(1));
        System.out.println("一个月之后的日期，"+localDate.plusMonths(1));
        System.out.println("一天之前的星期，"+localDate.minusDays(1));
        System.out.println("一个月之前的日期，"+localDate.minusMonths(1));



    }
}

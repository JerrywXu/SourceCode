package java8_Special;

import java.time.LocalDateTime;

/**
 * @author jerry
 * @Package java8_Special
 * @date 2021/7/18 20:02
 */
public class java8Date3 {
    public static void main(String[] args) {
        //获取系统当前时间
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println("年："+ localDateTime.getYear());
        System.out.println("月："+ localDateTime.getMonth());
        System.out.println("日："+ localDateTime.getDayOfMonth());
        System.out.println("周几："+ localDateTime.getDayOfWeek());
        System.out.println("一年中的第几天"+ localDateTime.getDayOfYear());
        System.out.println("时："+ localDateTime.getHour());
        System.out.println("分："+ localDateTime.getMinute());
        System.out.println("秒："+ localDateTime.getSecond());
        System.out.println("纳秒："+ localDateTime.getNano());
        System.out.println("一天前："+ localDateTime.minusDays(1));
        System.out.println("一天后："+ localDateTime.plusDays(1));

        
    }
}

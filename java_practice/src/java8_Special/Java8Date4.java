package java8_Special;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * java8的日期格式化（线程安全）
 * LocalDate -> String
 * LocalTime -> String
 * LocalDateTime -> String
 *
 *
 * @author jerry
 * @Package java8_Special
 * @date 2021/7/19 21:10
 */
public class Java8Date4 {
    public static void main(String[] args) {
        //创建日期时间格式器
        DateTimeFormatter formatter1 = DateTimeFormatter
                .ofPattern("yyyy-MM-dd HH:mm:ss");
        //获取系统时间
        LocalDateTime localDateTime = LocalDateTime.now();
        //格式化
        String localDateTimeStr = localDateTime.format(formatter1);
        System.out.println(localDateTimeStr);


        //创建日期时间格式器
        DateTimeFormatter formatter2 = DateTimeFormatter
                .ofPattern("yyyy/MM/dd");
        //获取系统日期
        LocalDate localDate = LocalDate.now();
        //格式化
        String localDateStr = localDate.format(formatter2);
        System.out.println(localDateStr);


        //创建日期时间格式器
        DateTimeFormatter formatter3 = DateTimeFormatter
                .ofPattern("HH:mm:ss SSS");
        //获取系统时间
        LocalTime localTime = LocalTime.now();
        //格式化
        String localTimeStr = localTime.format(formatter3);
        System.out.println(localTimeStr);






    }
}

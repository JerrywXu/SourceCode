package java8_Special;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * java8日期格式化
 * String -> LocalDateTime
 * @author jerry
 * @Package java8_Special
 * @date 2021/7/19 22:05
 */
public class java8Date5 {
    public static void main(String[] args) {
        //日期格式器对象
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("yyyy-MM-dd HH:mm:ss");

        //调用LocalDateTime的parse方法
        LocalDateTime localDateTime = LocalDateTime
                .parse("2021-02-09 20:10:25",formatter);
        System.out.println(localDateTime);
    }
}

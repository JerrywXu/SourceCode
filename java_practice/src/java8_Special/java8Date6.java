package java8_Special;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 获取带有时区的时间
 * @author jerry
 * @Package java8_Special
 * @date 2021/7/19 22:14
 */
public class java8Date6 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("America/Chicago"));

        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);

    }
}

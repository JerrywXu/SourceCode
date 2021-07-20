package java8_Special;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 给localDateTime添加时区
 * @author jerry
 * @Package java8_Special
 * @date 2021/7/20 20:35
 */
public class LocalDateTimeAddZone {
    public static void main(String[] args) {

        //LocalDateTime对象
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("未添加时区："+ localDateTime);

        //将localDateTime添加时区，转换为ZoneDateTime
        ZonedDateTime zonedDateTime = localDateTime
                .atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);
    }

}

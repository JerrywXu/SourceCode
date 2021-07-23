package java8_Special;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * 获取时间差，Java8日期API中的一员
 * @author jerry
 * @Package java8_Special
 * @date 2021/7/22 20:33
 */
public class DurationTest {
    public static void main(String[] args) {
        //获取指定的时间
        LocalDateTime startTime = LocalDateTime.parse("2020-02-23T12:10:20");

        //获取系统当前时间
        LocalDateTime endTime = LocalDateTime.now();

        //获取时间间隔对象
        Duration duration = Duration.between(startTime,endTime);

        System.out.println("相隔天数"+ duration.toDays());
        System.out.println("相隔小时数"+ duration.toHours());
        System.out.println("相隔分钟数"+ duration.getSeconds());
        System.out.println("相隔秒数"+ duration.getSeconds());
        System.out.println("相隔秒数"+ duration.toMillis());
    }
}

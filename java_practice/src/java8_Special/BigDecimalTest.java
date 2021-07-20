package java8_Special;

import java.math.BigDecimal;

/**
 * Bigcimal类，高精度数据，适用于财务软件
 * （double类型的精度不够）
 * @author jerry
 * @Package java8_Special
 * @date 2021/7/20 21:12
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        //创建一个精度较高的对象
        BigDecimal v1 = new BigDecimal(100);
        BigDecimal v2 = new BigDecimal(200);

        BigDecimal v3 = v1.add(v2);
        System.out.println(v3);

        BigDecimal v4 = v1.multiply(v2);
        System.out.println(v4);

    }
}

package annotation;

import javax.xml.crypto.Data;

/**
 * @author jerry
 * @Package annotation
 * @date 2021/8/2 21:28
 */
public class Order {
    //@ClassName(value = "java.util.Data")
    @ClassName("java.util.Data")   //只有value可以省略不写

    Data time;
}

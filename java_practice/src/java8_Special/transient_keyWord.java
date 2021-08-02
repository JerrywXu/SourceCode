package java8_Special;

import java.io.Serializable;

/**
 * @author jerry
 * @Package java8_Special
 * @date 2021/7/22 21:37
 */
public class transient_keyWord {
    public static void main(String[] args) {

    }
    public class Product implements Serializable{
        private transient String name;   //transient表示该字段不参与序列化操作
    }
}

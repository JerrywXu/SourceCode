package java8_Special;

/**
 * @author jerry
 * @Package java8_Special
 * @date 2021/7/21 22:40
 */
public class ArrayListCapacity {
    public static void main(String[] args) {
        //jdk1.8 arrayList扩容策略
        /*
        * 初始化容量为0
        * 第一次扩容容量为10
        * 以后每次扩容为之前的 1.5 倍
        *
        * jdk 1.7扩容策略
        *在jdk1.7中创建ArrayList对象时，不管是调用无参构造器还是带参构造器，
        * 在底层都会创建一个固定长度的数组。如果是调用的无参构造器便会创建一个长度为10的Object[]数组elementData。
        * 如果是调用的带参构造器，便会根据我们传入的参数创建一个固定长度的数组。
        * */
        ArrayListCapacity a1=new ArrayListCapacity();
    }
}

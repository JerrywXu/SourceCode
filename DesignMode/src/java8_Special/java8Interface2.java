package java8_Special;

/**
 * @author jerry
 * @Package java8_Special
 * @date 2021/6/10 13:38
 * java8接口新特性：接口中允许定义静态方法
 */
public class java8Interface2 {
    public static void main(String[] args) {
//        Pen.dosome();
//        Pen pen= new Pen();
//        pen.dosome();
//        MyInterface.dosome();
        Writeable.dosome();//只能使用本接口来调用，为了增加接口的灵活性，静态方法也不需要new对象来调用
    }
}

interface Writeable{
    void write();
    static void dosome(){
        System.out.println("do some!!!");//接口中事务静态方法必须有方法体
    }
}
class Pen implements Writeable{
    @Override
    public void write() {

    }
}
interface MyInterface extends Writeable{

}

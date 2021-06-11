package example;

/**
 * @author jerry
 * @Package Example
 * @date 2021/5/11 16:50
 */
public class test4 {
    public static void main(String[] args) {
        //接口的继承是为了控制细粒度，同样的方法，默认调用子类，与类的继承不同，
        //类的继承是先调用父类再调用子类
        test4Overloaded test= new test4Overloaded();
        test.print(test);
    }

    interface A{
        default void print(String some){
            System.out.println("String version print from A");
        }
        default void print(Object some){
            System.out.println("Object version print from A");
        }
        default void print(int some){
            System.out.println("Object version print from int");
        }
    }

    interface B extends A{
        default void print(String some){
            System.out.println("String version print from B");
        }
        default void print(Object some){
            System.out.println("Object version print from B");
        }
    }

    static class test4Overloaded implements A,B{

    }
}

package Example;

/**
 * @author jerry
 * @Package Example
 * @date 2021/5/11 16:42
 */
public class test3 {
    public static void main(String[] args) {
        new ClasssB();//执行顺序：1.A,B静态代码块   2.A代码块，构造方法 3.B代码块，B构造方法
    }
    public static class ClassA{
        public ClassA(){
            System.out.println("A constructor");
        }
        static {
            System.out.println("A static block");
        }
        {
            System.out.println("A code block");
        }
    }
    public static class ClasssB extends ClassA{
        public ClasssB(){
            super();//默认添加，不写无影响
            System.out.println("B constructor");
        }
        static {
            System.out.println("B static block");
        }
        {
            System.out.println("B code block");
        }
    }
}

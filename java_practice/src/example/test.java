package example;

/**
 * @author jerry
 * @Package Example
 * @date 2021/5/10 21:53
 */
public class test {
    static {
        System.out.print("J");
    }
    public static class A{
        {
            System.out.print("A");
        }
    }
    public static class B extends A{
        static {
            System.out.print("B");
        }
        public void print(){
            System.out.print("PB");
        }
    }
    public static class C extends B{

        public void print() {
            System.out.print("PC");
        }
    }

    public static void main(String[] args) {
        new C().print();
    }

}

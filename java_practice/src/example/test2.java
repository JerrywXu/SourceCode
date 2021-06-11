package example;

/**
 * @author jerry
 * @Package Example
 * @date 2021/5/11 16:37
 */
public class test2 {
    private static int x=100;

    public static void main(String[] args) {
        test2 t2=new test2();
        t2.x++;
        test2 t3=new test2();
        t3.x++;
        t2=new test2();
        t2.x++;
        test2.x--;
        System.out.print("x="+x);
    }
}

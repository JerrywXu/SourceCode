package Java8;

/**实现线程的第二种方式
 * 编写一个类实现runnable接口，并实现run方法
 * @author jerry
 * @Package Java8
 * @date 2021/5/11 21:12
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        //创建一个可运行的对象
        // MyRunnable r = new MyRunnable();
        //创建线程对象
        //Thread t = new Thread(r);
        Thread t = new Thread(new MyRunnable());
        t.start();

    }
}
//定义一个类实现runnable接口，并实现run方法
//MyRunnable这个类严格意义上并不是一个线程类，是一个可运行的类
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println(i);
        }
    }
}

package java_basic;

/**实现线程的第一种方式
 * 直接编写一个类继承thread
 *
 * @author jerry
 * @Package Java8
 * @date 2021/5/11 21:07
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        //创建线程对象
        Thread t = new MyThread();
        //给线程一个名字
        t.setName("t");
        //启动线程
        t.start();
    }
}
class MyThread extends Thread{  //线程存储在栈中
    //重写run方法
    public void run(){
        for (int i = 0; i < 100; i++){
            System.out.println("i=" + i);
        }
    }
}

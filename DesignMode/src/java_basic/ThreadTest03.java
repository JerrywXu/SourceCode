package java_basic;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**实现线程的第三种方式
 *          实现JUC工具包下的Callable接口，实现call方法
 *          使用FutureTask进行包装
 *          这种方式可以获取线程的返回值
 * @author jerry
 * @Package Java8
 * @date 2021/5/11 21:18
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        FutureTask futureTask=new FutureTask(new MyCallable());
        Thread t=new Thread(futureTask);
        t.start();
        try {
            Object obj = futureTask.get();
            System.out.println("主线程："+obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
class MyCallable implements Callable{
    @Override
    public Object call() throws Exception {
       for (int i = 0; i < 10; i++){
           System.out.println(i);
           Thread.sleep(500);
       }
       Object obj=new Object();
       return obj;
    }
}

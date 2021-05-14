package Java8;

/**
 * @author jerry
 * @Package Java8
 * @date 2021/5/14 14:03
 *
 * 1.System.out标准输出流
 *      不是直接输出，会将输出的信息缓存起来（缓存多少不一定）
 *      然后输出
 * 2. System.err标准错误输出流
 *      首先，只要执行立即输出，不会缓存输出信息
 *      适合在调试程序的过程中输出错误信息
 *      错误出现时可以做到立即提醒
 */
public class Systemerr {
    public static void main(String[] args) {
        //标准输出流
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        //标准错误输出流
        System.err.println(5);
    }
}

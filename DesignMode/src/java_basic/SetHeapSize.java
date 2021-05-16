package java_basic;

import java.util.HashSet;
import java.util.Set;

/**
 * 设置jvm内存堆的大小
 * VMoption中设置JVM堆内存空间
 * -Xmx2m -Xms2m   //设置堆内存的最大值最小值
 * -XX:-UseGCOverheadLimit //不启用垃圾回收
 * @author jerry
 * @Package java_basic
 * @date 2021/5/16 10:37
 */
public class SetHeapSize {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();
        int i = 0;
        while (true){
            set.add(new Object());
            System.out.println(i++);
        }
    }
}

package java_basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * map集合两种遍历方式性能对比
 *
 * @author jerry
 * @Package Java8
 * @date 2021/5/11 20:10
 */
public class MapIteration {
    public static void main(String[] args) {
        //随机数生成器
        Random r = new Random();
        //创建map集合
        Map<Integer, Integer> map = new HashMap<>();
        //给hashmap放十万个键值对
        for (int i = 0; i < 1000000; i++) {
            map.put(i, r.nextInt());
        }

        //第一种方式遍历集合
        long begin = System.currentTimeMillis();
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            Integer value = map.get(key);
        }
        long end = System.currentTimeMillis();
        System.out.println("第一种遍历方式" + (end - begin));


        //第二种方式遍历集合
        begin = System.currentTimeMillis();
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
        }
        end = System.currentTimeMillis();
        System.out.println("第二种遍历方式" + (end - begin));
    }
}

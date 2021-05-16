package java_basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author jerry
 * @Package Java8
 * @date 2021/5/14 13:36
 * 关闭处理流的时候不需要关闭节点流【close()源码，节点流已经被关闭了】
 */
public class IOClose {
    public static void main(String[] args) {
        FileReader reader = null;
        BufferedReader br = null;

        try {
            //节点流
            reader = new FileReader("D:/myfile");
            //处理流
            br = new BufferedReader(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

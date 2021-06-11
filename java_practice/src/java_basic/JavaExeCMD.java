package java_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * @author jerry
 * @Package java_basic
 * @date 2021/5/15 10:56
 */
public class JavaExeCMD {
    public static void main(String[] args) throws IOException {
        //获取运行时对象
        Runtime runtime =Runtime.getRuntime();
        //!!!获取一个可以执行DOS命令的进程对象
        Process process = runtime.exec
                ("cmd.exe /c ping www.baidu.com");
        //获取输入流，读取命令执行结果
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        process.getInputStream(),
                        Charset.forName("GBK")));
        String readLine = null;
        while ((readLine = reader.readLine()) != null){
            System.out.println(readLine);
        }
        reader.close();
    }
}

package Java8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * java创建压缩文件
 * @author jerry
 * @Package Java8
 * @date 2021/5/14 13:43
 */
public class ZipFile {
    public static void main(String[] args) throws IOException {
        //第一步 创建Zip输出流
        FileOutputStream fileout =
                new FileOutputStream("E:\\zipfile\\text.zip");
        ZipOutputStream zipOut = new ZipOutputStream(fileout);
        //第二步 创建ZipEntry对象
        ZipEntry zipEntry = new ZipEntry("my.text");
        //第三步 将ZipEntry将对象添加到Zip输出流中
        zipOut.putNextEntry(zipEntry);
        //第四步 向my.txt文件中写入数据
        zipOut.write("大家好".getBytes());
        zipOut.closeEntry();
        zipOut.close();
    }
}

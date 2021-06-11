package java8_Special;

import java.io.FileInputStream;

/**
 * @author jerry
 * @Package java8_Special
 * @date 2021/6/10 13:45
 * java7新特性 资源的自动释放
 */
public class java7AutoRelease {
    public static void main(String[] args) {
        //java7之前的写法
        FileInputStream in = null;
        try{
            in = new FileInputStream("d:/test.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //手动释放资源
            if(in !=null){
                try{
                    in.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        //java7之后的写法
        try(FileInputStream in2 = new FileInputStream("d:/test.txt")){ //小括号内是被自动管理的资源，省略手动释放这一步骤

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

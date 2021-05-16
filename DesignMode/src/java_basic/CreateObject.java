package java_basic;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 创建对象的四种方式
 * @author jerry
 * @Package Java8
 * @date 2021/5/14 14:11
 */
public class CreateObject {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, ClassNotFoundException, CloneNotSupportedException {
        //第一种 直接new
        Student s1=new Student("zhangsan");
        System.out.println("第一种:"+s1);

        //第二种 反射机制调用构造方法
        //获取字节码
        Class<Student> studentClass = Student.class;
        //获取构造方法
        Constructor con;
        con = studentClass.getDeclaredConstructor(String.class);
        //调用构造方法创建对象
        Object obj = con.newInstance("lisi");
        System.out.println("第二种:"+obj);

        //第三种 调用clone方法进行对象克隆,需要实现克隆接口，重写克隆方法
        Object obj2;
        obj2 = s1.clone();
        System.out.println("第三种:"+obj2);

        //第四种 通过反序列化(IO流的方式)
        //序列化
        ObjectOutputStream out = new ObjectOutputStream
                (new FileOutputStream("studentfile"));
        Student s2 = new Student("wangwu");
        out.writeObject(s2);
        out.flush();//强制将缓冲区数据清空（都读到内存中）
        out.close();//然后关闭
        //反序列化
        ObjectInputStream in = new ObjectInputStream
                (new FileInputStream("studentfile"));
        Object obj3 = in.readObject();
        System.out.println("第四种:"+obj3);
    }


    //学生类
    public static class Student implements Cloneable, Serializable {
        String name;
        int age;
        public  Student(String name){
            this.name=name;
        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}

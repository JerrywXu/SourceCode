package java_basic;

/**
 * 获取class的三种方式
 * https://www.cnblogs.com/personsiglewine/p/12582385.html(详情见博客)
 *（1）类名.class：JVM将使用类装载器，将类装入内存(前提是:类还没有装入内存)，不做类的初始化工作，返回Class的对象。
 *（2）Class.forName(“类名字符串”)：装入类，并做类的静态初始化，返回Class的对象。
 *（3）实例对象.getClass()：对类进行静态初始化、非静态初始化；返回引用运行时真正所指的对象(子对象的引用会赋给父对象的引用变量中)所属的类的Class的对象。
 * @author jerry
 * @Package Java8
 * @date 2021/5/15 10:08
 */
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        //第一种方式 Class.forName("全限定类名")
        Class c1 = Class.forName
                ("CreateObject.Student");

        //第二种方式 .class 属性
        Class c2 = CreateObject.Student.class;

        //第三种方式 调用引用的getClass()方法
        CreateObject.Student stu = new CreateObject.Student("jack");
        Class c3 = stu.getClass();
    }
}

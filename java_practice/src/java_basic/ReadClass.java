package java_basic;

/**类的字节码分析
 * @author jerry
 * @Package Java8
 * @date 2021/5/11 20:34
 * javap -c D:\LocalRepositories\OriginRepositories\SourceCode\DesignMode\out\production\DesignMode\Java8\ReadClass.class
 * 在out文件下的class文件，查看字节码的编译
 */
public class ReadClass {
    public static void main(String[] args) {
        int x = 10;
        int y = x;
        y++;
        System.out.println(x);
    }
}
/**字节码文件执行过程
 *public class Java8.ReadClass {
 *   public Java8.ReadClass();
 *     Code:
 *        0: aload_0
 *        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 *        4: return
 *
 *   public static void main(java.lang.String[]); //vmstacak中main方法栈帧中有局部变量和操作数栈帧
 *     Code:
 *        0: bipush          //将10加入到操作数栈中
 *        2: istore_1        //将10存x中
 *        3: iload_1         //x变量中的数加载到操作数栈中
 *        4: istore_2        //将10存y中
 *        5: iinc          2, 1
 *        8: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
 *       11: iload_1
 *       12: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
 *       15: return
 * }
 *
 * */

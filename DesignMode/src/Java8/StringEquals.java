package Java8;

/**
 * @author jerry
 * @Package Java8
 * @date 2021/5/14 13:18
 */
public class StringEquals {
    public static void main(String[] args) {
        //String username = "jackson";
        String username= null;
        //第一种写法存在空指针异常隐患
        //System.out.println(username.equals("admin"));
        //第二种写法推荐
        System.out.println("admin".equals(username));//建议常量写在前面，不要把变量写在前面，容易引发空指针异常

        //equals方法源码分析
        String s1 =new String("hello");
        String s2 =new String("hello");
        s1.equals(s2);

/*
* public boolean equals(Object anObject) { //anObject为s2
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof String) {
            String anotherString = (String)anObject;
            int n = value.length;   //value指的是s1
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
*
*
* */
    }
}

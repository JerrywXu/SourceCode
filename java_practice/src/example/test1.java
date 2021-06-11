package example;

/**
 * @author jerry
 * @Package Example
 * @date 2021/5/11 10:00
 */
   class A{
        static {
            System.out.print("1");
        }
        public A(){
          System.out.print("a");
        }
    }
    class B extends A{
        static {
            System.out.print("2");
        }
        public B(){
            System.out.print("b");
        }

        public static void main(String[] args) {
            A a=new B();   //子类方法默认有一个supper调用父类中被子类隐藏的方法
            a=new B();     //静态代码块只执行一次
        }
    }




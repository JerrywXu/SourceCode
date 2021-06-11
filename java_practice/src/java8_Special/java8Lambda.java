package java8_Special;

/**
 * @author jerry
 * @Package java8_Special
 * @date 2021/6/10 14:01
 */
public class java8Lambda {
    public static void main(String[] args) {
        //最原始的方式
        SystemService systemService = new SystemServiceImpl();//这种是可以的，声明变量被绑定在一个以此接口实现的对象
        systemService.logout();

        //匿名内部类的方式
        SystemService systemService2 = new SystemService() {
            @Override
            public void logout() {
                System.out.println("系统已经安全退出——匿名内部类的方式");
            }
        };
        systemService2.logout();

        //Lambda表达式简化匿名内部类（！！！接口中只能有一个方法，如果有多个方法，则无法使用Lambda表达式）
        SystemService systemService3 = () ->{   //代表接口中的方法的参数列表，有参数则传递参数
            System.out.println("系统已经安全退出——Lambda表达式的方式");
        };
        systemService3.logout();

    }
}

interface SystemService{
    void logout();
    //boolean login(String username,String password);
}
class SystemServiceImpl implements SystemService{

    @Override
    public void logout() {
        System.out.println("系统已经安全退出");
    }
}
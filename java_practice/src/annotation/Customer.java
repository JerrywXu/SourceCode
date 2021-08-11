package annotation;

/**
 * @author jerry
 * @Package annotation
 * @date 2021/7/23 22:50
 */
//出现在类上
    //@MyAnnotation
public class Customer {
    //出现在实例变量上
    //@MyAnnotation
    private String id;

    //出现在构造方法上
    //@MyAnnotation
    public Customer(String id){
        this.id = id;
    }

    //出现在方法上
   // @MyAnnotation
    public String getId(){
        return id;
    }

    //出现在形式参数上
   /* public void setId(@MyAnnotation String id){
        this.id = id;
    }*/

    public String toString(){
        //出现在局部变量上
        //@MyAnnotation
        String name = "jack";
        return name;
    }









}

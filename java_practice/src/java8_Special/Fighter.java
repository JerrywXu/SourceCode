package java8_Special;
/*
* java8 接口默认新特性的方法
*
* */
public interface Fighter {
    void fly();
    default void eat(){//java8新特性，不用全部实现，想重写的时候重写就好

     }
}
class CatFly implements Fighter{
    @Override
    public void eat() {//可以选择性的重写

    }

    @Override
    public void fly() {

    }
}
class Aircraft implements Fighter{

    @Override
    public void fly() {

    }
}

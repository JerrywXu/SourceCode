package java8_Special;

/**
 * @author jerry
 * @Package java8_Special
 * @date 2021/6/11 23:28
 */
abstract class Bird {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract int fly();
}
class Test {
    public void test(Bird bird){
        System.out.println(bird.getName() + "能够飞 " + bird.fly() + "米");
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.test(new Bird() {
            public int fly() {
                return 10000;
            }
            public String getName() {
                return "大雁";
            }
        });
    }
}
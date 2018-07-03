package user.Java和Kotlin情景比较.demo1;

/**
 * 主函数中调用类中的方法.
 *
 * @author YC
 * Created by 2018/6/21 9:41.
 */
public class Example {

    public static void main(String[] args) {
        Example example = new Example();
        example.sayHello();
    }

    public void sayHello() {
        System.out.println("Hello, World!");
    }
}

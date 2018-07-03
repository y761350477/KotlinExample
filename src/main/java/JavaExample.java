import org.junit.jupiter.api.Test;

public class JavaExample {

    /**
     * java中调用kotlin代码
     * 特点:
     * 1. 非is打头的属性名称,获取时/设值时,需要属性名添加getter/setter前缀.
     * 2. is打头的属性名称,获取时通过不添加任何前缀.而setter名称中的is会被替换成set.
     *
     * @author YC
     * Created by 2018/5/30 13:37.
     */
    @Test
    void test1() {
        PersonKt personKt = new PersonKt("Bob", true);
        System.out.println(personKt.getName());
        System.out.println(personKt.isMarried());
        // java中设值需要写在方法中.
        personKt.setMarried(false);
    }
}

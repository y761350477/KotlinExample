package 枚举类型的使用.test1;

/**
 * 枚举类型的测试
 *
 * @author YC
 * Created by 2018-07-14 19:35
 */
public class ExampleTest {

    public static void main(String[] args) {
        for (Parameter parameter : Parameter.values()) {
            String code = parameter.getCode();
            Integer index = parameter.getIndex();
            int ordinal = parameter.ordinal();
            System.out.println(code);
            System.out.println(index);
            System.out.println("下标" + ordinal);
        }

    }
}

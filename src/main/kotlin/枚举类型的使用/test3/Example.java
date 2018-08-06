package 枚举类型的使用.test3;

import org.junit.jupiter.api.Test;

/**
 * 枚举的基础使用
 *
 * @author YC
 * Created by 2018-07-15 7:04
 */
public class Example {

    @Test
    void test1() {
        // 枚举类型的实例化.
        Parameter1 typecode1 = Parameter1.TYPECODE1;
        // 枚举判断存在 -> 判断是否存在指定字符串,如果存在返回名称,如果不存在则报异常.
        Parameter1 valueOf = typecode1.valueOf("typecode1".toUpperCase());
        System.out.println(valueOf);
        // 枚举比较(compareTo) -> 比较两个枚举之间的大小,即 typecode11的下标 - typecode12的下标.
        Parameter1 typecode11 = typecode1.TYPECODE1;
        Parameter1 typecode12 = typecode1.TYPECODE2;
        int compareTo = typecode11.compareTo(typecode12);
        System.out.println(compareTo);
        // 遍历枚举(values)
        for (Parameter parameter : Parameter.values()) {
            Integer index = parameter.getIndex();
            String code = parameter.getCode();
            System.out.println(index);
            System.out.println(code);
        }

        // Java中可以通过实例化枚举类型进行遍历(Kotlin中不行).
        for (Parameter1 parameter1 : typecode1.values()) {
            System.out.println(parameter1);
        }

    }
}

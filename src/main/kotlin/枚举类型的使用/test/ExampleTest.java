package 枚举类型的使用.test;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 常量测试
 *
 * @author YC
 * Created by 2018-07-14 18:34
 */
public class ExampleTest {

    @Test
    void test1() {
        Collection<Parameter> values = Example.getTest().values();
        for (Parameter parameter : values) {
            String code = parameter.getCode();
            Integer index = parameter.getIndex();
            System.out.println(code);
            System.out.println(index);
        }
    }

    @Test
    void test2() {
        Map<String, String> map = new HashMap();
        map.put("index", "code");
        map.put("index1", "code1");
        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}

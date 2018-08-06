package 枚举类型的使用.test;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试常量
 *
 * @author YC
 * Created by 2018-07-14 18:26
 */
public class Example {

    private static Parameter parameter = new Parameter(0, "test1");
    private static Parameter parameter1 = new Parameter(1, "test2");

    public static Map<Integer, Parameter> getTest() {
        Map<Integer, Parameter> map = new HashMap<Integer, Parameter>();
        map.put(parameter.getIndex(), parameter);
        map.put(parameter1.getIndex(), parameter1);
        return map;
    }

}

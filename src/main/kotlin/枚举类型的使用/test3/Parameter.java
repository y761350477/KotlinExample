package 枚举类型的使用.test3;

/**
 * 枚举构造的使用.
 * 注: 1. 枚举参数不能相同.
 *
 * @author YC
 * Created by 2018/7/15 7:13.
 */
public enum Parameter {

    TYPECODE1(0,"状态1"), TYPECODE2(1,"状态2"), TYPECODE3(2,"状态3"), TYPECODE4(3, "状态4");

    private Integer index;
    private String code;

    Parameter(Integer index, String code) {
        this.index = index;
        this.code = code;
    }

    public Integer getIndex() {
        return index;
    }

    public String getCode() {
        return code;
    }

}

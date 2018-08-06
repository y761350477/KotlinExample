package 枚举类型的使用.test;

/**
 * 测试常量
 *
 * @author YC
 * Created by 2018-07-14 18:24
 */
public class Parameter {

    private Integer index;
    private String code;

    public Parameter() {
    }

    public Parameter(Integer index, String code) {
        this.index = index;
        this.code = code;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

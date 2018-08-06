package 枚举类型的使用.test1;

public enum Parameter {

    TYPETEST1(0, "test1"), TYPETEST2(1, "test2"), TYPETEST3(3, "test3"), TYPETEST4(4, "test4");

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


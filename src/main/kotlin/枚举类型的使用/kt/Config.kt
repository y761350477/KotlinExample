package 枚举类型的使用.kt

/**
 * 实际应用中的枚举类
 *
 * @author YC
 * Created by 2018-08-06 9:15
 */
class Config {

    enum class getColor(var index: Int = 0, var info: String? = null) {
        RED(0, "红色"), BLACK(1, "黑色")
    }

    enum class getType(var index: Int = 0, name: String? = null) {
        BIG(0, "大杯"), SMALL(1, "小杯")
    }

}
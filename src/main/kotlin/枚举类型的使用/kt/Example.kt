package 枚举类型的使用.kt

import org.junit.jupiter.api.Test

/**
 * 枚举类型的使用
 *
 * @author YC
 * Created by 2018-08-06 8:49
 */
class Example {

    /**
     * 一般枚举类的使用情况.
     *
     * @author YC
     * Created by 2018/8/6 9:22.
     */
    @Test
    fun test1() {
        // 获取枚举值及枚举类型的实例化.
        val yellowColorEnum = ColorEnum.YELLOW
        println("yellowColorEnum的值: $yellowColorEnum")
        println()
        // 获取指定枚举值. (风险: 不存在则报异常!)
        var valueOf = ColorEnum.valueOf("YELLOW")
        println("获取指定枚举类型的值: $valueOf")

        val pinkColorEnum = ColorEnum.PINK
        val redColorEnum = ColorEnum.RED

        // 枚举类型的比较方法. 比较返回值为0表示相等,不为零表示位置的间隔.
        println("枚举类型之间的比较: ")
        var compareTo = yellowColorEnum.compareTo(yellowColorEnum)
        println(compareTo)
        var compareTo1 = yellowColorEnum.compareTo(pinkColorEnum)
        println(compareTo1)
        var compareTo2 = yellowColorEnum.compareTo(redColorEnum)
        println(compareTo2)
        println()

        // 枚举的遍历
        println("枚举类型的遍历: ")
        var arrayOfColorEnums = ColorEnum.values()
        for (arrayOfColorEnum in arrayOfColorEnums) {
            var name = arrayOfColorEnum.name
            println(name)
        }
        println()

    }

    /**
     * 配置信息中的枚举类的使用情况.
     *
     * @author YC
     * Created by 2018/8/6 9:22.
     */
    @Test
    fun test2() {
        // 获取类中的枚举类的方式.
        var black = Config.getColor.BLACK
        var blackName = black.name
        var blackIndex = black.index
        println(blackName)
        println(blackIndex)
        println()

        // 遍历类中的枚举类.
        var arrayOfGetColors = Config.getColor.values()
        for (arrayOfGetColor in arrayOfGetColors) {
            var colorIndex = arrayOfGetColor.index
            var colorName = arrayOfGetColor.info
            println(colorIndex)
            println(colorName)
        }
    }
}
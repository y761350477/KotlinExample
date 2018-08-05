package 视频学习.数据类型

import org.junit.jupiter.api.Test

/**
 * 和java的比较
 *
 * @author YC
 * Created by 2018-08-05 16:46
 */
class CompareJava {

    /**
     * 字符串模版的优势体现
     *
     * @author YC
     * Created by 2018/8/5 16:57.
     */
    @Test
    fun test1() {
        val arg1: Int = 0
        val arg2: Int = 1

        // java的字符串格式写法
        println("" + arg1 + " + " + arg2 + " = " + (arg1 + arg2))

        // kotlin字符串模版写法
        println("$arg1 + $arg2 = ${arg1 + arg2}")
    }

    /**
     * 非null判断
     *
     * @author YC
     * Created by 2018/8/5 16:58.
     */
    @Test
    fun test2() {
        // java的逻辑思路
        val javaName = getJavaName()
        if (javaName == null) {
            println("name is invalid!")
        } else {
            println(javaName.length)
        }

        // kotlin
        val kotlinName = getKotlinName()
        println(kotlinName.length)

        // kotlinNameIsNull?中的"?"表示如果为null时,输入null.
        val kotlinNameIsNull = getKotlinNameIsNull()
        println(kotlinNameIsNull?.length)

        // kotlinNameIsNull!!中的"!!"表示非null值,如果kotlinNameIsNull为null则报异常.
        println(kotlinNameIsNull!!.length)
    }

    fun getJavaName(): String? = null

    fun getKotlinName(): String = "默认不能为null,如果为null需要在String类型后面指定."

    fun getKotlinNameIsNull(): String? = null
}
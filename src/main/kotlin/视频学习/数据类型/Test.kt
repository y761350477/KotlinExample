package 视频学习.数据类型

import org.junit.jupiter.api.Test

/**
 *
 *
 * @author YC
 * Created by 2018-08-05 13:37
 */
class Test {

    /**
     * 原始字符串的使用.
     *
     * @author YC
     * Created by 2018/8/5 16:53.
     */
    @Test
    fun test1() {
        val testNum: Int = 1
        // """中转义字符\n,\t等无效,而$字符串模版依然有效,解决这类问题的方法,$和表达式之间加一个空格.
        val str: String = """+ \n\$testNum+"""
        // 解决原始字符串中无法输入$testNum的问题.
        val str1: String = """ ${'$'}testNum """
        println(str)
        println(str1)
    }

    /**
     * 字符转义的使用
     * 总结:
     *  1. 字符转义有两种方式: ①\t; ②${'\t'}.
     *
     * 注:
     *  1. 当在原始字符串中无法输出$、\等情况,可以使用${'$'}、${'\\'}.
     *  2. 当使用${''}形式的时候如果''中是"\"或者"'",在需要"\"转义为"\\", "\'".
     *
     * @author YC
     * Created by 2018/8/6 1:01.
     */
    @Test
    fun test2() {
        // 制表符
        val escapeT1 = "test \t escapeT1"
        // 制表符的第二种转义
        val escapeT2 = "test ${'\t'} escapeT2"

        // 美元符号
        val quotesDollar1 = "test \$ quotesDollar1"
        // 美元符号的第二种转义
        val quotesDollar2 = "test ${'$'} quotesDollar2"

        // 光标回退一个字符
        val escapeB = "test \b escapeB"
        // 换行
        val escapeN = "test \n escapeN"
        // 回车
        val escapeR = "test \r escapeR"
        // 单引号
        val escapeOne1 = "test \' quotesOne1"
        val escapeOne2 = "test ${'\''} quotesOne2"

        // 双引号
        val quotesTwo1 = "test \" quotesTwo1"
        val quotesTwo2 = "test ${'"'} quotesTwo2"
        // 反斜杠
        val quotesSlash1 = "test \\ quotesSlash1"
        val quotesSlash2 = "test ${'\\'} quotesSlash2"

        println(quotesDollar1)
        println(quotesDollar2)
        println(escapeT1)
        println(escapeT2)
        println(escapeOne1)
        println(escapeOne2)
        println(quotesTwo1)
        println(quotesTwo2)
        println(quotesSlash1)
        println(quotesSlash2)

    }
}
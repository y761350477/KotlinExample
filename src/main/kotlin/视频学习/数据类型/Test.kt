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
        println(str)
    }
}
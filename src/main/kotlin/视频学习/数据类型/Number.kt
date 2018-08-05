package 视频学习.数据类型

/**
 * 基本类型范围
 *
 * @author YC
 * Created by 2018-08-04 15:20
 */
var maxInt: Int = Int.MAX_VALUE
var mixInt: Int = Int.MIN_VALUE

var maxLong: Long = Long.MAX_VALUE
var mixLong: Long = Long.MIN_VALUE

var maxByte: Byte = Byte.MAX_VALUE
var mixByte: Byte = Byte.MIN_VALUE

var maxShort: Short = Short.MAX_VALUE
var mixShort: Short = Short.MIN_VALUE

var maxFloat: Float = Float.MAX_VALUE
var mixFloat: Float = -Float.MAX_VALUE

var maxDouble: Double = Double.MAX_VALUE
var mixDouble: Double = -Double.MAX_VALUE

fun main(args: Array<String>) {
    println("Int:")
    println("maxInt: $maxInt")
    println("mixInt: $mixInt")
    println(Math.pow(2.0, 31.0) - 1)
    println(-Math.pow(2.0, 31.0))

    println()
    println("Long: ")
    println("maxLong: $maxLong")
    println("mixLong: $mixLong")
    println(Math.pow(2.0, 63.0) - 1)
    println(-Math.pow(2.0, 63.0))

    println()
    println("Byte: ")
    println("maxByte: $maxByte")
    println("mixByte: $mixByte")
    println(Math.pow(2.0, 8.0) - 1)
    println(-Math.pow(2.0, 8.0))

    println()
    println("Short: ")
    println("maxShort: $maxShort")
    println("mixShort: $mixShort")
    println(Math.pow(2.0, 15.0) - 1)
    println(-Math.pow(2.0, 15.0))

    println()
    println("Float: ")
    println("maxFloat: $maxFloat")
    println("mixFloat: $mixFloat")

    println()
    println("Double: ")
    println("maxDouble: $maxDouble")
    println("mixDouble: $mixDouble")

}

/**
 * 总结:
 * 1. 基本类型的最大长度等于(2*他的位数 - 1),最小长度等于(-2*他的位数) - 整型
 *
 * 操作发现:
 * 1. 编写已经存在的变量时,可以根据先首写一个开头单词,然后写紧接着的大写字母,会过滤信息,来提高效率.
 *
 * 疑惑:
 * 浮点型的范围和小数位数如何体现的.
 *
 * 内容:
 * 1. 基本类型的长度、char类型的转义字符、数据类型的转换、字符串(== 和 ===的区别、转义字符的使用、原始字符串的使用)
 *
 * 总结:
 * 1. 字符串 -> == 等价与java中的equals比较的是值, === 等价与java中的==比较的是引用值.
 *
 *
 * @author YC
 * Created by 2018/8/5 11:45.
 */
/**
 * 人机交互
 * 注:
 *  1. readLine?.toInt()表示可以返回null,导致toInt+toInt1时报错,因为null不能和null相加.
 *  2. "?"表示可以接受null值,而"!!"表示接受值一定不为null.
 *
 * @author YC
 * Created by 2018/6/3 14:16.
 */
fun main(args: Array<String>) {
    println("请输入数字:")
    var readLine = readLine()
    println("请输入数字:")
    var readLine1 = readLine()

    var toInt = readLine!!.toInt()
    var toInt1 = readLine1!!.toInt()

    println("$toInt + $toInt1 = ${toInt + toInt1}")
}
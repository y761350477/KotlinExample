/**
 * 异常的简单使用
 *
 * @author YC
 * Created by 2018/6/3 14:30.
 */
fun main(args: Array<String>) {

    while (true) {
        println("请输入数字:")
        var readLine = readLine()
        println("请输入数字:")

        var readLine1 = readLine()
        try {
            var toInt = readLine!!.toInt()
            var toInt1 = readLine1!!.toInt()
            println("$toInt + $toInt1 = ${toInt + toInt1}")
        } catch (e: Exception) {
            println("输入的数字有问题,请重新输入!")
        }
    }

}
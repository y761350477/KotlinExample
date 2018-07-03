/**
 * 两种函数表达式和函数的使用
 *
 * @author YC
 * Created by 2018/5/30 23:14.
 */
fun main(args: Array<String>) {
    // 函数表达式方式一
    var i = { x: Int, y: Int -> x + y }
    // 函数表达式方式二
    var j: (Int, Int) -> Int = { x, y -> x + y }

    println(i(1, 2))
    println(j(1, 2))
    println(testFun(1, 2))
}

// 函数
fun testFun(x: Int, y: Int) = x + y

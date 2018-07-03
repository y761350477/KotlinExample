package function.lambda

/**
 * lambda表达式的学习
 * 1. "::"表示引用.
 *
 * @author YC
 * Created by 2018/6/20 17:33.
 */
fun main(args: Array<String>) {
    test1()
}

/**
 * 1. 匿名函数不能使用::funName方法.
 *
 * @author YC
 * Created by 2018/6/20 17:27.
 */
fun test1() {
    var lists = arrayOf(1, 2, 3, 4, 5, 6)
    // 匿名函数(lambda表达式)
    lists.forEach { testLambda(it) }
    println()

    // 具名函数
    lists.forEach(::testFun)
    println()
    lists.forEach { testFun(it) }
    println()

    // 解决循环末位的逗号问题,最优解决方案.
    var joinToString = lists.joinToString(", ")
    println(joinToString)
}

// 匿名函数(lambda表达式)
var testLambda = { item: Int -> print("$item, ") }

// 具名函数
fun testFun(item: Int) {
    print("$item, ")
}

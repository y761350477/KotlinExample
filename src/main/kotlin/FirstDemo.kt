/**
 * kotlin基础学习
 * 注:
 *  1. if在kotlin中是表达式,而在java中是语句.(表达式意味着有数据返回)
 *
 * @author YC
 * Created by 2018/5/30 14:46.
 */
fun main(args: Array<String>) {
    println("Hello, World!")
    println(max(2, 1))
    stringTemplate()
    stringExpression()
}

// 完整的声明.(有块主体)
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// 函数的内容部分仅仅是有一个表达式组成的，可以移除大括号和return声明，使用表达式作为整个函数的主体.(没有块主体)
fun max1(a: Int, b: Int): Int = if (a > b) a else b

// 没有返回类型声明的情况.(没有块主体)
fun max2(a: Int, b: Int) = if (a > b) a else b

// 字符串模版的使用 -> $name.
fun stringTemplate() {
    val name = "YangChen"
    println("Hello, $name")
}

// 字符串模版的使用 -> ${name}.
fun stringExpression() {
    val list: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)
    println("获取数据下标为1的值:\t${list[1]}")
}
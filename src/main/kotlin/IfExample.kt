/**
 * if在kotlin中的使用
 *  1. 语句形式使用
 *  2. 表达式形式使用
 *
 * @author YC
 * Created by 2018/5/30 23:22.
 */
fun main(args: Array<String>) {

}

// 表达式形式的使用,可以省去{}使用=.
fun testIf1(x: Int, y: Int) = if (x > y) x else y

// 语句形式的使用.
fun testIf2(x: Int, y: Int) {
    if ((x > y)) {
        println(true)
    } else {
        println(false)
    }
}

// 无返回类型使用Unit.(可省略)
fun testIf3(x: Int, y: Int): Unit {
    if ((x > y)) {
        println(true)
    } else {
        println(false)
    }
}
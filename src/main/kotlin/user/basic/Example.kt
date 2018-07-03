package user.basic

fun main(args: Array<String>) {
//    test1()
//    println(test2(60))
//    test6()
    test7()
}

val intArray = intArrayOf(1, 2, 3, 4, 5, 6, 7)

// while
fun test1() {
    var i = 0
    while (i < intArray.size) {
        println("${intArray[i]}, intArray下标$i")
        i++
    }
}

//when
// 1. when匹配条件不可以是范围,但是可以是真假表达式.
// 2. 带有返回值的时候，必须要写else的条件

// 思考:
// 1.如何像java一样匹配多个条件?
fun test2(x: Any): String =
    when (x) {
        100 -> "满分"
        60 -> "及格"
        is Int -> "Int类型"
        else -> "不合适的数据"
    }

// when没有返回值的时候,不用写else条件
fun test3(x: Any) {
    when (x) {
        1 -> println("Hello, World!")
    }
}

// when没有返回值的时候,方法使用"="时同样必须写else条件.
fun test4(x: Any) =
    when (x) {
        1 -> println("Hello, World!")
        else -> println("else")
    }

fun test5(x: Any) = println("123")

// for不使用下标.
fun test6() {
    for (i in intArray) {
        println(i)
    }
}

// for中使用下标.
// intArray.indices表示区间, intArray声明时完全可以使用区间.
fun test7() {
    for (i in intArray.indices) {
        println("$i -> ${intArray[i]}")
    }
}
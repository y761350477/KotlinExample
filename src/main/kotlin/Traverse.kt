import org.junit.jupiter.api.Test

class Traverse {

    @Test
    fun test() {
//        println("根据下标遍历:")
//        test1()

//        println("遍历:")
//        test2()

//        test3()

//        test4()

//        test5()

//        test6()

//        test7()

//        test8()

        test9()
    }
}

// 根据下标遍历
fun test1() {
    val items = listOf("apple", "banana", "kiwi")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
    println()
}

// 遍历
fun test2() {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }
    println()
}

// 闭区间[1, 100](包含两端)
fun test3() {
    var nums = 1..100
    var result = 0
    for (num in nums) {
        print("$num, ")
        result += num
    }
    println()
    println("计算1加到100的值:\t$result")
}

// 步长，循环时可用，设置每次循环的增加或减少的量
fun test4() {
    println("step的使用")
    var nums = 1..10
    for (num in nums step 2) {
        print("$num, ")
    }
    println()
}

// 倒序的使用 -> reversed()方法.
fun test5() {
    println("reversed()方法的使用")
    var nums = 1 .. 16
    var nums1 = nums.reversed()
    for (num in nums1) {
        print("$num, ")
    }
    println()
}

// 倒序不会排序的验证.
fun test6() {
    println("倒序不会排序的验证")
    var nums = listOf(1, 3, 8, 9, 2, 4, 5)
    for (num in nums) {
        print("$num, ")
    }
    println()
}

// 求共总个数 -> count()方法.
fun test7() {
    var nums = 1..16
    var count = nums.count()
    println("总个数:\t$count")
    println()
}

// 半开半闭区间[1,16)
fun test8() {
    var nums = 1 until 16
    for (num in nums) {
        print("$num, ")
    }
    println()
}

// 根据下标遍历的简便方式
fun test9() {
    var listing = listOf<String>("鸡蛋", "冰淇淋", "牙刷", "袜子")
    for ((i, e) in listing.withIndex()) {
        println("$i, $e")
    }
    println()
}


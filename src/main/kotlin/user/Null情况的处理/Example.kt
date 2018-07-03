package user.Null情况的处理

fun main(args: Array<String>) {
    var str: String?
    str = "1"
    // 安全调用,为Null时直接返回Null,而不是报空指针.
    println(str?.length)
    // 非null时调用.
    str?.let {
        println("非Null时执行！")
    }

    str = null
    // str为空时执行.非Null时返回str,为Null时调用: 右边的表达式.
    fun let() {
        println("为Null时执行！")
    }

    str ?: let()
    // null时调用.

    str ?: "test"
}
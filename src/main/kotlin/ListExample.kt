fun main(args: Array<String>) {
    var list: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6)
    list.add(7)
    println(list)
    // 循环
    // 方式一
    list.forEach(::print)
    println()
    list.forEach(::append)
    println()

    // 因为forEach(::print)直接使用会导致数据连在一起引申出的又两种forEach(::print)遍历形式1
    list.map { "$it, " }.forEach(::print)
    // forEach遍历形式2
    list.forEach {
        print("$it, ")
    }
    // 及如下方式
    var joinToString = list.joinToString(separator = ",")
    println()

    // 方式二
    for (i in list) {
        print("$i, ")
    }
    println()
    // 方式三
    var listIterator = list.listIterator()
    while (listIterator.hasNext()) {
        print("${listIterator.next()}, ")
    }


}

// 自定义函数用于灵活解决forEach(::print)引发的数据连接到一起的问题
fun append(item: Int) {
    print("$item, ")
}


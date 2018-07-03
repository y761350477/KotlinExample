package singleton

fun main(args: Array<String>) {

    var son = Son
    var son1 = Son
    // 单例模式的验证
    println(son == son1)
}
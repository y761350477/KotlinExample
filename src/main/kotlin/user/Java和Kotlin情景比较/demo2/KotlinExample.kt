package user.Java和Kotlin情景比较.demo2

/**
 * Kotlin除了在类外使用主函数,也可以像java一样在类内使用,另外并不影响类外部的主函数的使用.
 *
 * @author YC
 * Created by 2018/6/21 10:27.
 */
class KotlinExample {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            println("In -> Hello, World!")
        }
    }
}

fun main(args: Array<String>) {
    println("Out -> Hello, World!")
}
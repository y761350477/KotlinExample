package user.Java和Kotlin情景比较.demo1

/**
 * 与Example中比较,Kotlin的特点
 * 1. 主函数写在类的外面.
 * 2. 方法可以写在类外面,主函数直接调用.
 *
 * @author YC
 * Created by 2018/6/21 9:44.
 */
class KotlinExample {
    // demo1
    fun sayHello() = println("Hello, World!")
}

fun main(args: Array<String>) {
    // 方法写在类中需要示例化,然后调用.
    var kotlinExample = KotlinExample()
    kotlinExample.sayHello()

    // 方法可以写在类外面直接调用.
    sayHelloOut()
}

// demo2
fun sayHelloOut() = println("Hello, World!")
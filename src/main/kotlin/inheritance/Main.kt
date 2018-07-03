package inheritance

fun main(args: Array<String>) {
    var son = Son("构造方法")
    println(son.f_name)
    son.sayHello()

}

/**
 * 1. 如何设置多个构造方法
 * 2. 构造方法中有没有var关键字区别
 *
 * @author YC
 * Created by 2018/6/3 20:54.
 */
package jackson.kclass

/**
 * kotlin反射的使用.
 * 收获:
 *  1. kotlin类和java类获取类方式一致.
 *  2. "::"可以直接使用Person,"."只能使用var person = Person()的person.
 *
 * @author YC
 * Created by 2018/6/7 8:38.
 */
fun main(args: Array<String>) {
    var person = Person()
    var cat = Cat()

    // 使用实例化对象调用
    println("person::class = ${person::class}")
    // 不使用实例化对象调用
    println("person::class = ${Person::class}")
    println("person::class.java = ${Person::class.java}")
    println("person.javaClass.kotlin = ${person.javaClass.kotlin}")
    println("person.javaClass = ${person.javaClass}")
    println("person::javaClass = ${person::javaClass}")
    println()
    println("Cat::class = ${Cat::class}")
    println("Cat::class.java = ${Cat::class.java}")
    println("cat.javaClass.kotlin = ${cat.javaClass.kotlin}")
    println("cat.javaClass = ${cat.javaClass}")
    println("Cat::javaClass = ${Cat::javaClass}")
}
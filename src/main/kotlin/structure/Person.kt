package structure

class Person() {

    constructor(name: String) : this()

    constructor(name: String, age: Int) : this(name)
}

/**
 * 构造参数在构造时不声明,构造参数name只能在初始化块以及属性声明中使用
 *
 * @author YC
 * Created by 2018/6/4 9:18.
 */
class Person1(name: String) {

    /*var name = name

    init {
        var name = name
    }*/

    // 方法中不可以调用构造参数name
    /*fun test() {
        var name = name
    }*/

}

/**
 * 构造参数在构造时声明,,构造参数name可以在方法中使用
 *
 * @author YC
 * Created by 2018/6/4 9:25.
 */
class Person2(val name: String) {

    /*var name = name

    init {
        var name = name
    }*/

    // 方法中不可以调用构造参数name
    fun test() {
        var name = name
    }
}

class Person3(var name: String? = null, var age: Int? = null)

/**
 * 次级构造方法的用法
 *
 * @author YC
 * Created by 2018/6/4 12:21.
 */
class PTest {
    var str: String

    constructor(str: String) {
        this.str = str
    }

}

fun main(args: Array<String>) {
    var t1 = Person3("yc")
    println(t1.name)

    var pt = PTest("test")
    println(pt.str)
}
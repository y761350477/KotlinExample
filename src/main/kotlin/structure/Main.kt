package structure

import org.junit.jupiter.api.Test

class Main {

    @Test
    fun test() {
        var person = Person("李四")
        var person_1 = Person("李四", 22)

        var person1 = Person1("test")
    }

    @Test
    fun test1() {
        // 主构造函数中每个参数都设置默认值,会生成一个额外的无参构造函数来使用初始化属性为初始值.
        var user = User()
        println(user.name)

        // 若构造函数中并非所有参数都有默认值,则不会生成默认无参构造函数.
        // 将无法编译通过
//        var user1 = User1()
        // 合法声明
        var user1 = User1("yc", 22)

    }


}


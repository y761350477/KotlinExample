package structure

/**
 * 主构造函数中每个参数都设置默认值,会生成一个额外的无参构造函数来使用初始化属性为初始值.
 *
 * @author YC
 * Created by 2018/6/4 8:54.
 */
class User(name: String = "yc", age: Int = 22) {
    var name = name
    var age = age
}

/**
 * 若构造函数中并非所有参数都有默认值,则不会生成默认无参构造函数.
 *
 * @author YC
 * Created by 2018/6/4 8:57.
 */
class User1(name: String = "yc", age: Int)

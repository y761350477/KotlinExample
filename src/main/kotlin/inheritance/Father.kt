package inheritance

open class Father(var name: String) {

    open var f_name: String = "姓名"
    open fun sayHello() {
        println("Hello!")
    }
}
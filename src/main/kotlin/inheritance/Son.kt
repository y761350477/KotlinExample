package inheritance

class Son(name: String): Father(name) {
    override var f_name: String = "son, 名字"
    override fun sayHello() {
        println(name)
        println("son, Hello!")
    }
}

package seal

fun main(args: Array<String>) {
    var x = Donkeys.LittleDonkey()
    var y = Donkeys.LittlePony()
    var z = Donkeys.LittlePony()

    var list = listOf(x, y, z)
    for (any in list) {
        if (any is Donkeys.LittlePony) {
            any.sayHello()
        }
    }
}
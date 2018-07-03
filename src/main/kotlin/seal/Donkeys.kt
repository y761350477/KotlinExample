package seal

/**
 * 印章类的使用 -> Sealed class(子类类型有限的class)
 * Donkeys(母驴)、LittlePony(小马)、LittleDonkey(小驴)
 * 因为母驴只能有两个后代,小马和小驴,如果不使用sealed class加以限制,则可以有很多后代类.
 *
 * @author YC
 * Created by 2018/6/3 21:56.
 */
sealed class Donkeys {

    class LittlePony: Donkeys()
    class LittleDonkey: Donkeys()

    fun sayHello() {
        println("Hello!")
    }

}
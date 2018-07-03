package entrust

/**
 * 委托的使用. -> by要委托的类
 * 注:
 *  1. 委托类的接口中不必实现接口方法,调用委托类的方法则使用被委托类的方法.
 *  2. 委托类的接口中实现了接口的方法,调用委托类的方法则使用委托类的方法.
 *
 * @author YC
 * Created by 2018/6/3 22:51.
 */
fun main(args: Array<String>) {

    var son = Son()
    var son1 = Son()
    // 单例模式的验证
    println(son == son1)

    var father = Father()
    father.washing()
}
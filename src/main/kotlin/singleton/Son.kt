package singleton

/**
 * 单例模式: 使用object来指定单例模式,表明jvm中只创建一个Sun.
 * 注;
 *  1. Father使用by不需要使用()了.
 *  2. Father方法中的Son.washing()方法,其一Son不需要(),并且使用的是同一个实例,如果不使用object指定单例则不是同一个实例.
 *
 * @author YC
 * Created by 2018/6/3 22:45.
 */
object Son : WashBow {

    override fun washing() {
        println("子类洗碗")
    }
}
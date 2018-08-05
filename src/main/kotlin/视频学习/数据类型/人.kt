package 视频学习.数据类型

/**
 * 类与对象
 *
 * @author YC
 * Created by 2018-08-05 13:17
 */
open class 人(var 性格: String, var 长相: String, var 声音: String) {

 init {
     println("${this.javaClass.simpleName}, ta性格:$性格,长相:$长相,声音:$声音")
 }
}

class 男生(性格: String, 长相: String, 声音: String): 人(性格, 长相, 声音)

class 女生(性格: String, 长相: String, 声音: String): 人(性格, 长相, 声音)

fun main(args: Array<String>) {
    var 男生: 男生 = 男生("彪悍", "帅气", "浑厚")
    var 女生: 女生 = 女生("温柔", "甜美", "动人")
    println(男生 is 人)
    println(女生 is 人)
}

/**
 * 1. 继承的使用(构造方法、构造方法初始化代码块、is的使用)
 *
 * @author YC
 * Created by 2018/8/5 13:27.
 */

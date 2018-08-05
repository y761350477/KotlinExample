package 视频学习.数据类型

import user.Java和Kotlin情景比较.demo1.Example


/**
 * 核心示意
 *
 * @author YC
 * Created by 2018-08-04 10:59
 */
val FINAL_HELLO_WORLD: String = "Example"
var helloWorld: String = FINAL_HELLO_WORLD
var nullableHelloWorld: String? = helloWorld
val helloWorldArray: Array<Char> = arrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'I', 'd')
val helloWorldCharArray: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'I', 'd')
val helloWorldLength: Int = helloWorld.length
val helloWorldLengthLong: Long = helloWorldLength.toLong()

fun main(args: Array<String>) {
    println("final hello world: $FINAL_HELLO_WORLD")
    println("assignable hello world: $helloWorld")
    println("hello world from nullable type: $nullableHelloWorld")
    println("hello world from Array: ${helloWorldArray.joinToString(" - ")}")
    println("hello world from CharArray: ${String(helloWorldCharArray)}")
    println("class name hello world: ${Example::class.java.simpleName}")
    println("part of the class name of HelloWorld: ${Example::class.java.simpleName.slice(0 until helloWorldLength)}")
    println("the length of hello world is $helloWorldLength")
    println("the length of hello world is (long): $helloWorldLengthLong")
}
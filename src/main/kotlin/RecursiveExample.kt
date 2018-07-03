import java.math.BigInteger

/**
 * 递归
 * 注:
 *  1. 阶乘 -> 5的阶乘(5*4*3*2*1)
 *  2. 递归体现为方法中判断条件而多次调用方法.
 *  3. 当数值存不下的使用需要使用BigInteger.(无限大)
 *
 * @author YC
 * Created by 2018/6/3 14:40.
 */
fun main(args: Array<String>) {

    // 计算5的阶乘
    var num = 5
    println(fact(num))

    // 当num为100时,Long类型也存不下了,需要使用BigInteger
    var bigInteger = BigInteger("100")
    println(factPro(bigInteger))
}

fun fact(num: Int): Int {

    if (num == 1) {
        return 1
    } else {
        return num * fact(num - 1)
    }
}

fun factPro(num: BigInteger): BigInteger {

    if (num == BigInteger.ONE) {
        return BigInteger.ONE
    } else {
        return num * factPro(num - BigInteger.ONE)
    }
}
import java.util.*

/**
 * 自定义访问器
 * 特点:
 *  1. 属性isSquare不需要字段来保存他的值,值每次访问计算出来的.
 *
 * @author YC
 * Created by 2018/5/30 14:10.
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }

    // 简洁写法
    /*val isSquare: Boolean
        get() = height == width*/
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}
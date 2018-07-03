package 面向对象.接口

interface InputDevice {
    fun input(event: Any)
}

interface USBInputDevice : InputDevice

interface BLEInputDevice : InputDevice

class USBMouse(var name: String) : USBInputDevice {
    override fun input(event: Any) {

    }

    override fun toString(): String {
        return name
    }
}

abstract class AbstractUSBMouse(var name: String) : USBInputDevice {
    override fun input(event: Any) {

    }

    override fun toString(): String {
        return name
    }
}

class LogitechMouse : AbstractUSBMouse("罗技鼠标") {
    override fun input(event: Any) {

    }
}

class Computer {

    fun addUSBInputDevice(inputDevice: USBInputDevice) {
        println("add usb input device $inputDevice")
    }

    fun addBLEInputDevice(inputDevice: BLEInputDevice) {
        println("add ble input device $")
    }

    fun addInputDevice(inputDevice: InputDevice) {
        when (inputDevice) {
            is USBInputDevice -> {
                addUSBInputDevice(inputDevice)
            }
            is BLEInputDevice -> {
                addBLEInputDevice(inputDevice)
            }
            else -> {
                throw IllegalArgumentException("输入设备类型不支持!")
            }
        }
    }

}

fun main(args: Array<String>) {
    val computer = Computer()
    val usbMouse = USBMouse("罗技品牌")
    val logitechMouse = LogitechMouse()
//    computer.addUSBInputDevice(usbMouse)
    computer.addUSBInputDevice(logitechMouse)

}
package entrust

class Father : WashBow by Son() {

    override fun washing() {
        println("父类洗碗")
        Son().washing()
    }
}
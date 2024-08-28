class Employee(name: String, lastName: String, age: Int): Person(name, lastName, age) {

    override fun go() {
        println("Сотрудник идет")
    }

    override fun stop() {
        println("Сотрудник остановился")
    }

    override fun eat() {
        println("Сотрудник ест")
    }

    fun work() {
        println("Сотрудник работает")
    }

    override fun infoToString(): String {
        return super.infoToString()
    }
}
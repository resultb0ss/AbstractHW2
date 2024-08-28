class Student(name: String, lastName: String, age: Int): Person(name,lastName,age) {

    override fun go() {
        println("Студент идет")

    }

    override fun stop() {
        println("Студент остановился")

    }

    override fun eat() {
        println("Студент ест")
    }

    fun study(){
        println("Студент учится")
    }

    override fun infoToString(): String {
        return super.infoToString()
    }
}
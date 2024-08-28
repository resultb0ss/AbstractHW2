abstract class Person (val name: String,val lastname: String,val age: Int)  {

    abstract fun go()
    abstract fun stop()
    open fun eat(){
        println("Человек ест")
    }

    open fun infoToString(): String {
        return "$name $lastname возраст $age"
    }
}
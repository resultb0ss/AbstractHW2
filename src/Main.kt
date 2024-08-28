fun main() {

    var student = Student("Виктор","Иванов", 23)
    var employee = Employee("Сергей","Петров", 29)


    student.go()
    student.stop()
    student.eat()
    student.study()
    println(student.infoToString())

    println("------------------------------------")
    employee.work()
    employee.eat()
    employee.go()
    employee.stop()
    println(employee.infoToString())
}
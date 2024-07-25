//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val car1 = Vehicle("Red", "Toyota", "Corolla")
    val car2 = Car("Blue", "Nissan", "Sentra", 4)
    val myBus = Bus("Yellow", "Mercedes", "Sprinter", 30)

    println("Color: ${car1.color}, Make: ${car1.make}, Model: ${car1.model}")
    car1.accelerate()
    car1.stop()
    println("---------------------------")

    println("Color: ${car2.color}, Make: ${car2.make}, Model: ${car2.model}, Doors: ${car2.numberOfDoors}")
    car2.accelerate()
    car2.stop()
    car2.parallelPark()
    println("---------------------------")

    println("Color: ${myBus.color}, Make: ${myBus.make}, Model: ${myBus.model}, Passenger Capacity: ${myBus.passengerCapacity}")
    myBus.accelerate()
    myBus.stop()
    myBus.openRearDoor()
    println("---------------------------")
}

open class Vehicle(val color: String, val make: String, val model: String) {

    open fun accelerate() {
        println("The vehicle is accelerating.")
    }

    open fun stop() {
        println("The vehicle has stopped.")
    }
}

class Car(color: String, make: String, model: String, val numberOfDoors: Int) : Vehicle(color, make, model) {

    override fun accelerate() {
        println("The car is accelerating quickly.")
    }

    override fun stop() {
        println("The car has stopped smoothly.")
    }

    fun parallelPark() {
        println("The car is parallel parking.")
    }
}

class Bus(color: String, make: String, model: String, val passengerCapacity: Int) : Vehicle(color, make, model) {

    override fun accelerate() {
        println("The bus is accelerating steadily.")
    }

    override fun stop() {
        println("The bus has stopped safely.")
    }

    fun openRearDoor() {
        println("The rear door is open.")
    }
}

fun main(){
    // 1
    println("Hello Kotlin.")
    println("--------------------------------------------------")

    //2
    var popcorn = 5
    val costumers = 10

    println(popcorn)
    println(costumers)
    println("There are $costumers costumers in the store")
    println("---------------------------------------------------")


    //3
    var customers = 10

        // Some customers leave the queue
        customers = 8
        customers =  customers + 3 // Example of addition: 11
        customers += 7            // Example of addition: 18
        customers -= 3            // Example of subtraction: 15
        customers *= 2            // Example of multiplication: 30
        customers /= 3            // Example of division: 10

    println(customers) // 10

    println("-------------------------------------------------")

    //4 Lists

    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    //To get the first item of the list:
    println("The firts item in then list is: ${readOnlyShapes[0]}")
    println("The first item in the list is: ${readOnlyShapes.first()}")

    // To get the last item of the list (return it will be true or false:
    println("The first item in the list is: ${readOnlyShapes.last()}")

    // To check if the item with specifc name is in the list
    println("circle" in readOnlyShapes)

    //To count how many items in the list:
    println("This list has ${readOnlyShapes.count()} items")


    // creating Mutable List and adding something in the list
    val shapes2: MutableList<String> = mutableListOf("triangle", "square", "circle")
    shapes2.add("pentagon")
    println(shapes2)

    // Remove the first "pentagon" from the list
    shapes2.remove("pentagon")
    println(shapes2)

}
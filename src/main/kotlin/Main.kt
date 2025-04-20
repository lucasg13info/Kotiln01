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

    println("--------------------------------------------------------")


    //5 - sets
    //Sets: Whereas lists are ordered and allow duplicate items, sets are unordered and only store unique items.
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    //will not show duplicated data
    println(fruit)

    println("--------------------------------------------------------------")


    //6 Map - Maps store items as key-value pairs. You access the value by referencing the key. You can imagine a map like a food menu. You can find the price (value), by finding the food (key) you want to eat. Maps are useful if you want to look up a value without using a numbered index, like in a list

    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)

    println("--------------------------------------")


    //7
    // Conditionals
    //if

    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    //Ternary operation
    val a = 1
    val b = 2

    println(if (a > b) a else b) // Returns a value: 2
    println("--------------------------------------")


    //8 - When Use when when you have a conditional expression with multiple branches.
    val obj = "Hell0o"

    when (obj) {
        // Checks whether obj equals to "1"
        "1" -> println("One")
        // Checks whether obj equals to "Hello"
        "Hello" -> println("Greeting")
        // Default statement
        else -> println("Unknown")
    }
    println("--------------------------------------")


    //9

    //This example uses a when expression without a subject to check a chain of Boolean expressions:

    //Option 1
    val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"

    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)

    //Option 2
    val trafficLightState2 = "Red" // This can be "Green", "Yellow", or "Red"

    val trafficAction2 = when (trafficLightState2) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)
}
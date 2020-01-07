fun main() {

    // TODO 1
    val user: Map<String, String> = mapOf(
            "Name" to "John",
            "Age" to "23",
            "Address" to "St. Petersburg")

    // TODO 2
    val name = user.getValue("Name")
    val age = user.getValue("Age")
    val address = user.getValue("Address")

    // TODO 3
    println("User\nName: $name\nAge: $age\nAddress: $address")

}
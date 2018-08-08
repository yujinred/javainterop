package CallingKotlinFromJava

class Kotlin(val firstName: String, val lastName: String) {

    fun PrintName(): Unit {
        print("Hello $firstName $lastName!")
    }
}
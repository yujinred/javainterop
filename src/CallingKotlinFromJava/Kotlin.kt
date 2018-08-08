package CallingKotlinFromJava

import java.io.IOException

class Kotlin(val firstName: String, val lastName: String) {

    val dansRealName: String
        @JvmName("getRealNameOfDan")
        get() = "Khrushchev"

    fun getDansRealName() = "Ho Chi Minh"

    fun PrintName(): Unit {
        println("Hello $firstName $lastName!")
    }

    @JvmOverloads fun printDefaultValues(criminal: String = "Dan", victim: String = "Eugene", crime: String = "using kotlin") {
        println("$criminal made $victim commit the crime of $crime")
    }

    @Throws(IOException::class)
    fun throwException(isThrow: Boolean) {
        if (isThrow)
            throw IOException("This is a random exception")
    }

    fun uncheckedException(list: List<String>, appendable: Appendable) {
        for (token in list) {
            appendable.append(token)
        }
    }
}
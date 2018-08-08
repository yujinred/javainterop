package CallingJavaFromKotlin

fun main(args: Array<String>) {

    val java: Java = Java()

    playingWithGetterAndSetter(java)

    functionNamesThatAreKotlinKeywords(java)
}

fun playingWithGetterAndSetter(java: Java) {
    java.variable = 5
    print(java.variable)
}

fun functionNamesThatAreKotlinKeywords(java: Java) {
    java.variable = 5
    java.`is`()
}

fun playingWithGenerics(java: Java) {

}
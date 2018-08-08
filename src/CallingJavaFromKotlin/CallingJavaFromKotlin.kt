package CallingJavaFromKotlin

fun main(args: Array<String>) {

    val java = Java()

    playingWithGetterAndSetter(java)

    functionNamesThatAreKotlinKeywords(java)

    playingWithPlatformTypes(java)

}

fun playingWithGetterAndSetter(java: Java) {
    java.variable = 5
    print(java.variable)
}

fun functionNamesThatAreKotlinKeywords(java: Java) {
    java.variable = 5
    java.`is`()
}

fun playingWithPlatformTypes(java: Java) {
//    val nullableJava: String = java.nullable
//    print(nullableJava)
}
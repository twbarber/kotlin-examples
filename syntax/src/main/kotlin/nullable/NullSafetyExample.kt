package nullable

class NullSafetyExample {

    val nonNull: String = NullJava.getNonNullAnnotatedString()
    val nullable: String? = NullJava.getNullableAnnotatedString()
    val platform: String = NullJava.getString()

}

fun main(args: Array<String>) {
    // println(NullJava.getNullString().length)
    println(NullJava.getString().length)
}
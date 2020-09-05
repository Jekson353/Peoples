import java.util.*

fun main() {
    println("Введите число")
    val scan = Scanner(System.`in`)
    val likes = scan.nextInt()
    var comment: String

    var last: Int = likes.toString().length - 1
    val str = likes.toString()
    val ch = str[last]

    val num = ch.toString().toInt()

    if (num == 1) {
        comment = "человеку"
    } else if (num > 1) {
        comment = "людям"
    } else {
        comment = "людям"
    }

    println("Понравилось $likes $comment")
}
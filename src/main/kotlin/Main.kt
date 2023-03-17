fun main() {
    print(solution("taiaiaertkixquxjnfxxdh"))
}

fun solution(message: String): String {
    val decrypted = StringBuilder()
    var sum = 0
    for (i in message.indices) {
        val c = (message[i] - 'a' - sum + 26) % 26 + 'a'.digitToInt()
        decrypted.append(c.toChar())
        sum = (sum + c - 'a'.digitToInt()) % 26
    }
    return decrypted.toString()
}

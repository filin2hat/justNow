fun main() {

}

fun agoToText(secondsAgo: Int): String = when (secondsAgo) {
    in 0..60 -> "был(а) $secondsAgo назад"
    //todo
    else -> "был(а) давно"
}

fun minutesToText(seconds: Int): String {
    val minutes = seconds / 60
    if (minutes >= 11 || minutes <= 14)
        return "$minutes минут"
    return when (minutes % 10) {
        1 -> "$minutes минуту"
        2,3,4 -> "$minutes минуты"
        else -> "$minutes минут"
    }
}

fun hoursToString(seconds: Int): String {

}
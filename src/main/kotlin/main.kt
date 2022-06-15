fun main() {
    var secondsAgo = 30
    repeat(14) {
        secondsAgo *=2
        println(agoToText(secondsAgo))
    }
}

fun agoToText(secondsAgo: Int): String = when (secondsAgo) {
    in 0..60 -> "был(а) только что."
    in 61..3600 -> "был(а) ${minutesToText(secondsAgo)} назад."
    in 3601..86400 -> "был(а) ${hoursToString(secondsAgo)} назад."
    in 86401..172800 -> "был(а) сегодня."
    in 172801..259200 -> "был(а) вчера."
    else -> "был(а) давно"
}

fun minutesToText(seconds: Int): String {
    val minutes = seconds / 60
    if (minutes in 11..14)
        return "$minutes минут"
    return when (minutes % 10) {
        1 -> "$minutes минуту"
        2, 3, 4 -> "$minutes минуты"
        else -> "$minutes минут"
    }
}

fun hoursToString(seconds: Int): String {
    val hours = seconds / 3600
    if (hours in 5..20)
        return "$hours часов"
    return when (hours % 10) {
        1 -> "$hours час"
        2, 3, 4 -> "$hours часа"
        else -> "$hours часов"
    }
}
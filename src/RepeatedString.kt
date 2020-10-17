class RepeatedString {

    fun repeatedString(s: String, n: Long): Long {
        var countOfA = 0L
        val timeOriginalStringToAdd: Long = (n / s.length)
        val indexTillWhichSubstringToTake = (n % s.length).toInt()

        s.filter { char -> char == 'a' }.map { ++countOfA }

        countOfA *= timeOriginalStringToAdd

        s.take(indexTillWhichSubstringToTake).filter { char -> char == 'a' }.map { ++countOfA }
        return countOfA
    }
}
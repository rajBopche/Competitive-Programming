class TwoStrings {

    fun twoStrings(s1: String, s2: String): String {
        val allAlphabets = "abcdefghijklmnopqrstuvwxyz"
        var subStringExist = "NO"

        allAlphabets.forEach { char ->
            if (s1.indexOf(char) > -1 && s2.indexOf(char) > -1) {
                subStringExist = "YES"
                return@forEach
            }
        }
        return subStringExist
    }
}
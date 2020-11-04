class TwoStrings {

    fun twoStrings(s1: String, s2: String): String {
        val allAlphabets = "abcdefghijklmnopqrstuvwxyz"
        var subStringExist = "NO"

        allAlphabets.forEach { char ->
            if (s1.contains(char) && s2.contains(char)) {
                subStringExist = "YES"
                return@forEach
            }
        }
        return subStringExist
    }
}
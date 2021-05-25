package problems

class RepeatedStrings {

    fun countNoOfA() {
        val inputString = readLine()!!
        val validCount = readLine()!!.toLong()
        val inputLen = inputString.length
        var countOfA = 0L

        if (validCount == 0L || inputLen == 0) {
            println(0)
            return
        }
        val numberOfTimes = validCount / inputLen  //No. of times the countOfA repeated in string
        val remChars = (validCount % inputLen).toInt() //No.of characters that we need to visit at last checking for a

        inputString.forEach { char ->
            if (char == 'a') {
                ++countOfA
            }
        }

        //Don't iterate the string again, as count of A in string will remain constant
        //Just multiply the number of times we need to repeat over
        countOfA *= numberOfTimes

        for (counter in 0 until remChars) {
            if (inputString[counter] == 'a') {
                ++countOfA
            }
        }

        println(countOfA)
    }
}

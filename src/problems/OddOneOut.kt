package problems

class OddOneOut {

    fun some() {
        val noOfFirstOddElements = readLine()!!.toInt()
        val inputSequence = readLine()!!
        if (inputSequence.isBlank()) {
            println(1)
            return
        }
        val sumOfRemainingElements = inputSequence.split(" ").map { ip -> ip.toInt() }.sum()

        /*
    To find the sum of first n odd numbers we can apply odd number theorem, it states that the sum of first n odd numbers is equal to the square of n.
    */
        val sq = noOfFirstOddElements * noOfFirstOddElements
        println(sq - sumOfRemainingElements)
    }

}


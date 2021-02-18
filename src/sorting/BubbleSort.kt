package sorting

fun main() {
    val numbers = mutableListOf(1)
    BubbleSort().sort(numbers)
    println(numbers)
}


class BubbleSort {

    //The core logic is to compare current element with the adjacent element, and swap if current element is large
    //After one pass atleast one element is in the correct position.
    // We keep checking if atleast one swapping was done.
    //If atleast one swapping was done, then we again need to perform sorting for the elements
    //If no swapping was performed then it means the array was already sorted

    fun sort(numbers: MutableList<Int>) {
        var isSwapped = true

        while (isSwapped) {
            isSwapped = false
            for (i in 0 until numbers.lastIndex) {
                if (numbers[i] > numbers[i + 1]) {
                    val temp = numbers[i]
                    numbers[i] = numbers[i + 1]
                    numbers[i + 1] = temp
                    isSwapped = true
                }
            }
        }
    }

}
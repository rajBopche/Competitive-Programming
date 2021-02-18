package sorting

class SelectionSort {

    //The core logic is to find the min element from unsorted array part
    //Then swap the min element with the first element in unsorted array
    //Then recursively repeat it for n-1 elements
    tailrec fun sort(numbers: Array<Int>, startIndex: Int, endIndex: Int) {

        if (endIndex < startIndex) return

        var minElement = numbers[startIndex]
        var minElementIndex = startIndex

        for (i in startIndex..endIndex) {
            if (numbers[i] < minElement) {
                minElement = numbers[i]
                minElementIndex = i
            }
        }

        //swap the min element with the first element in unsorted array
        val temp = numbers[startIndex]
        numbers[startIndex] = minElement
        numbers[minElementIndex] = temp

        sort(numbers, startIndex + 1, endIndex)
    }
}
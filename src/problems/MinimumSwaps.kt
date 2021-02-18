package problems

class MinimumSwaps {

    fun minimumSwaps(arr: Array<Int>): Int {

        var minSwaps = 0
        val visitedArray = BooleanArray(arr.size) { false }

        var j = 0
        while (j < arr.size) {

            if (arr[j] == (j + 1) || visitedArray[j]) {
                ++j
                continue
            } else {

                var cycleSize = 0
                var nextIndexToCheck = arr[j] - 1
                visitedArray[j] = true
                ++cycleSize
                while (!visitedArray[nextIndexToCheck]) {
                    visitedArray[nextIndexToCheck] = true
                    nextIndexToCheck = arr[nextIndexToCheck] - 1
                    ++cycleSize
                }
                minSwaps += cycleSize - 1
            }
            ++j
        }
        return minSwaps
    }


}
package problems

class HourGlassMatrix {

    fun hourglassSum(arr: Array<Array<Int>>): Int {
        val sumOfAllHourGlasses = ArrayList<Int>(16)

        for (i in 0 until (arr.size - 2))
            for (j in 0 until (arr.size - 2)) {

                val sumOfHourGlass =
                    arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]

                sumOfAllHourGlasses.add(sumOfHourGlass)
            }
        return sumOfAllHourGlasses.max()!!
    }

}

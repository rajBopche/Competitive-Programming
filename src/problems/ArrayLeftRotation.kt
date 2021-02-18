package problems

class ArrayLeftRotation {

    fun rotLeft(a: Array<Int>, d: Int): Array<Int> {

        val newTempArray = a.clone()
        val arraySize = a.size
        if (d == arraySize) return a
        for (i in a.indices) {

            var newPos = i - d
            if (newPos < 0) newPos += arraySize

            a[newPos] = newTempArray[i]


        }
        return a
    }

}
package problems

fun countApplesAndOranges(
    houseStart: Int,
    houseEnd: Int,
    appleTree: Int,
    orangeTree: Int,
    apples: Array<Int>,
    oranges: Array<Int>
) {

    var appleCount = 0
    var orangeCount = 0

    apples.forEach { dist ->
        val tDist = (dist + appleTree)
        if (tDist in houseStart..houseEnd) {
            ++appleCount
        }
    }

    oranges.forEach { dist ->
        val tDist = (dist + orangeTree)
        if (tDist in houseStart..houseEnd) {
            ++orangeCount
        }
    }

    print("$appleCount\n$orangeCount")

}
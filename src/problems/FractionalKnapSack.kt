package problems

fun findMaxProfit(knapSackLimit: Int, items: Array<Int>, weight: Array<Int>, profits: Array<Int>): Float {

    var pwMap = HashMap<Int, Float>()

    for (i in items.indices) {
        val ratio: Float = (profits[i] / weight[i].toFloat())
        pwMap[i] = ratio
    }

    pwMap = pwMap.toList().sortedByDescending { (_, value) -> value }.toMap() as HashMap

    var weightSum = 0
    var profit = 0f
    var tempWeight = 0
    var tempProfit = 0

    run {
        pwMap.forEach { (key) ->

            tempWeight = weight[key]
            tempProfit = profits[key]
            val tempSum = weightSum + tempWeight
            if (tempSum > knapSackLimit) return@run

            weightSum += weight[key]
            profit += profits[key]
        }
    }

    val ratio = (knapSackLimit - weightSum) / tempWeight.toFloat()
    profit += ratio * tempProfit

    return profit
}

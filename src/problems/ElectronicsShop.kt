package problems

fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    return if (keyboards.size > drives.size) {
        findMaxMoney(keyboards, drives, b)
    } else {
        findMaxMoney(drives, keyboards, b)
    }
}

private fun findMaxMoney(longArr: Array<Int>, shortArr: Array<Int>, budget: Int): Int {

    var maxMoney = -1

    for (i in 0..shortArr.lastIndex) {
        if (shortArr[i] >= budget) continue
        for (j in 0..longArr.lastIndex) {
            if (longArr[j] >= budget) continue
            else {
                val sum = longArr[j] + shortArr[i]
                if (sum > budget) continue
                if (sum > maxMoney) maxMoney = sum
            }
        }
    }

    return maxMoney
}

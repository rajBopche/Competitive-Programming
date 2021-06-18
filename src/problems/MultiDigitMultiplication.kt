package problems

fun multiply(str1: String, str2: String): String {

    val temp1 = StringBuilder(str1)
    val temp2 = StringBuilder(str2)
    val prevResult = StringBuilder()
    val final = StringBuilder()

    for (i in temp2.indices) {
        val lastDig = temp2.last().toString().toInt()
        var carry = 0
        for (j in temp1.indices) {
            val lD = temp1.last().toString().toInt()
            var result = lastDig * lD + carry
            carry = result / 10
            if (result >= 10) {
                result %= 10
            }
            final.append(result)
            temp1.deleteCharAt(temp1.lastIndex)
        }
        if (carry != 0) {
            final.append(carry)
        }

        for (k in 0 until i) {
            final.insert(0, 0)
        }

        val result = multiAdd(prevResult.toString(), final.reverse().toString())
        prevResult.clear()
        prevResult.append(result)
        final.clear()
        temp1.append(str1)
        temp2.deleteCharAt(temp2.lastIndex)
    }
    return prevResult.toString()
}

fun multiAdd(num1: String, num2: String): String {

    if (num1.isBlank()) return num2
    if (num2.isBlank()) return num1

    var lowNum: Long
    var highNum: Long
    val sb = StringBuilder()

    if (num1.toLong() > num2.toLong()) {
        lowNum = num2.toLong()
        highNum = num1.toLong()
    } else {
        lowNum = num1.toLong()
        highNum = num2.toLong()
    }

    var carry = 0L

    while (highNum > 0) {

        val l1 = lowNum % 10
        val l2 = highNum % 10

        val temp = l1 + l2 + carry

        if (temp >= 10) {
            carry = temp / 10
            sb.append(temp % 10)
        } else {
            carry = 0
            sb.append(temp)
        }
        highNum /= 10
        lowNum /= 10
    }
    sb.append(carry)
    return sb.reverse().toString()
}
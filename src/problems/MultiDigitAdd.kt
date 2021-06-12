package problems

fun multiDigitAddition(num1: String, num2: String): String {
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
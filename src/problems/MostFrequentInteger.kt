package problems

class MostFrequentInteger {


    fun random() {
        readLine()!!.toInt()
        val n = readLine()!!.split(" ").map { item -> item.toInt() }.sortedBy { it }
        val m = LinkedHashMap<Int, Int>()
        var l = Int.MIN_VALUE
        var a = Int.MIN_VALUE

        //use the hashmap to maintain the frequency count, use LinkedHashMap for maintaining order
        n.forEach { number ->
            if (m[number] == null) {
                m[number] = 1
            } else {
                m[number] = (m[number]!!) + 1
            }
        }

        m.forEach { (k, v) ->
            if (v > l) {
                l = v
                a = k
            }
        }
        println(a)
    }
}

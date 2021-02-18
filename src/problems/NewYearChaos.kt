package problems

class NewYearChaos {

    fun minimumBribes(q: Array<Int>) {

        var minBribes = 0

        if (q.size == 1) {
            println(0)
            return
        }

        for (i in (q.size - 1) downTo 0) {
            if (q[i] != (i + 1)) {

                when {
                    q[i - 1] == (i + 1) -> {
                        ++minBribes
                        q[i - 1] = q[i].also { q[i] = q[i - 1] }
                    }
                    q[i - 2] == (i + 1) -> {
                        minBribes += 2
                        q[i - 2] = q[i - 1]
                        q[i - 1] = q[i]
                        q[i] = i + 1
                    }
                    else -> {
                        println("Too chaotic")
                        return
                    }
                }
            }
        }
        println(minBribes)
    }
}
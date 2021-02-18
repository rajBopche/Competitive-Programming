package problems

class JumpingOnClouds {

    fun jumpingOnClouds(c: Array<Int>): Int {
        var jump = 0
        var currentCloudPosition = 0

        if (c.size == 2) return 1

        while ((currentCloudPosition + 2) < c.size) {

            currentCloudPosition += if (c[currentCloudPosition + 2] == 0) 2 else 1
            ++jump

        }

        try {
            if (c[currentCloudPosition + 1] == 0) ++jump
        } catch (e: Exception) {

        }

        return jump
    }

}
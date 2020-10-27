class RansomNote {

    fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {

        val magazineMap = hashMapOf<String, Int>()

        if (note.size > magazine.size) {
            println("No")
            return
        }

        magazine.forEach { word ->

            var wordFrequency = magazineMap[word]
            if (wordFrequency == null) magazineMap[word] = 1
            else magazineMap[word] = ++wordFrequency

        }

        note.forEach { word ->
            var wordFrequency = magazineMap[word]
            if (wordFrequency == null || wordFrequency == 0) {
                println("No")
                return
            } else {
                var wordCount = magazineMap[word]
                if (wordCount != null) magazineMap[word] = --wordCount
            }
        }
        println("Yes")
    }

}
import kotlin.math.floor

class SalesByMatch {


    fun countPairsOfSocksOfDifferentColors(arrayOfSocks: Array<Int>): Int {
        var numberOfDifferentColouredPairs = 0
        val lookupMap = HashMap<Int, Int>()

        arrayOfSocks.forEach { colouredSock ->
            var colouredSockFrequency = lookupMap[colouredSock]
            if (colouredSockFrequency == null) lookupMap[colouredSock] = 1
            else lookupMap[colouredSock] = ++colouredSockFrequency
        }

        lookupMap.values.forEach { colouredSockCount ->
            numberOfDifferentColouredPairs += floor((colouredSockCount / 2).toDouble()).toInt()
        }

        return numberOfDifferentColouredPairs
    }


}



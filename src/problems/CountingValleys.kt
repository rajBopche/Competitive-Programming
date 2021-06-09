package problems

fun countingValleys(steps: Int, path: String): Int {

    if (steps == 0) return 0;
    var level = 0
    var valleyCounter = 0

    for (index in 0 until steps) {

        val currentStep = path.get(index)

        if (currentStep == 'D') --level
        else ++level

        //If we are at level 0 and we used step = 'U' implies
        // we have just crossed a valley
        if (level == 0 && currentStep == 'U') {
            ++valleyCounter
        }
    }
    return valleyCounter;
}

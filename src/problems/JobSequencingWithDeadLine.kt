package problems

data class Job(val id: Int, val profit: Int, val deadLine: Int) : Comparable<Job> {

    override fun compareTo(other: Job): Int {
        return when {
            this.profit == other.profit -> 0
            this.profit > other.profit -> 1
            else -> -1
        }
    }
}

fun findSequence(items: Array<Job>): Array<Int> {

    items.sortDescending()
    var maxDeadLine = 0
    for (i in items.indices) {
        if (items[i].deadLine > maxDeadLine) maxDeadLine = items[i].deadLine
    }

    val slots = Array(maxDeadLine) { 0 }
    var inc = 1
    var slotIndex: Int
    items.forEach { job ->
        while (!isAllSlotsFull(slots)) {
            slotIndex = job.deadLine - inc
            if (slotIndex < 0) break
            if (slots[slotIndex] == 0) {
                slots[slotIndex] = job.id
                break
            }
            ++inc
        }
        inc = 1
        if (isAllSlotsFull(slots)) return slots
    }
    return slots
}

fun isAllSlotsFull(slots: Array<Int>): Boolean {

    for (i in slots.indices) {
        if (slots[i] == 0) return false
    }

    return true
}


fun main() {
    val jobArr = arrayOf(
        Job(1, 100, 2),
        Job(2, 19, 1),
        Job(3, 27, 2),
        Job(4, 25, 1),
        Job(5, 15, 3)
    )
    findSequence(jobArr).map { item -> print(" $item") }
}
package problems

fun printZigZag(str: String, rows: Int): String {

    if (rows == 1) return str

    var direction = true //If true inc row else dec row
    val bucket = Array(rows) { "" }
    val lastRow = rows - 1
    var tempRow = 0

    str.forEach { char ->
        if (tempRow == lastRow) direction = false
        if (tempRow == 0) direction = true
        bucket[tempRow] = "${bucket[tempRow]}$char"
        if (direction) ++tempRow
        else --tempRow
    }

    return bucket.flatMap { it.asIterable() }.joinToString().replace(", ", "")
}
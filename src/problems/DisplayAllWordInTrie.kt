package problems

class Tries {

    val root = TrieNode()

    class TrieNode(var data: Char = Char.MIN_VALUE, var isWord: Boolean = false) {
        val childrenList: Array<TrieNode?> = Array<TrieNode?>(26) { null }
    }

     fun insert(key: String) {
        var currentNode = root
        key.forEach {
            val index = it - 'a'
            if (currentNode.childrenList[index] == null) {
                val node = TrieNode(it, false)
                currentNode.childrenList[index] = node
            }
            currentNode = currentNode.childrenList[index]!!
        }
        currentNode.isWord = true
    }

     fun displayAllWords(root: TrieNode, strB: StringBuilder, level: Int) {
        val currentNode = root

        if (currentNode.isWord) {
            println(strB.toString() + "${currentNode.data}")
        }

        for (index in 0 until 26) {
            if (currentNode.childrenList[index] != null) {
                if (currentNode.data == Char.MIN_VALUE) strB.append("") else strB.append(currentNode.data)
                displayAllWords(currentNode.childrenList[index]!!, strB, level + 1)
                if (level != 0) strB.setLength(level - 1)
            }
        }
    }
}
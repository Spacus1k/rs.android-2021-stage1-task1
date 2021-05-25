package subtask3

import java.util.*

class StringParser {

    fun getResult(inputString: String): Array<String> {

        val roundBracketsStack = Stack<Int>()
        val squareBracketsStack = Stack<Int>()
        val triangularBracketsStack = Stack<Int>()
        val outputString = mutableListOf<Pair<Int, Int>>()
        var startIndex = -1

        inputString.forEachIndexed { index, symbol ->
            when (symbol) {
                '(' -> roundBracketsStack.push(index)
                ')' -> if (roundBracketsStack.size > 0) {
                    startIndex = roundBracketsStack.pop()
                    outputString.add(Pair(startIndex + 1, index))
                }
                '[' -> squareBracketsStack.push(index)
                ']' -> if (squareBracketsStack.size > 0) {
                    startIndex = squareBracketsStack.pop()
                    outputString.add(Pair(startIndex + 1, index))
                }
                '<' -> triangularBracketsStack.push(index)
                '>' -> if (triangularBracketsStack.size > 0) {
                    startIndex = triangularBracketsStack.pop()
                    outputString.add(Pair(startIndex + 1, index))
                }
            }
        }
        outputString.sortBy { it.first }
        return outputString.map { inputString.substring(it.first, it.second) }.toTypedArray()
    }
}

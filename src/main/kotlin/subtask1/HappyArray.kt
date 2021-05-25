package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyArray = sadArray.toMutableList()
        for (index in happyArray.size - 3 downTo 0) {
            if (happyArray[index + 1] > happyArray[index] + happyArray[index + 2]) {
                happyArray.removeAt(index + 1)
            }
        }
        return happyArray.toIntArray()
    }
}

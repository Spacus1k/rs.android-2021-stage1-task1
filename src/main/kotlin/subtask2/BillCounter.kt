package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val billAnna = (bill.sum() - bill[k]) / 2
        return if (billAnna == b) {
            "Bon Appetit"
        } else {
            return (b - billAnna).toString()
        }
    }
}

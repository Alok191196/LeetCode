class TwoSum {
    fun findPair(inputArray: IntArray, target: Int): Pair<Int, Int> {
        var sum = -1
        var i = 0
        var j = inputArray.size.minus(1)
        while (sum != target) {
            sum = inputArray[i] + inputArray[j]
            if (sum > target) {
                j -= 1
            }

            if (sum  < target) {
                i += 1
            }
        }
        return Pair(inputArray[i], inputArray[j])
    }
}

fun main() {
    println(TwoSum().findPair(intArrayOf(1, 2, 4, 6, 8, 9, 14, 15), target = 13))
    println(TwoSum().findPair(intArrayOf(2,7,11,15), target = 9))
    println(TwoSum().findPair(intArrayOf(3,2,4), target = 6))
    println(TwoSum().findPair(intArrayOf(3,3), target = 6))
}
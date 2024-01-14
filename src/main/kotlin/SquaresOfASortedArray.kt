import java.lang.Math.abs

class SquaresOfASortedArray {
    fun find(nums: IntArray): IntArray {
        /*intArray.forEachIndexed { index, value->
            intArray[index] = intArray[index] * intArray[index]
        }
        intArray.sort()
        return intArray*/


        val arr = IntArray(nums.size)
        var i = 0
        var j = nums.size - 1
        while (i <= j) {
            if (abs(nums[j]) > abs(nums[i])) {
                arr[j-i] = nums[j] * nums[j]
                j--
            } else {
                arr[j-i] = nums[i] * nums[i]
                i++
            }
        }
        return arr
    }

}

fun main() {
    println(SquaresOfASortedArray().find(intArrayOf(-4,-1,0,3,10)).asList())
}
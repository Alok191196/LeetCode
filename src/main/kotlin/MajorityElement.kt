class MajorityElement {

    fun majorityElement(nums: IntArray): Int {
        val frequencyMap = hashMapOf<Int, Int>()
        var maxKey = -1
        var maxVal = -1
        if (nums.size == 1)
            return nums.first()
        for (num in nums) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap[num] = frequencyMap[num]?.plus(1)!!
                if (frequencyMap[num]!! > maxVal) {
                    maxVal = frequencyMap[num]!!
                    maxKey = num
                }
            } else {
                frequencyMap[num] = 1
            }
        }
        return maxKey
    }

}

fun main(args: Array<String>) {
    val input = intArrayOf(3,2,3)
    val input2 = intArrayOf(2,2,1,1,1,2,2)
    val input3 = intArrayOf(1)
    val input4 = intArrayOf(5)
    println(MajorityElement().majorityElement(input3))
    println(MajorityElement().majorityElement(input4))
}

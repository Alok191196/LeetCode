class MajorityElement {

    fun solution1(nums: IntArray): Int {
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


    fun solution2(nums: IntArray) : Int {
        nums.sort()
        return nums[nums.size/2]
    }

}

fun main(args: Array<String>) {
    val input = intArrayOf(3,2,3)
    val input2 = intArrayOf(2,2,1,1,1,2,2)
    val input3 = intArrayOf(1)
    val input4 = intArrayOf(5)
    println(MajorityElement().solution2(input))
    println(MajorityElement().solution2(input2))
    println(MajorityElement().solution2(input3))
    println(MajorityElement().solution2(input4))
}

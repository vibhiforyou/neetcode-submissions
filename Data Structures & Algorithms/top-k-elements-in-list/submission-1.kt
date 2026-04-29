class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = nums.toList().groupingBy { it }.eachCount().toList().sortedByDescending { it.second }
        val result = mutableListOf<Int>()
        for(i in 0..k-1){
            result.add(map.get(i).first)
        }
        return result.toList().toIntArray()
    }
}

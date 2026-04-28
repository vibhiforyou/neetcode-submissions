class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
       val map = mutableMapOf<Int,Int>()
       for (i in 0..nums.size-1) {
           val difference = target-nums[i]
           if(map.containsKey(difference)){
               return intArrayOf(map[difference]!!,i)
           }
           else
           {
               map.put(nums[i],i)
           }
       }
        return intArrayOf()
    }
}

class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val elements = mutableMapOf<Int,Int>();
        
        for(num in nums){
            if(elements.containsKey(num)){
               val existingElement = elements.get(num)
                elements.put(num,existingElement!!+1)
            }
            else
            {
                elements.put(num,1)
            }
        }
        for ( (key,value) in elements){
            if(value>1){
                return true
            }
        }
        return false
    }
}

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sCount = s.lowercase().groupingBy { it }.eachCount()
        val tCount = t.lowercase().groupingBy{it}.eachCount()
        
        if(sCount.size == tCount.size)
        {
        for((key,value ) in sCount){
            if((tCount.containsKey(key) && tCount.get(key)!=value) or !tCount.containsKey(key))
            {
                return false
            }
        }
        }
        else
        {
            return false
        }
        return true
    }
}

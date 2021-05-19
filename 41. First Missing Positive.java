class Solution {
    public int firstMissingPositive(int[] nums) {
        
        TreeMap<Integer,Boolean> mp = new TreeMap<>();
        
        for(int a:nums)
            if(a>0)
                mp.putIfAbsent(a,true);
        
        int i=1;
        for (int a:mp.keySet())
        {
            if(a!=i)
                 return i;
            ++i;
        }
        
        return mp.size()+1;
        
    }
}
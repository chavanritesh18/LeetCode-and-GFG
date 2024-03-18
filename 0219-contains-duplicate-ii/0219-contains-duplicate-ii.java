class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        
        if(k == 0)
        {
            return false;
        }
        
        HashMap<Integer , Integer > hm =  new HashMap<>();
        
        for(int i  = 0; i < nums.length; i++)
        {
            int ans  =  nums[i];
            
            if(hm.containsKey(ans) && i - hm.get(ans) <= k)
            {
                return true;
            }
            hm.put(ans , i);
        }
        
        return false;
    }
}
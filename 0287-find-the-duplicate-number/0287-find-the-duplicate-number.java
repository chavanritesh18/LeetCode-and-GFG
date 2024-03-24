class Solution {
    public int findDuplicate(int[] nums) {
        
        HashSet<Integer> hm  =  new HashSet<>();

        for(int ele : nums)
        {
            if(hm.contains(ele))
            {
                return ele;
            }

            hm.add(ele);
        }

        return -1;
    }
}
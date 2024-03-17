class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int n = strs.length;
        
        if(n == 0) return "";
        
        Arrays.sort(strs);
        
        String first = strs[0] , last = strs[n-1];
        
        int i  = 0;
        
        while( i < first.length())
        {
            if(first.charAt(i) == last.charAt(i))
            {
                i+=1;
            }
            else
            {
                break;
            }
        }
        
        return i == 0 ? "" :first.substring(0,i);
    }
}
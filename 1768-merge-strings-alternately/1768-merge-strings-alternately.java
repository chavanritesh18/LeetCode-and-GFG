class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String ans  = "";

        int n1  = word1.length();
        int n2  = word2.length();

        int n = Math.min(n1 , n2);

        for(int i  = 0; i < n; i++)
        {
            ans+=word1.charAt(i);
            ans+=word2.charAt(i);
        }

        if(n1 < n2)
        {
            for(int i = n; i < n2; i++)
            {
                   ans += word2.charAt(i);
            }
        } else
        {
            for(int i  = n; i < n1; i++)
            {
                ans += word1.charAt(i);
            }
        }

        return ans;
    }
}
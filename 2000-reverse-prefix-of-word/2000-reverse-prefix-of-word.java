class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder ans = new StringBuilder();
        int index = 0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                index = i;
                break;
            }
        }

        if(index!=0){ //only if index of ch found in index
            for(int i=index;i>=0;i--){
                ans.append(word.charAt(i));
            }
            for(int i=index+1;i<word.length();i++){
                ans.append(word.charAt(i));
            }
        }
        return index==0?word:ans.toString(); 
    }
}
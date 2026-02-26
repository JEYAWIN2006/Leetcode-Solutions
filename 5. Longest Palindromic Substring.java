class Solution {
    public String longestPalindrome(String s) {
        int k=s.length();
        int start=0;
        int maxLen=1; 
        if(k<=1){
            return s;
        }
        for(int i=0;i<k;i++){
            int left=i;
            int right=i;
            while(left>=0 && right<k &&s.charAt(right)==s.charAt(left)){
                int curlen=right-left+1;
                if(curlen>maxLen){
                    start=left;
                    maxLen=curlen;
                }
                left--;
                right++;
            }
            left = i;
            right = i + 1;

            while (left >= 0 && right < k && s.charAt(left) == s.charAt(right)) {
                int curlen = right - left + 1;

                if (curlen > maxLen) {
                    start = left;
                    maxLen = curlen;
                }

                left--;
                right++;
            }
        }
        return s.substring(start, start +maxLen);
        }

       
        
    
}

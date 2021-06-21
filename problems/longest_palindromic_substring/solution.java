class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        int maxLen=1;
        int start=0;
        int[][] dp = new int[len][len];
        for(int i=0;i<len;i++){
            dp[i][i]=1;
            if(i>0)
            {
                if(s.charAt(i)==s.charAt(i-1)){
                    dp[i-1][i]=1;
                    start=i-1;
                    maxLen=2;
                }
            }
        }
        for(int i=3;i<=len;i++)
        {
            for(int j=0;j<len-i+1;j++)
            {
                int k=j+i-1;
                if(s.charAt(j)==s.charAt(k) && dp[j+1][k-1]==1){
                    dp[j][k]=1;
                    maxLen=i;
                    start=j;
                }
            }
        }
        
        return s.substring(start,start+maxLen);
        
    }
}
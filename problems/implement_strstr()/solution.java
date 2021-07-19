class Solution {
    public int strStr(String haystack, String needle) {
         if(needle == null || needle.trim().length()     == 0) return 0;
    if(haystack.trim().length() < needle.trim().length()) return -1;
    
    int m = haystack.length();
    int n = needle.length();
    int j;
    int temp;
    
    for(int i=0;i<m;i++){
        
        j=0;
        temp = i;
        
        while(temp < m && j < n 
              && haystack.charAt(temp) == needle.charAt(j)){
            temp++;
            j++;
        }
        
        if(j == n) return i;
        if(temp == m) return -1;
            
    }
    return -1;
    }
}
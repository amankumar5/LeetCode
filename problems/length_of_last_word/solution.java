class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        String str = s.trim();
        int len = str.length();
        if(len == 0)
            return 0;
        else
        {
            
            for(int i=len-1;i>=0;i--)
            {
                if(str.charAt(i)==' ')
                    break;
                else
                    count++;
            }
        }
        return count;
    }
}
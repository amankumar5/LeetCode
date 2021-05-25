class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        else
        {
            int res=x;
            long rev=0;
            while(x>0)
            {
                int a=x%10;
                x/=10;
                rev=rev*10+a;
            }
            if(rev==res)
                return true;
            else
                return false;
        }
        
    }
}
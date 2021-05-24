class Solution {
    public int reverse(int x) {
        long sum=0;
        if(x>-1){
            while(x>0)
            {
                int a=x%10;
                sum=sum*10+a;
                x=x/10;
            }
        }
        else{
            x*=(-1);
            while(x>0)
            {
               int a=x%10;
                sum=sum*10+a;
                x=x/10;
            }
            sum*=(-1);
        }
        int limit=2^31;
        if(sum<=2147483647 && sum>=-2147483648){
            
        return (int)sum;
        }
        else
            return 0;
            
    }
}
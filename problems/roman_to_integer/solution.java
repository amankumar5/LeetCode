class Solution {
    public int getValue(char c)
    {
        switch(c)
        {
            case 'I' : return 1;
                    
            case 'V' : return 5;
                   
            case 'X' : return 10;
                    
            case 'L' : return 50;
                  
            case 'C' : return 100;
                     
            case 'D' : return 500;
                    
            case 'M' : return 1000;
                    
            default : return -1;
                     
        }
    }
    public int romanToInt(String s) {
        int sum=0;
        int len=s.length();
        for(int i=0;i<len;i++)
        {
           int val=getValue(s.charAt(i));
            if(i<len-1){
            if(val<getValue(s.charAt(i+1)))
            {
                sum=sum-val;
            }
            else
            {
                sum+=val;
            }
            }
            else
                sum+=val;
        }
        return sum;
    }
}
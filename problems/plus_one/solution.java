class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        int len=digits.length;
       for(int i=len-1;i>=0;i--)
       {
           if(carry==0)
               break;
           digits[i]+=1;
           if(digits[i]==10)
           {
               carry=1;
               digits[i]=0;
           }
           else
               carry=0;
       }
        if(carry==0)
            return digits;
        else
        {
            int[] arr= new int[len+1];
            arr[0]=1;
            int pos=1;
            for(int i=0;i<len;i++)
            {
                arr[pos++]=digits[i];
            }
            return arr;
        }
    }
}
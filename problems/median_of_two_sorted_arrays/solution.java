class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLen = nums1.length + nums2.length;
        int[] arr=new int[totalLen/ 2+ 1];
        int i=0;
        int a=0;
        int b=0;
        int num1Len =nums1.length;
        int num2Len =nums2.length;
        while(a<num1Len && b<num2Len && i<totalLen/2+1)
        {
            if(nums1[a]<nums2[b])
            {
                arr[i]=nums1[a];
                a++;
            }
            else
            {
                arr[i]=nums2[b];
                b++;
            }
            i++;
        }
        if(a>=num1Len && b<num2Len)
        {
            while(i<totalLen/2+1 && b<num2Len)
            {
                arr[i]=nums2[b];
                i++;
                b++;
            }
        }
        if(a<num1Len && b>=num2Len)
        {
            while(i<totalLen/2+1 && a<num1Len)
            {
                arr[i]=nums1[a];
                i++;
                a++;
            }
        }
        if(totalLen%2==0)
        {
            return (double)(arr[totalLen/2]+arr[totalLen/2-1])/2;
        }
        else
        {
           return (double)arr[totalLen/2] ;
        }
       
    }
}
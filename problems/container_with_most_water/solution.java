class Solution {
    public int maxArea(int[] height) {
        int start =0;
        int end = height.length-1;
        int maxArea=0;
        while(start<end)
        {
            int len = height[start]<height[end]?height[start]:height[end];
            int area= (end-start)*len;
            if(area>maxArea)
                maxArea=area;
            if(len ==height[start])
                start++;
            else
                end--;
        }
        return maxArea;
    }
}
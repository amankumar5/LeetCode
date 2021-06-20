class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0,end=0;
        Map <Character,Integer> seen=new HashMap<Character, Integer>();
        int max=0;
        int len = s.length();
        for(end=0;end<len;end++)
        {
            if(seen.containsKey(s.charAt(end)))
            {
                int gotAtIndex = seen.get(s.charAt(end))+1;
                start=start > gotAtIndex ? start: gotAtIndex;
            }
            seen.put(s.charAt(end),end);
            int index = end-start+1;
            max= max > index? max: index; 
        }
        return max;
    }
}
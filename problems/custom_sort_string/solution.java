class Solution {
    public String customSortString(String order, String str) {
        char[] ch = str.toCharArray();
        int[] count = new int[26];
        for(int i = 0; i < str.length(); i++ )
        {
            count[ch[i]-'a']++;
        }
        int index = 0;
        for (int i = 0; i < order.length(); i++) {
            for (int j = 0; (count[order.charAt(i) - 'a']--)>0; j++) {
                ch[index++]=order.charAt(i);
            }
        }
        for(int i = 0; i < 26 ;i++)
        {
            while(count[i]>0){
            ch[index++]=(char)('a'+i);
                count[i]--;
            }
        }
        return String.valueOf(ch);
    }
}
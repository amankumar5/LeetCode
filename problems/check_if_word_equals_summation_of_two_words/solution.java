class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int first = convertToInt(firstWord);
        int second = convertToInt(secondWord);
        int target = convertToInt(targetWord);
        
        return target == first + second;
    }
    private int convertToInt(String word){
        int integer = 0;
        for(char ch : word.toCharArray()){
            integer *= 10;
            integer += ch - 'a';
        }
        return integer;
    }
}
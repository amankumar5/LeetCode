class Solution {
    public String intToRoman(int num) {
        
        String roman = "";
        int[] numbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] rom ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<numbers.length;i++) {
            while(num >= numbers[i]) {
                num -= numbers[i];
                roman=roman+rom[i];
            }
        }
        return roman;
        
    
    }
}
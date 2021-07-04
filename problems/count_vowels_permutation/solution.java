class Solution {
    public Map<String, Long> dp= new HashMap<String, Long>();
    public long solve(int n, char c)
    {
        if(dp.containsKey(n+","+c)){
            return dp.get(n+","+c);
        }
        if(n==1)
            return 1;
        long res = 0;
        switch(c)
        {
            case 'a' : res = (solve(n-1,'e')) % 1000000007;
                       break;
            case 'e' : res = (solve(n-1, 'a')+solve(n-1, 'i'))% 1000000007;
                       break;
            case 'i' : res = (solve(n-1, 'a')+solve(n-1,'e')+solve(n-1, 'o')+solve(n-1, 'u'))% 1000000007;
                       break;
            case 'o' : res = (solve(n-1, 'i')+solve(n-1, 'u'))% 1000000007;
                       break;
            case 'u' : res = (solve(n-1, 'a'))% 1000000007;
                       break;
        }
        dp.put((n+","+c),res);
        return res;
    }
    public int countVowelPermutation(int n) {
        long a = solve(n,'a');
        long e = solve(n,'e');
        long i = solve(n,'i');
        long o = solve(n,'o');
        long u = solve(n,'u');
        return (int)((a+e+i+o+u)% 1000000007);
    }
}
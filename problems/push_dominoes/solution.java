class Solution {
    public String pushDominoes(String dominoes) {
        char[] arr = dominoes.toCharArray();
        int l = -1;
        int r = -1;
        int len = arr.length;
        char LastFound = 'k';
        for(int i = 0; i < len; i++)
        {
            if(arr[i] == 'L')
            {
                
                
                if(LastFound == 'R')
                {
                    int temr = r+1;
                    int teml = i-1;
                    while(temr<teml)
                    {
                        arr[teml] = 'L';
                        arr[temr] = 'R';
                        teml--;
                        temr++;
                    }
                    if(temr == teml)
                        arr[teml] = '.';
                }
                else
                {
                    if (LastFound == 'L'){
                    for(int j =l;j<i;j++)
                    {
                        arr[j]='L';
                    }
                    }
                    else
                    for(int j =0;j<i;j++)
                    {
                        arr[j]='L';
                    }
                }
                LastFound = 'L';
                l = i;
                
            }
            if(arr[i] == 'R')
            {
                if(LastFound == 'R')
                {
                    for(int j = r; j < i; j++)
                    {
                        arr[j]='R';
                    }
                }
                r = i;
                LastFound = 'R';
            }
            if(i == len-1 && r>l)
            {
                for(int j = r+1;j < len;j++)
                {
                    arr[j] = 'R';
                }
            }
        }
        return String.valueOf(arr);
    }
}
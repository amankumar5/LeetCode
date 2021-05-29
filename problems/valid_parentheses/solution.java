class Solution {
    public boolean isValid(String s) {
         Deque<Character> stack = new ArrayDeque<Character>();
        for(int j=0;j<s.length();j++)
        {
            char x=s.charAt(j);
            if(x =='(' || x =='{' || x =='[')
            {
                  stack.push(x);
                continue;
            }
            if(stack.isEmpty())
                return false;
            char check;
            switch(x)
            {
                case ')':
                    check=stack.pop();
                    if(check!='(')
                        return false;
                    break;
                case '}':
                    check=stack.pop();
                    if(check!='{')
                        return false;
                    break;
                case ']':
                    check=stack.pop();
                    if(check!='[')
                        return false;
                    break;
                default :
                    return false;
                    
            }
            
        }
        return stack.isEmpty();
        
    }
}
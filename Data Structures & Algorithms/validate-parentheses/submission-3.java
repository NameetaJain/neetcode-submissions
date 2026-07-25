class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty())
            return false;
        
        Stack<Character> st = new Stack<Character>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            } else {
                if(!st.isEmpty()){
                    char ch = st.pop();
                    if(ch == '(' && c != ')' ||
                        ch == '{' && c != '}' ||
                        ch == '[' && c != ']'
                    )
                        return false;
                } else return false;
            }
        }
        return st.isEmpty();
    }
}

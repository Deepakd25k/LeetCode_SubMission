class Solution {
    public boolean isValid(String s) {
       if(s == null) return false;
        
        Stack<Character> stack = new Stack<>();
        for(int i=0 ;i<s.length();i++) {
            char ch = s.charAt(i);
            if(!stack.isEmpty() && match(stack.peek() , ch)) {
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
    
    private boolean match(char ch1, char ch2) {
        return (ch1 == '(' && ch2 == ')') ||
            (ch1 == '[' && ch2 == ']') ||
            (ch1 == '{' && ch2 == '}');
    }
}
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s == null || goal == null) {
            //throw exception on A and B both being null?
            return false;
        }
        if(s.length() != goal.length()) {
            return false;
        }
        if(s.length() == 0) {
            return true;
        }
        for(int i = 0; i < s.length(); i++) {
            if(rotateString(s, goal, i)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean rotateString(String s, String goal, int rotation) {
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != goal.charAt((i+rotation)%goal.length())) {
                return false;
            }
        }
        return true;
    }
}
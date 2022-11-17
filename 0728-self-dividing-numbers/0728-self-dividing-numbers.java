class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> result = new ArrayList<>();
        for(int i = left ; i<=right ; i++) {
            if(isSelfDividing(i)) result.add(i);
        }
        
        return result;
    }
    
    public boolean isSelfDividing(int nums) {
        for(char c : String.valueOf(nums).toCharArray()) {
            if(c == '0' || nums % (c - '0') > 0) return false;
        }
        
        return true;
        
    }
}
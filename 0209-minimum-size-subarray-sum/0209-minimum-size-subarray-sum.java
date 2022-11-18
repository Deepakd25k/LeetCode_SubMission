class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int result = Integer.MAX_VALUE;
        int left_pointer = 0;
        int val_sum = 0;
        
        for(int i =0 ; i<nums.length; i++) {
            val_sum += nums[i];
            
            while(val_sum >= target) {
                result = Math.min(result , i+1-left_pointer);
                val_sum -= nums[left_pointer];
                left_pointer++;
            }
        }
        
        return result != Integer.MAX_VALUE ? result :0 ;
    }
}
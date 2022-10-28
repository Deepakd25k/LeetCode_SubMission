class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length, curMax = nums[0], max = nums[0], curMin = nums[0];
    
    for(int i=1; i<n; i++){
		/*
		nums[i] * curMin -> because if current number is -ve and curMin is also -ve then 
		mutiply both would be curMax*/
        
        int temp = curMax;
        curMax = Math.max(nums[i], Math.max(nums[i]*curMax, nums[i]*curMin));
        curMin = Math.min(nums[i], Math.min(nums[i]*temp, nums[i]*curMin));
        max = Math.max(max, curMax);
    }
    
    return max;
    }
}
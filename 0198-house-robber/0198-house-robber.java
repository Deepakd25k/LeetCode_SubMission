class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);

         return solve(nums,0,dp);
    }
    
    // recursion
    private int solve(int nums[],int i,int dp[]){
        
        if(i>=nums.length) return 0;
        
        if(dp[i]!=-1) return dp[i];
        
        int a=nums[i]+solve(nums,i+2,dp);
        int b=solve(nums,i+1,dp);
        
        return dp[i]=Math.max(a,b);
        
        
    }
}
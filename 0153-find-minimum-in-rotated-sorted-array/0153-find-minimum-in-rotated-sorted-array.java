class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

//         // If the first element is less than the last element then there is no rotation. The first element is minimum.
//         if(a[start] <= a[end]) {
//             return a[start];
//         }

//         while(start <= end) {
//             int mid = (start + end) / 2;

//             // If the middle element is smaller than its previous element, then it is the minimum element
//             if(mid > 0 && a[mid] < a[mid-1]) {
//                 return a[mid];
//             }

//             // If the middle is greater than its next element, then the next element is the minimum element
//             if(mid < n-1 && a[mid] > a[mid+1]) { 
//                 return a[mid+1];
//             }

//             if(a[start] <= a[mid]) { // left array is sorted. So the pivot is on the right side
//                 start = mid+1;
//             } else { //right array is sorted. So the pivot is on the left side
//                 end = mid-1;
//             }
//         }

//         return -1;
        
        
        int lo = 0, hi = nums.length - 1;
        
        if (nums[lo] < nums[hi]) return nums[lo];
        
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (nums[mid] > nums[hi]) {
                lo = mid + 1;
            } else if (nums[mid] < nums[hi]) {
                hi = mid;
        }
        }
        return nums[hi];
    }
}
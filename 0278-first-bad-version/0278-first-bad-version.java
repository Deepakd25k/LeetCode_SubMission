/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1, end=n;
        while(start<end){
		
            //Implement binary search logic
            //get the mid and pass it to function isBadVersion()
            //If mid is bad version (false) -> then start will be mid+1
            //If mid is good version (true) -> then end is mid
			
            int mid=  start+(end-start)/2;
            if(!isBadVersion(mid))
                start=mid+1;
            else
                end=mid;
        }
        return start;
    }
}
class Solution {
    public int searchInsert(int[] nums, int x) {
        int low = 0, high = nums.length - 1;
        int ans = -1; 
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == x)
                return mid;
            if (nums[mid] <= x) {
                     
                low = mid + 1;  
            } else {
                high = mid - 1;
            }
        }
        
        return low;
    }
}
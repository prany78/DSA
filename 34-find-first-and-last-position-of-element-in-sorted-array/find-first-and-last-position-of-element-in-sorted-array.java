class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = First(nums, target);
        int last = Last(nums, target);

        return new int[]{first, last};
    }
    public int First(int[] nums,int target){
        int a=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left +(right-left)/2;
            if(nums[mid]==target)
             {a=mid;
              right=mid-1;}
              else if(nums[mid]>target){
                 right=mid-1;
              }
              else{
                left=mid+1;
              }

        }
        

        return a;
    }
    public int Last(int[] nums,int target){
      int b=-1;
      int left=0;
      int right=nums.length-1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                b = mid;
                left = mid + 1;
            }
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return b;
    }
}
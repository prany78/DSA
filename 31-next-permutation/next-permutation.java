class Solution {
    public void nextPermutation(int[] nums) {
        int a=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
           { a=i;
            break;}
        }
        if(a!=-1)
        {
           for(int i=nums.length-1;i>a;i--)
           {
            if(nums[i]>nums[a])
            {
                swap(nums,i,a);
                break;
            }
           }
        }
        reverse(nums, a + 1, nums.length - 1);

    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }
}
class Solution {
    public void sortColors(int[] nums) {
        int a=nums.length;
        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(nums[i]>nums[j])
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        
    }
}
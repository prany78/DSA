class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int c=nums.length;
        int[] crr=new int[2];
        for(int i=0;i<c;i++)
        {
            for(int j=i+1;j<c;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    crr[0]=i;
                    crr[1]=j;
                }
            }
        }
        return crr;
        
    }
}
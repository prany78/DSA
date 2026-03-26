class Solution {
    public int singleNumber(int[] nums) {
        int a=nums.length;
        for(int i=0;i<a;i++)
        {
            int count=0;
            for(int j=0;j<a;j++)
            {
                if(nums[i]==nums[j])
                {count++;}
            }
            if(count==1)
        {
            return nums[i];
        }
        }
        
        return -1;

    }
    
}
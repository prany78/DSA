class Solution {
    public int missingNumber(int[] nums) {
        int a=nums.length;
       int sum=0;
       for(int i=0;i<a;i++)
       {
        sum=sum+nums[i];
       }
       int sum2=(a*(a+1))/2;
       return sum2-sum;

    }
}
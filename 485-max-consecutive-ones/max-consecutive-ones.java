class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int a=nums.length;
        int c=0;
        List<Integer> ma=new ArrayList<>();
        for(int i=0;i<a;i++)
        {
          if(nums[i]==1)
           {c++;
           ma.add(c);}
           else c=0;
        }
        if(ma.isEmpty())
        return 0;
        else{
        int maxValue = Collections.max(ma);
        return maxValue;
        }
    }
}
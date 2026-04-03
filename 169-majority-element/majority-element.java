class Solution {
    //this question. is solved using bayer moore and the canditate is not changed when the element changes but rather when the count becomse zero
    public int majorityElement(int[] nums)
    {
        int count=0;
        int a=nums[0];
        for(int i=0;i<nums.length;i++){
            if(count==0)
            {
                a=nums[i];
            }
          if(nums[i]==a)
            {
                count++;
            }
            else{count--;}
            }
            return a;
        }
         

    }
    

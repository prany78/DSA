class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> AL=new ArrayList<>();
        ArrayList<Integer> BL=new ArrayList<>();
        ArrayList<Integer> CL=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                AL.add(nums[i]);
            }else
            {
                BL.add(nums[i]);
            }
        }

        int[] res = new int[nums.length];
        int p = 0, n = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                res[i] = AL.get(p++);
            } else {
                res[i] = BL.get(n++);
            }
        }

        return res;
    }
}
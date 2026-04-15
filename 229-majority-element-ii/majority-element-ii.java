class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int count1=0;
       int count2=0;
       Integer ele1=null;
       Integer ele2=null;
       List<Integer> L1=new ArrayList<>();
       List<Integer> L2=new ArrayList<>();

       for(int i : nums)
       {
       if (ele1 != null && i == ele1) {
                count1++;
            } else if (ele2 != null && i == ele2) {
                count2++;
            } else if (count1 == 0) {
                ele1 = i;
                count1 = 1;
            } else if (count2 == 0) {
                ele2 = i;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
       }
      count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == ele1) count1++;
            else if (num == ele2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        if (count1 > n / 3) result.add(ele1);
        if (count2 > n / 3) result.add(ele2);

        return result;
}
}
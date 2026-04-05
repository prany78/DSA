/*class Solution {
    public int maxProfit(int[] prices) {
        int p1=0;
        
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int p2=0;
                p2=prices[j]-prices[i];
                if(p2>p1)
                {
                    p1=p2;
                }
            }
        }
        return p1;
    }
}
this works but it goes out of time index goes out as O(n2)
*/
class Solution {
    public int maxProfit(int[] prices)
    {
        int mp=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<mp)
            {mp=prices[i];}
            else{
                int pro=prices[i]-mp;
                max=Math.max(max,pro);
            }
        }
        return max;

    }
}
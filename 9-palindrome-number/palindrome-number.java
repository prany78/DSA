class Solution {
    public boolean isPalindrome(int x) {
     
        int a=0;
        int k=x;
        if(x<0)
        {
            return false;
        }
        else 
        {
           while(k>0)
           {
            int b=k%10;
            a=a*10+b;
            k=k/10;
           }
           return a==x;
        }
        
    }
}
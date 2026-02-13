class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String a=s;
        String ss="";
        for(int i=0;i<s.length();i++)
        {
           if(Character.isLetterOrDigit(s.charAt(i)))
           {
            ss=ss+s.charAt(i);
           }
        }
        String rev=new StringBuilder(ss).reverse().toString();
        return ss.equals(rev);
    }
}
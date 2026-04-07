class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        //the patern hers is we move first right then bottom then left then top   and then decrease each by one all and then repeat till it reaches the last element
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0,left=0;
        int bottom =m-1,right=n-1;
        List<Integer> sparr=new ArrayList<>();
        while(top<=bottom && left<=right)
        {
        for(int i=left;i<=right;i++)
        {
            sparr.add(matrix[top][i]);
            
        }
        top++;
        for(int i=top;i<=bottom;i++)
        {
            sparr.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom){
        for(int i=right;i>=left;i--)
        {
            sparr.add(matrix[bottom][i]);
        }
        bottom--;}
        if(left<=right){
        for(int i=bottom;i>=top;i--)
        {
            sparr.add(matrix[i][left]);
        }
        left++;
        }
        }
        return sparr;
    }
}
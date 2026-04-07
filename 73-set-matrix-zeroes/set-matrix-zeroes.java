/*class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> ma= new ArrayList<>();
        ArrayList<Integer> na= new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    ma.add(i);
                    na.add(j);
                }
            }
        }
         for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
              if(ma.contains(i)||na.contains(j))
               {
                matrix[i][j]=0;
               }
            }
        }

    }
}
this code works but theres an issue it has a total complexity of O(n^4)
*/
class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> rows= new ArrayList<>();
        ArrayList<Integer> cols= new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int r : rows) {
            for (int j = 0; j < n; j++) {
                matrix[r][j] = 0;
            }
        }

        
        for (int c : cols) {
            for (int i = 0; i < m; i++) {
                matrix[i][c] = 0;
    }
}
    }
}
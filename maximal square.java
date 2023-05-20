class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
        return 0;

        int sq=0;
        int evalmat[][]= new int[matrix.length+1][matrix[0].length+1];
        for(int i=1;i<=matrix.length;i++)
        {
            for(int j=1;j<=matrix[0].length;j++)
            {
                if(matrix[i-1][j-1]=='1')
                {
                    // if(matrix[i][j+1]==1 && matrix[i+1][j]==1 && matrix[i+1][j+1]==1)
                    // pow=2;

                    // else
                    // pow=0;
                    evalmat[i][j]=Math.min(evalmat[i][j-1],Math.min(evalmat[i-1][j], evalmat[i-1][j-1]))+1;
                    sq=Math.max(sq,evalmat[i][j]);
                }
            }
        }
        return sq*sq;
    }
}
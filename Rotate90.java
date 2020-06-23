class Solution {
    public void rotate(int[][] matrix) {
        //transpose
        int len=matrix.length;
                                        
        for(int i=0;i<len;i++)
        {
            for(int j=i;j<len;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
                    
        //loop for swapping
                                        
    for(int i=0;i<len;i++)
    {
        for(int j=0;j<len/2;j++)
        {
            int temp=matrix[i][j];
            matrix[i][j]=matrix[i][len-j-1];
            matrix[i][len-j-1]=temp;
            
        }
    }
                                        
        
    }
}

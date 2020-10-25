class Solution {
    public void setZeroes(int[][] matrix) {
        
        if(matrix.length==0)
            return;
        
     int row = matrix.length;
     int col=matrix[0].length;
        
    boolean isColZero=false;
    
        for(int k=0;k<col;k++)
        {
        if(matrix[0][k]==0)
        {
                isColZero=true;
            break;
        }
        }
        
        
    for(int i=1;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {  
            if(matrix[i][j]==0)
            {
                matrix[0][j]=0;
                matrix[i][0]=0;
            }
            
        }
    }
        
        //row
        for(int i=1;i<row;i++)
        {
            if(matrix[i][0]==0)
            {
                for(int j=1;j<col;j++)
                    matrix[i][j]=0;
            }
        }
        
        //col
        
        for(int j=0;j<col;j++)
        {
            if(matrix[0][j]==0)
            {
                for(int i=1;i<row;i++)
                    matrix[i][j]=0;
            }
        }
    
    while(isColZero)
    {
        for(int j=0;j<col;j++)
            matrix[0][j]=0;
        
        isColZero=false;
    }
        
    
        
        
    }
}

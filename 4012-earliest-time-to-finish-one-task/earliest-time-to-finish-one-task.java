class Solution 
{
    public int earliestTime(int[][] tasks) 
    {
        int row = tasks.length;
        int col = tasks[0].length;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < row; i++)
        {
            int sum = 0;
            for(int j = 0; j < col; j++)
            {
                sum += tasks[i][j];
            }
            if(sum < ans)
            {
                ans = sum;
            }
        }
        return ans;
    }
}
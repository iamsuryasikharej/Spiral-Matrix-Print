
public class MatrixPrint {
public void print(int [][]m,int row,int col)
{
	int start_row=0;
	int start_col=0;
	int direction=0;

	
	while (start_row<=row && start_col<=col)
	{
		if(direction ==0) {
			
		for(int i=start_col;i<=col;i++)
		{
			System.out.print(m[start_row][i]+",");
			
			
		}
		start_row++;
		
		direction=direction+1;
		
		}
		if(direction==1)
		{
			
			for(int i=start_row;i<=row;i++) {
			System.out.print(m[i][col]+",");
		}
			direction=direction +1;
			col--;
		}
		
		if(direction==2)
		{
			
			for (int i =col; i >=start_col&& start_row<row; i--) {
				System.out.print(m[row][i]+",");
				
			}
			row--;
			direction++;
		}
		if(direction==3)
		{
			for(int i=row;i>=start_row;i--)
			{
				System.out.print(m[i][start_col]+",");
			}
			start_col++;
			direction=0;
			
		}
		
	}
}
}

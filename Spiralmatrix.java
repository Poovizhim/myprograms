package myprograms;
import java.util.Scanner;
public class Spiralmatrix
{
	public static void main(String args[])
	{
		//Getting Input Matrix
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Matrix Size : ");
		int size=scan.nextInt();
		int i,j,count=0,left=0,right=0,top=0,bottom=0,end,start=0;
		int [][]mat=new int[size+1][size+1]; 
		System.out.println("Enter Matrix values : ");	
		for(i=1;i<=size;i++)
		{
			for(j=1;j<=size;j++)
			{
				mat[i][j]=scan.nextInt();
			}
		}
		//Finding starting position of Matrix 
		if(size%2==0)
		{
			left=size/2;
			right=left+1;
			top=size/2;
			bottom=top+1;
			end=size/2;
		}
		else
		{
			left=(size/2)+1;
			right=left+1;
			top=(size/2)+1;
			bottom=top+1;
			end=(size/2)+1;
		}
		while(start<end)
		{
			//Print Value from left to right
			for(i=left;i<=right;i++)
			{
				if(count<size*size)
				{
				System.out.print(mat[top][i]+" ");
				count++;
				}
			}
			left--;
			
			//Print value from top to bottom
			for(i=top+1;i<bottom;i++)
			{
				if(count<size*size)
				{
				System.out.print(mat[i][right]+" ");
				count++;
				}
			}
			top--;
			
			//Print value from right to left
			for(i=right;i>=left;i--)
			{
				if(count<size*size)
				{
				System.out.print(mat[bottom][i]+" ");
				count++;
				}
			}
			right++;
			
			//Print value from bottom to top
			for(i=bottom-1;i>top;i--)
			{
				if(count<size*size)
				{
				System.out.print(mat[i][left]+" ");
				count++;
				}
			}
			bottom++;
			start++;
		}
		scan.close();
	}
}

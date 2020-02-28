package myprograms;
import java.util.Scanner;
public class NqueensProblem
{
	public static void main(String args[])
	{
		//Getting Inputs
		Scanner scanner=new Scanner(System.in);
		int n,i=0,j=0,k=1,l=0,temp=0,even;
		System.out.println("Enter Matrix Size:");
		n=scanner.nextInt();
		char board[][]=new char[n][n];
		//Checking the Matrix Size
		if(n/2==2)
		{
			//Storing Queens Position in First Half Matrix
			for(i=0;i<n/2;i++)
			{
				for(j=0;j<n;j++)
				{
					if((j%2!=0)&&(j==k))
						board[i][j]='Q';
					else
						board[i][j]='.';
				}
				k=k+2;
			}
			//Storing Queens Position in Second Half Matrix
			for(i=n/2;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if((j%2==0)&&(j==l))
						board[i][j]='Q';
					else
						board[i][j]='.';
				}
				l=l+2;
			}
		}
		//Checking the Matrix Size
		else
		{
			//Storing Queens Position in First Half Matrix
			for(i=0;i<n/2;i++)
			{
				for(j=0;j<n;j++)
				{
					if((j%2!=0)&&(j==k))
						board[i][j]='Q';
					else
						board[i][j]='.';
				}
				k=k+2;
			}
			//Storing Queens Position in Second Half Matrix
			for(i=n/2;i<n;i++)
			{
				if(i%2==0)
				{
					even=temp+2;
					for(j=0;j<n;j++)
					{
						if((j%2==0)&&(j==even))
							board[i][j]='Q';
						else
							board[i][j]='.';
					}
					temp=temp+2;
				}
				else
				{
					even=temp-2;
					for(j=0;j<n;j++)
					{
						if((j%2==0)&&(j==even))
							board[i][j]='Q';
						else
							board[i][j]='.';
					}
					temp=temp+2;
				}
			}
		}
		//Printing All Queens Position in Matrix
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}

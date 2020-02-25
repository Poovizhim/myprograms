package myprograms;
import java.util.Scanner;
public class Chessboard
{
	public static void main(String args[])
	{
		//Getting input as Queen and Knight Position
		Scanner scan=new Scanner(System.in);
		int queen_row=scan.nextInt();
		int queen_column=scan.nextInt();
		int knight_row=scan.nextInt();
		int knight_column=scan.nextInt();
		//Check whether these position are cut to each other are not
		if(queen_row==knight_row)
		{
			System.out.println("They are cut each other");
		}
		else if(queen_column==knight_column)
		{
			System.out.println("They are cut each other");
		}
		else if(Math.abs(queen_row-knight_row)==Math.abs(queen_column-knight_column))
		{
			System.out.println("They are cut each other");
		}
		else if((Math.abs(queen_row-knight_row)==2)&&(Math.abs(queen_column-knight_column)==1))
		{
			System.out.println("They are cut each other");
		}
		else if((Math.abs(queen_row-knight_row)==1)&&(Math.abs(queen_column-knight_column)==2))
		{
			System.out.println("They cut each other");
		}
		else
		{
			System.out.println("They do not are cut each other");
		}
		scan.close();
	}

}

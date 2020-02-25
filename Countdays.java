package myprograms;
import java.util.Scanner;
public class Countdays
{
	public static void main(String args[])
	{
		//Getting Input as Date
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Date1:");
		int day1=scan.nextInt();
		System.out.println("Enter Month1");
		int month1=scan.nextInt();
		System.out.println("Enter Year1");
		int year1=scan.nextInt();
		System.out.println("Enter Date2");
		int day2=scan.nextInt();
		System.out.println("Enter Month2");
		int month2=scan.nextInt();
		System.out.println("Enter Year2");
		int year2=scan.nextInt();
		Countdays days=new Countdays();
		if(year2>=year1)
		days.calculatedays(year1,year2,month1,month2,day1,day2);
		else
		days.calculatedays(year2,year1,month2,month1,day2,day1);
		scan.close();
	}
	//Calculate Number of Days between 2 dates
	void calculatedays(int year1,int year2,int month1,int month2,int day1,int day2)
	{
		int count=0,i;
		for(i=year1;i<year2;i++)
		{
			if((i%4==0&&i%100!=0)||(i%400==0))
			{
				count+=366;
			}
			else
			{
				count+=365;
			}	
		}
		count-=month(month1,year1);
		count-=day1;
		count+=month(month2,year2);
		count+=day2;
		System.out.println("Number of days is: " +count);
	}
	int month(int month,int year)
	{
		int monthval[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		int val=0;
		for(int c=0;c<month-1;c++)
		{
			if(c==1)
			{
				if((year%4==0&&year%100!=0)||(year%400==0))
				//if(year%4==0)
				{
					val+=29;
				}
				else
				{
					val+=28;
				}
			}
			else
			{
				val+=monthval[c];
			}
		}
		return val;
	}
}

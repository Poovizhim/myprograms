package myprograms;
import java.util.Scanner;
public class CountDateAndTime
{
	public static void main(String args[])
	{
		//Getting Input as Date and Time
		Scanner scanner=new Scanner(System.in);
		int days,day1,month1,year1,day2,year2,month2,hour1,hour2,min1,min2,sec1,sec2,i,j;
		System.out.println("Enter Start day: ");
		day1=scanner.nextInt();
		System.out.println("Enter Start month: ");
		month1=scanner.nextInt();
		System.out.println("Enter Start year: ");
		year1=scanner.nextInt();
		System.out.println("Enter End day: ");
		day2=scanner.nextInt();
		System.out.println("Enter End month: ");
		month2=scanner.nextInt();
		System.out.println("Enter End year: ");
		year2=scanner.nextInt();
		System.out.println("Enter Start hour in 24hr format: ");
		hour1=scanner.nextInt();
		System.out.println("Enter Start minutue: ");
		min1=scanner.nextInt();
		System.out.println("Enter start Second: ");
		sec1=scanner.nextInt();
		System.out.println("Enter End hour in 24hr format: ");
		hour2=scanner.nextInt();
		System.out.println("Enter End minutue: ");
		min2=scanner.nextInt();
		System.out.println("Enter End Second: ");
		sec2=scanner.nextInt();
		CountDateAndTime day=new CountDateAndTime();
		if(year2>=year1)
		{
			days=day.calculatedays(year1,year2,month1,month2,day1,day2);
		}
		else
		{
			days=day.calculatedays(year2,year1,month2,month1,day2,day1);
		}
		int tot_sec=0,tot_min=0,tot_hour=0;
		if(sec1<=sec2)
		{
			tot_sec=sec2-sec1;
		}
		else
		{
			min1++;
			for(i=sec1;i<=60;i++)
			{
				tot_sec+=1;
			}
			for(j=1;j<sec2;j++)
			{
				tot_sec+=1;
			}
			if(tot_sec>=60)
			{
				tot_sec=tot_sec%60;
			}
		}
		if(min1<=min2)
		{
			tot_min=min2-min1;
		}
		else
		{
			hour1++;
			for(i=min1;i<=60;i++)
			{
				tot_min+=1;
			}
			for(j=1;j<min2;j++)
			{
				tot_min+=1;
			}
			if(tot_min>=60)
			{
				tot_min=tot_min%60;
			}
		}
		if(hour1<=hour2)
		{
			tot_hour=hour2-hour1;
		}
		else
		{
			days--;
			for(i=hour1;i<=24;i++)
			{
				tot_hour+=1;
			}
			for(j=1;j<hour2;j++)
			{
				tot_hour+=1;
			}
			if(tot_hour>=24)
			{
				tot_hour=tot_hour%24;
			}
		}
		System.out.println(days+" days");
		System.out.println(tot_hour+" hours");
		System.out.println(tot_min +" minutues");
		System.out.println(tot_sec +" seconds");
		scanner.close();
	}
	//Calculate Number of Days between 2 dates
	int calculatedays(int year1,int year2,int month1,int month2,int day1,int day2)
	{
		int count=0,i;
		for(i=year1;i<year2;i++)
		{
			if((i%4==0&&i%100!=0)||(i%400==0))
				count+=366;
			else
				count+=365;	
		}
		count-=month(month1,year1);
		count-=day1;
		count+=month(month2,year2);
		count+=day2;
		return count;
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
					val+=29;
				else
					val+=28;
			}
			else
			{
				val+=monthval[c];
			}
		}
		return val;
	}
}

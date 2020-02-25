package myprograms;
import java.util.*;
public class PowerNumber
{
	public static void main(String[] args)
	{
		//Getting Integer as Input
		Scanner scanner=new Scanner(System.in);
		int num;
		num=scanner.nextInt();
		int length=0,i=0,j=0,k=0,pow=1,sum=0;
		int a[]=new int[100];
		int b[]=new int[100];
		//Splitting the inputs
		while(num!=0)
		{
		    a[i]=num%10;
		    num/=10;
		    length++;
		    i++;
		}
		for(j=length-1;j>=0;j--)
		{
		    b[k]=a[j];
		    k++;
		}
		//Adding all Power Values 
		for(k=0;k<=length-1;k++)
		{
			if(k==length-1)
			{
				b[k+1]=b[0];
			}
			for(i=0;i<b[k+1];i++)
			{
				pow=pow*b[k];
			}
			sum=sum+pow;
			pow=1;
		}
		scanner.close();
		System.out.println("Sum of all power value is:"+sum);
	}
}
	

package myprograms;
import java.util.*;
public class Expand
{
	public static void main(String args[])
	{
		
		int i=0,n=1;
		char ch1=0;
		String str;
		String newstring="";
		
		//Getting Input String 
		Scanner scanner=new Scanner(System.in);
		str=scanner.nextLine();
		str=str+'\0';
		
		//Expanding String based on Count Value
		for(i = 0; i<str.length(); i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				if(str.charAt(i+1)>='0' && str.charAt(i+1)<='9')
				{
					n = (str.charAt(i)-'0')*10 + str.charAt(i+1) - '0';
					while( n!=0 )
					{
						System.out.print(newstring);
						n=n-1;
					}
					i++;
					newstring = "";
				}
				else
				{
					n = str.charAt(i)-'0';
					while( n!=0 )
					{
						System.out.print(newstring);
						n = n-1;
					}
					newstring = "";
				}
			}
			else
			{
				ch1 = str.charAt(i);
				if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
				{
					newstring += ch1;
				}
			}
		}
		scanner.close();
		}
}
		
	


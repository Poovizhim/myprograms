package myprograms;
import java.util.*;
public class FrequentWord
{
	public static void main(String[] args)
	{
		//Getting Input as Paragraph
		Scanner scanner=new Scanner(System.in);
		String str;
		int split=0,i,j,k=0,temp1,count=0;
		String temp="";
		str=scanner.nextLine();
		for( i = 0; i<str.length(); i++)
		{
			if(str.charAt(i)==' ')
			{
				split++;
			}
		}
		
		//Splitting Each word in Paragraph
		String word_arr[]=new String[split+1];
		int[] frequent=new int[100];
		String newstring="";
		for(i=0,j=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				word_arr[j]=newstring;
				j++;
				newstring="";
			}
			else
			{
				newstring+=str.charAt(i);
			}
			word_arr[j]=newstring;
		}
		
		for(i=0;i<word_arr.length;i++)
		{
			count=1;
			for(j=i+1;j<word_arr.length;j++)
			{
				if(word_arr[i].equals(word_arr[j]))
				{
					count++;
					word_arr[j]="0";
				}
			}
			if(word_arr[i]!="0")
			{
				frequent[k]=count;
				k++;
			}
		}
		
		//Finding Frequent Word based on high Count
		for(i=0;i<k;i++)
		{
			for(j=i+1;j<k;j++)
			{
				if(frequent[i]<frequent[j])
				{
					temp1=frequent[i];
					frequent[i]=frequent[j];
					frequent[j]=temp1;
					temp=word_arr[i];
					word_arr[i]=word_arr[j];
					word_arr[j]=temp;
				}
			}
		}
		
		//Printing Top 5 Frequent Word in Paragraph
		for(i=0;i<5;i++)
		{
			if(word_arr[i]!="0")
			System.out.println(word_arr[i]);
		}
		scanner.close();
	}
}

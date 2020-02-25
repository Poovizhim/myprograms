package myprograms;
import java.util.*;
public class RomanToNumber
{
    public static void main(String args[])
    {
    	//Getting Roman Numerals as input
	    Scanner scanner=new Scanner(System.in);
	    String str;
	    str=scanner.nextLine();
        RomanToNumber number=new RomanToNumber();
        System.out.println("The Number Form of RomanNumeral is:" +number.romanNumber(str));
        scanner.close();
    }
    
   //Converting RomanString to value
    int romanNumber(String str)
    {
        int sum=0;
        for(int i = 0; i<str.length(); i++)
        {
            int v1 = convertToValue(str.charAt(i));
            if( i+1 < str.length() )
            {
                int v2 = convertToValue(str.charAt(i+1));
                if(v1 >= v2)
                {
                    sum += v1;
                }
                else
                {
                    sum += v2-v1;
                    i++;
                }
            }
            else
            {
                sum += v1;
                i++;
            }
        }
        return sum;
    }
    
  //Converting each character to Value
    int convertToValue(char ch)
    {
        int val = 0;
        switch(ch)
        {
            case 'I':
                val=1; break;
            case 'V':
                val=5; break;
            case 'X':
                val=10; break;
            case 'L':
                val=50; break;
            case 'C':
                val=100; break;
            case 'D':
                val=500; break;
            case 'M':
                val=1000; break;
        }
        return val;
    }
}

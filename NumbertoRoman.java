package myprograms;
import java.util.*;
public class NumbertoRoman
{
    public static void main(String args[])
    {
    	//Getting integer as input
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        NumbertoRoman object=new NumbertoRoman();
        System.out.println(object.numberToRoman(number));
        scanner.close();
    }
    
    //Convering Number to RomanNumerals
    String numberToRoman(int number)
    {
        String roman = "";
        while(number!=0)
        {
            if(number >= 1000)
            {
                roman += "M";
                number -= 1000;
            }
            else if(number >= 900)
            {
                roman += "CM";
                number -= 900;
            }
            else if(number >= 500)
            {
                roman+= "D";
                number -= 500;
            }
            else if(number>= 400)
            {
                roman+= "CD";
                number-= 400;
            }
            else if(number >= 100)
            {
                roman+= "C";
                number -= 100;
            }
            else if (number >= 90)
            {
                roman+= "XC";
                number -= 90;
            }
            else if (number >= 50)
            {
                roman += "L";
                number-= 50;
            }
            else if (number >= 40)
            {
                roman += "XL";
                number -= 40;
            }
            else if (number >= 10)
            {
                roman+= "X";
                number -= 10;
            }
            else if (number >= 9)
            {
                roman+= "IX";
                number -= 9;
            }
            else if (number >= 5)
            {
                roman += "V";
                number -= 5;
            }
            else if (number >= 4) 
            {
                roman += "IV";
                number -= 4;
            }
            else if(number >= 1)
            {
                roman += "I";
                number -= 1;
            }
        }
        return roman;
    }
}
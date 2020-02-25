package myprograms;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Password
{
	public static void main(String args[])
	{
		//Getting input as password
		Scanner scanner=new Scanner(System.in);
		String password=scanner.nextLine(); 
		//Password should be atleast 1small letter,atleast 1capital letter,atleast 1digit,atleast 1special character
		String pattern="((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,})";
		Pattern p=Pattern.compile(pattern);
	    Matcher m=p.matcher(password);
	    if(m.matches())
	    {
	    	System.out.println("Valid Password");
	    }
	    else
	    {
	    	System.out.println("Invalid PassWord");
	    }
	    scanner.close();
	}
}

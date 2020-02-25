package myprograms;
import java.util.Scanner; 
public class Anagram
{
	 public static void main(String args[]) 
	 { 
		 //Getting Inputs as Paragraph
	    	Scanner scanner=new Scanner(System.in);
			String str=scanner.nextLine();
			Anagram anagram = new Anagram();
			anagram.splitingWords(str);
			scanner.close();
	 }
	 
	 //Splitting Each word in Paragraph
		void splitingWords(String str)
		{
			int split=0,i,j;
			
			String word_arr[];
			
			for( i = 0; i < str.length(); i++)
			{
				if(str.charAt(i)==' ')
				{
					split++;
				}
			}
			
			word_arr = new String[ split+1 ];
			String newstring = "";
			
			for(i = 0, j = 0; i<str.length(); i++)
			{
				if(str.charAt(i)==' ')
				{
					word_arr[j] = newstring;
					j++;
					newstring = "";
				}
				else
				{
					newstring += str.charAt(i);
				}
				word_arr[j]=newstring;
			}
			 int n = word_arr.length; 
		     findAllAnagrams(word_arr,n);
	    } 
		//Check All Possible Anagrams in Paragraph
		static void findAllAnagrams(String word_arr[], int n) 
	    { 
	        for (int i = 0; i < n; i++) 
	        {
	        	if(word_arr[i]!="*")
	        	{
	        		for (int j = i+1; j < n; j++)
	        		{
	        			if (areAnagram(word_arr[i], word_arr[j]))
	        			{
	        				System.out.println(word_arr[i] +  " is anagram of " + word_arr[j]); 
	        				word_arr[j]="*";
	        			}
	        		}
	        	}
	        }
	    } 
		//Find Anagram Based on word length
		static boolean areAnagram(String str1, String str2) 
	    { 
	        int n1 = str1.length(); 
	        int n2 = str2.length(); 
	        if (n1 != n2) 
	            return false;
	        String nstr1=sortstring(str1);
	        String nstr2=sortstring(str2);
	        for(int i=0;i<str1.length();i++)
	            if (nstr1.charAt(i) != nstr2.charAt(i)) 
	                return false; 
	        return true;   
	    } 
		//Sorting each character in word
		static String sortstring(String str1)
		{
			char[] charstr1 = str1.toCharArray();
            for(int i=0;i<charstr1.length;i++)
            {
                for(int j=i+1;j<charstr1.length;j++)
                {
                    if (charstr1[j] < charstr1[i])
                    {
                        char tem = charstr1[i];
                        charstr1[i]=charstr1[j];
                        charstr1[j]=tem;
                    }
                }
            }
            String s=new String(charstr1);
            return s;
		}  
	} 
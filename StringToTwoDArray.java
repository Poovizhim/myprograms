package myprograms;
import java.util.*;
public class StringToTwoDArray
{
	public static void main(String args[])
	{
		String two_d_array_string = "{{346,1199,718,1240},{1068,1199,1858,1240},{2973,1199,2571,865},{5589,1199,2580,865},{345,2879,2580,865},{2973,2879,2571,865},{5589,2879,2580,865}}";
		two_d_array_string=two_d_array_string.replace("{","");
		two_d_array_string=two_d_array_string.replace("}","");
		String[] str=two_d_array_string.split(",");
		int k=0;
		int[][] dimensions0 = new int[7][4];
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<4;j++)
			{
				dimensions0[i][j]=Integer.parseInt(str[k]);
				k++;
				System.out.print(dimensions0[i][j]+" ");
			}
			System.out.println();
		}
	}
}

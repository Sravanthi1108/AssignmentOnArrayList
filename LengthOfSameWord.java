import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

 class UserMainCode
 {
	public static int compareLastTwoWords(String sentense) {
		// TODO Auto-generated method stub
		//System.out.println(sentense);
		String[] string = sentense.split(" ");
		
		String last = string[(string.length)-1];
		if(string[0].equals(last))
		{
			int output = string[0].length();
			return output;
		}
		else
		{
			//System.out.println("in");
			int output = (string[0].length()+last.length());
		    return output;
		}
	}
 }

    public class LengthOfSameWord
    {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the String");
	        String sentense = scanner.nextLine();
	       // System.out.println(sentense);
	        int output = UserMainCode.compareLastTwoWords(sentense);
	        System.out.println(output);
		

	}
    }
 
	



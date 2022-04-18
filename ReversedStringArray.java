import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReversedStringArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int fr=scanner.nextInt();
		String a[]=new String[fr];
		for(int i=0;i<fr;i++)
		{
		  a[i]=scanner.next();
		}
		String ba=scanner.next();
		getvalues(a,ba);
		}
		public static void getvalues(String[] a, String b) {
		ArrayList<String>al=new ArrayList<String>();
		for(int i=0;i<a.length;i++)
		{
		al.add(a[i]);
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
		if(b.equals(al.get(i)))
		{
		System.out.println(i+1);
		}
		}
		}
		}




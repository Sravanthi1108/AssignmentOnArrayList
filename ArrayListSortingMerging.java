import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SortingMerging
{
	public static ArrayList<Integer>result(ArrayList<Integer>al1,ArrayList<Integer>al2)
	{
		al1.addAll(al2);
		Collections.sort(al1);
		ArrayList<Integer> res=new ArrayList<Integer>();
		res.add(al1.get(2));
		res.add(al1.get(6));
		res.add(al1.get(8));
		return res;
		
		
	}
}
public class ArrayListSortingMerging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		ArrayList<Integer> res=new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		al1.add(scanner.nextInt());
		for(int j=0;j<5;j++)
		al2.add(scanner.nextInt());
		res=SortingMerging.result(al1, al2);
		for(int k=0;k<3;k++)
			System.out.println(res.get(k));
			
		
		

	}

}

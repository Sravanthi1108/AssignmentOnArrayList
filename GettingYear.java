import java.util.ArrayList;
import java.util.Scanner;

class UserMainCode2{

	public static int getYear(ArrayList<Integer> arrayList1) {
		// TODO Auto-generated method stub
		int year=0;
		int admission=0;

		for(int i=0;i<arrayList1.size();i++){
			int num=arrayList1.get(i);
			if(year<num)
				year=num;
			}
		admission=arrayList1.get((arrayList1.indexOf(year))-1);
	return admission;
	}
	
}
public class GettingYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("size");
		int size=scanner.nextInt();
		ArrayList<Integer> arrayList1 = new ArrayList<>(size*2);
		for (int i=0;i<(size*2);i++){
			arrayList1.add(scanner.nextInt());
		}
		System.out.println(UserMainCode2.getYear(arrayList1));
	}



	}



import java.util.ArrayList;
import java.util.Scanner;
class UserMainCode1{

	public static ArrayList<Integer> removeMultiplesOfThree(ArrayList<Integer> arrayList) {
		// TODO Auto-generated method stub
	//	Iterator<Integer> iterator = arrayList.iterator();
		ArrayList<Integer> arrayList1  = new ArrayList<>();
		for(int i=1;i<(arrayList.size()+1);i++){
			if (i % 3 == 0){
				continue;
			}
			else
				arrayList1.add(arrayList.get(i-1));
		}
		return arrayList1;
	}
	
}

public class RemoveMultipliesOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many elements you want to enter");
		int count = scanner.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<Integer>(count);
		for (int i=0;i<count;i++){
			System.out.println("enter the elements ");
			int element = scanner.nextInt();
			arrayList.add(element);
			}
		//System.out.println(arrayList.size());
		ArrayList<Integer> output = UserMainCode1.removeMultiplesOfThree(arrayList);
		for (int element : output){
			System.out.println(element);
		}
	}
		

	}



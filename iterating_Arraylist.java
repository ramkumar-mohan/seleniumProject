package ramdatastructures;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


public class iterating {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<=3; i++)
		{
			System.out.println("Enter the deque name:");
			String obj1 = scanner.nextLine();
			list.add(obj1);
			for (String item : list) {
	            System.out.println(item);
	        }

	        // Using Iterator
	        Iterator<String> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
		}

	}

}

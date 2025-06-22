package ramdatastructures;
import java.util.Scanner;
import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<=4; i++)
		{
			System.out.println("Enter the String:");
			String obj1 = scanner.nextLine();
			fruits.add(obj1);
			
		}
		System.out.println("Final Array List values are:" + fruits);
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);

	}

}


package ramdatastructures;
import java.util.Scanner;
import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<=4; i++)
		{
			System.out.println("Enter the Colors:");
			String obj1 = scanner.nextLine();
			colors.add(obj1);
			
		}
		System.out.println("Final Hashset values are:" + colors);

	}

}
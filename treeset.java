package ramdatastructures;
import java.util.Scanner;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<=4; i++)
		{
			System.out.println("Enter the Numbers:");
			Integer obj1 = scanner.nextInt();
			numbers.add(obj1);
		}
		System.out.println("Final Sorted Numbers are:" + numbers);
	}
}
package ramdatastructures;
import java.util.Scanner;
import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		HashMap<String, Integer> ageMap = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<=2; i++)
		{
			    System.out.println("Enter the Name:");
				String obj1 = scanner.nextLine();
				
				System.out.println("Enter the Age:");
				Integer obj2 = scanner.nextInt();
				scanner.nextLine();
				ageMap.put(obj1, obj2);
				System.out.println("Name & Age is:" + ageMap);
		}
		System.out.println("Final Name & Age details are:" + ageMap);
		System.out.println("Age of Ram: " + ageMap.get("Ram"));
	}
}
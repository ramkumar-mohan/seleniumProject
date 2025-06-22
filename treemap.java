	package ramdatastructures;
	import java.util.Scanner;
	import java.util.TreeMap;
	
	
	public class treemap {
	
		public static void main(String[] args) {
	        TreeMap<String, Integer> studentGrades = new TreeMap<>();
			Scanner scanner = new Scanner(System.in);
			for (int i=0; i<=2; i++)
			{
				    System.out.println("Enter the Name:");
					String obj1 = scanner.nextLine();
					
					System.out.println("Enter the Mark:");
					Integer obj2 = scanner.nextInt();
					scanner.nextLine();
					studentGrades.put(obj1, obj2);
					System.out.println("Name & Mark is:" + studentGrades);
			}
			System.out.println("Final Name & Age details are:" + studentGrades);
			
		}
	}
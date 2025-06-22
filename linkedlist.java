	package ramdatastructures;
	import java.util.Scanner;
	import java.util.LinkedList;
	
	public class linkedlist {
	
		public static void main(String[] args) {
			LinkedList<String> vegetables = new LinkedList<>();
			Scanner scanner = new Scanner(System.in);
			for (int i=0; i<=2; i++)
			{
				System.out.println("Enter the Vegetable names:");
				String obj1 = scanner.nextLine();
				vegetables.add(obj1);
				
			}
			System.out.println("Final Linked List values are:" + vegetables);
	        vegetables.addLast("Onion");
	        System.out.println("After adding onion: " + vegetables);
	
		}
	
	}
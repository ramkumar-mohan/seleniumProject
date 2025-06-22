package ramdatastructures;
import java.util.Scanner;
import java.util.ArrayDeque;


public class arraydeque {

	public static void main(String[] args) {
		ArrayDeque<String> deque = new ArrayDeque<>();
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<=3; i++)
		{
			System.out.println("Enter the deque name:");
			String obj1 = scanner.nextLine();
			deque.add(obj1);
			
		}
		System.out.println("Final Array List values are:" + deque);
		System.out.println("Removed from front: " + deque.removeFirst());
		deque.addFirst("zero");
        System.out.println("After removal: " + deque);

	}

}

package ramdatastructures;
import java.util.Scanner;
import java.util.PriorityQueue;

public class priorityqueue_123 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<=2; i++)
		{
			System.out.println("Enter the values for priority search:");
			Integer obj1 = scanner.nextInt();
			pq.add(obj1);
			
		}
		System.out.println("Final Priority Queue are:" + pq);
        System.out.println("Head of the queue: " + pq.poll());
	}

}
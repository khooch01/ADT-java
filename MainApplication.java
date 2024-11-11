import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // List ADT Testing
        System.out.println("Testing List ADT...");
        ListADT<Integer> list = new ListADT<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List Contents:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\nList Size: " + list.size());

        // Stack ADT Testing
        System.out.println("\nTesting Stack ADT...");
        StackADT<Integer> stack = new StackADT<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack Top Element: " + stack.peek());
        stack.pop();
        System.out.println("Stack Top after Pop: " + stack.peek());
        System.out.println("Stack Size: " + stack.size());

        // Queue ADT Testing
        System.out.println("\nTesting Queue ADT...");
        QueueADT<Integer> queue = new QueueADT<>();
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        System.out.println("Queue Front Element: " + queue.peek());
        queue.dequeue();
        System.out.println("Queue Front after Dequeue: " + queue.peek());
        System.out.println("Queue Size: " + queue.size());

        scanner.close();
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // * Adding elements to the queue
        // * The offer() method adds an element to the end of the queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue); // Output: [1, 2, 3]

        // * Accessing the front element of the queue
        // * The peek() method retrieves, but does not remove, the head of the queue
        int front = queue.peek();
        System.out.println(front); // Output: 1
  
        // * Removing elements from the queue
        // * The poll() method retrieves and removes the head of the queue
        int removed = queue.poll();
        System.out.println(removed); // Output: 1
        System.out.println(queue); // Output: [2, 3]

        // ! There are 3 additional methods that can be used with a queue:
        // ! 1. add() - Similar to offer(), but throws an exception if the queue is full
        // ! 2. remove() - Similar to poll(), but throws an exception if the queue is empty
        // ! 3. element() - Similar to peek(), but throws an exception if the queue is empty

        queue.add(4);
        System.out.println(queue); // Output: [2, 3, 4] 
        int removedElement = queue.remove();
        System.out.println(removedElement); // Output: 2
        System.out.println(queue); // Output: [3, 4]
        queue.element(); // Output: 3
        System.out.println(queue); // Output: [3, 4]
    }
}
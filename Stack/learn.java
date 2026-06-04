import java.util.Stack;

public class learn {
    public static void main(String[] args) {
        // * Stack is a data structure that follows the Last In First Out (LIFO) principle, which means that the last element added to the stack will be the first one to be removed.

        // * Internal working of Stack:
        // 1. When we create a Stack, it initializes an internal array or linked list to store the elements.
        // 2. When we push an element onto the stack, it adds the element to the top of the stack and updates the size accordingly.
        // 3. When we pop an element from the stack, it removes the top element from the stack and returns it, while also updating the size accordingly. 
        // 4. The Stack also provides methods to peek at the top element without removing it, check if the stack is empty, and get the size of the stack.
        // 5. The Stack is not synchronized, which means it is not thread-safe. If multiple threads access a Stack concurrently, and at least one of the threads modifies the stack structurally, it must be synchronized externally.
        // 6. The Stack allows duplicate elements and does not maintain any specific order of elements other than LIFO.
        // 7. The Stack is part of the Java Collections Framework and implements the List interface, which provides a standard way to work with lists in Java.

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(12);
        System.out.println(stack);

        stack.push(14);
        System.out.println(stack);

        System.out.println("The top element is: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println(stack);
    }
}
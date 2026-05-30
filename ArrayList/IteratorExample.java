import java.util.*;

public class IteratorExample {
    public static void main(String[] args) { 
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(14);
        list.add(2, 13);

        // * Iterating through the list using Iterator
        // * The iterator() method returns an iterator object that can be used to traverse the list.
        // * The hasNext() method returns true if there are more elements to iterate over, and false otherwise.
        // * The next() method returns the next element in the iteration and advances the iterator to the next position.


        // ! Time Complexity: O(n) where n is the number of elements in the list, because we need to iterate through all the elements in the list to print them.
        // ! Space Complexity: O(1) because we are using a constant amount of space to store the iterator and the current element being printed, regardless of the size of the list.
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println("The element is: " + element);
        }
    }
}
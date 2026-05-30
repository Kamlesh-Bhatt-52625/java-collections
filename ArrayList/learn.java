import java.util.ArrayList;
import java.util.List;

// ArrayList is found in java.util package

public class learn {
    public static void main(String[] args) {

        // * Internal working of ArrayList:
        // 1. When we create an ArrayList, it initializes an internal array with a default capacity (usually 10).
        // 2. When we add elements to the ArrayList, it checks if the internal array has enough capacity.
        // 3. If the internal array is full, it creates a new array with a larger capacity (usually 1.5 times the current capacity) and copies the existing elements to the new array. Formula for new capacity: newCapacity = oldCapacity + (oldCapacity / 2) + 1. And the old array is discarded.
        // 4. The new element is then added to the internal array, and the size of the ArrayList is updated.
        // 5. When we remove elements from the ArrayList, it shifts the remaining elements to fill the gap and updates the size accordingly.
        // 6. The ArrayList also provides methods to access and modify elements, such as get(), set(), and contains().
        // 7. The ArrayList is not synchronized, which means it is not thread-safe. If multiple threads access an ArrayList concurrently, and at least one of the threads modifies the list structurally, it must be synchronized externally.
        // 8. The ArrayList allows duplicate elements and maintains the insertion order of the elements.
        // 9. The ArrayList provides dynamic resizing, which means it can grow and shrink as needed to accommodate the number of elements it contains.
        // 10. The ArrayList is part of the Java Collections Framework and implements the List interface, which provides a standard way to work with lists in Java.
        // 11. To add an element at a specific index, we can use the add(int index, E element) method. This will shift the existing elements to the right to make room for the new element.
        // 12. To remove an element at a specific index, we can use the remove(int index) method. This will shift the remaining elements to the left to fill the gap created by the removed element.
        // 13. Using the .addAll() method you can add a whole new list to the already existing list 

        // * ___________----------------------____________ 

        // <String> is the type parameter, it specifies the type of elements in the ArrayList
        // except String, we can also use other types like Integer, Double, Boolean, etc.

        // *VERY IMPORTANT:
       // !Difference between ArrayList and List: 
        // ? The difference between ArrayList<Integer> list = new ArrayList<>(); and List<Integer> list = new ArrayList<>(); is that the first one uses the concrete implementation of the List interface, which is ArrayList, while the second one uses the List interface as a reference type. Using the List interface allows for more flexibility and abstraction, as you can easily switch to a different implementation of the List interface (like LinkedList) without changing the code that uses the list. It also promotes programming to an interface rather than a specific implementation, which is a good practice in object-oriented programming.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        System.out.println(list);

        list.add(14);
        System.out.println(list);

        list.add(2, 13);
        System.out.println(list);

        // * Removing an element at a specific index using .remove() method
        list.remove(0);

        // * Removing an element by value using .remove() method
        list.remove(Integer.valueOf(12));
        System.out.println(list);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(15);
        newList.add(16);
        newList.add(17);
        
        // * Adding a whole new list to the already existing list using .addAll() method
        list.addAll(newList);
        System.out.println(list);

        // * Accessing an element at a specific index using .get() method
        System.out.println(list.get(0));


        // * Modifying an element at a specific index using .set() method
        list.set(0, 11);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(20);
        list2.add(20);
        list2.add(20);
        list2.add(20);
        list2.add(20);
        list2.add(20);

        System.out.println(list2);

        // * Removing the first occurrence of the value 20 from the list using .remove() method which is at index 0
        list2.remove(Integer.valueOf(20));
        System.out.println(list2);

        // * Removing all occurrences of the value 20 from the list using .removeAll() method
        list2.removeAll(list2);
        System.out.println(list2);

        // * Clearing the entire list using .clear() method
        list.clear();
        System.out.println(list);

        // ! VERY IMPROTANT: 
        // * In terms of time complexity, the add() method of an ArrayList has an average time complexity of O(1) for adding an element at the end of the list. However, if the internal array needs to be resized to accommodate more elements, the time complexity can temporarily become O(n) due to the need to copy existing elements to a new array. The get() method has a time complexity of O(1) for accessing an element at a specific index, while the remove() method has a time complexity of O(n) in the worst case when removing an element from the middle or end of the list, as it requires shifting elements to fill the gap created by the removed element.

        // *Time complexity of every method in ArrayList:
        // 1. add(E element): O(1) on average, O(n) when resizing is needed
        // 2. add(int index, E element): O(n) due to shifting elements
        // 3. get(int index): O(1)
        // 4. set(int index, E element): O(1)
        // 5. remove(int index): O(n) due to shifting elements
        // 6. remove(Object o): O(n) due to searching for the element
        // 7. removeAll(Collection<?> c): O(n) due to iterating through the list
        // 8. clear(): O(n) due to setting all elements to null
        // 9. addAll(Collection<? extends E> c): O(n) due to iterating through the collection
        // 10. contains(Object o): O(n) due to searching for the element
        // 11. size(): O(1) as it returns the current size of the list
        // 12. isEmpty(): O(1) as it checks if the size is 0
        // 13. indexOf(Object o): O(n) due to searching for the element
        // 14. lastIndexOf(Object o): O(n) due to searching for the
        // 15. toArray(): O(n) due to creating a new array and copying elements
        // 16. iterator(): O(1) as it returns an iterator for the list
        // 17. listIterator(): O(1) as it returns a list iterator for the list
        // 18. subList(int fromIndex, int toIndex): O(n) due to creating a new list and copying elements
        // 19. trimToSize(): O(n) due to creating a new array and copying elements
        // 20. ensureCapacity(int minCapacity): O(n) due to creating a new array and copying elements when resizing is needed
        // 21. clone(): O(n) due to creating a new list and copying elements
        // 22. equals(Object o): O(n) due to comparing elements of the list
        // 23. hashCode(): O(n) due to calculating the hash code based on the elements of the list
        // 24. toString(): O(n) due to creating a string representation of the list by iterating through its elements
        // 25. stream(): O(1) as it returns a sequential Stream with this collection as its source
    }
}
import java.util.*; // * is used to import all the classes in the java.util package, including ArrayList and List.

public class IterationArrayList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(14);
        list.add(2, 13);
        
        // * Iterating through the list using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println("The element is: " + list.get(i));
        }

        // * Iterating through the list using for-each loop
        for (Integer element : list) {
            System.out.println("The element is: " + element);
        }
    }
}
import java.util.ArrayList;
import java.util.Comparator;

public class ListClass {

    public  void learnList(){
        ArrayList<String> fruits = new ArrayList<>();

        // Add method to add items in arraylist
        fruits.add("Watermelon");
        fruits.add("Guava");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Muskmelon");
        fruits.add("Oranges");
        fruits.add("Mangoes");
        fruits.add("Litchi");
        fruits.add("Spinach");

        System.out.println(fruits); // Print Arraylist of fruits

        // .size() -> To fetch size of the arraylist
        int size = fruits.size();
        System.out.println("Fetching the size of fruits arraylist: " + size);

        // .indexOf() -> method to fetch index of elements from arraylist
        int index = fruits.indexOf("Mangoes");
        System.out.println("Index of Mangoes in Arraylist of fruits is : " + index);

        // .remove() -> method that removes the ele from arraylist of given position or by given object name
        fruits.remove("Spinach");
        System.out.println(fruits);

        // .contains() -> Boolean method that return true if ele is present false if not.
        String name = "Litchi";
        String name1 = "idk";
        boolean t = fruits.contains(name);
        boolean t1 = fruits.contains(name1);
        System.out.println(t);
        System.out.println(t1);

        // .isEmpty() -> rBoolean method that return true if arraylist is empty false if not.
        boolean test = fruits.isEmpty();
        System.out.println("Is fruits arraylist is empty?" + test);

        // .sort() -> sorts the arraylist
        fruits.sort(Comparator.naturalOrder());
        System.out.println(fruits);
        fruits.sort(Comparator.reverseOrder());
        System.out.println(fruits);

        ArrayList<String> clonearray = (ArrayList<String>)fruits.clone();
        System.out.println("I'm cloned array" + clonearray);

        for(String f : fruits){
            System.out.println(f);
        }
    }
}

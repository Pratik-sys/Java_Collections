import java.util.Stack;

public class StackClass {

    public  void learnStack(){
        Stack<String> animals= new Stack<>();

        // Add elements to Stack --- LIFO method
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);

        String element = animals.pop();
        System.out.println("Removed Element: " + element);

        String element1 = animals.peek();
        System.out.println("Element at top: " + element1);

        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position);
    }
}

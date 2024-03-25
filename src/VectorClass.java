import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {

    public  void learnVector(){

        Vector<String> mammals= new Vector<>();

        // Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");

        // Using index number
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);

        // Using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);
        String element = animals.remove(1);
        System.out.println("Removed Element: " + element);
        System.out.println("New Vector: " + animals);

        // Using clear()
        animals.clear();
        System.out.println("Vector after clear(): " + animals);
    }

    public void vectorEnumeration(){

        Vector<Integer> v = new Vector<>();

        for(int i=0; i<20; i++){
            v.add(i);
        }
        System.out.println("Vector represent as :" + v);
        Enumeration<Integer> venum = v.elements();
        while (venum.hasMoreElements()){
            int j = (int) venum.nextElement();
            System.out.println(j);
        }

    }

}

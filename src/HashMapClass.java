import java.util.HashMap;

public class HashMapClass {

    public  void  learnHashMap(){

        HashMap<Integer, String> listitems = new HashMap<>();

        listitems.put(1, "Oil");
        listitems.put(2, "Rice");
        listitems.put(3, "Wheat Flour");
        listitems.put(4, "Lentils");
        listitems.put(5, "Sugar");
        listitems.put(6, "Salt");
        System.out.println( listitems);

        System.out.println( listitems.values());


    }
}

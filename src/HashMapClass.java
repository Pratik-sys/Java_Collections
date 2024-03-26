import com.sun.source.tree.WhileLoopTree;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class HashMapClass {

    public void learnHashMap() {

        HashMap<Integer, String> listitems = new HashMap<>();

        listitems.put(1, "Oil");
        listitems.put(2, "Rice");
        listitems.put(3, "Wheat Flour");
        listitems.put(4, "Lentils");
        listitems.put(5, "Sugar");
        listitems.put(6, "Salt");
        System.out.println(listitems);
        System.out.println(listitems.values());
    }
    public void learnHashTable(){
        Hashtable<Integer, Integer> ht = new Hashtable<>();

        for(int i=0; i<=10; i++){
            ht.put(i,i+1);
        }
        System.out.println("Hash table looks like: " + ht);

        // Remove key from hashtable
        ht.remove(10);
        System.out.println("Hash table after removing key:10" + ht);

        // prints values from hashtable
        System.out.println(ht.values());
    }


}

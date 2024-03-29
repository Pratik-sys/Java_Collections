public class Main {
    public static void main(String[] args) {

        //All about Arraylist
        ListClass obj = new ListClass();
        obj.learnList();

        //All about LinkedList
        LinkedListClass objclass = new LinkedListClass();
        objclass.learnLinkedList();

        //All about Vector
        VectorClass objvector = new VectorClass();
        objvector.learnVector();
        objvector.vectorEnumeration();

        // All about Stack
        StackClass objstack = new StackClass();
        objstack.learnStack();

        // All about hashmap
        HashMapClass objhash = new HashMapClass();
        objhash.learnHashMap();
        objhash.learnHashTable();
        
       // All about Iterator
        IterFunctions objiter = new IterFunctions();
        objiter.learnIter();
        objiter.listIter();


    }

}
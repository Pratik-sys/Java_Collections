
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterFunctions {

    // There are 3 types of cursors(Cursors -> iterate or to traverse through collection) in java
    public void learnIter() {
        ArrayList<Integer> new_arr = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            new_arr.add(i);
        }
        System.out.println("Fetched ele from the list are :" + new_arr);
        Iterator<Integer> itr = new_arr.iterator();
        while (itr.hasNext()){
          int j = itr.next();
            if(j%2 !=0){itr.remove();}
        }
        System.out.println("Even ele are: " + new_arr);
    }

    public  void listIter(){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i<=10; i++){
            al.add(i);
        }
        ListIterator<Integer> lt = al.listIterator();
        while (lt.hasNext()){
            int j = lt.next();
            if(j % 2 == 0){
                j++;
                lt.set(j);
                lt.add(j);
            }
        }
        System.out.println(al);
    }
}
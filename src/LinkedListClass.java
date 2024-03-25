import java.util.LinkedList;

public class LinkedListClass {

    public  void learnLinkedList(){

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println( linkedList);

        // adding ele at some index
        linkedList.add(5,6);
        System.out.println( linkedList);

        // Remove ele from linked list
        linkedList.remove(1);
        System.out.println( linkedList);

        //change ele from certain index
        linkedList.set(4,7);
        System.out.println(linkedList);

        //accessing ele
        System.out.println(linkedList.get(4));

//------------------------------------------------------------------------------------------

        System.out.println("Linked list as queue");

        //linked list as queue
        // .peek() gives first(head) ele
        System.out.println(linkedList.peek());

        //.poll() -> returns and removes first head of linked list
        linkedList.poll();
        System.out.println(linkedList);

        //.offer() -> add specified ele at end of linked list, similarly addLast() can add ele at last index
        linkedList.offer(8);
        System.out.println(linkedList);

        //.addFirst() -> add ele to first place in linked list
        linkedList.addFirst(1);
        System.out.println(linkedList);
    }
}


//Linked list implementation using custom LinkedList class
public class Linked {

    public static void main(String[] args){
        LinkedList nums=new LinkedList();

        nums.add(7);
        nums.add(9);
        nums.add(11);
        nums.add(23);

        nums.addFirst(5);

        nums.delete(23);

        nums.addLast(8);

        nums.printList();
    }
}

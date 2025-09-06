public class QueueImpl {

    public static void main(String[] args){
        Queue queue=new Queue();

        queue.enqueue(5);// to add elemnt to queue
        queue.enqueue(7);
        queue.enqueue(12);
        queue.enqueue(3);

        System.out.println("dequeue "+queue.dequque());// Dequeue is to remove element from the queue, here we are printing that element aswell.
        System.out.println("Queue before performing enqueue");
        queue.printQueue();

        System.out.println("Size"+" ");
        queue.size();

        System.out.println("Queue after performing enqueue");
        queue.enqueue(10);

        queue.printQueue();



    }
}

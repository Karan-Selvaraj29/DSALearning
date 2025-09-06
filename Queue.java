//We are implementing Circular queue using array

public class Queue {
    int front=0;
    int rear=-1;
    int[] arr=new int[4];
    int size=0;

    public void enqueue(int data){
        if(!isFull()) {
            rear = (rear + 1) % arr.length;
            arr[rear] = data;
            size++;
        }
        else{
            throw new RuntimeException("Queue is full");
        }
    }
    public int dequque(){
        if(!isEmpty()) {
            int data=arr[front];
            front = (front+1) % arr.length;
            size--;
            return data;
        }
        else
            throw new RuntimeException("Queue is Empty");
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        else
            return false;
    }
    public boolean isFull(){
        if(size==4){
            return true;
        }
        else
            return false;
    }

    public int peek(){
        if(!isEmpty()) {
            int data=arr[front];
            return data;
        }
        else
            throw new RuntimeException("Queue is empty");
    }

    public void printQueue(){

        if(isEmpty()){
            throw new RuntimeException("queue is empty");
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % arr.length] + " ");
        }
        System.out.println();
    }
    public void size(){
        System.out.println(arr.length);
    }
}

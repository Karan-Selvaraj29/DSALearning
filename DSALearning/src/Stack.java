//Stack custom class with array
public class Stack {
    int[] arr=new int[5];
    int top;
    int size;
    public Stack(){

        top=-1;
        size=arr.length-1;
    }
    public void push(int data){
        if(top<size){
            top++;
            arr[top]=data;}
        else
            System.out.println("Stack Overfow");


    }
    public int pop(){
        if(top>-1)
            return arr[top--];
        else
            System.out.print("Stack Underflow");

        return 0;

    }

    public int peek(){
        return arr[top];
    }

    public void printStack(){
        for(int n:arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }
}

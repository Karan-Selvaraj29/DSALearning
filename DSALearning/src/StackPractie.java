public class StackPractie {
    public static void main(String[] args){
        Stack nums=new Stack();

        nums.push(11);
        nums.push(3);
        nums.push(2);

        System.out.println("pop element "+nums.pop());


        nums.push(10);
        System.out.println("peek element "+nums.peek());
        nums.push(11);
        nums.push(12);
        nums.push(7);

        nums.printStack();
    }
}

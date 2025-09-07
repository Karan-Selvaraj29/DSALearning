import com.sun.source.tree.SynchronizedTree;

//DoubleCheckedLocking
public class DoubleLocking {
    private static DoubleLocking instance;

    private DoubleLocking(){
        System.out.println("Double Checked Locking");
    }

    public static DoubleLocking getInstance(){
        if(instance==null){
            synchronized (DoubleLocking.class) {
                if (instance == null) {
                    instance = new DoubleLocking();
                }
            }
        }
        return instance;
    }



    public void printsome(){
        System.out.println("double checked locking is working");
    }
}

class Checking{
    public static void main(String[] args){
        DoubleLocking.getInstance().printsome();
    }
}





//Singleton(Need to have only one instance)
public class Singleton {
    private static Singleton instance;

    //constructor
    private Singleton(){
        System.out.println("Singleton");
    }

    private void preventfromReflection() throws Exception {
        if(instance!=null){
            throw new Exception("Already instance is there");
        }
    }

    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    //to prevent breaking by readresolve
    public Object readResolve(){
        return instance;
    }

    public void printsome(){
        System.out.println("Calling is happeing");
    }
}
class Practice{
    public static void main(String[] args){
            Singleton.getInstance().printsome();
        }
}

//below code snippet is to prevent break down in singleton
/*class Singleton implements Serializable {

    private Singleton instance;

    public Singleton(Singleton instance){
        this.instance=instance;
    }

    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.locking)
            if(instance==null){
                instance=new Singleton();
            }

        }
        return instance;
    }


    // Ensure the same instance is returned upon deserialization
    protected Object readResolve() {
        return instance;
    }
}*/

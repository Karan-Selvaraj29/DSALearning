import java.util.HashMap;
import java.util.Map;
import java.util.*;

class Student{
    private int id;
    private String name;

    public Student(int id, String name){
        this.id=id;
        this.name=name;

    }

    public boolean equals(Object o){
        if(this==o){return true;}
        else if(!(o instanceof Student)){return false;}
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    public int hashCode(){
        return Objects.hash(id,name);
    }

}


public class HasMapExample {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();

        // Put a Student object as key
        map.put(new Student(101, "Alice"),"A+");

        // Retrieve using a new but logically equal Student object
        String grade = map.get(new Student(101, "Alice"));

        System.out.println("Grade: " + grade); // Output: A+
    }
}

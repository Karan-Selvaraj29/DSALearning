import java.io.*;
import java.lang.String;
class Main {
    public static void findFile() throws IOException {
        // code that may produce IOException
        String path = "C:\\Users\\Karan S\\IdeaProjects\\JavaPractice\\test.txt";
        File newFile=new File(path);
        FileInputStream stream=new FileInputStream(newFile);
        FileWriter writer=new FileWriter(path);
        writer.write("How are you");
        writer.close();
        System.out.println("written");
    }

    public static void main(String[] args) {
        try{
            findFile();
        } catch(IOException e){
            System.out.println(e);
        }
    }
}
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ue9 {
    public static void main(String[] args) throws IOException {
        File f= new File("C:\\Users\\s53037\\IdeaProjects\\test.txt");

        FileWriter fileWriter= new FileWriter(f);
        PrintWriter printWriter= new PrintWriter(fileWriter);
        printWriter.println("Käse");
        printWriter.println("Brot");
        printWriter.flush();
        printWriter.close();
    }
}

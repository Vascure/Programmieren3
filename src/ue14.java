import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ue14 {
    public static void main(String[] args) throws IOException {
        File file= new File("C:\\Users\\s53037\\IdeaProjects\\test-output.txt");
        FileOutputStream fileOutputStream= new FileOutputStream(file);

        String outputText= "hello File- first output";

        for (char c:outputText.toCharArray()) {
            System.out.println("Schreibe char "+ (int) c + " in die Datei..");
            fileOutputStream.write(c);
        }

        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("Fertig");
    }
}

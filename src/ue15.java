import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ue15 {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\s53037\\IdeaProjects\\dafuq");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        char c = (char) System.in.read();
        while (c!='x') {
            fileOutputStream.write(c);
            System.out.println("Zeichen geschrieben: "+(int)c);
             c = (char) System.in.read();
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            System.out.println("Fertig");
        }
    }


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ueTextTest {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\s53037\\Documents\\School Stuff\\GetIt.txt");

        Scanner reader;
        try {
            reader = new Scanner(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (reader.hasNextLine()){
            String data= reader.nextLine();
            System.out.println(data);
        }
    }
}

import java.io.*;
import java.util.Locale;

public class ue8 {
    public static void main(String[] args) throws IOException {

        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        String line = inp.readLine();
        while (line != null) {
            if (line.toLowerCase().equals("stop")) {
                break;
            } else {
                System.out.println(line);
                line = inp.readLine();
            }

        }
        inp.close();
    }
}





import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ue8_mitException {public static void main(String[] args)  {

    BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
    String line = null;
    try {
        line = inp.readLine();

        while (line != null) {
            if (line.toLowerCase().equals("stop")) {
                System.out.println("Programm wird beendet...");
                break;
            } else {
                System.out.println(line);

                    line = inp.readLine();

                }
            }
        inp.close();
        throw new IOException("Fehler: Das ist eine Testexception!");
    }
    catch (IOException myException) {
        System.out.println("IO Exception: etwas ist schiefgelaufen... "+myException.getMessage());

    }

}
}



import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ue13 {
        public static void main(String[] args) throws IOException {
            File file = new File("C:\\Users\\s53037\\IdeaProjects\\cat.png");
            // FileInputStream stellt eine Verbindung zur Datei her. Datei wird geöffnet.
            FileInputStream fileInputStream = new FileInputStream(file);
            // Für Optimierung der Performance -> BufferedInputStream
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            // read() liefert Byte for Byte aus der Datei. Wenn das Ende erreicht ist, dann liefert die Methode -1 als Ergebnis.
            // While-Schleife liest somit Zeichen um Zeichen aus.
            int byteRead;
            int counter=0;
            while ((byteRead = bufferedInputStream.read()) != -1) {

                // char[] ch = Character.toChars(byteRead);
                // System.out.println(ch);
                // Byte wird in char umgewandelt und ausgegeben.

                System.out.println("Byte "+ counter+ ": ");
                System.out.println((int) byteRead);
                //System.out.println("\t"+ (char) byteRead);
                counter++;

            }
            System.out.println("Insgesamt: "+ counter);

            // close() gibt die Datei wieder frei.
            bufferedInputStream.close();

        }
    }


import java.io.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ue12MitExceptions {
        public static void main(String[] args) {
            File file = new File("test-output.txt");
            // FileInputStream stellt eine Verbindung zur Datei her. Datei wird geöffnet.
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);


                // Für Optimierung der Performance -> BufferedInputStream
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

                // read() liefert Byte for Byte aus der Datei. Wenn das Ende erreicht ist, dann liefert die Methode -1 als Ergebnis.
                // While-Schleife liest somit Zeichen um Zeichen aus.
                int byteRead;
                while (true) {

                    if (!((byteRead = bufferedInputStream.read()) != -1)) break;

                }
                // char[] ch = Character.toChars(byteRead);
                // System.out.println(ch);
                // Byte wird in char umgewandelt und ausgegeben.
                System.out.println((char) byteRead);


                // close() gibt die Datei wieder frei.

                bufferedInputStream.close();
            } catch (IOException e) {
                System.out.println("Error: "+ e.getMessage());
            }

        }
    }


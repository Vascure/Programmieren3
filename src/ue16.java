import java.io.*;

public class ue16 {

    public static class myClass implements Serializable{
        int a=5;
        String b="Hallo in der Klasse";
        byte[] c= {'e','x','b','c','a'};
        double d=8.7;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String text1 = "Hallo Welt";
        String text2 = "Uiuiui es regnet hardcore";

        File file = new File("C:\\Users\\s53037\\IdeaProjects\\object.dat");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        System.out.println("Mein Dateipfad: " + file.getAbsolutePath());
        oos.writeObject(text1);
        oos.writeObject(text2);
        myClass meinObject= new myClass();
        //mein Objekt in datei schreiben
        oos.writeObject(meinObject);

        oos.close();

        fileOutputStream.close();


        FileInputStream fileIn = new FileInputStream(file);
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);

        String a = (String) objectIn.readObject();
        String b = (String) objectIn.readObject();

        System.out.println("The Object has been read from the file");
        objectIn.close();

        //mein Objekt



    }
        }



//    public static void speichern(String text, String file) {
//        try {
//            ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file));
//            stream.writeObject(text);
//            stream.close();
//        } catch (IOException ioex) {
//            System.err.println("Fehler beim Schreiben des Objekts aufgetreten.");
//            ioex.printStackTrace();
//        }
//    }
//}


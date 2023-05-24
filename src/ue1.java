import java.io.File;
import java.io.IOException;

public class ue1 {
    public static void main(String[] args) {



            File file = new File("C:\\Users\\s53037\\IdeaProjects\\Pruefung1 Startpaket\\Programmieren3\\test.txt");
        System.out.println("does this file exist?" + file.exists());
        System.out.println("Full path to file: " + file.getAbsolutePath());
        System.out.println("Name of the file: "+ file.getName());
        System.out.println("Parent Directory of file: "+ file.getParent());
        System.out.println("Path to Parent File: "+ file.getParentFile().getAbsolutePath());
        System.out.println("Is this a directory? "+ file.isDirectory());
        System.out.println("Is this a File? "+ file.isFile());
        System.out.println("Is this file readable? "+file.canRead());
        System.out.println("Is this file writeable? "+file.canWrite());
        System.out.println("Is this file hidden? "+file.isHidden());
        System.out.println("Filesize: "+file.length()/1024d);


        File file2= new File("k.txt");

            try {
                file2.createNewFile();
            } catch (Exception e) {

            }
        }


        }



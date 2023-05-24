import java.io.File;

public class ue2 {
    public static void main(String[] args) {
        String dir = "Dir:C:\\";


        File f = new File("C:\\");
        File[] listOfFiles = f.listFiles();

       printFilesOfSpecificDirectory(listOfFiles);


    }

    public static void printFilesOfSpecificDirectory(File[] inputFiles) {
        for (int i = 0; i < inputFiles.length; i++) {
            if (inputFiles[i].isFile()) {
                System.out.println("file:" + inputFiles[i].getAbsolutePath() +i);
            } else if (inputFiles[i].isDirectory()) {
                System.out.println("dir:" + inputFiles[i].getAbsolutePath());
            }
    }


    }
}

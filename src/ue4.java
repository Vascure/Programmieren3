import java.io.File;

public class ue4 {
    public static void main(String[] args) {
        String dir = "Dir:C:\\";


        File f = new File("C:\\Users\\s53037\\Documents");
        File[] listOfFiles = f.listFiles();

        printFilesOfSpecificDirectory(listOfFiles);


    }

    public static void printFilesOfSpecificDirectory(File[] inputFiles) {
        int counter = 0;
        long sum = 0;
        for (File currentfile : inputFiles) {
            double fileSize = currentfile.length();
            if (currentfile.isFile()) {
                sum = (long) (sum + fileSize);
                counter++;
                System.out.println("file:" + counter + " name: " + currentfile.getAbsolutePath() + " size: " + fileSize);
            }
        }
        System.out.println("full size: " + sum);
    }
}





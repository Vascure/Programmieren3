import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class ue6 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\s53037\\IdeaProjects");

        createFiles(dir);
        renameFiles(dir);

    }
    private static void createFiles(File dir) {

        for (int i = 0; i < 10; i++) {
            String filename = ThreadLocalRandom.current().nextInt() + ".mp3";
            File fileToCreate = new File(dir.getAbsolutePath() + File.separator + filename);
            //System.out.println("File " + i + ": " + fileToCreate.getAbsolutePath());

            try {
                fileToCreate.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (fileToCreate.exists())
                System.out.println("File " + fileToCreate.getAbsolutePath() + " CREATED");
            else
                System.out.println("ERROR: File " + fileToCreate.getAbsolutePath() +
                        " could NOT beCREATED");
        }
    }

    private static void deleteFiles(File dir) {
        for (File currentFile : dir.listFiles()) {
            if (currentFile.isFile()) {
                if (currentFile.delete()) {
                    System.out.println("Erfolg: File " + currentFile.getAbsolutePath() + " was deleted");
                }
            }
        }
    }

    private static void renameFiles(File dir) {
        for (File currentFile : dir.listFiles()) {
            if (currentFile.isFile()) {
                File destFile = new File(dir.getAbsolutePath() +
                        File.separator + "1_" + currentFile.getName());
                if (currentFile.renameTo(destFile)) {
                    System.out.println("Erfolg: File " + currentFile.getAbsolutePath() +
                            " was renamed to " + destFile.getAbsolutePath());
                }
            }
        }
    }
}



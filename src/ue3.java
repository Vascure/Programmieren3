

import java.io.File;

public class ue3 {

    public static void main(String[] args) {
        File dir = new File("C:\\Users\\s53037");
        System.out.println("Original Path: " + dir.getAbsolutePath());
        listFilesAndDirectoriesWithSubFolders(dir.getAbsolutePath());
    }

    public static void listFilesAndDirectoriesWithSubFolders(String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for (File f : list) {
            if (f.isDirectory()) {
                // rekursiver Aufruf
                System.out.println("Directory: " + f.getAbsolutePath());
                listFilesAndDirectoriesWithSubFolders(f.getAbsolutePath());
            } else {
                System.out.println("File: " + f.getAbsolutePath());
            }
        }

    }





//    public static void printFilesOfSpecificDirectory(File[] listOfFiles) {
//        for (int i = 0; i < listOfFiles.length; i++) {
//            if (listOfFiles[i].isFile()) {
//                System.out.println("Eintrag" + i + "dir" + listOfFiles[i].getAbsolutePath());
//                System.out.println("It's a File, get some Inhalt");
//                File[] subdirectory = listOfFiles[i].listFiles();
//                printFilesOfSpecificDirectory(subdirectory); }
//            else {
//                System.out.println("Eintrag "+ i + " file "+listOfFiles[i].getAbsolutePath());


//            for (int i = 0; i < Lvl; i++)
//                System.out.println("-----------------------------------------");
//                if (f.isFile()) {
//                    System.out.println("file:" + f.getAbsolutePath());
//                    System.out.println("It's a File, get some Inhalt");
//                    File[] subdirectory=listOfFiles[i];
//                } else if (f.isDirectory()) {
//                    System.out.println("dir:" + f.getAbsolutePath());
//
//                    printFilesOfSpecificDirectory(f.listFiles(),Lvl+1);
//                }
//
//            }

            }






package Ue11;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {

    private ArrayList<Product>productVerwaltung=new ArrayList<>();

    FileWriter fileWriter= new FileWriter("C:\\Users\\s53037\\IdeaProjects\\products.txt");
    PrintWriter printWriter= new PrintWriter(fileWriter);

    public ProductManager() throws IOException {
    }

    public void add(Product p) {
        productVerwaltung.add(p);
        System.out.println(p);

    }
    public void saveToFile(String path) throws IOException {
        File f= new File(path);
        FileWriter fw= new FileWriter(path);

        BufferedWriter bw= new BufferedWriter(fw);
        for (Product p: productVerwaltung) {
            System.out.println("ProductManager::saveToFile: saving Product");
            bw.write(p.toString());
            bw.newLine();

        }
        bw.flush();
        bw.close();
    }
    public  void readFromFile( String path) throws IOException {
        File file= new File(path);
        FileReader fr= new FileReader(file);
        BufferedReader br= new BufferedReader(fr);

        String line = br.readLine();
        while (line != null) {
            if (line.toLowerCase().equals("stop")) {
                break;
            } else {
                System.out.println(line);
                line = br.readLine();
            }

        }
        br.close();

    }

}

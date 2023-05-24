import java.io.*;

public class BRReadAllLines {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\s53037\\IdeaProjects\\test.txt");

        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line= br.readLine();
        while (line!=null) {
            System.out.println(line);
            line= br.readLine();
        }
        br.close();

    }
}

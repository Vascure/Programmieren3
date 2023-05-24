import java.io.*;

public class ue10 {
    public ue10() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        File f= new File("C:\\Users\\s53037\\IdeaProjects\\test.txt");


        FileWriter fileWriter= new FileWriter(f);
        PrintWriter printWriter= new PrintWriter(fileWriter);

        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

        String line = inp.readLine();
        while (line != null) {
            if (line.toLowerCase().equals("stop")) {
                break;
            } else {
                printWriter.println(line);
                printWriter.flush();
                System.out.println(line);
                line = inp.readLine();

            }

        }



        inp.close();
    }
}

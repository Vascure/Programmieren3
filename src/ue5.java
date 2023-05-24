import java.io.File;

public class ue5 {
    public static void main(String[] args) {
        File dir = new File("C:\\\\campus02\\\\test\\\\demo4");
        if (!dir.exists()){
            dir.mkdirs();
            System.out.println(" Directory is created");

        }
        if (dir.exists()) {
            System.out.println(dir.getAbsolutePath()+ " "+ true + ",Directory has been created");
        } else {
            System.out.println(dir.getAbsolutePath()+ false + "Directory cannot be created");
        }
    }



    }


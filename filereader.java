package abu_talha;
import java.io.File;
import java.util.Scanner;

public class publictry {
    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\dell\\Desktop\\sql injection.txt");
            Scanner sc = new Scanner(file);



            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();

        }
        catch (Exception e)
        {
            System.out.println("An Occured" + e.getMessage());
        }

    }
    }

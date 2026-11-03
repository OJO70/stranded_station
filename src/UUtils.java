
import java.util.Scanner;

public class UUtils {

    private Scanner stdin = new Scanner(System.in);

    

    public Integer consoleInt() {
        System.out.printf("please enter an int: ");
        while(stdin.hasNext()) {
            
            if (stdin.hasNextInt()) {
                int i = stdin.nextInt();
                stdin.nextLine();
                stdin.close();
                return i;
            }else {
                System.out.println("Invalid input.");
                stdin.nextLine();
            }
            System.out.printf("please enter a int: ");
        }
        return null;
    }

    public String consoleString() {
        System.out.printf("please enter a string: ");
        while(stdin.hasNext()) {
                return stdin.nextLine();
            

        }
        return null;
    }

    

    private void clearInputStream() {
        stdin.nextLine();
    }
    
}

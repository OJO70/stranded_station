
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class UUtils {

    public static Scanner stdin = new Scanner(System.in);

    

    public Integer consoleInt() {
        System.out.printf("please enter an int: ");
        while(stdin.hasNext()) {
            
            if (stdin.hasNextInt()) {
                int i = stdin.nextInt();
                stdin.nextLine();
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


    public static String[] CommandParser() throws Exception {

        String input = stdin.nextLine();
        // Split on space. Into array. Commands must be array length 2 elements (1 or 2 because of help). Return array.
        String[] splitStr = input.split(" ");

        if (splitStr.length >= 0 && splitStr.length <= 2) {
            return splitStr;
        }
        throw new Exception();

    }
    
}

import java.util.Scanner;

public class UUtils {

    private Scanner stdin = new Scanner(System.in);

    public Double consoleDouble() {
        System.out.printf("please enter a double: ");
        while(stdin.hasNext()) {
            
            if (stdin.hasNextDouble()) {
                double output = stdin.nextDouble();
                stdin.nextLine();
                return output;
            }else {
                System.out.println("Invalid input.");
                stdin.nextLine();
            }
            System.out.printf("please enter a double: ");
        }
        return null;
    }

    public Integer consoleInt() {
        System.out.printf("please enter a int: ");
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

    public double badDoubleInput() {
        //double output = 0;
        //boolean hasInput = false;

        do {
            System.out.printf("please enter a double: ");
            try {
                double output = stdin.nextDouble();
                this.clearInputStream();
                return output;
            } catch (Exception e) {
                System.out.println("invalid input");
                stdin.nextLine();
            }
        }while(true);

        //throw new IllegalStateException();
    }

    private void clearInputStream() {
        stdin.nextLine();
    }
    
}

import java.util.Scanner;

public class Count_down {

    static boolean gameOver = false;

    public static void countdown() {

        Scanner scanner = new Scanner(System.in);

        // Start the countdown thread
        Thread timer = new Thread(() -> {

            for (int i = 5; i > 0; i--) { // i = number of "thread.sleep"
                                            // therefore total count down timer = i * thread.sleep
                                            // if i = 5 , thread.sleep = 1000 (1second) count down = 5s 
                if (gameOver) {
                    return;
                }

                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⠀⠀⠀⠉⠛⢷⣄⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⣀⣀⣀⣀⣀⣠⣾⣿⣿⣿⣿⠀⠀⠘⢶⣤⠀⠙⢷⡀⠀⠀⠀");
                System.out.println("⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠠⣄⠀⠙⣷⠀⠈⣷⠀⠀⠀");
                System.out.printf ("⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⢸⠆⠀⣿⠆⠀⣿⠀⠀ "); System.out.printf("Time remaining: " + i + " minutes  until structual integrity failure \n");
                System.out.println("⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠐⠋⠀⣠⡿⠀⢀⡿⠀⠀⠀");
                System.out.println("⠀⠀⠉⠉⠉⠉⠉⠙⢿⣿⣿⣿⣿⠀⠀⢠⠾⠛⠀⣠⡾⠁⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⠀⠀⠀⣀⣤⡾⠋⠀⠀⠀⠀⠀");    
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⠀⠀");

                try {
                    Thread.sleep(5000); // intival of time between count down
                } catch (InterruptedException e) {
                    return;
                }
            }

            gameOver = true;
            System.out.println("TIME'S UP! You failed to escape!");
            System.out.println("Press [q] to quit the game.");

           

        });

        timer.start();

    }

}

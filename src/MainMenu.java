import java.util.Scanner;

public class MainMenu {
    private static final int MenuChoices=4;//Assuming there are ony 4 options to choose from? Start,help, story/background,quit.

    public static  Scanner stdin = new Scanner(System.in);

    public static int ReadMenuChoice() throws Exception { // looked at chris's code and you can incorpporate this after he lists menu choices int read_menu_number = to this method.

        while(true){

            int choice = new UUtils().consoleInt();
             // consume the newline character after reading the integer
            if (choice>=1 && choice<=MenuChoices){ 
                
                return choice;

            }

            System.out.println("Please select an option from the Menu");

        }

        }
        public static void ShowCommands()throws Exception{
        System.out.println("Available Commands:");
        System.out.println("⬆️ go north     go south ⬇️"); //add the other commands next release e.g take,look etc
        System.out.println("➡️ go east      go west ⬅️");
        System.out.println("🔼 up           down 🔽");
        
        System.out.println("menu - Return to main menu");
        System.out.println("quit - Exits the program");

        



    }




    
    public static void MainMenu() throws Exception 
    {
        System.out.println("Stranded Station 2026 \n");

        System.out.println("[1] START NEW GAME \n");
        System.out.println("[2] HELP \n");
        System.out.println("[3] STORY \n");
        System.out.println("[4] EXIT PROGRAM \n");

        int read_menu_number = ReadMenuChoice();

        if (read_menu_number == 1)
        {
            boolean exitCondition = Game.gameLoop();
            if (exitCondition) {
                System.out.println("WON");
            }else {
                System.out.println("You have quit the game");
            }
            return;

        }
        else if (read_menu_number == 2)
        {
            System.out.println("This is a texted base adventure game you will be required to type in commands your character will perform such as\n 'go', 'grab' , 'take' , 'check'  \n");
        }
        else if (read_menu_number == 3)
        {
            System.out.println("You are an astronaut on the ISS and your station has been hit by debris. In the panic your team has left without you but there is one pod left you need to explore the station, repair the pod and escape the station.\n");
        }
        else
        {
            return ;
        }
        
    }
}

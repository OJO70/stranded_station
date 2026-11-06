import java.util.Scanner;
 
 
public class MainMenu {
   private static final int MenuChoices = 4;// Assuming there are ony 4 options to choose from? Start,help,
                                            // story/background,quit.
 
 
   public static Scanner stdin = new Scanner(System.in);
 
 
   public static String[] CommandParser() throws Exception {
 
 
       String input = stdin.nextLine();
       // Split on space. Into array. Commands must be array length 2 elements (1 or 2
       // because of help). Return array.
       String[] splitStr = input.split(" ");
 
 
       if (splitStr.length >= 0 && splitStr.length <= 2) {
           return splitStr;
       }
       throw new Exception();
 
 
   }
 
 
   public static int ReadMenuChoice() throws Exception { // looked at chris's code and you can incorpporate this after
                                                         // he lists menu choices int read_menu_number = to this
                                                         // method.
 
 
       while (true) {
 
 
           int choice = new UUtils().consoleInt();
 
 
           if (choice >= 1 && choice <= MenuChoices) { //input validation for menu choices. If not valid, loop back and ask for input again.
 
 
               return choice;
 
 
           }
 
 
           System.out.println("Please select an option from the Menu");
 
 
       }
 
 
   }
 
 
   public static void ShowCommands() {
       System.out.println("Available Commands:");
 
       System.out.println("[h] - help menu to see these commands");
 
       System.out.println("⬆️ go north     go south ⬇️ "); // add the other commands next release e.g take,look etc
       System.out.println("➡️ go east      go west ⬅️");
       System.out.println("🔼 go up        go down 🔽");
       System.out.println("\"take\" to pick up items");
       System.out.println("\"drop\" to drop items ");
       System.out.println("\"look\" to observe your surroundings");
 
 
      System.out.println("\"examine\" \"item name\" - will inform you for certain items you have taken");
       System.out.println("[q] - Exits the program");
       System.out.println("[m] - For Map 🗺️ ");
 
 
   }
 
 
       public static void MainMenu() throws Exception {
       System.out.println("Stranded Station 2026 \n");
 
 
       System.out.println("[1] START NEW GAME \n");
       System.out.println("[2] HELP \n");
       System.out.println("[3] STORY \n");
       System.out.println("[4] EXIT PROGRAM \n");
 
 
       int read_menu_number = ReadMenuChoice();
 
 
       if (read_menu_number == 1)
       {
 
 
           Intro.Intro();
           Intro.Tutorial();
           Intro.Map_layout();
 
 
          
           while (true)
           {
               System.out.println("Please press \"1\" to start the game or \"2\" to return to main menu");
 
 
               int start_game = new UUtils().consoleInt();
 
 
               if (start_game == 1)
               {
 
 
                   boolean exitCondition = Game.gameLoop();
                   if (exitCondition)
                   {
                       Outro.OutroForQuittingOrWinning(exitCondition);
                   }
                   else
                  {
                      MainMenu();
                      return;
                  }
                return;
 
 
               }
                   if (start_game == 2)
                   {
                   MainMenu();
                   return;
 
 
                   }
 
 
           }
       }
           else if (read_menu_number == 2)
           {
               ShowCommands();
 
 
               System.out.println("\n To return to main menu press [1]");
               while (true)
              
               {
 
 
               int choice = new UUtils().consoleInt();
 
 
               if (choice == 1)
               {
                    MainMenu();
                    return;
                   
               }
 
 
               System.out.println("To return to main menu press [1]");
 
 
               }
           }
       else if (read_menu_number == 3)
           {
               System.out.println(
               "You are an astronaut on the ISS and your station has been hit by debris. In the panic your team has left without you but there is one pod left you need to explore the station, repair the pod and escape the station.\n");
              
               System.out.println("\n To return to main menu press [1]");
               while (true)
              
               {
 
 
                   int choice = new UUtils().consoleInt();
 
 
                   if (choice == 1)
                   {
                       MainMenu();
                       return;
                   }
 
 
                   System.out.println("To return to main menu press [1]");
 
 
               }
           }
             else
               {
                return;
               }
       }
}
 
 














// >>>>>>> e0eae9f (added command, outro and fixed main menu)

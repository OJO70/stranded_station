import java.util.Scanner;



public class MainMenu {

    private static Scanner stdin = new Scanner(System.in);
    
    public static void MainMenu() throws Exception 
    {
        System.out.println("Stranded Station 2026 \n");

        System.out.println("[1] START NEW GAME \n");
        System.out.println("[2] HELP \n");
        System.out.println("[3] STORY \n");
        System.out.println("[4] EXIT PROGRAM \n");

        int read_menu_number = new UUtils().consoleInt();

        if (read_menu_number == 1)
        {
            System.out.println("YOU WIN!!!\n");
        }
        else if (read_menu_number == 2)
        {
            System.out.println("This is a texted base adventure game you will be required to type in commands your character will perform such as\n 'go', 'grab' , 'take' , 'check'  \n");
        }
        else if (read_menu_number == 3)
        {
            System.out.println("You are an astronaut on the ISS and your station has been hit by debris. In the panic your team has left without you but there is one pod left you need to explore the station, repair the pod and escape the station.\n");
        }
        else if (read_menu_number == 4)
        {
            return ;
        }
        else 
        {
            MainMenu();
        }
    }
}

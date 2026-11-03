import java.util.Scanner;

public class MainMenu {
    public static final int MenuChoices=4;//Assuming there are ony 4 options to choose from? Start,help, story/background,quit.

    public static  Scanner stdin = new Scanner(System.in);

  


       







    



    
    public static int ReadMenuChoice() throws Exception { // looked at chris's code and you cant incorpporate this after he lists menu choices

        while(true){

            int choice = new UUtils().consoleInt();

            if (choice>=1 && choice<=MenuChoices){ 

                return choice;


            }

            System.out.println("Please select an option from the Menu");




        }

        



         



    



            





        }




      

       




        }






        

    






        
    


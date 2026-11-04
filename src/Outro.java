public class Outro {
    public static void OutroForQuittingOrWinning() {
        if (Game.gameLoop()) {
            System.out.printf("You throw yourself into the pod and punch in the power cell. The red lights continue to fash as everyhting boot up...\n A faceless voice announces \"3... 2... 1...\"\nThe entire station falls silent...\n BOOM!!! The pod fires out of the dying station in a sea of destruction!\n You made it out just in time!\n");
        }

        else {
            System.out.printf("Quit Game\nThank you for playing\n");
        }
    }
    
}

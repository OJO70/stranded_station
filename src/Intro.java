public class Intro {
    
    public static String Intro() {

        String introText = "SMASH!\nA meteor strike has crippled the research station! It seems the crew have evacuated without you! The last escape pod has no power. You need to find out a way to escape. Exploren the space station. There must be another way out...";

        return introText;

    }

    public static String Tutorial() {
        //To do:
        String tutorial = "To play the game you have options to choose from.\n GO can be followed by by the directions:\n North, South, East, West, Down and Up.\nYou can also Take and Look at things in your environment.";

        return tutorial;
    }

    public static void Map_layout()
    {
        System.out.println("                          |‾‾‾‾‾‾‾‾‾‾‾‾‾|");
        System.out.println("                          | Observation |");
        System.out.println("                          |     Deck    |");
        System.out.println("                          |_____________|");
        System.out.println("                                 |      ");
        System.out.println("                                 | Up/Down");  
        System.out.println("                                 |      ");   
        System.out.println("                          |‾‾‾‾‾‾‾‾‾‾‾‾‾|");
        System.out.println("                          |     The     |");
        System.out.println("                          |  Laboratory |");
        System.out.println("                          |_____________|");
        System.out.println("                                 |      ");
        System.out.println("                                 | North/South");
        System.out.println("                                 |      ");
        System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾|           |‾‾‾‾‾‾‾‾‾‾‾‾‾|           |‾‾‾‾‾‾‾‾‾‾‾‾‾| ");
        System.out.println("|    Crew     | East/West |   Central   | East/West |   Storage   |");
        System.out.println("|   Cabin     |  ‾‾ ‾‾ ‾‾ |  Corridor   |  ‾‾ ‾‾ ‾‾ |     Bay     |");
        System.out.println("|_____________|           |_____________|           |_____________|");
        System.out.println("                                 |      ");
        System.out.println("                                 | North/South");
        System.out.println("                                 |      ");
        System.out.println("                          |‾‾‾‾‾‾‾‾‾‾‾‾‾|");
        System.out.println("                          |     The     |");
        System.out.println("                          |   Airlock   |");
        System.out.println("                          |_____________|");
        System.out.println("                                 |      ");
        System.out.println("                                 | Up/Down");  
        System.out.println("                                 |      ");   
        System.out.println("                          |‾‾‾‾‾‾‾‾‾‾‾‾‾|");
        System.out.println("                          |    Escape   |");
        System.out.println("                          |     Pod     |");
        System.out.println("                          |_____________|");



    }
}

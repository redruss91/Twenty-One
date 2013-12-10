package cit260.main;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kylerussell
 */

//Riley Created the class and added the variables
public class HelpMenuControl extends Menu{
    
   public static final String DESCRIPTION = "DESCRIPTION";
   public static final String GOAL = "GOAL";
   public static final String RULES = "RULES";
    public static final String WELCOME = "WELCOME";
    public static final String GOBACK = "GOBACK";
    
    private final static String[][] menuItems = {
        {"D", "The description"},
        {"G", "The goal"},
        {"R", "Rules of the game"},
        {"W", "Welcome to the help"},
        {"B", "Return back to the main menu"},
        {"Q", "Quit Help"}
    };
  
    public HelpMenuControl() {
        super(HelpMenuControl.menuItems);
    } 
    
        public String getHelpMenuItem(Object object) {
        
        String gameStatus = Game.PLAYING;
        do {
            this.display();
            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "D":
                    this.displayHelp(HelpMenuControl.DESCRIPTION);
                    break;
                case "G":
                    this.displayHelp(HelpMenuControl.GOAL);
                    break;
                case "R":
                    this.displayHelp(HelpMenuControl.RULES);
                    break;
                case "W":
                    this.displayHelp(HelpMenuControl.WELCOME);
                    break;
                case "B":
                    this.displayHelp(HelpMenuControl.GOBACK);
                    break;
                case "Q":
                    return Game.QUIT;
            }
        } while (!gameStatus.equals(Game.QUIT));
        
         return gameStatus;
    }
     
         private void displayHelp(String helpType) {

        String helpText = null;
        switch (helpType) {
            case HelpMenuControl.DESCRIPTION: helpText =
                 "The game is based on the card game 21.\n" +
                 "Players start with 2 cards and draw additional cards to\n" +
                 "try to get as close as they can to a score of 21 without going over.\n";
                break;
                
            case HelpMenuControl.GOAL: helpText =
               "To beat the dealer by getting as close to a score of 21 as\n" + 
                "possible without going over.\n";
                break;
                
            case HelpMenuControl.RULES: helpText =
               "1. Each player starts with 2 cards.\n\n"
            + "2. Dealer starts with 2 cards but only the first card is shown to\n"
            + " the players.\n\n"
            + "3. Players take turns trying to get a score as close to 21 as\n"
            + "possible.\n\n"
            + "4. During a turn a player can “hit” – take additional cards until\n"
            + "the total score of the cards is 21\n\n"
            + "5. A player’s turn is over when they “hold” – stop drawing cards\n"
            + "or they “bust” score over 21\n\n"
            + "6. After the players complete their turns the dealer takes his\n"
            + "turn following the same rules as the players.\n\n"
            + "7. If the player “busts” then they lose.\n\n"
            + "8. If the player scores more than the dealer then they win.\n\n"
            + "9. If the player scores the same as the dealer then they tie.\n\n"
            + "10. If the player scores less than the dealer then they lose.\n";
                break;
                
            case HelpMenuControl.WELCOME: helpText =
                "\n\tWelcome to Help! Type 'description' for a description\n"
                + "of the game. Type 'goal' to find out what the goal of the\n"
                + "game is. Type 'rules' to display the rules of the game\n\n";
                break;
                
            case HelpMenuControl.GOBACK: helpText =
                "To return to the help menu, type 'menu'. To return to the main\n"
            + "menu, type 'main'\n";
                break;
        } 
         StringBuilder dividerLine = new StringBuilder(80);
        for (int i = 0; i < 80; i++) {
            dividerLine.insert(i, '~');
        }
        
        System.out.println("\t" + dividerLine.toString());
        System.out.println(helpText);
        System.out.println("\t" + dividerLine.toString());
    }
    @Override
    public String executeCommands(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

package cit260.main;

public abstract class Menu {

    private String[][] menuItems = null;

    public Menu() {
    }

    public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }
    
    // This is an abstract function. It specifies that all sub-classes must
    // implement this function.
    public abstract String executeCommands(Object object);
    
    public String[][] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String[][] menuItems) {
        this.menuItems = menuItems;
    }
    
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("\t " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    private boolean validCommand(String command) {
        String[][] items = this.menuItems;

        for (String[] item : this.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }

}
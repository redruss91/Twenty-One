package twentyone.maingame;

/**
 * @author K Russell
*/

public class TwentyOneError {
 
    public Object displayError(Object object) {
        String message = (String) object;
        System.out.println("\t ERROR: " + message);
        return null;
    }
}

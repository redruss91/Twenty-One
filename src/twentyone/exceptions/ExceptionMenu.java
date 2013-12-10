
package twentyone.exceptions;


/**
 *
 * @author Kyle Russell
 */
public class ExceptionMenu extends Exception {

    public ExceptionMenu() {
    }

    public ExceptionMenu(String message) {
        super(message);
    }

    public ExceptionMenu(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionMenu(Throwable cause) {
        super(cause);
    }
    
}
    
    

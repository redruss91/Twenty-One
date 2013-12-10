package twentyone.exceptions;

/**
 *
 * @author Kyle Russell
 */
public class ExceptionPlayer extends Exception {


    public ExceptionPlayer() {
    }

    
    public ExceptionPlayer(String msg) {
        super(msg);
    }
    public ExceptionPlayer(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionPlayer(Throwable cause) {
        super(cause);
    }    
}

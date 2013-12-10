package twentyone.exceptions;


/**
 *
 * @author Kyle Russell
 */
public class ExceptionResults extends Exception {

    public ExceptionResults() {
    }

    public ExceptionResults(String message) {
        super(message);
    }

    public ExceptionResults(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionResults(Throwable cause) {
        super(cause);
    }
    
}
    
    

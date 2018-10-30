package ma.valueit.core.errorhandling.businessexception;

import javax.ws.rs.WebApplicationException;

/**
 * Created by valueit-mac-yelansari on 3/23/18.
 */
public class InvalidArgumentException extends WebApplicationException {
    private static final long serialVersionUID = -8864777585995829747L;

    public InvalidArgumentException(String message) {
        super(message);
    }

    public InvalidArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidArgumentException(Throwable cause) {
        super(cause);
    }

}

package ma.valueit.core.errorhandling.businessexception;

import javax.ws.rs.WebApplicationException;

public class NoContentException extends WebApplicationException {
    private static final long serialVersionUID = 5391146990874781853L;

    public NoContentException() {
        super("no content found");
    }

    public NoContentException(String message) {
        super(message);
    }

    public NoContentException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoContentException(Throwable cause) {
        super(cause);
    }
}

package ma.valueit.core.errorhandling.filemanagererror;

public class FMSyntaxException extends FileManagerException {

	private static final long serialVersionUID = 8209677270758886311L;

	public FMSyntaxException() {
		super();
	}

	public FMSyntaxException(String message) {
		super(message);
	}

	public FMSyntaxException(String message, Throwable cause) {
		super(message, cause);
	}

	public FMSyntaxException(Throwable cause) {
		super(cause);
	}

}

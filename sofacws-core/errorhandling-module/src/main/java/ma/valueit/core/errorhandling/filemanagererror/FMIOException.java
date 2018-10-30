package ma.valueit.core.errorhandling.filemanagererror;

public class FMIOException extends FileManagerException {

	private static final long serialVersionUID = -3092780409132734482L;

	public FMIOException() {
		super();
	}

	public FMIOException(String message) {
		super(message);
	}

	public FMIOException(String message, Throwable cause) {
		super(message, cause);
	}

	public FMIOException(Throwable cause) {
		super(cause);
	}

}

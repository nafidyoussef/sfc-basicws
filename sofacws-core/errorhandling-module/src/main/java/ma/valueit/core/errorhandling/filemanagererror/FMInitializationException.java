package ma.valueit.core.errorhandling.filemanagererror;

public class FMInitializationException extends RuntimeException {

	private static final long serialVersionUID = 3841185931455230944L;

	public FMInitializationException() {
		super();
	}

	public FMInitializationException(String message) {
		super(message);
	}

	public FMInitializationException(String message, Throwable cause) {
		super(message, cause);
	}

	public FMInitializationException(Throwable cause) {
		super(cause);
	}

}

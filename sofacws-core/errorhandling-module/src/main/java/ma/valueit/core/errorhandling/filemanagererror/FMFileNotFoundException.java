package ma.valueit.core.errorhandling.filemanagererror;

public class FMFileNotFoundException extends FileManagerException {

	private static final long serialVersionUID = -5190916378693008743L;

	public FMFileNotFoundException() {
		super();
	}

	public FMFileNotFoundException(String message) {
		super(message);
	}

	public FMFileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public FMFileNotFoundException(Throwable cause) {
		super(cause);
	}

}

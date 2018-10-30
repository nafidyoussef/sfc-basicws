package ma.valueit.core.errorhandling.filemanagererror;

public class FMConfigException extends FileManagerException {

	private static final long serialVersionUID = 3353184611612119883L;

	public FMConfigException() {
		super();
	}

	public FMConfigException(String message) {
		super(message);
	}

	public FMConfigException(String message, Throwable cause) {
		super(message, cause);
	}

	public FMConfigException(Throwable cause) {
		super(cause);
	}

}

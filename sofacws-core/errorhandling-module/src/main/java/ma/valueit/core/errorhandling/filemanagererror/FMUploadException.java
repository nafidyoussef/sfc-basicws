package ma.valueit.core.errorhandling.filemanagererror;

public class FMUploadException extends FileManagerException {
	
	private static final long serialVersionUID = -830464371611210134L;

	public FMUploadException() {
		super();
	}

	public FMUploadException(String message) {
		super(message);
	}

	public FMUploadException(String message, Throwable cause) {
		super(message, cause);
	}

	public FMUploadException(Throwable cause) {
		super(cause);
	}

}

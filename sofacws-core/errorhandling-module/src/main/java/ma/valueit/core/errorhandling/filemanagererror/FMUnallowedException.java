package ma.valueit.core.errorhandling.filemanagererror;

public class FMUnallowedException  extends FileManagerException {
	
	private static final long serialVersionUID = 4199024126003281207L;

	public FMUnallowedException() {
		super();
	}

	public FMUnallowedException(String message) {
		super(message);
	}

	public FMUnallowedException(String message, Throwable cause) {
		super(message, cause);
	}

	public FMUnallowedException(Throwable cause) {
		super(cause);
	}

}

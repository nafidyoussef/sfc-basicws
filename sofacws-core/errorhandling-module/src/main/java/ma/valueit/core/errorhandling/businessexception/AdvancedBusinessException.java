package ma.valueit.core.errorhandling.businessexception;

import lombok.Getter;
import lombok.Setter;
import ma.valueit.core.errorhandling.validator.ValidationMessages;
import org.springframework.http.HttpStatus;

public class AdvancedBusinessException extends BusinessException {
    private static final long serialVersionUID = -3377325407569060574L;

    @Getter @Setter
    private HttpStatus status;

    @Getter @Setter
    private ValidationMessages validationMessages;

    public AdvancedBusinessException(ValidationMessages validationMessages, String message) {
        super(message);
        this.setValidationMessages(validationMessages);
    }
}
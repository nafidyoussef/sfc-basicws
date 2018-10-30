package ma.valueit.core.errorhandling.validator;

import ma.valueit.core.errorhandling.businessexception.BusinessException;

/**
 * Created by valueit-mac-yelansari on 3/12/18.
 */
public interface Validator {
    public ValidationMessages getValidationMessages();
    public void validate() throws BusinessException;
}

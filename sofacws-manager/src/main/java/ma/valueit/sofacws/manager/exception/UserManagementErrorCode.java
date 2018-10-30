package ma.valueit.sofacws.manager.exception;

import lombok.Getter;
import ma.valueit.core.errorhandling.businessexception.BusinessErrorCode;

/**
 * Created by valueit-mac-yelansari on 3/6/18.
 */
public enum UserManagementErrorCode implements BusinessErrorCode {
    AUTH_TYPE_MISSING("users.auth_type.missing"),
    EMAIL_MISSING("users.email.missing"),
    FIRST_NAME_MISSING("users.firstname.missing"),
    LAST_NAME_MISSING("users.lastname.missing"),
    DUPLICATE_USERNAME("users.duplicate_username"),
    PASSWORD_MISSING("users.password.missing"),
    USER_NAME_MISSING("users.username.missing"),
    USER_NOT_FOUND("users.not_found"),
    INVALID_ACCOUNT_TYPE("users.invalid_account_type");

    @Getter
    private final String value;

    private UserManagementErrorCode(String value) {
        this.value = value;
    }
}

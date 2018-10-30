package ma.valueit.sofacws.manager.exception;

import lombok.Getter;
import ma.valueit.core.errorhandling.businessexception.BusinessErrorCode;

/**
 * Created by valueit-mac-yelansari on 3/6/18.
 */
public enum ProfileManagementErrorCode implements BusinessErrorCode {
    PROFILE_NOT_FOUND("profiles.not_found");

    @Getter
    private final String value;

    private ProfileManagementErrorCode(String value) {
        this.value = value;
    }
}

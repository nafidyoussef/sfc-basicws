package ma.valueit.sofacws.manager.exception;

import lombok.Getter;
import ma.valueit.core.errorhandling.businessexception.BusinessErrorCode;

/**
 * Created by valueit-mac-yelansari on 3/6/18.
 */
public enum CommonManagementErrorCode implements BusinessErrorCode {
    INVALID_FORMAT("commons.invalid_format"),
    INVALID_DATE("commons.invalid_date"),
    FIELD_REQUIRED("commons.field_required"),
    INVALID_FIELD_DATA("commons.invalid_data");

    @Getter
    private final String value;

    private CommonManagementErrorCode(String value) {
        this.value = value;
    }

}

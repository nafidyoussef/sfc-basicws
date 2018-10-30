package ma.valueit.sofacws.manager.exception;

import lombok.Getter;
import ma.valueit.core.errorhandling.businessexception.BusinessErrorCode;

/**
 * Created by valueit-mac-yelansari on 3/6/18.
 */
public enum AttachmentManagementErrorCode implements BusinessErrorCode {
    ATTACHMENT_NOT_FOUND("attachments.not_found");

    @Getter
    private final String value;

    private AttachmentManagementErrorCode(String value) {
        this.value = value;
    }
}

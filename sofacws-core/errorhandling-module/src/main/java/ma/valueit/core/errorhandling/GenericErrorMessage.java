package ma.valueit.core.errorhandling;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpStatus;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by valueit-mac-yelansari on 1/30/18.
 */
public class GenericErrorMessage {
    @Getter @Setter
    private HttpStatus status;

    @Getter @Setter
    private int code;

    @Getter @Setter
    private String message;

    @Getter @Setter
    private String link;

    @Getter @Setter
    private String developerMessage;

    public GenericErrorMessage() {}

    public GenericErrorMessage(Exception ex){
        try {
            BeanUtils.copyProperties(this, ex);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}

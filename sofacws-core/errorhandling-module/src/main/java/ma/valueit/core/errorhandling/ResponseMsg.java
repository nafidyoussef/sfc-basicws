package ma.valueit.core.errorhandling;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by valueit-mac-yelansari on 3/15/18.
 */
public class ResponseMsg {
    @Getter @Setter
    private String message;

    public ResponseMsg(String message){
        this.message = message;
    }
}

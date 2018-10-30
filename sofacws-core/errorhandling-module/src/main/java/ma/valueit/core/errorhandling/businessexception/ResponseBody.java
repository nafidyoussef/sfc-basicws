package ma.valueit.core.errorhandling.businessexception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Locale;

/**
 * Created by valueit-mac-yelansari on 3/4/18.
 */
public class ResponseBody<T> {
    @Getter @Setter
    private HttpStatus status = null;
    @Getter @Setter
    private Locale language = Locale.ENGLISH;
    @Getter @Setter
    private T data = null;
    @Getter @Setter
    private String message = null;

    public ResponseBody(HttpStatus status) {
        this.status = status;
    }

    public ResponseBody(T data) {
        this.data = data;
    }

    public ResponseBody(HttpStatus status, T data) {
        this.status = status;
        this.data = data;
    }

    public ResponseBody(HttpStatus status, Locale language, T data) {
        this.status = status;
        this.language = language;
        this.data = data;
    }
    public ResponseBody(HttpStatus status, T data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }
    public ResponseBody(HttpStatus status, Locale language, T data, String message) {
        this.status = status;
        this.language = language;
        this.data = data;
        this.message = message;
    }
}

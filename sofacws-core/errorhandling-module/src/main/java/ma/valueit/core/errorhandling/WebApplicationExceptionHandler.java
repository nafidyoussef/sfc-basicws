package ma.valueit.core.errorhandling;

import ma.valueit.core.errorhandling.businessexception.*;
import ma.valueit.core.errorhandling.filemanagererror.FMInitializationException;
import ma.valueit.core.errorhandling.filemanagererror.FileManagerException;
import ma.valueit.core.errorhandling.validator.ValidationMessages;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by valueit-mac-yelansari on 3/10/18.
 */
@RestControllerAdvice
public class WebApplicationExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ResponseBody<String>> handleBusinessException(BusinessException ex) {
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);

        String errorMessage = ex.getErrorCode() != null ? ex.getErrorCode().getValue() : ex.getMessage();

        return new ResponseEntity<>(new ResponseBody<>(HttpStatus.BAD_REQUEST, "", errorMessage), headers, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(AdvancedBusinessException.class)
    public ResponseEntity<ResponseBody<ValidationMessages>> handleAdvancedBusinessException(AdvancedBusinessException ex) {
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);

        //String errorMessage = ex.getErrorCode() != null ? ex.getErrorCode().getValue() : ex.getMessage();

        return new ResponseEntity<>(
                new ResponseBody<>(HttpStatus.BAD_REQUEST, ex.getValidationMessages(), ex.getMessage()), headers, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidArgumentException.class)
    public ResponseEntity<ResponseBody<String>> handleInvalidArgumentException(InvalidArgumentException ex) {
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);

        return new ResponseEntity<>(new ResponseBody<>(HttpStatus.BAD_REQUEST, ex.getMessage()), headers, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoContentException.class)
    public ResponseEntity<ResponseBody<String>> handleNoContentException(NoContentException ex) {
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);

        return new ResponseEntity<>(new ResponseBody<String>(HttpStatus.OK, "", ex.getMessage()), headers, HttpStatus.OK);
    }

    @ExceptionHandler(FMInitializationException.class)
    public ResponseEntity<ResponseBody<String>> handleFMInitializationException(FMInitializationException ex) {
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);

        return new ResponseEntity<>(new ResponseBody<>(HttpStatus.BAD_REQUEST, ex.getMessage()), headers, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(FileManagerException.class)
    public ResponseEntity<ResponseBody<String>> handleFileManagerException(FileManagerException ex) {
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);

        return new ResponseEntity<>(new ResponseBody<>(HttpStatus.BAD_REQUEST, ex.getMessage()), headers, HttpStatus.BAD_REQUEST);
    }

}

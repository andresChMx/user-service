package pe.edu.upc.onewebs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message){
        super(message);
    }

    public ResourceNotFoundException(String teacher, String id, Long teacherId){
        super();
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message,cause);
    }

    public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("Resource %s not found for %s with value %s", resourceName, fieldName, fieldValue));
    }
}
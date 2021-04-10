
package academy.devdojo.springboot2.handler;


import academy.devdojo.springboot2.exception.BadRequestExceptDetails;
import academy.devdojo.springboot2.exception.ExceptionName;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

import java.time.LocalDateTime;

//
@ControllerAdvice
public class RestExceptioHandler {
    private BadRequestExceptDetails badRequestExceptDetails;

   
    @ExceptionHandler(ExceptionName.class)

    public ResponseEntity<BadRequestExceptDetails> handlerBadRequestException(ExceptionName exceptionName){
        return new ResponseEntity<>(
                 new BadRequestExceptDetails(
                         "BAD REQUEST CRIADA AGORA PELA LORENA",
                         HttpStatus.BAD_REQUEST.value(),
                         exceptionName.getMessage(),
                         exceptionName.getClass().getName(),
                         LocalDateTime.now()), HttpStatus.BAD_REQUEST);


    }
}

package com.twitter.Twitter.Controllers;

import com.twitter.Twitter.Exceptions.NicknameAlreadyExistException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class ControllerExceptionHandler {
    @ExceptionHandler(NicknameAlreadyExistException.class)

    protected ResponseEntity<NicknameAlreadyExistException> handleUnknownException(NicknameAlreadyExistException e) {

        return ResponseEntity.status(e.status())
                .body(e);
    }
}

package com.twitter.Twitter.Exceptions;

import org.springframework.http.HttpStatus;

public class NicknameAlreadyExistException extends RuntimeException {
    public NicknameAlreadyExistException() {
    }

    public NicknameAlreadyExistException(String message) {
        super(message);

    }

    public int status(){
        return HttpStatus.ALREADY_REPORTED.value();

    }
}

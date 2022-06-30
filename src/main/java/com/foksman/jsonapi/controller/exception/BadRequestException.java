package com.foksman.jsonapi.controller.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BadRequestException extends RuntimeException {

    private final static long serialVersionUID = -2244369579617373970L;
    private String message;
}

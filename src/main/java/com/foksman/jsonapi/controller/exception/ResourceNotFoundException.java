package com.foksman.jsonapi.controller.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ResourceNotFoundException extends RuntimeException{

    private final static long serialVersionUID = 5269892068980250247L;
    private String message;
}

package com.foksman.jsonapi.controller.advice;

import com.foksman.jsonapi.controller.exception.BadRequestException;
import com.foksman.jsonapi.controller.exception.ResourceNotFoundException;
import com.foksman.jsonapi.model.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@ResponseBody
public class BlogPostControllerAdvice {

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorDto handleAsylumCaseNotFoundException(ResourceNotFoundException resourceNotFoundException, HttpServletRequest httpServletRequest) {
        return new ErrorDto(resourceNotFoundException.getMessage());
    }

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDto handleBadRequestException(BadRequestException badRequestException, HttpServletRequest httpServletRequest) {
        return new ErrorDto(badRequestException.getMessage());
    }
}

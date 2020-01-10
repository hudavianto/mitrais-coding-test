package com.mitrais.coding.test.demo.controller;

import com.mitrais.coding.test.demo.controller.common.BaseResponse;
import com.mitrais.coding.test.demo.controller.common.ConstructResponse;
import com.mitrais.coding.test.demo.libraries.constant.ResponseCode;
import java.nio.file.AccessDeniedException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author hudaavianto
 */
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(RuntimeException.class)
  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
  public ResponseEntity<BaseResponse> runTimeException(RuntimeException re) {
    return new ResponseEntity<>(ConstructResponse.constructResponse(ResponseCode.RUNTIME_ERROR.getCode(),
        ResponseCode.RUNTIME_ERROR.getMessage(),
        null), HttpStatus.INTERNAL_SERVER_ERROR);
  }
}

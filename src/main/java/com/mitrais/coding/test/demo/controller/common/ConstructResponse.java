package com.mitrais.coding.test.demo.controller.common;

/**
 * @author hudaavianto
 */
public class ConstructResponse {
  public static <T> BaseResponse<T> constructResponse(String code, String message,
      T data) {
    return new BaseResponse.BaseResponseBuilder<T>().responseCode(code).responseMessage(message).build();
  }

}

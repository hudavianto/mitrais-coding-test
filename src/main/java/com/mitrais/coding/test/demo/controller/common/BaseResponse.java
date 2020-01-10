package com.mitrais.coding.test.demo.controller.common;

import lombok.Builder;

/**
 * @author hudaavianto
 */

@Builder
public class BaseResponse<T> {

  private String responseCode;
  private String responseMessage;
  private T object;

  @Override
  public String toString() {
    return "BaseResponse{" +
        "responseCode='" + responseCode + '\'' +
        ", responseMessage='" + responseMessage + '\'' +
        ", object=" + object +
        '}';
  }
}

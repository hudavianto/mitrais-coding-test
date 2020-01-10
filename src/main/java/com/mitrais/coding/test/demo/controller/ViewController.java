package com.mitrais.coding.test.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hudaavianto
 */

@Controller
public class ViewController {

  @RequestMapping(value = "/")
  public String main(){
    return "index";
  }
}

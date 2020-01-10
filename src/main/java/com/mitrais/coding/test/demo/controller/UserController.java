package com.mitrais.coding.test.demo.controller;

import com.mitrais.coding.test.demo.controller.common.BaseResponse;
import com.mitrais.coding.test.demo.controller.common.ConstructResponse;
import com.mitrais.coding.test.demo.entity.User;
import com.mitrais.coding.test.demo.libraries.constant.ResponseCode;
import com.mitrais.coding.test.demo.sevice.UserService;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.jws.soap.SOAPBinding.Use;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * @author hudaavianto
 */

@RestController
@RequestMapping(value = "/register")
public class UserController {

  @Autowired
  UserService userService;

  @RequestMapping(value = "new")
  public ResponseEntity<User> registerNew(@ModelAttribute  User user, @RequestParam String birthday) throws Exception{

    User user1 = userService.registerNewUser(user, birthday);
    return new ResponseEntity<>(
        user1,
        HttpStatus.OK);
  }

}

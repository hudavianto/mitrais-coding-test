package com.mitrais.coding.test.demo.sevice.impl;

import com.mitrais.coding.test.demo.dao.UserRepository;
import com.mitrais.coding.test.demo.entity.User;
import com.mitrais.coding.test.demo.libraries.BusinessLogicException;
import com.mitrais.coding.test.demo.libraries.constant.ResponseCode;
import com.mitrais.coding.test.demo.sevice.UserService;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hudaavianto
 */

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserRepository userRepository;


  @Override
  public User registerNewUser(User user, String date) throws Exception{
    User userExisting= userRepository.findUserByEmail(user.getEmail());

    if(isUserNotNull(userExisting)){
      throw new  BusinessLogicException(ResponseCode.DUPLICATE_DATA.getCode(), ResponseCode.DUPLICATE_DATA.getMessage());
    }

    if(date!=null && (!date.equals(""))){
      Date date1=new SimpleDateFormat("YYYY-MM-DD").parse(date);
      user.setDateOfBirth(date1);
    }

    return userRepository.save(user);

  }

  private boolean isUserNotNull(User user) { return user != null; }
}

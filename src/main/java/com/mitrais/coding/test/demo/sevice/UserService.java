package com.mitrais.coding.test.demo.sevice;

import com.mitrais.coding.test.demo.entity.User;

/**
 * @author hudaavianto
 */

public interface UserService {

  User registerNewUser(User user, String date) throws  Exception;

}

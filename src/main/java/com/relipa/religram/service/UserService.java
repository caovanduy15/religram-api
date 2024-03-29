package com.relipa.religram.service;

import com.relipa.religram.controller.bean.response.UserInfoBean;
import com.relipa.religram.entity.User;
import com.relipa.religram.exceptionhandler.UserAlreadyExistException;

import java.util.Locale;
import java.util.Optional;

public interface UserService extends AbstractService<User, Long> {

    UserInfoBean findUserByUserName(String userName);

    void registerNewUserAccount(User user, Locale locale) throws UserAlreadyExistException;
}

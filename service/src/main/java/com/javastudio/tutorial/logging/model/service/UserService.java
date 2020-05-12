package com.javastudio.tutorial.logging.model.service;

import com.javastudio.tutorial.logging.model.model.User;
import org.slf4j.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class UserService {

    @Inject
    Logger logger;

    public User getAdminUser() {
        logger.info("Getting admin user ...");
        return new User("admin");
    }
}

package com.javastudio.lms.tutorial.logging.web.controller;

import com.javastudio.tutorial.logging.model.model.User;
import com.javastudio.tutorial.logging.model.service.UserService;
import org.slf4j.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class HomeController implements Serializable {

    private static final long serialVersionUID = -9144466346095115939L;

    @Inject
    Logger logger;

    @EJB
    UserService userDao;

    private User user;

    @PostConstruct
    private void init() {
        user = userDao.getAdminUser();
        logger.info("Hello {}", user.getName());
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

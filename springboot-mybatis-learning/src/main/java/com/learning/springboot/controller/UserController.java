package com.learning.springboot.controller;

import com.learning.springboot.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @SuppressWarnings("unused")
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Reference
    private UserService userService;
}

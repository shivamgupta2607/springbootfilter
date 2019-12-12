package com.practice.springbootfilterapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shivamgupta
 */
@RestController
public class ExternalLoginController {

    Logger logger = LoggerFactory.getLogger(ExternalLoginController.class);

    @GetMapping("/external")
    public String externalLogin() {
        logger.error("In ExternalLoginController");
        return "ExternalLoginController";
    }


}

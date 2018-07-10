package com.jun.jenkins.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    @ResponseBody
    public Object test () {
        return "Hello Jenkins aaaaa";
    }
}

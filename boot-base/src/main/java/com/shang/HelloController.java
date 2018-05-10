package com.shang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by shang on 2018/5/10.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "hello world 123";
    }
}

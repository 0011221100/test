package com.southwind.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：ft
 * @date ：2023/2/1 17:20
 * @description：DemoController
 * @version: 1.0
 */
@Log4j2
@Controller
public class DemoController {

    private Integer num = 520;

    @GetMapping
    @ResponseBody
    public String index(Model model){
//        model.addAttribute("num",num++);
       log.info("你好index3");
        return "index3";
    }

    @GetMapping("/index")
    @ResponseBody
    public String index2(){
        log.info("你好Ok");
        return "OK!";
    }

}

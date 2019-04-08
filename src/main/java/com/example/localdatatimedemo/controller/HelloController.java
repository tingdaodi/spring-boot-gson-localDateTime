package com.example.localdatatimedemo.controller;

import com.example.localdatatimedemo.model.TimeBean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Description TODO
 *
 * @author Roye.L
 * @since 1.0
 */
@Controller
public class HelloController {

    @GetMapping(value = "/local")
    @ResponseBody
    public void localDateTime(TimeBean timeBean) {
        System.out.println(timeBean.getNowDate());
        System.out.println(timeBean.getNowTime());
    }

    @PostMapping(value = "/local", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public void local(@RequestBody TimeBean timeBean) {
        System.out.println(timeBean.getNowDate());
        System.out.println(timeBean.getNowTime());
    }

}

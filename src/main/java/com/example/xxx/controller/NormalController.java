package com.example.xxx.controller;

import com.example.xxx.model.Rooter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description: NormalController
 * @author: leiming5
 * @date: 2020-12-29 09:07
 */
@RestController
public class NormalController {


    @GetMapping("test")
    public String getById(){

        System.out.println(Rooter.getOne());
        System.out.println(Rooter.getTwo());
        return Rooter.getZxc();

    }

}

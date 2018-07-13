package com.project.JDiscord.controller;


import com.project.JDiscord.service.LOLservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LOLController {

    @Autowired
    private LOLservice loLservice;

    @RequestMapping("/LOL/getByName/{name}")
    public String getByName(@PathVariable("name") String name){
        return loLservice.getByName(name);
    }
}

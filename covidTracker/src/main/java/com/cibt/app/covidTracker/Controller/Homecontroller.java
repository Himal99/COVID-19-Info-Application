/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.app.covidTracker.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author user
 */
@Controller
public class Homecontroller {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/")
    public String index(Model model) {
       
        return "home/index";

    }

    @GetMapping(value = "/covid19")
    @ResponseBody
    public String data() {
        String url
                = "https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats,";
        return this.restTemplate.getForObject(url, String.class);

    }

    public Homecontroller(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
    
    

}

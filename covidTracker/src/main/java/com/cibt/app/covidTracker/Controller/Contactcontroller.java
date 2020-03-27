/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.app.covidTracker.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
public class Contactcontroller {
    @RequestMapping(value = "/contact")
    public String index(){
        return "contact/index";
    }
}

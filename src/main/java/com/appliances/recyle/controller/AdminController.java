package com.appliances.recyle.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/echopickup/admin")
@RequiredArgsConstructor
public class AdminController {

    @GetMapping("/product_register")
    public void registerGet() {

    }

    @PostMapping
    public void registerPost() {

    }

    @GetMapping("/product")
    public void productGet() {

    }

}

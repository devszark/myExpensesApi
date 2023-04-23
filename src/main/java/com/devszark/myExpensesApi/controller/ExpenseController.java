package com.devszark.myExpensesApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {

    @GetMapping("/test")
    String testController(){
        return "testController is responding!";
    }
}
